package com.ejercicios._1;

import java.util.Scanner;

// 1. (Sencillo) Crea un método que reciba un nombre y muestre un saludo personalizado.

public class SaludoPersonalizado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== SALUDO PERSONALIZADO ======");

        String nombre = inputNombre(sc);

        System.out.println(saludoPersonalizado(nombre));

        sc.close();
    }

    private static String inputNombre(Scanner sc){
        System.out.print("Ingresa tu nombre completo: ");
        return sc.nextLine();
    }

    private static String saludoPersonalizado(String nombre){
        nombre = nombre.trim();

        StringBuilder nombreCompleto = new StringBuilder();
        StringBuilder primerNombre = new StringBuilder();

        boolean anteriorEsContenido = false;
        boolean existePrimeraSecuencia = false;

        for(int i = 0; i < nombre.length(); i++){
            char caracter =  nombre.charAt(i);

            if(Character.isWhitespace(caracter)){
                if (anteriorEsContenido) {
                    nombreCompleto.append(" ");
                    anteriorEsContenido = false;
                    existePrimeraSecuencia = true;
                }
            }else {
                nombreCompleto.append(caracter);
                anteriorEsContenido = true;

                if(!existePrimeraSecuencia){
                    primerNombre.append(caracter);
                }
            }

// Versión basada en letras: todo carácter que no sea letra se trata como separador.

//            if(Character.isLetter(caracter) && !anteriorEsContenido){
//                nombreCompleto.append(caracter);
//                if(!existePrimeraSecuencia) primerNombre.append(caracter);
//                anteriorEsContenido = true;
//            }
//            else if(Character.isLetter(caracter) && anteriorEsContenido){
//                nombreCompleto.append(caracter);
//                if(!existePrimeraSecuencia) primerNombre.append(caracter);
//            }
//            else if (!Character.isLetter(caracter) && anteriorEsContenido){
//                nombreCompleto.append(caracter);
//                existePrimeraSecuencia = true;
//                anteriorEsContenido = false;
//            }

        }
        return "¿Qué tal " + primerNombre + ". Tu nombre completo es: " + nombreCompleto;
    }

}

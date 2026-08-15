package com.ejercicios._4;

import java.util.Scanner;

// 4. (Sencillo) Crea un método que determine si un número es par.

public class ImparOPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======= DETECTOR DE PARES E IMPARES =======");
        System.out.println(detectorParOImpar(sc));
        sc.close();
    }

    private static String detectorParOImpar(Scanner sc){

        int numero;
        String mensaje;

        while(true){
            try{

                System.out.print("Ingresa un número: ");
                numero = Integer.parseInt(sc.nextLine().trim());
                break;

            }catch(NumberFormatException e){
                System.out.println("Error: Ingresa un número entero válido.\n");
            }
        }

        if(numero % 2 == 0){
            mensaje = "\nEl numero es par";
        } else {
            mensaje = "\nEl numero es impar";
        }
        return mensaje;
    }
}

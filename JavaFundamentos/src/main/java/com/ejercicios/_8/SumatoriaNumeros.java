package com.ejercicios._8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// 8. (Intermedio) Solicita números hasta que el usuario introduzca `0` y después muestra su suma (usa `while`).

public class SumatoriaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> listaNumeros = new ArrayList<>();
        System.out.println("---- Sumatoria de números en Cadena ----");

        while(true){

            try{
                if(listaNumeros.isEmpty()){
                    System.out.print("Ingrese un número: ");
                }else{
                    System.out.print("Ingrese otro número (digite 0 para salir): ");
                }

                double numero = sc.nextDouble();
                if(numero == 0) break;
                listaNumeros.add(numero);

            }catch(InputMismatchException e){
                System.out.println("Ingresa un número válido");
                System.out.println();
                sc.nextLine();
            }
        }

        double sumatoria = 0;
        StringBuilder listaNumerosTexto = new StringBuilder();

        for(int i = 0; i < listaNumeros.size(); i++){
            sumatoria += listaNumeros.get(i);

            if(i < listaNumeros.size() - 1 ){
                listaNumerosTexto.append(listaNumeros.get(i)).append(" + ");
            }
            else{
                listaNumerosTexto.append(listaNumeros.get(i)).append(" = ");
            }
        }

        System.out.println();
        System.out.println("----- Sumatoria -----");
        System.out.println(listaNumerosTexto + "%.3f".formatted(sumatoria));

    }
}

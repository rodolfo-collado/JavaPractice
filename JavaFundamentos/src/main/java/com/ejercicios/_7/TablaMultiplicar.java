package com.ejercicios._7;

// 7. (Intermedio) Muestra la tabla de multiplicar de un número utilizando un ciclo `for`.

import java.util.InputMismatchException;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------- Tabla de multiplicar --------");

        while(true){

            try{
                System.out.print("Ingresa un número entero positivo: ");
                int numero = sc.nextInt();


                if(numero < 0){
                    System.out.println("Número inválido, intente de nuevo.");
                    System.out.println();
                    continue;
                }

                System.out.println();
                System.out.println("---- Tabla de multiplicar del número " + numero + " ----");
                for (int i = 1; i <= 12; i++){
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                break;

            }catch(InputMismatchException e){
                System.out.println("Entrada inválida, intente de nuevo.");
                System.out.println();
                sc.nextLine();
            }
        }

    }

}

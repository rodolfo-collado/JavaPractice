package com.ejercicios._6;

import java.util.InputMismatchException;
import java.util.Scanner;

// 6. (Intermedio) Solicita una calificación y muestra su categoría utilizando `switch`: excelente, aprobado o reprobado.

public class Calificador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------ Categorizador de calificaciones ------");

        while (true) {
           try{
                System.out.print("Ingrese su calificación: ");
                int calificacion = sc.nextInt();

                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("Ingrese una calificación válida");
                    System.out.println();
                    continue;
                }

                switch (calificacion / 10){
                    case 10, 9 -> System.out.println("Su nota es Excelente.");
                    case 8, 7 -> System.out.println("Has aprobado.");
                    default -> System.out.println("Has reprobado.");
                }
                break;

           } catch(InputMismatchException e){
                System.out.println("Ingrese una calificación válida");
               System.out.println();
                sc.nextLine();
           }
        }
    }
}

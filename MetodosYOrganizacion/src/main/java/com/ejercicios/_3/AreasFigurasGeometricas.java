package com.ejercicios._3;

import java.util.InputMismatchException;
import java.util.Scanner;

//3. (Sencillo) Crea métodos para calcular el área de un círculo, rectángulo y triángulo.

public class AreasFigurasGeometricas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcion;
        do{
            System.out.print("""
                    \n===== Calculadora de Áreas =====
                    
                    -------- Figuras Geométricas --------
                    1. Círculo.
                    2. Rectángulo.
                    3. Triángulo.
                    4. Salir.
                    
                    ==>\s""");

            opcion = sc.nextLine().trim().toLowerCase();

            switch(opcion){
                case "1" -> areaCirculo(sc);
                case "2" -> areaRectangulo(sc);
                case "3" -> areaTriangulo(sc);
                case "4" -> System.out.println("\nCerrando Programa...");
                default -> System.out.println("Input inválido. Intenta de nuevo.\n");
            }
        }while(!opcion.equals("4"));

        sc.close();
    }

    private static void areaCirculo(Scanner sc){
        System.out.println("""
                \n------ CÍRCULO ------
                A = π × r²
                """);
        double radio;

        while(true){
            try{
                System.out.print("Ingresa el radio (cm): ");
                radio = sc.nextDouble();

                if(radio <= 0){
                    System.out.println("Error: El radio tiene que ser mayor a 0.\n");
                    continue;
                }

                sc.nextLine();
                break;

            }catch(InputMismatchException e){
                System.out.println("Input inválido. Intente de nuevo.\n");
                sc.nextLine();
            }
        }

        double area = Math.PI * radio * radio;
        System.out.printf("El area del círculo es: %.3f cm² %n%n", area);
    }

    private static void areaRectangulo(Scanner sc){
        System.out.println("""
                \n------ RECTÁNGULO -------
                A = b × h
                """);

        double area = basePorAltura(sc);
        System.out.printf("El área del rectángulo es: %.3f cm² %n%n", area);
    }

    private static void areaTriangulo(Scanner sc){
        System.out.println("""
                \n------ TRIÁNGULO ------
                A = (b × h) / 2
                """);

        double area = basePorAltura(sc)/2;
        System.out.printf("El área del triángulo es: %.3f cm² %n%n", area);

    }

    private static double basePorAltura(Scanner sc){
        double base;
        double altura;
        while(true){
            try{
                System.out.print("Ingresa la base (cm): ");
                base = sc.nextDouble();

                if (base <= 0){
                    System.out.println("Error: La base tiene que ser mayor a 0.\n");
                    continue;
                }

                System.out.print("Ingresa la altura (cm): ");
                altura = sc.nextDouble();

                if(altura <= 0){
                    System.out.println("Error: La altura tiene que ser mayor a 0.\n");
                    continue;
                }
                sc.nextLine();
                break;

            }catch(InputMismatchException e){
                System.out.println("Input inválido. Intente de nuevo.\n");
                sc.nextLine();
            }
        }
        return base*altura;
    }
}

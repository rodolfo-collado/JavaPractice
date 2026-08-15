package com.ejercicios._5;

import java.util.Scanner;

// 5. (Sencillo) Sobrecarga un método llamado `calcularArea()` para que funcione con diferentes figuras.

public class SobrecargaMetodoArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcion;
        do {
            System.out.print("""
                    ====== CÁLCULO DE ÁREAS ======
                    
                    ---- Figuras ----
                    
                    1. Círculo.
                    2. Triángulo.
                    3. Rectángulo.
                    4. Salir.
                    
                    ==>\s""");

            opcion = sc.nextLine().trim().toLowerCase();

           switch(opcion){
               case "1" -> {
                   double radio = pedirRadio(sc);
                   double area = calcularArea(radio);
                   System.out.printf("El área del círculo es de: %.3f cm² %n%n", area);
               }
               case "2" -> {
                   BaseYAltura triangulo =  pedirBaseYAltura(sc);
                   double area = calcularArea(triangulo.base(), triangulo.altura())/2;
                   System.out.printf("El área del triángulo es de: %.3f cm² %n%n", area);
               }
               case "3" -> {
                   BaseYAltura rectangulo = pedirBaseYAltura(sc);
                   double area = calcularArea(rectangulo.base(), rectangulo.altura());
                   System.out.printf("El área del rectángulo es de: %.3f cm² %n%n", area);
               }
               case "4" -> System.out.println("\nSaliendo del programa...");
               default -> System.out.println("Input inválido. Intenta de nuevo.\n");
           }

        } while(!opcion.equals("4"));

        sc.close();
    }

    record BaseYAltura (double base, double altura) {}

    private static BaseYAltura pedirBaseYAltura(Scanner sc) {
        double base;
        double altura;

        while (true) {
            try {
                System.out.print("Ingresa la base (cm): ");
                base = Double.parseDouble(sc.nextLine().trim());

                if(base <= 0){
                    System.out.println("Error: La base tiene que ser mayor a 0.\n");
                    continue;
                }

                System.out.print("Ingresa la altura (cm): ");
                altura = Double.parseDouble(sc.nextLine().trim());

                if(altura <=0){
                    System.out.println("Error: La altura tiene que ser mayor a 0.\n");
                    continue;
                }

                break;

            }catch(NumberFormatException e) {
                System.out.println("Error: Ingresa un número positivo válido.\n");
            }
        }

        return new BaseYAltura(base,altura);
    }


    private static double pedirRadio(Scanner sc) {
        double radio;
        while (true) {
            try {

                System.out.print("Ingresa el radio (cm): ");
                radio = Double.parseDouble(sc.nextLine().trim());

                if(radio <= 0) {
                    System.out.println("Error: El radio tiene que ser mayor a 0.\n");
                    continue;
                }

                break;

            }catch(NumberFormatException e) {
                System.out.println("Error: Ingresa un número positivo válido.\n");
            }
        }
        return radio;
    }


    private static double calcularArea(double base, double altura){
        return base * altura;
    }


    private static double calcularArea(double radio){
        return Math.PI * radio * radio;
    }


}

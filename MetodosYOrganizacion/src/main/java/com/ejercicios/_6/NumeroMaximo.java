package com.ejercicios._6;

import java.util.Scanner;

//6. (Intermedio) Crea un método que reciba tres números y devuelva el mayor sin utilizar `Math.max()`.

public class NumeroMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== NÚMERO MÁXIMO DE TRES ======");
        Numeros numeros = pedirNumeros(sc);
        double numeroMaximo = calcularNumeroMaximo(numeros.primero(), numeros.segundo(), numeros.tercero());
        System.out.println("\nEl número máximo de los tres es: " + numeroMaximo);
        sc.close();
    }

    record Numeros(double primero, double segundo, double tercero) {}

    private static Numeros pedirNumeros(Scanner sc) {
        double a;
        double b;
        double c;

        while (true) {
            try {
                System.out.print("Ingresa el primer número: ");
                a = Double.parseDouble(sc.nextLine().trim());

                System.out.print("Ingresa el segundo número: ");
                b = Double.parseDouble(sc.nextLine().trim());

                System.out.print("Ingresa el tercer número: ");
                c = Double.parseDouble(sc.nextLine().trim());

                break;

            }catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido. Intenta de nuevo.\n");
            }
        }
        return new Numeros(a, b, c);
    }

    private static double calcularNumeroMaximo(double a, double b, double c) {
        if( a >= b && a >= c) {
                return a;
        }
        else if ( b >= c && b >= a){
            return b;
        }
        else return c;
    }
}

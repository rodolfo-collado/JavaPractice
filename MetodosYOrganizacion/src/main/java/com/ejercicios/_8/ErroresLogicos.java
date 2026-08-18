package com.ejercicios._8;

import java.math.BigInteger;
import java.util.Scanner;

// 8. (Intermedio) Escribe un programa con errores lógicos y utiliza el depurador del IDE para inspeccionar variables y corregirlo.

public class ErroresLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BIG INTEGER PRACTICE =====");
        System.out.println("\n--- Ingresa el 1er número (muy grande) ---");
        BigInteger n1 = pedirNumero(sc);
        System.out.println("\n--- Ingresa el 2do número (no tan grande) ---");
        BigInteger n2 = pedirNumero(sc);

        boolean alcanceN1 = excedeRangoInt(n1);
        boolean alcanceN2 = excedeRangoInt(n2);


        System.out.print("\nNúmero 1: ");
        mostrarResultados(alcanceN1);
        System.out.print("Número 2: ");
        mostrarResultados(alcanceN2);


        sc.close();


    }

    private static BigInteger pedirNumero(Scanner sc){
       BigInteger numero;

        while (true) {
            try {
                System.out.print("Introduce un número: ");
                numero = new BigInteger(sc.nextLine().trim());
                break;

            }catch (NumberFormatException e){
                System.out.println("Error: Ingresa un número válido.\n");
            }
        }

        return numero;
    }

    private static boolean excedeRangoInt(BigInteger numero){
        return numero.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 || numero.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0; // Error lógico solucionado.
    }

    private static void mostrarResultados(boolean alcance) {
        if (alcance) System.out.println("El número excede el rango de int (o Integer).");
        else System.out.println("El número no excede el rango de int (o Integer).");
    }


}

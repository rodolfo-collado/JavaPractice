package com.ejercicios._7;

import java.math.BigInteger;
import java.util.Scanner;

// 7. (Intermedio) Calcula el factorial de un número mediante recursividad.

public class NumeroFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== CALCULADORA DE FACTORIAL ======");

        BigInteger numero = pedirNumero(sc);
        BigInteger factorial = calcularFactorial(numero);
        mostrarResultado(factorial);
        sc.close();


    }

    private static BigInteger pedirNumero(Scanner sc) {
        BigInteger numero;

        while (true) {
            try {
                System.out.print("Ingresa un número entero positivo: ");
                numero = new BigInteger((sc.nextLine().trim()));

                if(numero.compareTo(BigInteger.ZERO)<=0) {
                    System.out.println("Número inválido. Intente de nuevo.\n");
                    continue;
                }

                break;

            }catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero positivo.\n");
            }
        }

        return numero;
    }

    private static void mostrarResultado(BigInteger factorial) {
        System.out.println("El resultado es: " + factorial);
    }

    private static BigInteger calcularFactorial(BigInteger numero) {
        if (numero.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return numero.multiply(calcularFactorial(numero.subtract(BigInteger.ONE)));
    }


}

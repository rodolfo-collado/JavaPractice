package com.ejercicios._3;

// 3. (Sencillo) Solicita dos números y muestra su suma, resta, multiplicación, división y residuo.

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------- Ingresa dos números -------");
        System.out.print("Número 1: ");
        double numero1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double numero2 = sc.nextDouble();
        System.out.println();

        System.out.printf("""
                ------- Operaciones -------
                Suma: %.2f
                Resta: %.2f
                Multiplicacion: %.2f
                Division: %.2f
                Residuo: %.2f
                """,
                numero1 + numero2,
                numero1 - numero2,
                numero1 * numero2,
                numero1/numero2,
                numero1%numero2
        );
    }

}

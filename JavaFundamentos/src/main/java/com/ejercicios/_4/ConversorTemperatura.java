package com.ejercicios._4;

import java.util.Scanner;

// 4. (Sencillo) Convierte una temperatura de grados Celsius a Fahrenheit.

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Conversor de Temperatura ------");
        System.out.print("Ingrese la temperatura en celsius: ");

        double temperaturaCelsius = sc.nextDouble();
        double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
        System.out.println();

        System.out.printf("%.2f grados Celsius equivalen a %.2f grados Fahrenheit.",temperaturaCelsius, temperaturaFahrenheit );
    }
}

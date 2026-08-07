package com.ejercicios._5;

import java.util.Scanner;

// 5. (Sencillo) Solicita un número e indica si es positivo, negativo o igual a cero.

public class IndicadorDeSignoNumerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Indicador del signo de un número ------");
        System.out.print("Ingrese un número: ");
        int numero =  sc.nextInt();
        System.out.println();

        if (numero > 0){
            System.out.println("El número es positivo.");
        } else if (numero < 0 ) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

}

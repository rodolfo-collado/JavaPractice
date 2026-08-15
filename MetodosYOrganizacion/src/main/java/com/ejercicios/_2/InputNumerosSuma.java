package com.ejercicios._2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//  2. (Sencillo) Crea un método que reciba dos números y devuelva su suma.

public class InputNumerosSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Sumatoria de números consecutivos =====");

        List<Double> lista =  listaNumeros(sc);
        double suma = sumaNumeros(lista);

        System.out.println("\nLa suma de los números es: " + suma);

        sc.close();
    }

    private static List<Double> listaNumeros(Scanner sc) {
        List<Double> lista = new ArrayList<>();
        int cantidad;

        while(true){
            try{

                System.out.print("Cantidad de números a sumar: ");
                cantidad = sc.nextInt();

                if( cantidad <=0){
                    System.out.println("Ingresa un número mayor que 0.\n");
                    continue;
                }

                break;

            }catch (InputMismatchException e){
                System.out.println("Input inválido. Ingresa un número entero positivo.\n");
                sc.nextLine();
            }
        }
        for (int i = 1; i<=cantidad; i++){

            while (true){
                try{
                    System.out.print("(" + i + ") Ingresa un número: ");
                    lista.add(sc.nextDouble());
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Input inválido. Ingresa un número.\n");
                    sc.nextLine();
                }
            }
        }

        return lista;
    }

    private static Double sumaNumeros(List<Double> lista){
        double suma = 0;
        for (Double aDouble : lista) {
            suma += aDouble;
        }
        return suma;
    }
}

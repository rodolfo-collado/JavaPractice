package com.ejercicios._9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumeros {


    public static double ingresarNumero() {
        Scanner sc = new Scanner(System.in);

        double numero;
        while(true) {
            try{
                System.out.print("Ingrese un número (0 = cancelar): ");
                numero = sc.nextDouble();

                if (numero != 0){
                    System.out.println("Número ingresado correctamente.");
                    System.out.println();
                }else {
                    System.out.println("Saliendo...");
                    System.out.println();
                }
                break;

            }catch(InputMismatchException ex){
                System.out.println("Error al ingresar el numero. Intente de nuevo.");
                System.out.println();
                sc.nextLine();
            }
        }return numero;

    }
}

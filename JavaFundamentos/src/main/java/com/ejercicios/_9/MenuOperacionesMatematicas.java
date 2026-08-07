package com.ejercicios._9;

import java.util.Scanner;

import static com.ejercicios._9.InputNumeros.*;
import static com.ejercicios._9.OperacionesMatematicas.*;

// 9. (Difícil) Crea un menú con `do-while` para sumar, restar, multiplicar o dividir
// dos números. El menú debe repetirse hasta seleccionar “Salir”.

public class MenuOperacionesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcion = "";
        double n1 = 0;
        double n2 = 0;
        do{
            System.out.print("""
                    ======== SUMA DE DOS NÚMEROS =======
                    
                    -------- OPCIONES --------

                    1. Ingresar primer número.
                    2. Ingresar segundo número.
                    3. Sumar.
                    4. Restar.
                    5. Multiplicar.
                    6. Dividir.
                    7. Mostrar todos.
                    
                    ==> Comando (salir = cerrar programa):\s""");

            opcion = sc.nextLine().toLowerCase().trim();
            System.out.println();

            switch (opcion) {
                case "1" -> n1 = ingresarNumero();
                case "2" -> n2 = ingresarNumero();
                case "3" -> sumar(n1, n2);
                case "4" -> restar(n1, n2);
                case "5" -> multiplicar(n1, n2);
                case "6" -> dividir(n1, n2);
                case "7" -> mostrarTodos(n1, n2);
                case "salir" -> System.out.println("Cerrando programa...");
                default -> {
                    System.out.println("Opción Inválida, intenta de nuevo.");
                    System.out.println();
                }
            }

        }while(!opcion.equals("salir"));
    }
}

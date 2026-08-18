package com.ejercicios._9;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 9. (Difícil) Construye una calculadora modular donde cada operación esté implementada en un método diferente y los datos sean validados antes de calcular.

public class CalculadoraModular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcion;
        do {
            System.out.print("""
                ====== CALCULADORA MODULAR ======
                
                --- Comandos ---
                
                1. Ingresar un número
                2. Modificar un número
                3. Eliminar número
                4. Ver lista
                5. Sumar
                6. Restar
                7. Multiplicar
                8. Dividir
                9. Salir
                
                ==>\s""");

            opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1" -> ingresarNumero(sc);
                case "2" -> modificarNumero(sc);
                case "3" -> eliminarNumero(sc);
                case "4" -> verListaNumeros();
                case "5" -> sumar();
                case "6" -> restar();
                case "7" -> multiplicar();
                case "8" -> dividir();
                case "9" -> System.out.println("\nSaliendo del programa...\n");
                default -> System.out.println("Ingresa una opción válida.\n");
            }

        } while (!opcion.equals("9"));

        sc.close();
    }

    private static final List<Double> listaNumeros = new ArrayList<>();


    private static boolean listaEsValida() {
        if(listaNumeros.size() <= 1) {
            System.out.println("Error: No hay suficientes datos en la lista.\n");
            return false;
        }
        return true;
    }

    private static void formatearListaNumeros() {
        StringBuilder listaFormateada =  new StringBuilder();
        for (int i = 0; i < listaNumeros.size(); i++) {

            if(i == listaNumeros.size() - 1)
                listaFormateada.append(listaNumeros.get(i));
            else
                listaFormateada.append(listaNumeros.get(i)).append(", ");
        }

        System.out.println("Números en la lista: " + listaFormateada);
    }

    private static void ingresarNumero(Scanner sc) {
        while (true) {
            try{
                System.out.print("Ingresa un número: ");
                listaNumeros.add(Double.parseDouble(sc.nextLine().trim()));
                System.out.println();
                break;

            }catch(NumberFormatException e){
                System.out.println("Error: Ingresa un número válido.\n");
            }
        }
    }

    private static void modificarNumero(Scanner sc) {
        int posicion;
        double numero;
        while (true) {
            try{
                if (listaNumeros.isEmpty()) {
                    System.out.println("Error: No hay suficientes datos.\n");
                    break;
                }

                verListaNumeros();

                System.out.print("Escribe la posición del número que deseas modificar: ");
                posicion = Integer.parseInt(sc.nextLine().trim());

                if (posicion <= 0 || posicion > listaNumeros.size()) {
                    System.out.println("Ingresa una posición válida.\n");
                    continue;
                }

                System.out.print("Ingresa el nuevo número: ");
                numero = Double.parseDouble(sc.nextLine().trim());

                listaNumeros.set(posicion - 1, numero);
                System.out.println();
                break;

            }catch (NumberFormatException e){
                System.out.println("Error: Ingresa un número válido.");
            }
        }
    }

    private static void eliminarNumero(Scanner sc) {

        int indice;
        while (true) {
            try {
                if (listaNumeros.isEmpty()) {
                    System.out.println("Error: No hay suficientes datos.\n");
                    break;
                }

                verListaNumeros();

                System.out.print("Escribe la posición del número que deseas eliminar: ");
                indice = Integer.parseInt(sc.nextLine().trim());

                if(indice <= 0 || indice > listaNumeros.size()) {
                    System.out.println("Error: Ingresa una posición valida.\n");
                    continue;
                }

                listaNumeros.remove(indice - 1);
                System.out.println();
                break;


            }catch(NumberFormatException e){
                System.out.println("Error: Ingresa un número válido.\n");
            }
        }

    }

    private static void verListaNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println("\n--- Lista de numeros ---");
            for (int i = 0; i < listaNumeros.size(); i++) {
                System.out.println(i + 1 + ". " + listaNumeros.get(i));
            }
            System.out.println();
        }else System.out.println("No hay números en la lista.\n");

    }

    private static void sumar() {
        if (listaEsValida()) {
            formatearListaNumeros();
            double suma = 0;
            for (Double listaNumero : listaNumeros) {
                suma += listaNumero;
            }
            System.out.println("La suma es: " + suma + "\n");
        }


    }

    private static void restar() {
        if (listaEsValida()) {
            formatearListaNumeros();
            double resta = 0;
            for (int i = 0; i < listaNumeros.size(); i++) {
                if( i == 0) resta = listaNumeros.get(i);
                else resta -= listaNumeros.get(i);
            }
            System.out.println("La resta es: " + resta + "\n");
        }
    }

    private static void multiplicar() {
        if (listaEsValida()) {
            formatearListaNumeros();
            double multiplicacion = 1;
            for (Double listaNumero : listaNumeros) {
                multiplicacion *= listaNumero;
            }
            System.out.println("La multiplicacion es: " + multiplicacion + "\n");
        }
    }

    private static void dividir() {
        if (listaEsValida()) {
            formatearListaNumeros();
            double division = 0;
            for (int i = 0; i < listaNumeros.size(); i++) {
                if (i == 0)
                    division = listaNumeros.get(i);
                else if (listaNumeros.get(i) == 0){
                    System.out.println("Error: No se puede dividir por cero.\n");
                    return;
                }
                else
                    division /= listaNumeros.get(i);

            }
            System.out.printf("La division es: %.3f%n%n", division);
        }
    }
}

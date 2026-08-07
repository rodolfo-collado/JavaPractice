package com.ejercicios._9;

public class OperacionesMatematicas {

    public static void sumar(double n1, double n2) {
        String mensaje = "la suma de los números " + n1 + " y " + n2 + " = " + "%.2f".formatted(n1 + n2);
        validar(n1, n2, mensaje);

    }

    public static void restar(double n1, double n2) {
        String mensaje = "la resta de los números " + n1 + " y " + n2 + " = " + "%.2f".formatted(n1 - n2);
        validar(n1, n2, mensaje);

    }

    public static void multiplicar(double n1, double n2) {
        String mensaje = "la multiplicación de los números " + n1 + " y " + n2 + " = " + "%.2f".formatted(n1 * n2);
        validar(n1, n2, mensaje);


    }

    public static void dividir(double n1, double n2) {
        String mensaje = "la división de los números " + n1 + " y " + n2 + " = " + "%.2f".formatted(n1 / n2);
        validar(n1, n2, mensaje);

    }

    public static void mostrarTodos(double n1, double n2) {
        sumar(n1, n2);
        restar(n1, n2);
        multiplicar(n1, n2);
        dividir(n1, n2);
    }

    private static void validar(double n1, double n2, String mensaje) {
        if(n1 == 0 || n2 == 0) {
            System.out.println("Error de sistema. Ingresa los números a operar primero.");
            System.out.println();
        }else {
            System.out.println(mensaje);
            System.out.println();
        }
    }

}

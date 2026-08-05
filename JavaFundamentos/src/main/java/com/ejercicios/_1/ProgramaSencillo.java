package com.ejercicios._1;

// 1. (Sencillo) Crea un programa que muestre tu nombre, edad y lenguaje de programación favorito.

public class ProgramaSencillo {
    public static void main(String[] args) {
        String nombreCompleto = "Rodolfo Alfredo Ramírez Collado";
        String carreraCursando = "Ing. en Sistemas";
        String lenguajeFavorito = "Java";
        Integer edad = 19;


        System.out.printf("""
                \n===== DATOS ESTUDIANTE =====
                Nombre: %s
                Edad: %d
                Carrera: %s
                Lenguaje favorito: %s
                """, nombreCompleto, edad, carreraCursando, lenguajeFavorito);
    }
}

package com.ejercicios._10;

import java.util.Scanner;

//10. (Difícil) Crea un sistema de conversión con métodos para temperatura, distancia y peso.
// Organiza el menú, la lectura de datos y los cálculos en métodos separados.
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SubMenus subMenu = new SubMenus();
        String opcion;

        do {
            System.out.print("""
                        ===== CONVERSOR DE TEMPERATURA, DISTANCIA Y PESO =====
                        
                        ---- Seleccione la unidad a convertir ----
                        
                        1. Temperatura
                        2. Distancia
                        3. Peso
                        4. Salir
                        
                        ==>\s""");

            opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1" -> subMenu.temperatura(sc);
                case "2" -> subMenu.distancia(sc);
                case "3" -> subMenu.peso(sc);
                default -> System.out.println("Ingresa una opción válida;");
            }
        } while (!opcion.equals("4"));

        sc.close();
    }


}

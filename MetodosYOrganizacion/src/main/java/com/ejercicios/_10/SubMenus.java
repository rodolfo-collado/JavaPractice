package com.ejercicios._10;

import java.util.Scanner;

public class SubMenus {

    public void temperatura(Scanner sc) {
        ConversorTemperatura ct = new ConversorTemperatura();

        String opcion;
        do {
            System.out.println("""
                ===== CONVERSOR DE TEMPERATURA =====
                
                1. °C a K
                2. °C a °F
                3. °F a °C
                4. °F a K
                5. K a °C
                6. K a °F
                7. Salir
                
                ==>\s""");

            opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1" -> ct.convertirCelciusAKelvin(sc);
                case "2" -> ct.convertirCelciusAFahrenheit(sc);
                case "3" -> ct.convertirFahrenheitACelcius(sc);
                case "4" -> ct.convertirFahrenheitAKelvin(sc);
                case "5" -> ct.convertirKelvinACelcius(sc);
                case "6" -> ct.convertirKelvinAFahrenheit(sc);
                case "7" -> System.out.println("\nSaliendo al menú principal...\n");
                default -> System.out.println("Ingresa una opción válida.\n");
            }

        } while (!opcion.equals("7"));
    }

    public void distancia(Scanner sc) {

    }

    public void peso(Scanner sc) {

    }
}

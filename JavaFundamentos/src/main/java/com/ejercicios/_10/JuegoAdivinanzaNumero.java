package com.ejercicios._10;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// 10. (Difícil) Crea un juego para adivinar un número aleatorio entre 1 y 100.
// Indica si cada intento es mayor o menor y limita la partida a siete intentos.

public class JuegoAdivinanzaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n===== ADIVINA UN NÚMERO =====");

        int contador = 7;
        int numeroJugador = 0;
        int numeroRandom = rand.nextInt(100) + 1;
        do {
            if(contador == 0){
                System.out.println("\nHas agotado los intentos. Inténtalo más tarde!");
                break;
            }

            try{
                System.out.println("\n----- Intentos disponibles: "+ contador + " -----");
                System.out.print("Ingresa un número del 1 al 100: ");
                numeroJugador = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Input Invalido! Ingresa un número del 1 al 100.");
                sc.nextLine(); // Limpia buffer de Scanner, evita repetir ciclo indefinidamente.
                continue;
            }

            if (numeroJugador < 1 || numeroJugador > 100) {
                System.out.println("Ingresa un número que este en el rango del 1 al 100.");
                continue;
            }
            else if (numeroJugador == numeroRandom) {
                System.out.println("\nFelicidades!, has adivinado el número.");
                break;
            }
            else if (Math.abs(numeroRandom - numeroJugador) <= 5) {
                System.out.println("Estuviste bastante cerca, vuelve a intentarlo.");
            }

            if (numeroJugador > numeroRandom) {
                System.out.println("Pista: El número es menor a " + numeroJugador);
            }
            else{
                System.out.println("El número es mayor a " + numeroJugador);
            }
//            else if (((numeroRandom - numeroJugador) >= -10) && ((numeroRandom - numeroJugador) <= 10)){
//                System.out.println("Estuviste bastante cerca, vuelve a intentarlo");
//            }
            contador--;
        } while (numeroJugador != numeroRandom);
    }
}

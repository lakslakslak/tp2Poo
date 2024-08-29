package ar.edu.unju.escmi.ejercicio14;

import java.util.Scanner;

public class Ejercicio14                   {
    public static void main(String[] args) {
        // Crear un array de 8 posiciones
        int[] numeros = new int[8];
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los valores para el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el índice y el valor almacenado en cada posición
        System.out.println("\nValores almacenados en el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}

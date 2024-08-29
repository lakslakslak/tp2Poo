package ar.edu.unju.escmi.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese 5 números enteros
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            // Verificar si el número es par
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " no es par.");
            }
        }

        scanner.close();
    }
}

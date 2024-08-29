package ar.edu.unju.escmi.ejercicio15;

import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		while (true) {
			System.out.print("Ingrese un número entero entre 3 y 10: ");
			n = scanner.nextInt();
			if (n >= 3 && n <= 10) {
				break;
			} else {
				System.out.println("El número debe estar entre el 3 y el 10. Intente de nuevo");
			}
		}
		
		// Crear un array con el tamaño ingresado por el usuario
		int[] array = new int[n];
		
		//Solicitar que el usuario ingrese los valores para el array
		for (int i = 0; i < n; i++) {
			System.out.print("Ingrese un número entero para la posicion " + i + ": ");
			array[i] = scanner.nextInt();
		}
		
		//Mostrar los valores del array y la suma total
		int suma = 0;
		System.out.println("\nValores del array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + i + ": " + array[i]);
			suma += array[i];
		}
		
		System.out.println("\nSuma de todos los valores: " + suma);
	}
}

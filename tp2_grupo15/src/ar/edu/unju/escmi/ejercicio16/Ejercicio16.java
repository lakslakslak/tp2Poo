package ar.edu.unju.escmi.ejercicio16;


	import java.util.Scanner;

	public class Ejercicio16 {

	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese un número entero entre 5 y 10
	        int tamaño;
	        do {
	            System.out.print("Ingrese un número entero entre 5 y 10: ");
	            tamaño = scanner.nextInt();
	        } while (tamaño < 5 || tamaño > 10);

	        // Crear un array de tipo String con el tamaño ingresado
	        String[] nombres = new String[tamaño];

	        // Solicitar al usuario que ingrese nombres para llenar el array
	        scanner.nextLine(); // Limpiar el buffer
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.print("Ingrese un nombre para la posición " + i + ": ");
	            nombres[i] = scanner.nextLine();
	        }

	        // Mostrar el contenido del array desde el primer índice (0)
	        System.out.println("\nContenido del array comenzando por el primer índice:");
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.println("Posición " + i + ": " + nombres[i]);
	        }

	        // Mostrar el contenido del array comenzando por la última posición
	        System.out.println("\nContenido del array comenzando por la última posición:");
	        for (int i = nombres.length - 1; i >= 0; i--) {
	            System.out.println("Posición " + i + ": " + nombres[i]);
	        }

	        // Cerrar el scanner
	        scanner.close();
	    }
	}

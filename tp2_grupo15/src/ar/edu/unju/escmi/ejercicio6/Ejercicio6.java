package ar.edu.unju.escmi.ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese el valor del radio
	        System.out.print("Ingrese el valor del radio del círculo (byte): ");
	        byte radio = scanner.nextByte();

	        // Calcular el área del círculo utilizando Math.PI y Math.pow()
	        double area = Math.PI * Math.pow(radio, 2);

	        // Mostrar el resultado por consola
	        System.out.println("El área del círculo con radio " + radio + " es: " + area);
	        
	        // Cerrar el scanner
	        scanner.close();
	    }
	}


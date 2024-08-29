package ar.edu.unju.escmi.ejercicio18;
import java.util.Scanner;
public class Ejercicio18 {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	Integer num1=null ,num2 = null;
		for (boolean valid = false; !valid; ) {
		System.out.print("Ingrese un número entero fuera del rango [-128, 127]: ");
		num1 = scanner.nextInt();
		if (num1 >= -128 && num1 <= 127) {
		System.out.println("El número ingresado está dentro del rango [-128, 127].Inténtelo nuevamente.");
		} else {
			valid = true;
			}
		}
		
	for (boolean valid = false; !valid; ) {
		System.out.print("Ingrese un número entero fuera del rango [-128, 127]: ");
		num2 = scanner.nextInt();
			if (num2 >= -128 && num2 <= 127) {
				System.out.println("El número ingresado está dentro del rango [-128, 127]. Inténtelo nuevamente.");
			}else {
				valid = true;
			}
	}
	
	System.out.println("Referencia de num1: " + System.identityHashCode(num1));
	System.out.println("Referencia de num2: " + System.identityHashCode(num2));
		if (num1 == num2) {
			System.out.println("Las referencias son iguales");
		} else {
			System.out.println("Las referencias no son iguales");
			}
		if (num1.equals(num2)) {
			System.out.println("Los valores son iguales");
		} else {
			System.out.println("Los valores no son iguales");
			}
		
	scanner.close();
	}
}
package ar.edu.unju.escmi.ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

for (int i = 0; i < 5; i++) {
while (true) {
System.out.println("Ingrese la edad: ");

try {
int edad = scanner.nextInt();
if (edad >= 1 && edad <= 12) {
System.out.println("Es un niño");
} else if (edad >= 13 && edad <= 20) {
System.out.println("Es un joven");
} else if (edad >= 21 && edad <= 100) {
System.out.println("Es un adulto");
} else {
System.out.println("Edad no permitida");
}
break; // Salir del bucle si la entrada es válida
} catch (Exception e) { // Verificar la entrada
System.out.println("Entrada no válida. Por favor, ingrese un número.");
scanner.next(); //Limpia la entrada no válida del escáner
}
}
}
System.out.println("Fin del programa");
scanner.close();
}
}
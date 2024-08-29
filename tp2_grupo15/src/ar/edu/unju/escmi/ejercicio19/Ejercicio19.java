package ar.edu.unju.escmi.ejercicio19;

public class Ejercicio19 {
public static void main(String[] args) {
String texto1 = "Chau";
String texto2 = "Chau";
//Comparación de referencias
System.out.println("Comparación de referencias (texto1 == texto2): " + (texto1 ==

texto2));

//Comparacion de contenido con equals()
System.out.println("Comparación de contenido (texto1.equals(texto2)): " +

texto1.equals(texto2));

//Crear un nuevo objeto String usando el constructor
String texto3 = new String("Chau");
//Comparación de referencias
System.out.println("Comparación de referencias (texto1 == texto3): " + (texto1 ==

texto3));

//Comparación de contenido con equals()
System.out.println("Comparación de contenido (texto1.equals(texto3)): " +

texto1.equals(texto3));
}
}
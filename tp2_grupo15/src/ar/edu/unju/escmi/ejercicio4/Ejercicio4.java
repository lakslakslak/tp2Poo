package ar.edu.unju.escmi.ejercicio4;

public class Ejercicio4 {

   public static void main(String[] args) {
       // Declarar una variable de tipo entero denominada num
       int num = 3;

       // Realizar el cálculo (num * (num + 1) / 2)^2
       int resultado = (num * (num + 1)) / 2;
       double resultadoFinal = Math.pow(resultado, 2);

       // Mostrar el resultado por consola
       System.out.println("El resultado de la expresión para num = " + num + " es: " + resultadoFinal);
   }
}

package ar.edu.unju.escmi.ejercicio10;

public class Ejercicio10 {

	 public static void main(String[] args) {
	        // Declarar las variables
	        int a = 7;
	        int b = 5;
	        int c = -14;

	        // Evaluar las expresiones y mostrar los resultados por consola
	        System.out.println("a) a > 3: " + (a > 3));                     // true
	        System.out.println("b) a > c: " + (a > c));                     // true
	        System.out.println("c) a < c: " + (a < c));                     // false
	        System.out.println("d) b < c: " + (b < c));                     // false
	        System.out.println("e) b != c: " + (b != c));                   // true
	        System.out.println("f) a == 3: " + (a == 3));                   // false
	        System.out.println("g) a * b == 15: " + (a * b == 15));         // true
	        System.out.println("h) a * b == -30: " + (a * b == -30));       // false
	        System.out.println("i) c / b < a: " + (c / b < a));             // true
	        System.out.println("j) c / b == -10: " + (c / b == -10));       // false
	        System.out.println("k) c / b == -4: " + (c / b == -4));         // true
	        System.out.println("l) a + b + c == 5: " + (a + b + c == 5));   // false
	        System.out.println("m) (a + b == 8) && (a - b == 2): " + ((a + b == 8) && (a - b == 2))); // true
	        System.out.println("n) (a + b == 8) || (a - b == 6): " + ((a + b == 8) || (a - b == 6))); // true
	        System.out.println("o) a > 3 && b > 3 && c < 3: " + (a > 3 && b > 3 && c < 3));           // true
	        System.out.println("p) a > 3 && b >= 3 && c < -3: " + (a > 3 && b >= 3 && c < -3));       // true
	    }
	}

package ar.edu.unju.escmi.ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Creación de dos objetos Integer con valores dentro del rango [-128, 127]
        Integer num1 = 50;
        Integer num2 = 50;

        // Imprimir la referencia de memoria de cada objeto
        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));

        // Comparar las referencias utilizando ==
        if (num1 == num2) {
            System.out.println("Las referencias son iguales.");
        } else {
            System.out.println("Las referencias no son iguales.");
        }

        // Comparar los valores utilizando equals()
        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales.");
        } else {
            System.out.println("Los valores no son iguales.");
        }

        // Cambiar el valor de num2 para estar fuera del rango de caché
        num2 = 80;

        // Imprimir la referencia de memoria de num2 nuevamente
        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));

        // Comparar nuevamente las referencias utilizando ==
        if (num1 == num2) {
            System.out.println("Las referencias son iguales.");
        } else {
            System.out.println("Las referencias no son iguales.");
        }

        // Comparar nuevamente los valores utilizando equals()
        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales.");
        } else {
            System.out.println("Los valores no son iguales.");
        }
    }
}

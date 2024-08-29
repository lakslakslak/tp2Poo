package ar.edu.unju.escmi.ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Crear y asignar valor a textoOriginal
        String textoOriginal = "Hoja";

        // Crear textoModificado usando el método replace en textoOriginal
        String textoModificado = textoOriginal.replace("ja", "la");

        // Mostrar los valores de textoOriginal y textoModificado en la consola
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto modificado: " + textoModificado);
    }
}

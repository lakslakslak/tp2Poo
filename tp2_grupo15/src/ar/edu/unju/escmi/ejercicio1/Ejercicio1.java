package ar.edu.unju.escmi.ejercicio1;
import java.time.LocalDate;

public class Ejercicio1 {

	public static void main(String[] args) {
		int dni = 47082971;

		char ejemplar = 'A';
		int edadFamiliar = 55;
		String procer = "José de San Martín";
		String numeroBingo = "1 15 18 23 30 45 59 77 81 88" ;
		double precioCelular = 574999.99;
		double estatura = 1.67;
		double pesoMascota = 3.5;
		LocalDate inicioCuatrimestre = LocalDate.of(2024, 8, 12);
		LocalDate finCuatrimestre = LocalDate.of(2024, 11, 20);
		System.out.println("DNI: " + dni);
		System.out.println("Ejemplar: " + ejemplar);
		System.out.println("Edad del familiar: " + edadFamiliar);
		System.out.println("Prócer: " + procer);
		System.out.println("Número de bingo: " + numeroBingo);
		System.out.println("Precio del celular: $" + precioCelular);
		System.out.println("Estatura: " + estatura + " metros");
		System.out.println("Peso de su mascota: " + pesoMascota + " kg");
		System.out.println("Inicio del cuatrimestre: " + inicioCuatrimestre);
		System.out.println("Fin del cuatrimestre: " + finCuatrimestre);
	}

}

package jaimito;

import java.util.Scanner;

/*
 * Introducir por teclado un número n; a continuación solicitar al usuario que teclee n
 * números. Muestra la suma, resta, multiplicación y división de todos
 */
public class Main {
	public static void main(String[] args) {
		int longitud, numero;

		int suma = 0, resta = 0, multiplicacion = 1;
		float division = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la longitud: ");
		longitud = sc.nextInt();

		int[] cadena = new int[longitud];
		
		// Pides el primer numero fuera
		System.out.println("Escribe números (" + 1 + "/" + longitud + "):");
		numero = sc.nextInt();
		
		// Inicializas las variables con ese numero
		division = numero;
		resta = numero;
		suma = numero;
		multiplicacion = numero;

		// Operas sobre el primer numero
		// cadena.length -1 xq ese primer numero ya lo hemos pedido fuera
		for (int i = 0; i < cadena.length-1; i++) {
			System.out.println("Escribe números (" + (i+2) + "/" + longitud + "):");
			numero = sc.nextInt();

			suma += numero;
			resta -= numero;
			multiplicacion *= numero;
			division /= numero;

		}

		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicacion: " + multiplicacion);
		System.out.println("Division: " + division);

		sc.close();
	}
}

package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escribe una función a la que se le pase como parámetro
 * un número entero y devuelva el número de divisores primos que tiene.
 */

/*
 * Pruebas de Entrada
 * 
 * Introduce un numero: abc
 * Input inválida.
 * 
 * Introduce un numero: 10
 * 10 tiene 2 divisores primos.
 * 
 */

public class Main {
	public static void main(String[] args) {
		// Variable para guardar el input
		int input = 0;
		// Variable para comprobar el input
		boolean ok = false;
		// Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Preguntar al usuario un numero
			System.out.printf("Introduce un numero: ");
			input = sc.nextInt();

			// Validar el input
			ok = true;
		} catch (InputMismatchException e) {
			System.out.printf("Input inválida.\n");
		}

		// Si la pregunta es valida
		if (ok)
			System.out.printf("%d tiene %d divisores primos.\n", input, Divisores.nDivisoresPrimos(input));

		// Cerrar scanner
		sc.close();
	}
}

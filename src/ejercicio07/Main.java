package ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Diseña una función que debe devolver true si n es primo
 * y false en caso contrario.
 */

/*
 * Pruebas de Entrada
 * 
 * Introduce un numero: abc
 * Input inválida.
 * 
 * Introduce un numero: 43
 * 43 es primo
 * 
 * Introduce un numero: 50
 * 50 no es primo
 * 
 */

public class Main {
	public static void main(String[] args) {
		// Variable para guardar el input del usuario
		int n = 0;

		// Variable para comprobar input
		boolean ok = false;

		// Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedir un numero
			System.out.printf("Introduce un numero: ");
			n = sc.nextInt();
			ok = true;
			
		} catch (InputMismatchException e) {
			System.out.printf("Input inválida.\n");
		}

		// Imprimir si es primo o no
		if (ok) {
			System.out.printf("%d %s", n, Primo.isPrimo(n) ? "es primo" : "no es primo");
		}

		// Cerrar scanner
		sc.close();
	}
}

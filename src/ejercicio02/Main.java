package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escribe una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
 */

/*
 * Pruebas de Entrada
 * 
 * Introduce el primero numero: abc
 * Input inválida.
 * Nada que mostrar.
 * 
 * Introduce el primero numero: -3
 * Introduce el segundo numero: 3
 *   -3 -2 -1 0 1 2 3 
 */

public class Main {
	public static void main(String[] args) {
		// Guardar los numeros
		int num1 = 0, num2 = 0;
		// mirar si es valido
		boolean ok = false;
		Scanner sc = new Scanner(System.in);

		try {
			// Preguntar numeros al usuario
			System.out.printf("Introduce el primero numero: ");
			num1 = sc.nextInt();

			System.out.printf("Introduce el segundo numero: ");
			num2 = sc.nextInt();

			// Validar el input
			ok = true;
		} catch (InputMismatchException e) {
			System.out.printf("Input inválida.\n");
		}

		// Si el input es válida
		if (ok) {
			NumerosEntre.numeroComprendidosEntre(num1, num2);
		} else {
			System.out.printf("Nada que mostrar.\n");
		}

		sc.close();
	}
}

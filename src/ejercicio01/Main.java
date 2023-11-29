package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Diseña la función eco() a la que se le pasa como parámetro de
 * entrada un número n, y muestra por pantalla n veces el mensaje “Eco…”.
 */

/*
 * Pruebas de Entrada
 * 
 * Introduce un numero: -3
 * Input inválida
 * 
 * Introduce un numero: abc
 * Input inválida
 * 
 * Introduce un numero: 3
 * Echo...
 * Echo...
 * Echo...
 */

public class Main {
	public static void main(String[] args) {
		int n = -1;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.printf("Introduce un numero: ");
			n = sc.nextInt();
			if (n < 1)
				System.out.printf("Input inválida");
		} catch (InputMismatchException e) {
			System.out.printf("Input inválida");
		}
		
		if (n >= 1)
			Echo.echo(n);

		sc.close();
	}
}


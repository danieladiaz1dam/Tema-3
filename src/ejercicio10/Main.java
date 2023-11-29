package ejercicio10;

import java.util.Scanner;

/*
 * Realiza un programa que lea una fecha introduciendo el día, mes y año
 * por separado y nos diga si la fecha es correcta o no.
 */

/*
 * Pruebas de Entrada
 * 
 * Introduce una fecha dd/mm/yyyy: > abc
 * Input inválida.
 * 
 * 
 * Introduce una fecha dd/mm/yyyy: > 1/1/1/1
 * Input inválida.
 *
 *
 * Introduce una fecha dd/mm/yyyy: > 23/4
 * Input inválida.
 * 
 * 
 * Introduce una fecha dd/mm/yyyy: > 29/2/1992
 * La fecha es válida.
 *
 *
 * Introduce una fecha dd/mm/yyyy: > 29/2/2023
 * La fecha es inválida.
 *
 *
 * Introduce una fecha dd/mm/yyyy: > 30/2/2023
 * La fecha es inválida.
 */

public class Main {
	public static void main(String[] args) {
		// Variables para la fecha
		int day = 0, month = 0, year = 0;
		String input;
		String[] split;

		// Variable para validar input
		boolean ok = false;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pedir input y separar valores
		System.out.printf("Introduce una fecha dd/mm/yyyy: ");
		input = sc.nextLine();
		split = input.split("/");

		// Comprobar que el input es valido
		if (split.length != 3)
			System.out.printf("Input inválida.\n");
		else
			ok = true;

		// Si la forma del input es válida, comprobar sus valores
		if (ok) {
			ok = false;

			try {
				day = Integer.valueOf(split[0]);
				month = Integer.valueOf(split[1]);
				year = Integer.valueOf(split[2]);

				ok = true;
			} catch (NumberFormatException e) {
				System.out.printf("Input inválida.\n");
			}
		}

		// Si los valores son correctos, llamar a la funcion
		if (ok) {
			if (Fecha.validate(day, month, year))
				System.out.printf("La fecha es válida.\n");
			else
				System.out.printf("La fecha es inválida.\n");
		}
		
		// Cerrar scanner
		sc.close();
	}
}

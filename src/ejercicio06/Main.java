package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio06.Cilindro.Opcion;

/*
 * Realiza una función que calcule y muestre el área y el volumen
 * de un cilindro, según se especifique.
 */

/*
 * Pruebas de entrada
 * 
 * Introduce el radio del cilindro: > 2
 * Introduce la altura del cilindro: > 6
 * Quieres calcular el area (1)  o el volumen(2)?: > 1
 * 
 * El AREA de un cilindro es 100,53 m2.
 * 
 * 
 * Introduce el radio del cilindro: > 2
 * Introduce la altura del cilindro: > 6
 * Quieres calcular el area (1)  o el volumen(2)?: > 2
 * 
 * El VOLUMEN de un cilindro es 75,40 m3.
 */

public class Main {
	public static void main(String[] args) {
		// Variables para guardar datos
		double radio = 0, altura = 0, res = 0;
		Opcion opt = Opcion.AREA;
		// Variable para comprobar input
		boolean ok = false;
		// Scanner
		Scanner sc = new Scanner(System.in);

		try {

			// Pedir info al usuario
			System.out.printf("Introduce el radio del cilindro: ");
			radio = sc.nextInt();

			System.out.printf("Introduce la altura del cilindro: ");
			altura = sc.nextInt();

			System.out.printf("Quieres calcular el area (1)  o el volumen(2)?: ");
			opt = sc.nextInt() == 1 ? Opcion.AREA : Opcion.VOLUMEN;

			ok = true;
		} catch (InputMismatchException e) {
			System.out.printf("Input inválida.\n");
		}

		if (ok) {
			res = Cilindro.calcular(opt, radio, altura);

			if (opt == Opcion.AREA)
				System.out.printf("\nEl area de un cilindro es %.2f m2.", res);
			else
				System.out.printf("\nEl volumen de un cilindro es %.2f m3.", res);
		}

		// Cerrar scanner
		sc.close();
	}
}

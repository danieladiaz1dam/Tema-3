package ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Diseñar la función calculadora(), a la que se le pasan dos números
 * reales (operandos) y qué operación se desea realizar con ellos.
 * Las operaciones disponibles son sumar, restar, multiplicar o dividir.
 */

/*
 * Pruebas de Entrada
 * 
 * Introduce el primer numero: > abc
 * Input inválida.
 * 
 * 
 * Introduce el primer numero: > 3
 * Introuce el segundo numero: > 3
 * ###################
 * # 1.- Sumar       #
 * # 2.- Restar      #
 * # 3.- Multiplicar #
 * # 4.- Dividir     #
 * ###################
 * Introduce la operación deseada: > 1
 * Output: 6.0
 * 
 * 
 * Introduce el primer numero: > 3
 * Introuce el segundo numero: > 0
 * ###################
 * # 1.- Sumar       #
 * # 2.- Restar      #
 * # 3.- Multiplicar #
 * # 4.- Dividir     #
 * ###################
 * Introduce la operación deseada: > 4
 * Output: Infinity
 * 
 * 
 * Introduce el primer numero: > 3
 * Introuce el segundo numero: > 3
 * ###################
 * # 1.- Sumar       #
 * # 2.- Restar      #
 * # 3.- Multiplicar #
 * # 4.- Dividir     #
 * ###################
 * Introduce la operación deseada: > 5
 * Opción inválida
 * Output: 0.0
 */

public class Main {
	public static void main(String[] args) {
		// Variables para guardar los numeros y la operacion
		int num1 = 0, num2 = 0, op = 0;
		// Variable para validar el input
		boolean ok = false;
		// Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedir numeros y operacion
			System.out.printf("Introduce el primer numero: ");
			num1 = sc.nextInt();

			System.out.printf("Introuce el segundo numero: ");
			num2 = sc.nextInt();

			Calculadora.printMenu();
			op = sc.nextInt();

			// Validar input
			ok = true;

		} catch (InputMismatchException e) {
			System.out.printf("Input inválida.\n");
		}
		
		// Si el input es válido
		if (ok) {
			System.out.printf("Output: %s", Calculadora.calcular(op, num1, num2));
		}

		// Cerrar scanner
		sc.close();
	}
}

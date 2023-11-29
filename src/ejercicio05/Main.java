package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realiza un programa que escriba la tabla de multiplicar de un número
 * introducido por teclado. Para ello implementa una función que reciba
 * como parámetro un número entero y muestre por pantalla la tabla de
 * multiplicar de dicho número.
 */

/*
 * Pruebas de entrada
 * 
 * Introduce un numero: > abc
 * Input invalida.
 * Nada que mostrar.
 * 
 * Introduce un numero: > 8
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * 8 x 4 = 32
 * 8 x 5 = 40
 * 8 x 6 = 48
 * 8 x 7 = 56
 * 8 x 8 = 64
 * 8 x 9 = 72
 * 8 x 10 = 80
 * 
 */

public class Main {
	public static void main(String[] args) {
		// Variable para guardar el numero
		long n = 0;
		// Variable para verificar input
		boolean ok = false;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedir un numero
			System.out.printf("Introduce un numero: ");
			n = sc.nextLong();
			
			ok = true;
			
		} catch (InputMismatchException e) {
			System.out.printf("Input invalida.\n");
		}
		
		// Imprimir la tabla
		if (ok) {
			Tabla.tablaDel(n);
		} else
			System.out.printf("Nada que mostrar.\n");
		
		// Cerrar scanner
		sc.close();
	}
}

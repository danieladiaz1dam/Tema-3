package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos.
 */

/* Pruebas de Entrada
 * 
 * Introduce el primer numero: abc
 * Input inválida.
 *
 *
 * Introduce el primer numero: 4,5
 * Introduce el segundo numero: 245,6
 * 245.6 es el mayor
 */

public class Main {
	public static void main(String[] args) {
		double num1 = 0, num2=0;
		boolean ok = false;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.printf("Introduce el primer numero: ");
			num1 = sc.nextDouble();
			
			System.out.printf("Introduce el segundo numero: ");
			num2 = sc.nextDouble();
			
			ok = true;
		} catch (InputMismatchException e) {
			System.out.printf("Input inválida.\n");
		}
		
		if (ok) {
			System.out.printf("%s es el mayor", Max.max(num1, num2));
		}
		
		sc.close();
	}
}

package ejercicio04;

import java.util.Scanner;

/*
 * Crear una función que devuelva un tipo booleano que indique si el
 * carácter que se pasa como parámetro de entrada corresponde con una vocal
 */

/*
 * Pruebas de Entrada
 * 
 * Introduce una letra: > a
 * 'a' es una vocal.
 * 
 * 
 * Introduce una letra: > d
 * 'd' es una letra.
 * 
 * 
 * Introduce una letra: > 4
 * '4' es un numero.
 * 
 * 
 * Introduce una letra: > ñ
 * 'ñ' es un caracter especial.
 * 
 * 
 * Introduce una letra: > 
 * No has introducido nada.
 * 
 * 
 * Introduce una letra: >  *caracter no esperado*
 * No se que has introducido.
 *
 */

public class Main {
	public static void main(String[] args) {
		// Varaible para guardar la letra
		char c;
		// Variable para volver a preguntar
		// Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedir letra al usuario
			System.out.printf("Introduce una letra: ");
			c = sc.nextLine().charAt(0);

			if (Vocal.isVocal(c))
				System.out.printf("'%s' es una vocal.\n", c);
			
			else if (Vocal.isLetter(c))
				System.out.printf("'%s' es una letra.\n", c);
			
			else if (Vocal.isNumber(c))
				System.out.printf("'%s' es un numero.\n", c);
			
			else if (Vocal.isSpecialChar(c))
				System.out.printf("'%s' es un caracter espacial.\n", c);
			
			else 
				System.out.printf("No se que has introducido.\n");

		} catch (StringIndexOutOfBoundsException e) {
			System.out.printf("No has introducido nada.\n");
		}

		// Cerrar scanner
		sc.close();
	}
}

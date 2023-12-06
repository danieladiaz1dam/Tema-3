package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	/**
	 * Muestra el menú
	 * 
	 * @return el número elegido
	 */
	public static int menu() {
		int input = -1;

		System.out.println("Elige una opcion:");
		System.out.println("1.- Volumen");
		System.out.println("2.- Area");
		System.out.println("0.- Salir");
		System.out.printf("> ");

		do {
			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
			}
		} while (input < 0 || input > 2);

		return input;
	}

	/**
	 * Pide que se introduzca el radio de la base
	 * 
	 * @returnlo devuelve
	 */
	public static double pideRadioBase() {
		double n = 0;
		boolean ok = false;

		do {
			try {
				System.out.printf("Introduce el radio de la base: ");
				n = sc.nextDouble();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
			}
		} while (!ok);

		return n;
	}

	/**
	 * Pide que se introduzca la altura del cilindro
	 * 
	 * @returnlo devuelve
	 */
	public static double altura() {
		double n = 0;
		boolean ok = false;

		do {
			try {
				System.out.printf("Introduce la altura: ");
				n = sc.nextDouble();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
			}
		} while (!ok);

		return n;
	}

	public static void main(String[] args) {
		int opt;
		double r, altura;
		Cilindro cil;

		opt = menu();

		if (opt != 0) {
			r = pideRadioBase();
			altura = altura();

			cil = new Cilindro(r, altura);

			switch (opt) {
			case 1 -> System.out.println(cil.volumen());
			case 2 -> System.out.println(cil.area());
			}
		}
		
		sc.close();
	}
}

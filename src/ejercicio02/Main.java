package ejercicio02;

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
		System.out.println("1.- Perimetro");
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
	 * Pide que se introduzca el ancho
	 * 
	 * @returnlo devuelve
	 */
	public static double pideAncho() {
		double n = 0;
		boolean ok = false;

		do {
			try {
				System.out.printf("Introduce el ancho: ");
				n = sc.nextDouble();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
			}
		} while (!ok);

		return n;
	}

	/**
	 * Pide que se introduzca el alto
	 * 
	 * @return lo devuelve
	 */
	public static double pideAlto() {
		double n = 0;
		boolean ok = false;

		do {
			try {
				System.out.printf("Introduce el alto: ");
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
		double ancho, alto;
		Rectangulo rect;

		opt = menu();

		if (opt == 0) {
			System.out.println("Exit.");
		} else {
			ancho = pideAncho();
			alto = pideAlto();

			rect = new Rectangulo(alto, ancho);

			switch (opt) {
			case 1:
				System.out.println(rect.getPerimetro());
				break;
			case 2:
				System.out.println(rect.getArea());
			default:
				break;
			}
		}
		
		sc.close();
	}
}

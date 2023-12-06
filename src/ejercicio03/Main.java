package ejercicio03;

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
		System.out.println("1.- Circunferencia");
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
	 * Pide que se introduzca el radio de la circumferencia
	 * 
	 * @returnlo devuelve
	 */
	public static double pideRadio() {
		double n = 0;
		boolean ok = false;

		do {
			try {
				System.out.printf("Introduce el radio: ");
				n = sc.nextDouble();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
			}
		} while (!ok);

		return n;
	}

	public static void main(String[] args) {
		double r;
		int opt;
		Circulo cir;

		opt = menu();

		if (opt != 0) {
			r = pideRadio();

			cir = new Circulo(r);
			
			switch (opt) {
			case 1 -> System.out.println(cir.circunferencia());
			case 2 -> System.out.println(cir.area());
			}
		}
		
		sc.close();
	}
}

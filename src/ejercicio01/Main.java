package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	/**
	 * Muestra el menu
	 * 
	 * @param sc Scanner
	 * @return numero elegido
	 */
	public static int menu() {
		int input = -1;

		System.out.println("Elige una opcion:");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicacion");
		System.out.println("4.- Division");
		System.out.println("5.- Maximo");
		System.out.println("6.- Minimo");
		System.out.println("0.- Salir");
		System.out.printf("> ");

		do {
			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
			}
		} while (input < 0 || input > 6);

		return input;
	}

	/**
	 * Pide un numero. Si se introduce un dato erróneo, lo vuelve a pedir
	 * 
	 * @param sc Scanner
	 * @return devuelve el numero
	 */
	public static double pideNumero() {
		double n = 0;
		boolean ok = false;

		do {
			try {
				System.out.printf("Introduce un numero: ");
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
		double num1, num2;
		Operaciones op;

		opt = menu();

		if (opt == 0) {
			System.out.println("Exit.");
		} else {
			num1 = pideNumero();
			num2 = pideNumero();

			op = new Operaciones(num1, num2);

			switch (opt) {
			case 1:
				System.out.println(op.suma());
				break;
			case 2:
				System.out.println(op.resta());
				break;
			case 3:
				System.out.println(op.multiplicacion());
				break;
			case 4:
				System.out.println(op.division());
				break;
			case 5:
				System.out.println(op.max());
				break;
			case 6:
				System.out.println(op.min());
				break;
			}
		}

		sc.close();
	}
}

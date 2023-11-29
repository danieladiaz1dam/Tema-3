package ejercicio09;

public class Calculadora {
	/**
	 * Imprime el menu para elegir una opción
	 */
	public static void printMenu() {
		System.out.printf("###################\n");
		System.out.printf("# 1.- Sumar       #\n");
		System.out.printf("# 2.- Restar      #\n");
		System.out.printf("# 3.- Multiplicar #\n");
		System.out.printf("# 4.- Dividir     #\n");
		System.out.printf("###################\n");
		System.out.printf("Introduce la operación deseada: ");
	}

	/**
	 * Hace una cuenta matemática
	 * 
	 * @param opt  : 1-suma 2-resta 3-multi 4-divi
	 * @param num1 Numero 1
	 * @param num2 Numero 2
	 * @return Resultado de la operación
	 */
	public static double calcular(int opt, double num1, double num2) {

		double res = switch (opt) {
		case 1:
			yield num1 + num2;
		case 2:
			yield num1 - num2;
		case 3:
			yield num1 * num2;
		case 4:
			if (num2 != 0)
				yield num1 / num2;
			else {
				yield Double.POSITIVE_INFINITY;
			}

		default:
			System.out.printf("Opción inválida\n");
			yield 0;
		};

		return res;
	}
}

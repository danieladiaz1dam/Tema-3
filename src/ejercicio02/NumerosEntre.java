package ejercicio02;

public class NumerosEntre {
	/**
	 * Muestra los numero comprendidos entre num1 y num2, incluidos
	 * 
	 * @param num1 Primer numero
	 * @param num2 Segundo numero
	 */
	public static void numeroComprendidosEntre(int num1, int num2) {
		int tmp;

		// comprobar q num1 es menor q num2
		if (num1 > num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}

		// imprimir
		for (int i = num1; i <= num2; i++) {
			System.out.printf("%d ", i);
		}
	}
}

package ejercicio04;

public class FuncionesRecursivas {
	/**
	 * Devuelve la suma de todos los números entre 1 y n.
	 */
	public static int sumatorio(int numero) {
		if (numero == 0)
			return 0;

		return numero + sumatorio(numero - 1);
	}

	/**
	 * Esta función devuelve el resultado de a^n.
	 */
	public static double potencia(double a, int n) {
		if (n == 0)
			return 1;
		return a * potencia(a, n - 1);
	}

	/**
	 * A esta función se le pasará un número entero y nos devolverá el término
	 * correspondiente de la serie de Fibonacci. El enésimo valor de la serie de
	 * Fibonacci se calcula sumando los dos valores anteriores de la serie. Es
	 * decir: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
	 */
	public static int serieFibonacci(int numero) {
		if (numero == 0 || numero == 1)
			return 1;
		return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
	}
}

package ejercicio08;

import ejercicio07.Primo;

public class Divisores {
	/**
	 * Calcular la cantidad de numeros primos capaz de dividir a n
	 * 
	 * @param n Numero en cuestion
	 * @return cantidad de divisores PRIMOS de n
	 */
	public static int nDivisoresPrimos(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && Primo.isPrimo(i))
				c++;
		}

		return c;
	}
}

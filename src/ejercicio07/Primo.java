package ejercicio07;

public class Primo {
	/**
	 * Mira si un numero es primo
	 * @param n El numero en cuestión
	 * @return true si n es primo, false si n es falso
	 */
	public static boolean isPrimo(int n) {
		// Si n es negativo, darle al vuelta
		if (n < 0)
			n = n * -1;

		// Si n es 1 o 0
		if (n <= 1)
			return false;

		boolean primo = true;

		// Mirar si tiene algun divisor
		for (int i = 2; i < n >> 1; i++) {
			if (n % i == 0) {
				primo = false;
				break;
			}
		}

		return primo;
	}
}

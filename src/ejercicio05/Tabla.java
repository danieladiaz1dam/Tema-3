package ejercicio05;

public class Tabla {
	/**
	 * Muestra por consola la table de multiplicar de n
	 * @param n Numero para multiplicar
	 */
	public static void tablaDel(long n) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n * i);
		}
	}
}

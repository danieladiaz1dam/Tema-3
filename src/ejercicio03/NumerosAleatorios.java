package ejercicio03;

public class NumerosAleatorios {
	/**
	 * La primera de las funciones recibirá un argumento de tipo entero que indicará
	 * la cantidad de números aleatorios a generar. Esta función generará números
	 * aleatorios comprendidos entre 0 y 1 y los mostrará por pantalla.
	 */
	public static void numerosAleatorios(int cant) {
		for (int i = 0; i < cant; i++) {
			System.out.printf("%.2f\n", Math.random());
		}
	}

	/**
	 * La segunda de las funciones recibirá dos argumentos de tipo entero: El
	 * primero indica la cantidad de números aleatorios a generar El segundo indica
	 * el valor máximo que tomará el número aleatorio. Los números aleatorios
	 * generados deben estar entre 0 y el valor máximo introducido por parámetro. En
	 * este caso los números aleatorios deben ser enteros. Los números aleatorios
	 * generados deben mostrarse por pantalla.
	 * 
	 */
	public static void numerosAleatorios(int cant, int max) {
		for (int i = 0; i < cant; i++) {
			System.out.printf("%d\n", (int) (Math.random() * max + 1));
		}
	}

	/**
	 * La tercera de las funciones recibirá tres argumentos de tipo entero: El
	 * primero indica la cantidad de números aleatorios a generar El segundo indica
	 * el valor mínimo que tomará el número aleatorio. El tercero indica el valor
	 * máximo que tomará el número aleatorio. Los números aleatorios generados deben
	 * estar entre el valor mínimo y el valor máximo introducidos por parámetro. En
	 * este caso los números aleatorios deben ser enteros. Los números aleatorios
	 * generados deben mostrarse por pantalla.
	 * 
	 */
	public static void numerosAleatorios(int cant, int min, int max) {
		for (int i = 0; i < cant; i++) {
			System.out.printf("%.2f\n", Math.random() * (min - max) + max);
		}
	}
}

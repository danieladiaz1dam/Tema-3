package ejercicio05;

/*
 * Diseña tres funciones de nombre numerosAleatorios que hagan lo siguiente
 * ( en las funciones )
 * 
 * Los números aleatorios generados deben estar entre el valor mínimo y el
 * valor máximo introducidos por parámetro. En este caso los números
 * aleatorios deben ser enteros. Los números aleatorios generados deben
 * mostrarse por pantalla.
 */

public class Main {
	public static void main(String[] args) {
		Numeros.numerosAleatorios(3);
		System.out.println();
		Numeros.numerosAleatorios(3, 5);
		System.out.println();
		Numeros.numerosAleatorios(3, 5, 8);
	}
}

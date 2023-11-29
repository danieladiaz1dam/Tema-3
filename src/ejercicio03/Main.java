package ejercicio03;

/*
 * Diseña dos funciones de nombre sumaEnteros que hagan lo siguiente:
 *
 * La primera de las funciones recibirá un argumento (numero) de tipo entero y
 * devolverá la suma de todos los números desde 1 hasta numero.
 * El valor a devolver debe ser entero.
 * 
 * La segunda de las funciones recibirá dos argumentos (num1 y num2) de tipo
 * entero y devolverá la suma de todos los números comprendidos entre los
 * dos números (num1 y num2). El tipo a devolver debe ser entero.
 * 
 */

public class Main {
	public static void main(String[] args) {
		int num1 = 20, num2 = 5;

		System.out.println(SumaRemix.sumaEnteros(num1, num2));
		System.out.println(SumaRemix.sumaEnteros(num1));
	}
}

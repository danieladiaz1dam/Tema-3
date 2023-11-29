package ejercicio04;

/*
 * Diseña dos funciones de nombre parseToBoolean que hagan lo siguiente:
 * 
 * La primera de las funciones recibirá un argumento de tipo
 * entero que devuelva false si el argumento es 0 y true si
 * el argumento es 1.
 * 
 * La segunda de las funciones recibirá un argumento de tipo
 * String que devuelva false si la cadena es igual a “false”
 * y true si la cadena es igual a “true”.
 *
 */

public class Main {
	public static void main(String[] args) {
		System.out.println(Parse.parseToBoolean(1));
		System.out.println(Parse.parseToBoolean(0));
		
		System.out.println(Parse.parseToBoolean("true"));
		System.out.println(Parse.parseToBoolean("false"));
	}
}

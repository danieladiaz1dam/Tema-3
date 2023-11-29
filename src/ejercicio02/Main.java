package ejercicio02;

/*
 * Diseña dos funciones de nombre media que hagan lo siguiente:
 * int media(int n1, int n2);
 * double media(double n1, double n2);
 */

/*
 * Pruebas de Entrada
 */

public class Main {
	public static void main(String[] args) {
		int iNumero1 = 4, iNumero2 = 5;
		double dNumero1 = 0.24624, dNumero2 = 0.354674;
		
		System.out.println(Media.media(iNumero1, iNumero2));
		System.out.println(Media.media(dNumero1, dNumero2));
	}
}

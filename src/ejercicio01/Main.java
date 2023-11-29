package ejercicio01;

/*
 * Diseña dos funciones de nombre suma que hagan lo siguiente:
 * int suma(int numero1, int numero2);
 * double suma(double numero1, double numero2);
 */

public class Main {
	public static void main(String[] args) {
		int iNumero1 = 4, iNumero2 = 5;
		double dNumero1 = 0.24624, dNumero2 = 0.354674;

		System.out.println(Suma.suma(iNumero1, iNumero2));
		System.out.println(Suma.suma(dNumero1, dNumero2));
	}
}

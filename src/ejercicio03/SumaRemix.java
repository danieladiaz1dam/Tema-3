package ejercicio03;

public class SumaRemix {
	public static int sumaEnteros(int num1, int num2) {
		int suma = 0;

		// si num2 es mayor que num1, darle la vuelta
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}

		// sumar todos los numeros de num1 hasta num2, incluidos
		for (int i = num1; i <= num2; i++) {
			suma += i;
		}

		return suma;
	}

	public static int sumaEnteros(int num) {
		return sumaEnteros(1, num);
	}
}

package ejercicio01;

public class Numeros {
	int numero;

	public Numeros() {
	}

	public Numeros(int numero) {
		this.numero = numero;
	}

	public boolean esPrimo() {
		if (numero == 1)
			return false;

		boolean primo = true;

		for (int i = 2; i < Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				primo = false;
				break;
			}
		}

		return primo;
	}

	public boolean esCapicua() {
		int num = numero, numReversed = 0;

		while (num > 0) {
			numReversed = numReversed * 10 + num % 10;
			num /= 10;
		}
		
		return numero == numReversed;
	}
}

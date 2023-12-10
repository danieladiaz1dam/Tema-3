package ejercicio05;

public class Figuras {
	int lado;
	char caracter;

	public Figuras() {
	}

	public Figuras(int lado, char caracter) {
		this.lado = lado;
		this.caracter = caracter;
	}

	public void triangulo() {
		System.out.println("Triangulo");

		for (int i = 0; i < lado; i++) {
			for (int j = lado - i; j > 1; j--) {
				System.out.printf(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.printf("%c ", caracter);
			}
			System.out.println();
		}
	}

	public void cuadrado() {
		System.out.println("Cuadrado");
		
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.printf("%c ", caracter);
			}
			System.out.println();
		}
	}

	public void hexagono() {
		System.out.println("Hexagono");
		
		// Parte de arriba del exagono
		for (int i = 0; i < lado; i++) {
			// Espacios
			for (int j = 0; j < lado - i; j++) {
				System.out.printf(" ");
			}

			// Asteriscos
			// size + i*2 para añadir un asterisco a cada lado
			for (int j = 0; j < lado + i * 2; j++) {
				System.out.printf("%c", caracter);
			}

			// Salto de linea
			System.out.println();
		}

		// Parte de abajo
		// size - 1, porque la linea del medio, la hace el bucle de arriba
		for (int i = lado - 1; i > 0; i--) {
			// Espacios
			// size + 1, xq aunq sea una linea menos, necesitamos la cantidad de espacios
			// para size, no size - 1
			for (int j = 0; j < lado + 1 - i; j++) {
				System.out.printf(" ");
			}

			// Asteriscos
			// size + i*2 para añadir un asterisco a cada lado,
			// i - 1 para que no imprima la linea del medio que ya hemos
			// impreso en el bucle de arriba
			for (int j = 0; j < lado + (i - 1) * 2; j++) {
				System.out.printf("%c", caracter);
			}

			// Salto de linea
			System.out.println();
		}
	}
}

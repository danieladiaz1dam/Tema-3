package ejercicio05;

public class Main {
	public static void main(String[] args) {
		Figuras fig = new Figuras(4, '*');
		
		fig.cuadrado();
		System.out.println();
		fig.triangulo();
		System.out.println();
		fig.hexagono();
	}
}

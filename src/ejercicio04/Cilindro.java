package ejercicio04;

public class Cilindro {
	double radioBase, altura;

	public Cilindro() {
	}

	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}

	double volumen() {
		return this.radioBase * this.radioBase * this.altura;
	}

	double area() {
		return 2 * this.radioBase * (this.altura * this.radioBase);
	}
}

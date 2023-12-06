package ejercicio03;

public class Circulo {
	double radio;

	public Circulo() {
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	double circunferencia() {
		return 2 * Math.PI * this.radio;
	}

	double area() {
		return Math.PI * this.radio * this.radio;
	}
}

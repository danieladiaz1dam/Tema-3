package ejercicio02;

public class Esfera {
	double radio;

	public Esfera() {
	}

	public Esfera(double radio) {
		this.radio = radio;
	}

	public double superficie() {
		return 4 * Math.PI * radio * radio;
	}

	public double volumen() {
		return (4 * Math.PI / 3) * radio * radio * radio;
	}
}

package ejercicio02;

/**
 * Clase para calculos sobre los parametros de un rectangulo
 */
public class Rectangulo {
	double alto = 0, ancho = 0;

	public Rectangulo() {
	}

	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	/**
	 * Calcula el perimetro y lo devuelve
	 */
	public double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
	}

	/**
	 * Calcula el area y la devuelve 
	 */
	public double getArea() {
		return this.alto * this.ancho;
	}
}

package ejercicio01;

/**
 * Clase para algunas operaciones matematicas simples
 */
public class Operaciones {
	double num1 = 0, num2 = 0;

	public Operaciones() {
	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Suma
	 * 
	 * @return num1 + num2
	 */
	public double suma() {
		return this.num1 + this.num2;
	}

	/**
	 * Resta
	 * 
	 * @return num1 - num2
	 */
	public double resta() {
		return this.num1 - this.num2;
	}

	/**
	 * Multiplicacion
	 * 
	 * @return num1 * num2
	 */
	public double multiplicacion() {
		return this.num1 * this.num2;
	}

	/**
	 * Division
	 * 
	 * @return Intifity or num1 / num2
	 */
	public double division() {
		return this.num2 == 0 ? Double.POSITIVE_INFINITY : this.num1 / this.num2;
	}

	/**
	 * Devuelve el numero mayor
	 */
	public double max() {
		return this.num1 > this.num2 ? this.num1 : this.num2;
	}

	/**
	 * Devuelve el numero menor
	 */
	public double min() {
		return this.num1 < this.num2 ? this.num1 : this.num2;
	}
}

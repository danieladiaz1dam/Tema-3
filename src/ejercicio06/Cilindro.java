package ejercicio06;

public class Cilindro {
	/**
	 * Opciones de entrada para la funcion calcular
	 */
	public enum Opcion {
		AREA, VOLUMEN
	}

	/**
	 * Calcula area y volumen de un cilindro
	 * 
	 * @param opt    Cilindro.Opcion para saver que calcular
	 * @param rad    Radio del cilindro
	 * @param height Altura del cilindro
	 * @return area o volumen de un cilindro, segun se especifique en o
	 */
	public static double calcular(Opcion opt, double rad, double height) {
		if (opt == Opcion.AREA) {
			return 2 * Math.PI * rad * (height + rad);
		} else
			return Math.PI * rad * rad * height;
	}
}

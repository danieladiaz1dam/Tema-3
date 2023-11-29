package ejercicio04;

public class Vocal {
	/**
	 * Comprueba si un caracter es vocal o no
	 * @param c Caracter a comprobar
	 * @return Devuelve true si c es una vocal
	 */
	public static boolean isVocal(char c) {
		boolean vocal;

		c = Character.toLowerCase(c);

		vocal = switch (c) {
		case 'a', 'e', 'i', 'o', 'u':
			yield true;
		default:
			yield false;
		};

		return vocal;
	}

	/**
	 * Comprueba si un caracter es un numero o no
	 * @param c Caracter a comprobar
	 * @return Devuelve true si c es un numero
	 */
	public static boolean isNumber(char c) {
		boolean num;

		num = switch (c) {
		case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
			yield true;
		default:
			yield false;
		};

		return num;
	}
	
	/**
	 * Comprueba si un caracter es una letra
	 * @param c Caracter a comprobar
	 * @return Devuelve true si c es una letra
	 */
	public static boolean isLetter(char c) {
			 // de   a    á    z            de A   á    Z
		return (c > 97 && c < 122 || c > 65 && c < 90 && !isVocal(c));
	}
	
	/**
	 * Comprueba si un caracter es especial
	 * @param c Caracter a comoprobar
	 * @return Devuelve true si c es un caracter especial
	 */
	public static boolean isSpecialChar(char c) {
		return (!isNumber(c) && !isLetter(c));
	}
}

package ejercicio10;

public class Fecha {
	/**
	 * Comprueba si una fecha es correcta o no
	 * 
	 * @return Devuelve true si la fecha es correcta
	 */
	public static boolean validate(int day, int month, int year) {
		// https://learn.microsoft.com/es-es/office/troubleshoot/excel/determine-a-leap-year

		// =IF(OR(MOD(A1,400)=0,AND(MOD(A1,4)=0,MOD(A1,100)<>0)),"Leap Year", "NOT a
		// Leap Year")

		boolean leap = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);

		// Mirar los meses
		if (month < 1 || month > 12)
			return false;
		
		/*
		 * Dias x Mes
		 * 
		 * 1  Enero 31
		 * 2  Febrero 28/29
		 * 3  Marzo 31
		 * 4  Abril 30
		 * 5  Mayo 31
		 * 6  Junio 30
		 * 7  Julio 31
		 * 8  Agosto 31
		 * 9  Septiembre 30
		 * 10 Octubre 31
		 * 11 Noviembre 30
		 * 12 Diciembre 31
		 * 
		 * 31 => 1, 3, 5, 7, 8, 10, 12
		 * 		
		 */
		
		// Mirar los dias
		if (
				day < 1 ||
				!leap && month == 2 && day > 28 ||
				leap && month == 2 && day > 29 ||
				month < 8 && month % 2 == 1 && day > 31 ||
				month < 8 && month % 2 == 0 && day > 30 ||
				month >= 8 && month % 2 == 1 && day > 30 ||
				month >= 8 & month % 2 == 0 && day > 31
			)
			return false;

		
		return true;
	}
}

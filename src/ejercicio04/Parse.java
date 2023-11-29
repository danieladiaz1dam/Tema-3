package ejercicio04;

public class Parse {
	public static boolean parseToBoolean(int n) {
		return n != 0;
	}
	
	public static boolean parseToBoolean(String s) {
		return s.equals("true");
	}
}

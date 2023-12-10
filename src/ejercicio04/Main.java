package ejercicio04;

public class Main {
	public static void main(String[] args) {
		System.out.println(FuncionesRecursivas.sumatorio(3));
		System.out.println(FuncionesRecursivas.potencia(2, 3));
		
		for(int i = 0; i < 10; i++) {
			System.out.print(FuncionesRecursivas.serieFibonacci(i) + " ");
		}
		
	}
}

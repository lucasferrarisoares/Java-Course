import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Qual número desejo indicar positivo ou negativo?/PAR2 ou IMPAR");  x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("NÃO NEGATIVO"); }
		else {
			System.out.println("NEGATIVO"); }
		
		if (x % 2 == 0) {
			System.out.println("É PAR");
		}
		else {
			System.out.println("É IMPAR");
		}

	}

}

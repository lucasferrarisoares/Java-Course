import java.util.Scanner;

public class SomaSem0 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0;
		
		System.out.printf("Qual valor de x?%n"); 
		x =sc.nextInt();
		
		while (x != 0) {
			soma += x;
			System.out.printf("Qual novo valor de x?%n"); 
			x =sc.nextInt();
		}
		
		System.out.printf("A soma total é: %d%n", soma);
		sc.close();
	}
}

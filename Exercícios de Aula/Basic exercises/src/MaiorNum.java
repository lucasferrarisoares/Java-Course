import java.util.Scanner;

public class MaiorNum {
	

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite três números: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = Maior(a, b, c);
		MostraResulado(maior);
		

	}
	
	public static int Maior(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else { 
			aux = z;
			}
		
		return aux;
	}
	
	public static void MostraResulado(int value) {
	System.out.println("O maior número é: "+ value);
	}
	
}
	

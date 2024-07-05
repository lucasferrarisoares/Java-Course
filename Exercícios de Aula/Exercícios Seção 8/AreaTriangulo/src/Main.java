import java.util.Locale;
import java.util.Scanner;
import inties.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo A, B;
		A = new Triangulo();
		B = new Triangulo();
		
		
		System.out.println("Qual as medidas do Triângulo A: ");
		A.a = sc.nextDouble();
		A.b = sc.nextDouble();
		A.c = sc.nextDouble();
		
		System.out.println("Qual as medias do Trângulo B: ");
		B.a = sc.nextDouble();
		B.b = sc.nextDouble();
		B.c = sc.nextDouble();
		
		A.area = A.calcarea();
		B.area = B.calcarea();
		
		if (A.area > B.area) {
			System.out.printf("A maior trinângulo é o A, sua área mede: %.25f%n", A.area);
			System.out.printf("A área do trinângulo B mede: %.2f%n ", B.area);
		}
		else {
			System.out.printf("O maior trinângulo é o B, sua área mede: %.2f%n", B.area);
			System.out.printf("A área do trinângulo A mede: %.2f%n", A.area);

		}
		
		sc.close();
	}
	
}

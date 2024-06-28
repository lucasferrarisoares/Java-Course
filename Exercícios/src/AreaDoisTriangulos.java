import java.util.Scanner;
import java.util.Locale;

public class AreaDoisTriangulos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Qual as medidas do Triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Qual as medias do Trângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double Areax = CalcA(xA, xB, xC);
		double Areay = CalcA(yA, yB, yC);
		
		if (Areax > Areay) {
			System.out.printf("A maior trinângulo é o X, sua área mede: %.25f%n", Areax);
			System.out.printf("A área do trinângulo Y mede: %.2f%n ", Areay);
		}
		else {
			System.out.printf("O maior trinângulo é o Y, sua área mede: %.2f%n", Areay);
			System.out.printf("A área do trinângulo X mede: %.2f%n", Areax);

		}
		
		sc.close();
	}
	
	public static double CalcA(double x, double y, double z) {
		
		double A, Area;
		
		A = (x + y + z) / 2.0;
		Area = Math.sqrt(A * (A - x) * (A - y) * (A - z));
		
			return Area;
	
	}
	
}

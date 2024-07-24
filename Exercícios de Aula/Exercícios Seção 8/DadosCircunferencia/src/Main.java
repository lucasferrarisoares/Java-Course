import java.util.Locale;
import java.util.Scanner;
import utils.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o raio: ");
		double raio = sc.nextDouble();
		
		double circun = Calculator.circunferencia(raio);
		System.out.println("A circunferência é: " + circun);

		double volume = Calculator.volume(raio);
		System.out.println("Volume é: "+ volume);

		System.out.println();
		System.out.println("Valor de Pi: "+ Calculator.PI);

		

		sc.close();
	}
	
}
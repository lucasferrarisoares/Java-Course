import java.util.Scanner;

public class CalculoTarifaTelefonica {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int Minutos, TempoExtra;
		Double Conta = 50.0;
		
		System.out.println("Quantos minutos o cliente utilizou de ligação? "); Minutos = sc.nextInt();
		
		TempoExtra = Minutos - 100;
		
		if (TempoExtra < 0) {
			System.out.printf("Cliente não deve pagar tarifas extras"); }
		else {
			Conta += TempoExtra * 2;
			System.out.printf("O cliente deve pagar %.2f reais de conta.%n", Conta); }
		
		sc.close();

	}

}

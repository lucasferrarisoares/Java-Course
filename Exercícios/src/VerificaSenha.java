import java.util.Scanner;

public class VerificaSenha {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.printf("Digite a senha: ");
		senha = sc.nextInt();

		while (senha != 2002) {

			System.out.println("Senha incorreta");
			System.out.println("Digite novamente:"); senha = sc.nextInt();

		}

		System.out.println("Senha correta, seja bem-vindo!");

	}

}


import java.util.Locale;
import java.util.Scanner;
import inties.Produto;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.println("Adicione os dados do produto:");
        System.out.print("Nome: "); 
        String Nome = sc.nextLine();
        System.out.print("Preço: "); 
        Double Preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: "); 

        Produto produto = new Produto(Nome, Preco);
        System.out.println();
        System.out.println("Dados do produto: " + produto);
        
        System.out.println();
        System.out.print("Qual quantidade de produto foi adicionado ao estoque? ");
        int quantidade = sc.nextInt();
        produto.somaEstoque(quantidade);
        
        System.out.println();
        System.out.println("Dados atualizados: " + produto.toString());
        
        System.out.println();
        System.out.print("Qual a quantidade de estoque foi removida? ");
        quantidade = sc.nextInt();
        
        System.out.println();
        produto.TiraEstoque(quantidade);
        System.out.println("Dados atualizados: " + produto);
		

		sc.close();
		}
}
	

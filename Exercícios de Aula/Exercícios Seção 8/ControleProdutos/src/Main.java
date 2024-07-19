
import java.util.Locale;
import java.util.Scanner;
import inties.Produtos;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        Produtos produto = new Produtos();
        System.out.println("Adicione os dados do produto:");
        System.out.print("Nome: "); 
        produto.Nome = sc.nextLine();
        System.out.print("Preço: "); 
        produto.Preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: "); 
        produto.Quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto);
        
        System.out.println();
        System.out.print("Qual quantidade de produto foi adicionado ao estoque? ");
        int quantidade = sc.nextInt();
        produto.SomaEstoque(quantidade);
        
        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        
        System.out.println();
        System.out.print("Qual a quantidade de estoque foi removida? ");
        quantidade = sc.nextInt();
        
        System.out.println();
        produto.TiraEstoque(quantidade);
        System.out.println("Dados atualizados: " + produto);
		

		sc.close();
		}
		
}
	

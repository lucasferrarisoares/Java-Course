package inties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, Double preco) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(0);
	}
	
	public double ValorTotalEstoque() {
		return this.getPreco() * this.getQuantidade();
	}

	public void somaEstoque(int quantidade) {
		this.setQuantidade(this.getQuantidade() + quantidade);
	}

	public void TiraEstoque(int quantidade) {
		this.setQuantidade(this.getQuantidade() - quantidade);
	}
	
	public void alterarNome(String novoNome) {
		this.setNome(novoNome);
	}
	
	public void alterarPreco(Double novoPreco) {
		this.setPreco(novoPreco);
	}
	
    public String toString() {
        return this.getNome() + ", $" + String.format("%.2f", this.getPreco()) + ", " + this.getQuantidade() + " unidades, Total: $ " + String.format("%.2f", ValorTotalEstoque());
    }	

}
package inties;

public class Produtos {
	
	public String Nome;
	public double Preco;
	public int Quantidade;
	
	
	public double ValorTotalEstoque() {
		return Preco * Quantidade;
	}

	public double SomaEstoque(int quantidade) {
		return this.Quantidade += quantidade;
	}

	public double TiraEstoque(int quantidade) {
		return this.Quantidade -= quantidade;
	}
	
    public String toString() {
        return Nome + ", $" + String.format("%.2f", Preco) + ", " + Quantidade + " unidades, Total: $ " + String.format("%.2f", ValorTotalEstoque());
    }
	

}
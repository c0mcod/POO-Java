package exercicio2_Produto;

public class Produto {

	private String nome;
	private int preco;

	String getNomeProduto() {
		return nome;
	}

	public void SetNomeProduto(String nome) {
		this.nome = nome;
	}

	int getPreco() {
		return preco;
	}
	

	void setPrecoProduto(int preco) {
		if (preco <= 0) {
			System.out.println("Preço inválido! Não é possível vender um produto por R$0,00 ou menos!");
		} else {
			this.preco = preco;
		}
	}

}

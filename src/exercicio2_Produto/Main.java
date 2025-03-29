package exercicio2_Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		
		p.SetNomeProduto("amaciante");
		p.setPrecoProduto(0);
		p.setPrecoProduto(20);
		
		System.out.println(p.getNomeProduto());
		System.out.println(p.getPreco());
	}

}

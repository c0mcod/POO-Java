package exercicio5_Carro;

public class Main {

	public static void main(String[] args) {
		Carro c = new Carro();
		
		c.setModelo();
		c.setMarca();
		c.setAno();
		
		c.seeAll();
		
		Carro a = new Carro();
		a.setModelo();
		a.setMarca();
		a.setAno();
		
		c.seeAll();
	}

}

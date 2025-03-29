package exercicio1_Pessoa;

public class Main {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		System.out.println(p.getNome());
		p.setNome("neto");
		System.out.println(p.getNome());
		
	}
}

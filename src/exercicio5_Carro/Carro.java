package exercicio5_Carro;
import java.util.Scanner;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	
	Scanner input = new Scanner(System.in);
	/*
	 * Construtor
	Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;	
	}
	*/
	
	void setMarca() {
		System.out.println("Insira a marca do veiculo: ");
		String newMarca = input.nextLine();
		this.marca = newMarca;
		
	}
	
	void setModelo() {
		System.out.println("Insira o modelo do veiculo: ");
		String newModelo = input.nextLine();
		this.modelo = newModelo;
	}
	
	void setAno() {
		System.out.println("Insira o ano do veiculo: ");
		int newAno = input.nextInt();
		this.ano = newAno;
	}
	
	void seeAll() {
		System.out.println("\nAs informações do veiculo são:\n");
		System.out.println(this.marca);
		System.out.println(this.modelo);
		System.out.println(this.ano);
		System.out.println("\n\n");
	}
}

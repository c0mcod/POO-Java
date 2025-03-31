package exercicio10_Animal;
import java.util.Scanner;

public class Animal {
	private String nome;
	private String idade;
	private String especie;
	
	Scanner input = new Scanner(System.in);
	
	void setNome() {
		System.out.println("Digite o nome do animal: ");
		String newNome = input.nextLine();
		this.nome = newNome;
	}
	
	void setIdade() {
		System.out.println("Digite a idade do animal: ");
		String newIdade = input.nextLine();
		this.idade = newIdade;
	}
	
	void setEspecie() {
		System.out.println("Digite a especie do animal: ");
		String newEspecie = input.nextLine();
		this.especie = newEspecie;
	}
	
	void seeAll() {
		System.out.println("Nome do animal: " + nome + "\nEspecie: " + especie + "\nIdade: " + idade);
	}
}

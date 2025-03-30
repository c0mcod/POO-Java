package exercicio6_Livro;
import java.util.Scanner;

public class Livro {
	private String titulo;
	private String autor;
	private double preco;
	
	Scanner input = new Scanner(System.in);
	/*
	 * Construtor
	 * Livro (String titulo, String autor, double preco) {
	 * 	this.titulo = titulo;
	 * 	this.autor = autor;
	 * 	this.preco = preco;
	 * }
	 */
	
	void setTitulo() {
		System.out.println("Insira o titulo da obra: ");
		String newTitulo = input.nextLine();
		this.titulo = newTitulo;
	}
	
	void setAutor() {
		System.out.println("Insira o autor da obra: ");
		String newAutor = input.nextLine();
		this.autor = newAutor;
	}
	
	void setPreco() {
		System.out.println("Insira o preço da obra: ");
		double newPreco = input.nextDouble();
		this.preco = newPreco;
	}
	
	void seeAll () {
		System.out.println("\nAs informações da obra " + titulo + " são:\n");
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(preco);
		System.out.println("\n\n");
	}
}

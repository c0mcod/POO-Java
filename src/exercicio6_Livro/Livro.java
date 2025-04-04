package exercicio6_Livro;

import java.util.Scanner;

public class Livro {
	private String titulo;
	private String autor;
	private double preco;

	Scanner input = new Scanner(System.in);

	Livro(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	void setAutor(String autor) {
		this.autor = autor;
	}

	void setPreco(double preco) {
		this.preco = preco;
	}

	void exibirInfo() {
		System.out.println("Autor: " + this.autor + "\nPreço: " + this.preco + "\nTitulo: " + this.titulo);
	}
}

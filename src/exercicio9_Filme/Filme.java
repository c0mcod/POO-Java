package exercicio9_Filme;

import java.util.Scanner;

public class Filme {
	private String titulo;
	private String ano;
	private String genero;

	Scanner input = new Scanner(System.in);

	void setTitulo() {
		System.out.println("Digite o Titulo do Filme:");
		String newTitulo = input.nextLine();
		this.titulo = newTitulo;
	}

	void setAno() {
		System.out.println("Digite o ano do Filme:");
		String newAno = input.nextLine();
		this.ano = newAno;
	}
	
	void setGenero() {
		System.out.println("Digite o genero do Filme:");
		String newGenero = input.nextLine();
		this.genero = newGenero;
	}
	
	void seeAll() {
		System.out.println("Titulo do filme: " + titulo + "\nAno do filme: " + ano + "\nGenero do filme: " + genero);;
	}
}
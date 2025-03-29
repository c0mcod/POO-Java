package exercicio3_Aluno;

import java.util.Scanner;

public class Aluno {
		private String nome;
		private double nota;
		
		Scanner input = new Scanner(System.in);
		
		/* Construtor

		public Aluno(String nome, double nota) {
			this.nome = nome;
			this.nota = nota;
		}
		*/
		
		void setNome() {
			System.out.println("Digite o primeiro nome do aluno");
			String newNome = input.nextLine();
			this.nome = newNome;
		}
		
		String getNome() {
			return nome;
		}
		void setNota() {
			System.out.println("Digite a nota do aluno:");
			int newNota = input.nextInt();
			this.nota = newNota;
		}
		
		double getNota() {
			return nota;
		}
		
		
}

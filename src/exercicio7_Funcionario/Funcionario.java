package exercicio7_Funcionario;

import java.util.Scanner;

public class Funcionario {
	private String nome;
	private double salario;

	Scanner input = new Scanner(System.in);

	/*
	 * Funcionario(String nome, double salario) { this.nome = nome; this.salario =
	 * salario; }
	 */

	void setSalario() {

		System.out.println("Defina o salário do colaborador: ");
		double newSalario = input.nextDouble();

		if (newSalario < 1345) {
			System.out.println("Salário abaixo do minímo permitido. O salário deve ser igual ou maior que R$1.345,00.");
		} else {
			this.salario = newSalario;
		}
	}

	void setNome() {
		System.out.println("Defina o nome do colaborador: ");
		String newNome = input.nextLine();
		this.nome = newNome;
	}

	void bonusSalarial() {
		double salarioBonus = this.salario * 10/100;
		this.salario += salarioBonus;
		System.out.println("Bônus de 10% aplicado!");
	}

	void exibirSalario() {
		System.out.println("O colaborador " + nome + " está recebendo R$" + salario);
	}
}

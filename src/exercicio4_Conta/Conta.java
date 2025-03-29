package exercicio4_Conta;

import java.util.Scanner;

public class Conta {
	private String titular;
	private double saldo;

	Scanner input = new Scanner(System.in);

	void setTitular() {
		System.out.println("Digite o nome do titular: ");
		String newTitular = input.nextLine();
		this.titular = newTitular;
	}

	String getTitular() {
		return titular;
	}

	void depositar() {
		System.out.println("Digite o valor a ser depositado:\n");
		double newDeposito = input.nextDouble();

		if (newDeposito <= 0) {
			System.out.println("Valor inválido.\n");
		} else {
			this.saldo += newDeposito;
		}

	}

	void sacar() {
		if (this.saldo <= 0) {
			System.out.println("Não há saldo suficiente para saque.\n");
		} else {
			System.out.println("Saldo disponivel: R$" + saldo + "\nQuanto deseja sacar?\n");
			double newSaque = input.nextDouble();
			if (newSaque > this.saldo) {
				System.out.println("Valor inválido.\n");
			} else {
				this.saldo -= newSaque;
			}
		}
	}

	void exibirSaldo() {
		System.out.println("\n\nO saldo atual é: R$" + this.saldo + "\n");
	}

	void gui() {
		int escolha;
		do {
			System.out.println("Escolha uma opção:\n\n [1] Depositar\n [2] Sacar\n [3] Exibir saldo\n [4] sair\n");
			escolha = input.nextInt();

			switch (escolha) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				exibirSaldo();
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.\n");
			}
		} while (escolha != 4);

		input.close();
	}
}

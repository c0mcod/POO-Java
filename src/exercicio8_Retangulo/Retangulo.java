package exercicio8_Retangulo;

import java.util.Scanner;

public class Retangulo {
	private double altura;
	private double largura;

	Scanner input = new Scanner(System.in);

	void calcularArea() {
		System.out.println("Digite a largura:");
		double newLargura = input.nextDouble();
		System.out.println("Digite a altura:");
		double newAltura = input.nextDouble();

		double area = newLargura * newAltura;
		System.out.println("O resultado da area desse retangulo é: " + area + "cm");
	}

	void calcularPerimetro() {
		System.out.println("Digite a largura:");
		double newLargura = input.nextDouble();
		System.out.println("Digite a altura:");
		double newAltura = input.nextDouble();

		double perimetro = 2 * (newLargura + newAltura);

		System.out.println("O resultado do perimetro desse retangulo é: " + perimetro);
	}

	void gui() {
		int escolha;
		do {
			System.out.println("Escolha uma opção:\n [1] calcular área\n [2] Calcular perimetro\n [3] Sair\n");
			escolha = input.nextInt();

			switch (escolha) {
			case 1:
				calcularArea();
				break;
			case 2:
				calcularPerimetro();
				break;
			case 3:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção invalida!");
			}
		} while (escolha != 3);
	}
}

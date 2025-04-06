package exercicio6_Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<>();

		while (true) {
			System.out.println("[1] Cadastrar Livro\n[2] Listar Livros\n[3] Editar Livros\n[4] Sair\n\nEscolha uma opção");
			int escolha = input.nextInt();
			input.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("Digite o autor do livro:");
				String autor = input.nextLine();
				
				System.out.println("Digite o nome do livro:");
				String titulo = input.nextLine();
				
				System.out.println("Digite o valor do livro:");
				double preco = input.nextDouble();

				livros.add(new Livro(titulo, autor, preco));

				System.out.println("Livro cadastrado.\n");
				break;
			case 2:
				if (livros.isEmpty()) {
					System.out.println("Não há livros cadastrados!");

				} else {
					System.out.println("Livros cadastrados:\n");
					for (int i = 0; i < livros.size(); i++) {
						System.out.println("livro " +  i + 1  + ":");
						livros.get(i).exibirInfo();
					}
				}
				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("Não há livros para editar informações.\n);");
					break;
				} else {
					System.out.println("Digite o numero do livro: ");
					int index = input.nextInt();

					if (index >= 0 && index < livros.size()) {
						Livro livro = livros.get(index);
						System.out.println("editando livro:\n");
						livro.exibirInfo();
						System.out.println("\n");

						System.out.println("novo titulo(ou ENTER para não mudar): ");
						String newTitulo = input.nextLine();

						if (!newTitulo.isEmpty())
							livro.setTitulo(newTitulo);

						System.out.println("Novo autor(ou enter para não mudar): ");
						String newAutor = input.nextLine();

						if (!newAutor.isEmpty())
							livro.setAutor(newAutor);

						System.out.println("Novo preço(ou '-1' para não mudar): ");
						double newPreco = input.nextDouble();
						if (newPreco >= 0)
							livro.setPreco(newPreco);

						System.out.println("Atualizado!");
					} else {
						System.out.println("indice errado.");
						break;
					}
					break;
				}
			case 4:
				System.out.println("Saindo...");
				input.close();
				return;

			default:
				System.out.println("Opção invalida.");
			}

		}
	}

}

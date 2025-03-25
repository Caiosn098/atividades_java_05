package java09_collection_fila_pilha;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2_Pilha {

	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n***************************************\n");
			System.out.println("--(1).Adicionar livro na pilha--");
			System.out.println("--(2).Listar todos os livros--");
			System.out.println("--(3).Retirar livro da pilha--");
			System.out.println("--(0).Sair--");
			System.out.println("\n***************************************");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1: {
				System.out.println("\nDigite o nome do livro: ");
				String livro = scanner.nextLine();
				pilhaLivros.add(livro);
				System.out.println("\nO livro '"+ livro +"' foi adicionado!\nPilha: ");
				for (String pilha:pilhaLivros) {
					System.out.println(pilha);
				}
				break;

			}
			case 2: {
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha de livros está vazia!\n");
				} else {
					System.out.println("\nLista de livros na pilha: ");
					for (String pilha:pilhaLivros) {
						System.out.println(pilha);
					}

				}
				break;

			}
			case 3: {
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha de livros está vazia!\n");
				} else {
					System.out.println("\nO livro '"+pilhaLivros.pop()+"' foi retirado da pilha!\nPilha: ");
					for (String pilha:pilhaLivros) {
						System.out.println(pilha);
					}

				}
				break;

			}
			case 0: {
				 System.out.println("\nPrograma finalizado!\n");
                 break;
			}
			default:
				System.out.println("\nOpção inválida!\n");

			}
		} while (opcao != 0);
		
		scanner.close();
	}
}
package java09_collection_fila_pilha;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1_Fila {

	public static void main(String[] args) {

		Queue<String> filaClientes = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n***************************************");
			System.out.println("--(1).Adicionar cliente na fila--");
			System.out.println("--(2).Listar todos os clientes--");
			System.out.println("--(3).Retirar cliente da fila--");
			System.out.println("--(0).Sair--");
			System.out.println("\n***************************************");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1: {
				System.out.println("\nDigite o nome do(a) cliente: ");
				String cliente = scanner.nextLine();
				filaClientes.add(cliente);
				System.out.println("\nCliente " + cliente + " adicionado!\nFila:");

				Iterator<String> iFila = filaClientes.iterator();
				while (iFila.hasNext()) {
					System.out.println(iFila.next());
				}
				break;

			}
			case 2: {
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia!\n");
				} else {
					System.out.println("Lista de clientes na fila: ");

					Iterator<String> iFilaClientes = filaClientes.iterator();
					while (iFilaClientes.hasNext()) {
						System.out.println(iFilaClientes.next());
					}

				}
				break;

			}
			case 3: {
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia!\n");
				} else {
					System.out.println("\nO(A) cliente " + filaClientes.poll() + " foi chamado(a)!\nFila: ");

					Iterator<String> iRestantes = filaClientes.iterator();
					while (iRestantes.hasNext()) {
						System.out.println(iRestantes.next());
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
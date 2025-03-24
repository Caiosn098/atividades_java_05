package java08_collections_list_set_extras;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2_List {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite um número para encontrar sua posição na lista: ");
		int posicao = scanner.nextInt();
		
		if (numeros.contains(posicao)) {
			System.out.println("\nA posição da nota  é: " + numeros.indexOf(posicao));
		} else {
			System.out.println("\nO número não foi encontrado!");
		}
		scanner.close();

	}

}
package java08_collection_list_set;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1_List {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 1; i < 6; i++) {
			System.out.println("Digite a " + i + "ª cor: ");
			cores.add(scanner.nextLine());
		}

		System.out.println("\nLista de cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		cores.sort(null);
		System.out.println("\nLista de cores ordenadas em ordem alfabética: ");

		for (String cor : cores) {
			System.out.println(cor);
		}

		scanner.close();

	}

}
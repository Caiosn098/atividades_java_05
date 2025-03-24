package java08_collections_list_set_extras;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4_Set {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();

		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		System.out.println("Digite um número para saber se ele está na lista: ");
		int numero = scanner.nextInt();

		if (setNumeros.contains(numero)) {
			System.out.println("\nO número "+numero+" foi encontrado!");
		} else {
			System.out.println("\nO número "+numero+" não foi encontrado!");
		}
		scanner.close();

	}

}

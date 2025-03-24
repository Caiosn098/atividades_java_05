package java08_collection_list_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3_Set {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();

		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "° número: ");
			setNumeros.add(scanner.nextInt());
		}

		Iterator<Integer> iSetNumeros = setNumeros.iterator();

		while (iSetNumeros.hasNext()) {
			System.out.println(iSetNumeros.next());

		}

	}
}

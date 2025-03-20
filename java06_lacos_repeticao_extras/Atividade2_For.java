package java06_lacos_repeticao_extras;

import java.util.Scanner;

public class Atividade2_For {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int pares = 0, impares = 0;
		int cont;
		
		System.out.println("Digite 10 números para calcular quantos são pares e quantos são ímpares:");
		for (cont = 1; cont < 11; cont++) {
			System.out.println("\nDigite o " + cont + "° número:");
			int numeros = lerScanner.nextInt();

			if (numeros % 2 == 0) {
				pares++;

			} else {
				impares++;
			}
		}
		System.out.println(pares + " números pares.");
		System.out.println(impares + " números ímpares.");

		lerScanner.close();
	}

}

package java06_lacos_repeticao_extras;

import java.util.Scanner;

public class Atividade6_Do_While {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		float multiplo3=0, numero, soma=0;
		
		System.out.println("Digite alguns números e calcule a média dos múltiplos de 3 (Digite 0 para encerrar)");

		do {
			System.out.println("\nDigite um número:");
			numero = lerScanner.nextFloat();

			if (numero % 3 == 0 && numero !=0) {
				multiplo3++;
				soma += numero;
				
			} else {

			}

		} while (numero != 0);
		
		System.out.printf("\nA média de todos os números múltiplos de 3 é %.1f",soma/multiplo3);
		
		lerScanner.close();
	}

}

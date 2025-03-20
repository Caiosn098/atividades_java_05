package java06_lacos_repeticao;

import java.util.Scanner;

public class Atividade3_While {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		int menor21 = 0;
		int maior50 = 0;
		boolean continua;

		System.out.print("Deseja calcular a quantidade de pessoas menores de 21 anos e maiores de 50?\n"
				+ "Digite (s) para sim e (n) para não:\n");
		continua = lerScanner.next().equalsIgnoreCase("s");

		while (continua) {
			System.out.println("\nDigite uma idade:");
			int idade = lerScanner.nextInt();

			if (idade < 21 && idade > 0) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			} else if (idade < 0) {
				continua = false;
				System.out.println("\nTotal de pessoas menores de 21: " + menor21);
				System.out.println("\nTotal de pessoas maiores de 50: " + maior50);
			} else {

			}

		}
		lerScanner.close();
	}
}

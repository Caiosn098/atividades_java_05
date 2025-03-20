package java06_lacos_repeticao;

import java.util.Scanner;

public class Atividade1_For {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		System.out.println("Calcule quais números são múltiplos de 3 e 5 dentro de um intervalo");
		System.out.println("(O primeiro número deve ser menor do que o segundo)\n");
		System.out.println("Digite o primeiro número:");
		int num1 = lerScanner.nextInt();

		System.out.println("Digite o segundo número:");
		int num2 = lerScanner.nextInt();

		if (num2 < num1) {
			System.out.println("Intervalo invalido!");
		} else {
			System.out.println("No intervalo entre " + num1 + " e " + num2 + ": \n");
			for (int cont = num1; cont < num2; cont++) {
				if (cont % 3 == 0 && cont % 5 == 0) {
					System.out.println(cont + " é múltiplo de 3 e 5");
				}

			}

		}

		lerScanner.close();
	}

}

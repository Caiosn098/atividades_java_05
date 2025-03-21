package java07_vetores;

import java.util.Scanner;

public class Atividade2_Vetores {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int vetorInteiro[] = new int[10], i = 0;
		float media = 0, soma = 0;

		for (i=0; i < vetorInteiro.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			vetorInteiro[i] = lerScanner.nextInt();
			soma += vetorInteiro[i];
		}
		
		media = soma / vetorInteiro.length;
		
		System.out.println("Os elementos pares são: ");
		for (i=0; i < vetorInteiro.length; i++) {
			if (vetorInteiro[i] % 2 == 0) {
				System.out.println(vetorInteiro[i]);
			}
		}
		System.out.println("\nOs elementos dos índices ímpares são: ");
		for (i=0; i < vetorInteiro.length; i++) {
			if (i % 2 != 0) {
				System.out.println(vetorInteiro[i]);
			}
		}
		System.out.printf("\nO valor total da soma dos elementos é: %.0f",soma);
		System.out.printf("\nA média dos elementos é: %.2f",media);

		lerScanner.close();

		}
	}


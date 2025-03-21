package java07_vetores;

import java.util.Scanner;

public class Atividade1_Vetores {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		int vetorInteiro[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int posicao = -1;

		System.out.println("Digite o número que você deseja encontrar: ");
		int numero = lerScanner.nextInt();

		for (int i = 0; i<vetorInteiro.length; i++) {
			if (vetorInteiro[i]== numero ) {
				posicao = i;
				break;
			}
			
		}if(posicao != -1) {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		}else {
			System.out.println("O número " + numero + " não foi localizado!");
		}
		
		lerScanner.close();
	}

}

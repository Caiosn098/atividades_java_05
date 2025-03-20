package java06_lacos_repeticao;

import java.util.Scanner;

public class Atividade5_Do_While {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		int inicial=0,numero, soma;
		
		System.out.println("Digite alguns números e calcule a soma dos números positivos (Digite 0 para encerrar)");
		
		do {
			System.out.println("\nDigite um número para ser somado:");
			numero = lerScanner.nextInt();
			
			if (numero>0) {
				soma = inicial+numero;
				inicial = soma;
			}else {
				
			}
		
		
		} while (numero != 0);
		
		System.out.println("\nA soma dos números positivos é "+inicial);
		
		lerScanner.close();
	}

}

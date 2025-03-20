package java05_controflow_extras;

import java.util.Scanner;

public class Atividade7_Switch_Case {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
	
		float n1, n2, soma, subt, mult, div;
		int opcao;

		System.out.println("Digite o primeiro número: ");
		n1 = lerScanner.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = lerScanner.nextFloat();
		
		System.out.println("\nESCOLHA UMA OPERAÇÃO:\n");
		System.out.println("--(1).Soma--");
		System.out.println("--(2).Subtração--");
		System.out.println("--(3).Multiplicação--");
		System.out.println("--(4).Divisão--");
		System.out.println("\n### ### ## # # # # ### # # ## # #####");
		opcao = lerScanner.nextInt();
		
		
		switch (opcao) {
		
		case 1:
				System.out.printf("O resultado da soma é %.1f", soma = n1+n2);
				
			break;
			
		case 2:
				System.out.printf("O resultado da subtração é %.1f", subt = n1-n2);
			
			break;
			
		case 3:
				System.out.printf("O resultado da multiplicação é %.1f", mult = n1*n2);
			
			break;
		case 4:
				System.out.printf("O resultado da divisão é %.1f", div = n1/n2);
			
			break;
		default:
			System.out.println("Opção inválida!");
			break;

		}
		
		lerScanner.close();
	}

}

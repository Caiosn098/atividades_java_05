package java05_controflow;

import java.util.Scanner;

public class Atividade5_Switch_Case {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		int opcao, quantidade;
		float item1=10.0f,item2=15.0f,item3=18.0f,item4=12.0f,item5=8.0f,item6=13.0f;

		System.out.println("### ESCOLHA O SEU LANCHE ###\n");
		System.out.println("--1.Cachorro Quente   |VALOR: R$10,00--");
		System.out.println("--2.X-Salada          |VALOR: R$15,00--");
		System.out.println("--3.X-Bacon           |VALOR: R$18,00--");
		System.out.println("--4.Bauru             |VALOR: R$12,00--");
		System.out.println("--5.Refrigerante      |VALOR: R$8,00--");
		System.out.println("--6.Suco de Laranja   |VALOR: R$13,00--");
		System.out.println("\n### ### ## # # # # ### # # ## # #####");
		opcao = lerScanner.nextInt();
		
		System.out.println("QUANTIDADE DE PRODUTOS");
		quantidade = lerScanner.nextInt();
			
		switch (opcao) {
		
		case 1:
			System.out.printf("TOTAL: R$%.2f", quantidade*item1);
			break;
		case 2:
			System.out.printf("TOTAL: R$%.2f", quantidade*item2);
			break;
		case 3:
			System.out.printf("TOTAL: R$%.2f", quantidade*item3);
			break;
		case 4:
			System.out.printf("TOTAL: R$%.2f", quantidade*item4);
			break;
		case 5:
			System.out.printf("TOTAL: R$%.2f", quantidade*item5);
			break;
		case 6:
			System.out.printf("TOTAL: R$%.2f", quantidade*item6);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
	}
	
}

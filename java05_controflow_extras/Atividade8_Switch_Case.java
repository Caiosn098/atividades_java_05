package java05_controflow_extras;

import java.util.Scanner;

public class Atividade8_Switch_Case {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		int opcao, senha;
		float valor, saldo=1000, saque, deposit;
		
		System.out.println("\nESCOLHA UMA OPERAÇÃO: \n");
		System.out.println("--(1).Saldo--");
		System.out.println("--(2).Saque--");
		System.out.println("--(3).Depósito--");
		System.out.println("\n### ### ## # # # # ### # # ## # #####");
		opcao = lerScanner.nextInt();
		
		switch (opcao) {
		
		case 1: {
				System.out.println("Operação - Saldo");
				System.out.printf("R$%.2f",saldo);

			}				
			break;
		case 2: {
			System.out.println("Operação - Saque");
			System.out.println("\nDigite o valor que deseja sacar: ");
			saque = lerScanner.nextFloat();
			if(saque>saldo) {
				System.out.println("Saldo Insuficiente!");
			}else {
				System.out.println("\nDigite a sua senha: ");
				senha = lerScanner.nextInt();
				saldo = saldo - saque;
				System.out.println("\nTransação Concluída!");
				System.out.printf("Seu saldo atual é R$%.2f", saldo);
			}
		}
			break;
		
		case 3: {
			System.out.println("Operação - Depósito");
			System.out.println("\nDigite o valor que deseja depositar: ");
			deposit = lerScanner.nextFloat();
			saldo = deposit+saldo;
				System.out.println("Transação Concluída!");
				System.out.printf("Seu saldo atual é R$%.2f", saldo);

			}
		default:
			System.out.println("Opção inválida!");
			break;
			}
		
		lerScanner.close();
		
	}
		
}
	
	

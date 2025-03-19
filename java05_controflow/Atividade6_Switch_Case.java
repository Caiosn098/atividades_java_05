package java05_controflow;

import java.util.Scanner;

public class Atividade6_Switch_Case {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		String nome;
		int cargo, rj1=10,rj2=7,rj3=9,rj4=6,rj5=5,rj6=8;
		float salario, novoSalario = 0;

		System.out.println("Digite seu nome: ");
		nome = lerScanner.nextLine();
		
		System.out.println("\nQual a sua função: \n");
		System.out.println("--(1).Gerente--");
		System.out.println("--(2).Vendedor--");
		System.out.println("--(3).Supervisor--");
		System.out.println("--(4).Motorista--");
		System.out.println("--(5).Estoquista--");
		System.out.println("--(6).Técnico de TI--");
		System.out.println("\n### ### ## # # # # ### # # ## # #####");
		cargo = lerScanner.nextInt();
		
		System.out.println("\nDigite o valor do seu salário: ");
		salario = lerScanner.nextFloat();
		
		switch (cargo) {
		
		case 1:
				novoSalario = salario + (rj1*salario)/100;
				System.out.println("\nOlá "+nome+ "!\nCargo: Gerente");
				System.out.printf("Seu novo salário será de R$%.2f", novoSalario);
			break;
		case 2:
				novoSalario = salario + (rj2*salario)/100;
				System.out.println("\nOlá "+nome+ "!\nCargo: Vendedor");
				System.out.printf("Seu novo salário será de R$%.2f", novoSalario);
			break;
		case 3:
				novoSalario = salario + (rj3*salario)/100;
				System.out.println("\nOlá "+nome+ "!\nCargo: Supervisor");
				System.out.printf("Seu novo salário será de R$%.2f", novoSalario);
			break;
		case 4:
				novoSalario = salario + (rj4*salario)/100;   
				System.out.println("\nOlá "+nome+ "!\nCargo: Motorista");
				System.out.printf("Seu novo salário será de R$%.2f", novoSalario);
			break;
		case 5:
				novoSalario = salario + (rj5*salario)/100;  
				System.out.println("\nOlá "+nome+ "!\nCargo: Estoquista");
				System.out.printf("Seu novo salário será de R$%.2f", novoSalario);
			break;
		case 6:
				novoSalario = salario + (rj6*salario)/100;   
				System.out.println("\nOlá "+nome+ "!\nCargo: Técnico de TI");
				System.out.printf("Seu novo salário será de R$%.2f", novoSalario);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		lerScanner.close();

	}

}

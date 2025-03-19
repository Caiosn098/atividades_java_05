package java05_controflow_extras;

import java.util.Scanner;

public class Atividade3_Laco_If {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		String nome, resposta;
		int idade;
		boolean sim = true;
		
		System.out.println("Digite o seu nome: ");
		nome = lerScanner.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = lerScanner.nextInt();
		
		System.out.println("\nEsta é sua primeira vez doando sangue? ");
		resposta = lerScanner.nextLine();
		
		if(idade>=18 && idade<=60 || idade>=18 && idade<=69 && true) {
			System.out.println("\n"+nome+" você está apto para doar sangue!");
		}else { 
			System.out.printf("\n"+nome+" você não está apto para doar sangue!");

		}
		
	}
	
}

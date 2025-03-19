package java05_controflow_extras;

import java.util.Scanner;

public class Atividade4_Laco_If {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		String tipo1,tipo2,tipo3;
		
		System.out.println("Digite uma classificação: ");
		tipo1 = lerScanner.nextLine();
		if(tipo1.equals("vertebrado")) {
			System.out.println("É uma Ave ou um Mamífero? ");
		}else
			System.out.println("É um Inseto ou um Anelídeo");
		tipo2 = lerScanner.nextLine();
		
		if(tipo2.equals("ave"))

		System.out.println("Digite o tipo de alimentação: ");
		tipo3 = lerScanner.nextLine();
		
		
		

	}

}

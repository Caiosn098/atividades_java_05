package java05_controflow;

import java.util.Scanner;

public class Atividade1_Laco_If {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		int A,B,C;
		
		System.out.println("Digite o primeiro número: ");
		A = lerScanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		B = lerScanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		C = lerScanner.nextInt();
		
		if((A+B) > C) {
			System.out.println("A soma de A+B é Maior do que C");
		}else if ((A+B) < C) {
			System.out.println("\nA soma de A+B é Menor do que C");
		}else { 
			System.out.printf("\nA soma de A+B é Igual a C");


		}
	}
}

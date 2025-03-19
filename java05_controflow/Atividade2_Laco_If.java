package java05_controflow;

import java.util.Scanner;

public class Atividade2_Laco_If {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		int A;
		
		System.out.println("Digite um número: ");
		A = lerScanner.nextInt();
		
		
		if(A%2 == 0 && A > 0) {
			System.out.println("O número é par e positivo!");
		}else if (A%2 != 0 && A > 0) {
			System.out.println("\nO número é ímpar e positivo!");
		}else if (A%2 == 0 && A < 0) {
			System.out.println("\nO número é par e negativo!");
		}else if (A==0) { 
			System.out.printf("\nO número 0 é par e neutro!");


		}

	}
}

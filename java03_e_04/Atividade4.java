package java03_e_04;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		float n1, n2, n3, n4, resul;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = ler.nextFloat();
		
		System.out.println("\nDigite o segundo valor: ");
		n2 = ler.nextFloat();
		
		System.out.println("\nDigite o terceiro valor: ");
		n3 = ler.nextFloat();
		
		System.out.println("\nDigite o quarto valor: ");
		n4 = ler.nextFloat();
		
		resul = (n1*n2)-(n3*n4);
		
		System.out.printf("\nA diferença é: %.1f", resul);

	}

}

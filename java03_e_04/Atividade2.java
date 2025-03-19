package java03_e_04;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		float n1, n2, n3, n4, resul;
		
		System.out.println("Digite o valor da primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.println("Digite o valor da segunda nota: ");
		n2 = ler.nextFloat();
		
		System.out.println("Digite o valor da terceira nota: ");
		n3 = ler.nextFloat();
		
		System.out.println("Digite o valor da quarta nota: ");
		n4 = ler.nextFloat();
		
		resul = (n1+n2+n3+n4)/4;
		
		System.out.printf("\nSua média é %.1f", resul, ".");

	}

}

package java03_e_04;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, resul;
		
		System.out.println("Digite o valor do salário: ");
		salario = ler.nextFloat();
		
		System.out.println("\nDigite o valor do abono: ");
		abono = ler.nextFloat();
		
		resul = salario + abono;
		
		System.out.printf("\nSeu novo salário será: = %.2f", resul);
		

		
		

	}

}

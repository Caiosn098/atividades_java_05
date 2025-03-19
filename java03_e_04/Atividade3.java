package java03_e_04;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float salario, adicional, horaExtra, desconto, resul;
		
		System.out.println("Digite o valor do seu salário bruto: ");
		salario = ler.nextFloat();
		
		System.out.println("\nDigite o valor do adicional noturno: ");
		adicional = ler.nextFloat();
		
		System.out.println("\nDigite o valor das horas extras: ");
		horaExtra = ler.nextFloat();
		
		System.out.println("\nDigite o valor dos descontos: ");
		desconto = ler.nextFloat();
		
		resul = salario + adicional + (horaExtra*5) - desconto;
		
		System.out.printf("\nO valor do salário líquido será: = %.2f", resul);

	}

}

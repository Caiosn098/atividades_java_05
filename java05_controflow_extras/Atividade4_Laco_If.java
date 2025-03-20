package java05_controflow_extras;

import java.util.Scanner;

public class Atividade4_Laco_If {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		String tipo1,tipo2,tipo3;
		
		System.out.println("É vertebrado ou invertebrado? ");
		tipo1 = lerScanner.nextLine();
		
		if(tipo1.equals("vertebrado")) {
			System.out.println("É uma Ave ou um Mamífero? ");
			
		}else 
			System.out.println("É um Inseto ou um Anelídeo?");
		tipo2 = lerScanner.nextLine();
		
	
		System.out.println("É herbívoro, carnívoro, onívoro ou hematófago? ");
		tipo3 = lerScanner.nextLine();
		
		if(tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("onívoro")) {
			System.out.println("Pomba!");
			
		}else if (tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("carnívoro")) {
			System.out.println("Águia!");
			
		}else if (tipo1.equals("vertebrado") && tipo2.equals("mamífero") && tipo3.equals("onívoro")) {	
			System.out.println("Homem!");
			
		}else if (tipo1.equals("vertebrado") && tipo2.equals("mamífero") && tipo3.equals("herbívoro")) {	
			System.out.println("Vaca!");
			
		}else if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematófago")) {	
			System.out.println("Pulga!");
			
		}else if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("herbívoro")) {	
			System.out.println("Lagarta!");
			
		}else if (tipo1.equals("invertebrado") && tipo2.equals("anelídeo") && tipo3.equals("hematófago")) {	
			System.out.println("Sanguessuga!");
			
		}else if (tipo1.equals("invertebrado") && tipo2.equals("anelídeo") && tipo3.equals("onívoro")) {	
			System.out.println("Minhoca!");
		}else {
		System.out.println("Opção inválida!");
		}
			
		

	}

}



package Aula1702;

import java.util.Scanner;

public class LerDuasVariaveisETrocar {

	public static void main(String[] args) {
		// ler dois valores e trocar
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		// primeiro valor
		double a;
		a = sc.nextDouble();
		
		System.out.println("Digite um valor para B: ");
		// segundo valor
		double b;
		b = sc.nextDouble();
		
		//realizando a troca do valor, c vai ser igual b
		double c;
		c = a;
		
		// realizando a troca do valor, d vai ser igual a
		double d;
		d = b;
		

		
		System.out.println("Valor de A: " + d);
		System.out.println("Valor de B: " + c);
		
		sc.close();

	}

}

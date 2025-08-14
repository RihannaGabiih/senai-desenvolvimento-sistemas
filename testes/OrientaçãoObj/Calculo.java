package testes;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		Retangulo r3 = new Retangulo();

		System.out.println("Digite os dados do 1º retangulo: ");
		System.out.println("Digite a altura do retangulo: ");
		r1.alt = sc.nextDouble();
		System.out.println("Digite o comprimento do retangulo: ");
		r1.comp = sc.nextDouble();
		
		System.out.println();
		System.out.println("Digite os dados do 2º retangulo: ");
		System.out.println("Digite a altura do retangulo: ");
		r2.alt = sc.nextDouble();
		System.out.println("Digite o comprimento do retangulo: ");
		r2.comp = sc.nextDouble();
		
		System.out.println();
		System.out.println("Digite os dados do 3º retangulo: ");
		System.out.println("Digite a altura do retangulo: ");
		r3.alt = sc.nextDouble();
		System.out.println("Digite o comprimento do retangulo: ");
		r3.comp = sc.nextDouble();

		System.out.println();
		System.out.println("A area desses retangulos são:");
		System.out.println("Retangulo 1: " + r1.area());
		System.out.println("Retangulo 2: " + r2.area());
		System.out.println("Retangulo 3: " + r3.area());
		
		
		System.out.println(r1.toString());
		

		sc.close();

	

	
	}

}

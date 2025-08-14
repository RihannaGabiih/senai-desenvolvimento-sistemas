package Aula1702;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu peso:");
		double peso;
		peso = sc.nextDouble();
		System.out.println(String.format("peso: %.2f", peso));
		
		System.out.print("Digite sua altura:");
		double altura;
		altura = sc.nextDouble();
		System.out.println(String.format("altura: %.2f", altura));
		
		double imc;
		imc = peso / (altura * altura);
		System.out.print(String.format("Imc: %.2f", imc ));
		
		sc.close();
	}

}

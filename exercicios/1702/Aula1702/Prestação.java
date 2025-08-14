package Aula1702;

import java.util.Scanner;

public class Prestação {

	public static void main(String[] args) {
		// Efetuar o cálculo e apresentar o valor de uma prestação de
		//um bem em atraso

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação: ");
		double valor;
		valor = sc.nextDouble();
		
		System.out.println("Digite o valor da taxa de atraso: ");
		double taxa;
		taxa = sc.nextDouble();
		
		System.out.println("Digite o tempo de atraso: ");
		int tempo;
		tempo = sc.nextInt();
		
		double prestacao;
		prestacao = valor + (valor * (taxa / 100) * tempo);
		System.out.println(String.format("Valor da prestação: %.2f", prestacao));
		
		sc.close();
		
		
	}

}

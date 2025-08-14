package Aula1702;

import java.util.Scanner;

public class volumecaixaretangular {

	public static void main(String[] args) {
		// Calcular o volume de uma caixa retangular;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do comprimento da caixa: ");
		int compri;
		compri = sc.nextInt();
		
		System.out.print("Digite o valor da largura da caixa: ");
		int larg;
		larg = sc.nextInt();
		
		System.out.print("Digite o valor da altura da caixa: ");
		int altura;
		altura = sc.nextInt();
		
		int volume;
		volume = compri * larg * altura;
		System.out.println("O volume da caixa é: " + volume);
		
       sc.close();		

	}

}

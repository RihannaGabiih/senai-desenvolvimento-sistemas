package Aula0302;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		// Divisão de dois inteiros
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero:");
		int num1;
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero:");
		int num2;
		num2 = sc.nextInt();
		
		int divisao;
		divisao = num1 / num2;
		System.out.print("Resultado:" + divisao);
		
		sc.close();
				

	}

}

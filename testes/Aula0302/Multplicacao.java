package Aula0302;

import java.util.Scanner;

public class Multplicacao {

	public static void main(String[] args) {
		//multiplicacao de dois numeros
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero:");
		int num1;
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero:");
		int num2;
		num2 = sc.nextInt();
		
		int produto;
		produto = num1 * num2;
		System.out.print("Resultado:" + produto);
		
		sc.close();
		

	}

}

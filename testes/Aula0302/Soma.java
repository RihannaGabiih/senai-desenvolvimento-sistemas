package Aula0302;

import java.util.Scanner;

public class Soma {
//somar dois numeros inteiros
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro numero:");
		int numero1;
		numero1 = sc.nextInt();

		System.out.print("Digite o segundo numero:");
		int numero2;
		numero2 = sc.nextInt();

		int soma;
		soma = numero1 + numero2;
		System.out.print("Resultado da soma:" + soma);

		sc.close();

	}

}

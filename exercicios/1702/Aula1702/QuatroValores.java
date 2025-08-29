package Aula1702;

import java.util.Scanner;

public class QuatroValores {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		//Comece lendo 4 valores inteiros.
		
		System.out.println("Digite um número inteiro: ");
		int a;
		a = sc.nextInt();
		
		System.out.println("Digite um segundo número inteiro: ");
		int b;
		b = sc.nextInt();
		 
		System.out.println("Digite um terceiro número inteiro: ");
		int c;
		c = sc.nextInt();
		
		System.out.println("Digite um último número inteiro: ");
		int d;
		d = sc.nextInt();
		
		//Agora faremos seis adições e mutiplicações para os números, combinando eles
		
		int adi1;
		adi1 = a + b;
		
		int adi2;
		adi2 = a + c;
		
		int adi3;
		adi3 = a + d;
		
		int adi4;
		adi4 = b + c;
		
		int adi5;
		adi5 = b + d;
		
		int adi6;
		adi6 = c + d;
		
		
		int mul1;
		mul1 = a * b;
		
		int mul2;
		mul2 = a * c;
		
		int mul3;
		mul3 = a * d;
		
		int mul4;
		mul4 = b * c;
		
		int mul5;
		mul5 = b * d;
		
		int mul6;
		mul6 = c * d;
		
		System.out.println("Os resultados de todas as adiçoes para esses números são: " );
		System.out.println(adi1);
		System.out.println(adi2);
		System.out.println(adi3);
		System.out.println(adi4);
		System.out.println(adi5);
		System.out.println(adi6);
		
		System.out.println("Os resultados de todas as multiplicações para esses números são: " );
		System.out.println(mul1);
		System.out.println(mul2);
		System.out.println(mul3);
		System.out.println(mul4);
		System.out.println(mul5);
		System.out.println(mul6);
		
		
		sc.close();
		
		
		
	
	}

}

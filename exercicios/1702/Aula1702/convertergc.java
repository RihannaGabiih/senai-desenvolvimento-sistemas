package Aula1702;

import java.util.Scanner;

public class ConverterGC {

	public static void main(String[] args) {
		
		//Exercicio 4.A, converter graus celsius para fahrenheit
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus Celsius:");
		double celsius;
		celsius = sc.nextDouble();
		
		double fahre;
		fahre = celsius * 9 / 5 + 32;
		System.out.print("A temperatura em fahrenheit é:" + fahre);
		
		sc.close();
		
				
	}

}

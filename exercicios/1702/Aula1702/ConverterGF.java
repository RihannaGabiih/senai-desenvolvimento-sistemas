package Aula1702;

import java.util.Scanner;

public class ConverterGF {

	public static void main(String[] args) {
		 
		// Exercicio 4.B converter graus fahrenheit em graus celsius
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em fahrenheit: ");
		double fahr;
		fahr = sc.nextDouble();
		
		double celsius;
		celsius = ((fahr - 32) * 5)/9;
		System.out.print("A temperatura é graus celsius é: " + celsius);
		
		sc.close();
				


	}

}

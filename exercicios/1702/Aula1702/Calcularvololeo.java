package Aula1702;

import java.util.Scanner;

public class Calcularvololeo {

	public static void main(String[] args) {
		
		// Exercicio 4.C calcular volume de uma lata de óleo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio da base da lata de óleo:");
		double raio;
		raio = sc.nextDouble();
		
		System.out.print("Digite a altura da lata de óleo:");
		double altura;
		altura = sc.nextDouble();
		
		double volume;
		volume = 3.14159 * (raio * raio) * altura;
		System.out.println(String.format("O volume da lata de óleo é: %.2f", volume));
		
		sc.close();
		
	}

}

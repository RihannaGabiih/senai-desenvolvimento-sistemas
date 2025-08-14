package testes;

import java.util.Scanner;

public class Obj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double alt1, alt2, alt3, comp1, comp2, comp3;

		System.out.println("Digite o valor do 1º retangulo: ");
		System.out.println("Altura: ");
		alt1 = sc.nextDouble();
		System.out.println("Comprimento: ");
		comp1 = sc.nextDouble();

		System.out.println("Digite o valor do 2º retangulo: ");
		System.out.println("Altura: ");
		alt2 = sc.nextDouble();
		System.out.println("Comprimento: ");
		comp2 = sc.nextDouble();

		System.out.println("Digite o valor do 3º retangulo: ");
		System.out.println("Altura: ");
		alt3 = sc.nextDouble();
		System.out.println("Comprimento: ");
		comp3 = sc.nextDouble();

		double area1, area2, area3;
		area1 = alt1 * comp1;
		area2 = alt2 * comp2;
		area3 = alt3 * comp3;

		System.out.println("As areas dos retangulos são: ");
		System.out.println("Retangulo 1: " + area1);
		System.out.println("Retangulo 2: " + area2);
		System.out.println("Retangulo 3: " + area3);

		sc.close();

	}

}

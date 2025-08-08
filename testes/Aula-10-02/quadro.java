package Aula1002;

import java.util.Scanner;
import java.lang.Math;

public class Quadro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura:");
		double larg;
		larg = sc.nextDouble();
		System.out.println(String.format("Largura: %.1f", larg));
		
		System.out.print("Digite o comprimento:");
		double compri;
		compri = sc.nextDouble();
		System.out.println(String.format("Comprimento: %.1f", compri));
		
		double area;
		area = larg * compri;
		System.out.println(String.format("Área: %.4f", area));
		
		double perimetro;
		perimetro = 2 * larg + 2 * compri;
		System.out.println(String.format("Perímetro: %.4f", perimetro));
		
		double diagonal;
		System.out.print("Diagonal:");
		System.out.print(String.format("%.4f", Math.sqrt (( larg * larg) + (compri * compri))));
		
		sc.close();
	
	}

}

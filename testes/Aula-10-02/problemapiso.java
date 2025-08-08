package Aula1002;

import java.util.Scanner;


public class ProblemaPiso {

	public static void main(String[] args) {
		//area e custo de um comodo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura:");
		double larg;
		larg = sc.nextDouble();
		System.out.println(String.format("Largura: %.1f ", larg));
		
		System.out.print("Digite o comprimento:");
		double compri;
		compri = sc.nextDouble();
		System.out.println(String.format("Comprimento: %.1f" , compri));
		
		System.out.print("Digite o valor do metro quadrado:");
		double metroQuadrado;
		metroq = sc.nextDouble();
		System.out.println(String.format("Metro quadrado: %.2f" , metroq));
		
		double area;
		area = larg * compri;
		System.out.println(String.format("Área do cômodo: %.2f" , area ));
		
		
		double custo;
		custo = metroq * area;
		System.out.println(String.format("Custo total do piso: %.2f" , custo ));
		
		
		
		sc.close();
		
	}

}

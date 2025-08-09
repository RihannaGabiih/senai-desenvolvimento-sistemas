package exercicio2;

import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto pdt = new Produto();
		
		System.out.println("Digite o nome do produto: ");
		pdt.setNome(sc.next());
		
		System.out.println("Digite o preço do produto:");
		pdt.setPreco(sc.nextDouble());
	
		
		System.out.println("Digite o percentual do desconto do produto: ");
		 double desconto = sc.nextDouble();   
		 
	        pdt.aplicarDesconto(desconto);
	        
	        sc.close();

	}

}

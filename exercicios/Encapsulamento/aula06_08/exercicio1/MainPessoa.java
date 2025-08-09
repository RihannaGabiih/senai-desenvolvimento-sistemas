package exercicio1;

import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa ps = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		ps.setNome(sc.next());
		
		System.out.println("Digite sua idade: ");
		ps.setIdade(sc.nextInt());
		
	
		
		sc.close();
	

	}

}

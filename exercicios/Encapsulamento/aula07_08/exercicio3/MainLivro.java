package exercicio3;

import java.util.Scanner;

public class MainLivro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro liv = new Livro();
		
		System.out.println("------BIBLIOTECA VIRTUAL------");
		System.out.println("Digite as informações do livro:");
		System.out.println("Título: ");
		liv.setTitulo(sc.nextLine());
		
		System.out.println("Autor: ");
		liv.setAutor(sc.nextLine());
		
		System.out.println("Número de páginas: ");
		liv.setNumeroPaginas(sc.nextInt());
				
		sc.close();
		



	}

}

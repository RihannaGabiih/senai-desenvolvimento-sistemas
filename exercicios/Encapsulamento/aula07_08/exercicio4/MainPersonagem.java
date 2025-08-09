package exercicio4;

import java.util.Scanner;

public class MainPersonagem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PersonagemRPG pRPG = new PersonagemRPG();
		
		System.out.println("-----Monte seu personagem RPG-----");
		System.out.println("Nome: ");
		pRPG.setNome(sc.nextLine());
		
		System.out.println("Classe: (ex: Guerreiro, Mago, Arqueiro e etc...)");
		pRPG.setClasse(sc.nextLine());
		
		System.out.println("Nível atual: ");
		pRPG.setNivel(sc.nextInt());
		
		System.out.println("Vida atual: ");
		pRPG.setVida(sc.nextInt());
		
		System.out.println(pRPG.toString());
		
		sc.close();		
	}

}

package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoPedra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String[] opcoes = {"pedra", "papel", "tesoura", "lagarto", "spock"};
		
		System.out.println("Escolha uma opção para jogar:");
		for (int i = 0; i < opcoes.length; i++) {
		    System.out.println(i + " - " + opcoes[i].substring(0, 1).toUpperCase() + opcoes[i].substring(1));
		}
		System.out.print("Sua jogada: ");
        int jogador = sc.nextInt();
        
        int computador = rd.nextInt(opcoes.length);
        
        System.out.println("Você escolheu: " + opcoes[jogador]);
        System.out.println("Computador escolheu: " + opcoes[computador]);
        
        if (jogador == computador) {
            System.out.println("Empate!");
        } else if (
            (jogador == 0 && (computador == 2 || computador == 3)) || 
            (jogador == 1 && (computador == 0 || computador == 4)) || 
            (jogador == 2 && (computador == 1 || computador == 3)) || 
            (jogador == 3 && (computador == 4 || computador == 1)) || 
            (jogador == 4 && (computador == 0 || computador == 2)) 
        ) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Computador venceu!");
        }

        sc.close();
	}

}

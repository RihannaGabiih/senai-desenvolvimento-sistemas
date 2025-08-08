package exercicios;

import java.util.Scanner;

public class VotacaoMascote {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		String[] candidatos = { "Cachorro", "Gato", "Coruja", "Dragão" };
		int[] votos = new int[candidatos.length];
		int totalVotos = 0;

		System.out.println("--- Votação para o Mascote da Turma ---");
		System.out.println("Digite o nome do candidato para votar (ou 'fim' para encerrar):");

		while (true) {
			System.out.println("\nCandidatos:");
			for (int i = 0; i < candidatos.length; i++) {
				System.out.println("- " + candidatos[i]);
			}

			System.out.print("Seu voto: ");
			String voto = sc.nextLine();

			if (voto.equalsIgnoreCase("fim")) {
				break;
			}

			boolean votoValido = false;
			for (int i = 0; i < candidatos.length; i++) {
				if (voto.equalsIgnoreCase(candidatos[i])) {
					votos[i]++;
					totalVotos++;
					votoValido = true;
					System.out.println("Voto computado para " + candidatos[i] + "!");
					break;
				}
			}

			if (!votoValido) {
				System.out.println("Candidato inválido. Tente novamente.");
			}
		}

		System.out.println("\n--- Resultado da Votação ---");
		if (totalVotos == 0) {
			System.out.println("Nenhum voto registrado.");
		} else {
			for (int i = 0; i < candidatos.length; i++) {
				double porcentagem = (votos[i] * 100.0) / totalVotos;
				System.out.printf("%s: %d votos (%.1f%%)%n", candidatos[i], votos[i], porcentagem);
			}
		}

		sc.close();
	}
}

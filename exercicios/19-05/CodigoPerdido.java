package exercicios;

import java.util.Scanner;

public class CodigoPerdido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultado = "";
		String entrada;

		System.out.println("Digite os códigos (ex: 4H, 7A, 2C). Digite 'fim' para encerrar.");

		while (true) {
			System.out.print("Código: ");
			entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("fim")) {
				break;
			}

			if (entrada.length() < 2) {
				System.out.println("Código inválido. Tente novamente.");
				continue;
			}

			
			String numeroStr = "";
			char letra = ' ';

		
			for (int i = 0; i < entrada.length(); i++) {
				char c = entrada.charAt(i);
				if (Character.isDigit(c)) {
					numeroStr += c;
				} else {
					letra = c;
					break;
				}
			}

			
			int quantidade = Integer.parseInt(numeroStr);

		
			for (int i = 0; i < quantidade; i++) {
				resultado += letra;
			}
		}

		System.out.println("\nCódigo reconstruído: " + resultado);
		sc.close();
	}
}

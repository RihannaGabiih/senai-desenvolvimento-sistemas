package exercicios;

import java.util.Scanner;

public class ValidadorDeSenhas {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a senha: ");
	        String senha = sc.nextLine();

	        boolean temMaiuscula = false;
	        boolean temNumeroPrimo = false;
	        boolean temEspecial = false;
	        boolean temVogaisDuplicadas = false;

	        String especiais = "!@#$%^&*()_+-=[]{}|;:'\",.<>?/";
	        String vogais = "aeiouAEIOU";

	        for (int i = 0; i < senha.length(); i++) {
	            char c = senha.charAt(i);

	            if (Character.isDigit(c)) {
	                int num = c - '0';
	                if (num == 2 || num == 3 || num == 5 || num == 7) {
	                    temNumeroPrimo = true;
	                }
	            }

	            if (Character.isUpperCase(c)) {
	                temMaiuscula = true;
	            }

	            if (especiais.indexOf(c) != -1) {
	                temEspecial = true;
	            }

	            if (i > 0) {
	                char anterior = senha.charAt(i - 1);
	                if (vogais.indexOf(c) != -1 && c == anterior) {
	                    temVogaisDuplicadas = true;
	                    break;  
	                }
	            }
	        }

	        if (temMaiuscula && temNumeroPrimo && temEspecial && !temVogaisDuplicadas) {
	            System.out.println("Senha válida!");
	        } else {
	            System.out.println("Senha inválida!");
	        }

	        sc.close();
	    }
	}
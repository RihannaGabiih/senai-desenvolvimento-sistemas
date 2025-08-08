package exercicios;

import java.util.Scanner;

public class ListaHerois {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String[] nomes = new String[100];
	        int[] forca = new int[100];
	        int[] inteligencia = new int[100];
	        int[] velocidade = new int[100];
	        int totalHerois = 0;

	        
	        nomes[0] = "Superman";
	        forca[0] = 95;
	        inteligencia[0] = 85;
	        velocidade[0] = 90;

	        nomes[1] = "Batman";
	        forca[1] = 70;
	        inteligencia[1] = 95;
	        velocidade[1] = 75;

	        nomes[2] = "Flash";
	        forca[2] = 65;
	        inteligencia[2] = 80;
	        velocidade[2] = 100;

	        nomes[3] = "Mulher-Maravilha";
	        forca[3] = 90;
	        inteligencia[3] = 85;
	        velocidade[3] = 85;

	        totalHerois = 4;

	        int opcao;
	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Criar novo herói");
	            System.out.println("2. Mostrar ranking de heróis");
	            System.out.println("3. Comparar dois heróis");
	            System.out.println("0. Sair");
	            System.out.print("Escolha: ");
	            opcao = sc.nextInt();

	            switch(opcao) {
	                case 1:
	                    sc.nextLine(); 
	                    System.out.print("Nome do herói: ");
	                    nomes[totalHerois] = sc.nextLine();
	                    System.out.print("Força (0-100): ");
	                    forca[totalHerois] = sc.nextInt();
	                    System.out.print("Inteligência (0-100): ");
	                    inteligencia[totalHerois] = sc.nextInt();
	                    System.out.print("Velocidade (0-100): ");
	                    velocidade[totalHerois] = sc.nextInt();
	                    totalHerois++;
	                    break;

	                case 2:
	                    int[] poderTotal = new int[totalHerois];
	                    for(int i = 0; i < totalHerois; i++) {
	                        poderTotal[i] = forca[i] + inteligencia[i] + velocidade[i];
	                    }

	                    for(int i = 0; i < totalHerois - 1; i++) {
	                        for(int j = i + 1; j < totalHerois; j++) {
	                            if(poderTotal[j] > poderTotal[i]) {
	                                int tempP = poderTotal[i];
	                                poderTotal[i] = poderTotal[j];
	                                poderTotal[j] = tempP;

	                                String tempN = nomes[i];
	                                nomes[i] = nomes[j];
	                                nomes[j] = tempN;

	                                int tempF = forca[i];
	                                forca[i] = forca[j];
	                                forca[j] = tempF;

	                                int tempI = inteligencia[i];
	                                inteligencia[i] = inteligencia[j];
	                                inteligencia[j] = tempI;

	                                int tempV = velocidade[i];
	                                velocidade[i] = velocidade[j];
	                                velocidade[j] = tempV;
	                            }
	                        }
	                    }

	                    System.out.println("\n--- RANKING ---");
	                    for(int i = 0; i < totalHerois; i++) {
	                        System.out.println((i+1) + ". " + nomes[i] + " | Poder Total: " + poderTotal[i]);
	                    }
	                    break;

	                case 3:
	                    if(totalHerois < 2) {
	                        System.out.println("Cadastre pelo menos dois heróis primeiro.");
	                        break;
	                    }

	                    sc.nextLine(); 
	                    System.out.print("Nome do primeiro herói: ");
	                    String nome1 = sc.nextLine();
	                    System.out.print("Nome do segundo herói: ");
	                    String nome2 = sc.nextLine();

	                    int index1 = -1, index2 = -1;
	                    for(int i = 0; i < totalHerois; i++) {
	                        if(nomes[i].equalsIgnoreCase(nome1)) {
	                            index1 = i;
	                        }
	                        if(nomes[i].equalsIgnoreCase(nome2)) {
	                            index2 = i;
	                        }
	                    }

	                    if(index1 == -1 || index2 == -1) {
	                        System.out.println("Um ou ambos os heróis não foram encontrados.");
	                    } else {
	                        int poder1 = forca[index1] + inteligencia[index1] + velocidade[index1];
	                        int poder2 = forca[index2] + inteligencia[index2] + velocidade[index2];

	                        System.out.println(nomes[index1] + " - Poder: " + poder1);
	                        System.out.println(nomes[index2] + " - Poder: " + poder2);

	                        if(poder1 > poder2) {
	                            System.out.println(nomes[index1] + " é mais poderoso!");
	                        } else if(poder2 > poder1) {
	                            System.out.println(nomes[index2] + " é mais poderoso!");
	                        } else {
	                            System.out.println("Ambos têm o mesmo poder!");
	                        }
	                    }
	                    break;

	                case 0:
	                    System.out.println("Saindo...");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	            }
	        } while(opcao != 0);

	        sc.close();
	    }
	}

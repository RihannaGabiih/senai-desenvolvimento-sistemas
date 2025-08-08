package exercicios;

import java.util.Scanner;

public class MundoFeiticos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};

        System.out.print("Digite o feitiço a ser encontrado: ");
        String alvo = sc.nextLine();

        int inicio = 0;
        int fim = feiticos.length - 1;
        int meio;
        boolean encontrado = false;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (feiticos[meio].equalsIgnoreCase(alvo)) {
                System.out.println("Feitiço encontrado na posição " + meio);
                encontrado = true;
                break;
            } else if (alvo.compareToIgnoreCase(feiticos[meio]) < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("Feitiço não encontrado.");
        }

        sc.close();
    }
}
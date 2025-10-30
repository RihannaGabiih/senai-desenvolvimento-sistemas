package conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA BANCÁRIO ===");

        System.out.print("Digite o nome do titular da Conta Corrente: ");
        String titularCC = sc.nextLine();
        Conta cc = new Corrente(1, "001", titularCC, 0);

        System.out.print("Digite o nome do titular da Conta Poupança: ");
        String titularCP = sc.nextLine();
        Conta cp = new Poupanca(2, "001", titularCP, 0);

        System.out.print("Digite o nome da Pessoa Jurídica: ");
        String titularPJ = sc.nextLine();
        Conta pj = new PessoaJuridica(3, "001", titularPJ, 0);

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("4 - Mostrar tarifas mensais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n Escolha a conta:");
                    System.out.println("1 - Corrente | 2 - Poupança | 3 - Pessoa Jurídica");
                    int contaDep = sc.nextInt();
                    System.out.print("Valor do depósito: R$");
                    double valorDep = sc.nextDouble();

                    if (contaDep == 1) cc.depositar(valorDep);
                    else if (contaDep == 2) cp.depositar(valorDep);
                    else if (contaDep == 3) pj.depositar(valorDep);
                    else System.out.println("Conta inválida!");
                    break;

                case 2:
                    System.out.println("\nEscolha a conta:");
                    System.out.println("1 - Corrente | 2 - Poupança | 3 - Pessoa Jurídica");
                    int contaSaq = sc.nextInt();
                    System.out.print("Valor do saque: R$");
                    double valorSaq = sc.nextDouble();

                    if (contaSaq == 1) cc.sacar(valorSaq);
                    else if (contaSaq == 2) cp.sacar(valorSaq);
                    else if (contaSaq == 3) pj.sacar(valorSaq);
                    else System.out.println("Conta inválida!");
                    break;

                case 3:
                    System.out.println("\n=== SALDOS ===");
                    cc.exibirSaldo();
                    cp.exibirSaldo();
                    pj.exibirSaldo();
                    break;

                case 4:
                    System.out.println("\n=== TARIFAS MENSAIS ===");
                    System.out.println("Conta Corrente: R$" + cc.calcularTarifaMensal());
                    System.out.println("Conta Poupança: R$" + cp.calcularTarifaMensal());
                    System.out.println("Conta Pessoa Jurídica: R$" + pj.calcularTarifaMensal());
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

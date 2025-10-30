package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        b.listaLivros(); // inicializa a biblioteca com livros prontos

        int opcao;
        do {
            System.out.println("\n----- SISTEMA DE BIBLIOTECA -----");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Listar livros");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do usuário: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();

                    System.out.print("É aluno ou professor? ");
                    String tipo = sc.nextLine();

                    Usuario u;
                    if (tipo.equalsIgnoreCase("aluno")) {
                        u = new Aluno(id, nome, email);
                    } else {
                        u = new Professor(id, nome, email);
                    }

                    usuarios.add(u);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código (ISBN): ");
                    String codigo = sc.nextLine();

                    System.out.print("Digite o título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Digite o autor: ");
                    String autor = sc.nextLine();

                    Livro livro = new Livro(codigo, titulo, autor, "Disponível");
                    b.adicionarLivro(livro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o ID do usuário: ");
                    int idEmp = sc.nextInt();
                    sc.nextLine();

                    Usuario usuarioEmp = b.buscarUsuario(usuarios, idEmp);
                    if (usuarioEmp == null) {
                        System.out.println("Usuário não encontrado!");
                        break;
                    }

                    System.out.println("\n Livros disponíveis:");
                    for (Livro l : b.livros) {
                        if (l.getStatus().equalsIgnoreCase("Disponível")) {
                            System.out.println(l.getCodigo() + " - " + l.getTitulo() + " (" + l.getAutor() + ")");
                        }
                    }

                    System.out.print("Digite o código do livro que deseja emprestar: ");
                    String codEmp = sc.nextLine();
                    b.emprestarLivro(usuarioEmp, codEmp);
                    break;

                case 4:
                    System.out.print("Digite o ID do usuário: ");
                    int idDev = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("\n Livros emprestados por esse usuário:");
                    for (Livro l : b.livros) {
                        if (l.getStatus().equalsIgnoreCase("Emprestado")) {
                            System.out.println(l.getCodigo() + " - " + l.getTitulo() + " (" + l.getAutor() + ")");
                        }
                    }


                    Usuario usuarioDev = b.buscarUsuario(usuarios, idDev);
                    if (usuarioDev == null) {
                        System.out.println("Usuário não encontrado!");
                        break;
                    }

                    System.out.print("Digite o código do livro a devolver: ");
                    String codDev = sc.nextLine();
                    b.devolverLivro(usuarioDev, codDev);
                    break;

                case 5:
                    System.out.println("\n LISTA DE LIVROS:");
                    for (Livro l : b.livros) {
                        System.out.println(l.getCodigo() + " - " + l.getTitulo() + " | " + l.getAutor() + " | " + l.getStatus());
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

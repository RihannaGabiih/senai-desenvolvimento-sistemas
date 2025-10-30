package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {

	// Encapsulamento: controle dos dados por meio de coleções privadas
	ArrayList<Livro> livros = new ArrayList<>();
	Map<Usuario, ArrayList<Emprestimo>> emprestimos = new HashMap<>();

	// Método para preencher livros iniciais (opcional)
	public void listaLivros() {
		livros.add(new Livro("978-0-123-45678-0", "Manual de Assassinatos para Boas Garotas", "Holly Jackson", "Disponível"));
		livros.add(new Livro("978-0-123-45679-7", "Uma Segunda Chance", "Colleen Hoover", "Disponível"));
		livros.add(new Livro("978-0-123-45680-3", "Desenfreados", "Kelly M.", "Disponível"));
		livros.add(new Livro("978-0-123-45681-0", "Um Novo Recomeço", "Tatiane Biasi", "Disponível"));
		livros.add(new Livro("978-0-123-45682-7", "Ainda Não Morri", "Holly Jackson", "Disponível"));
		livros.add(new Livro("978-3-16-148410-0", "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Disponível"));
		livros.add(new Livro("978-0-439-02348-1", "Maze Runner: Correr ou Morrer", "James Dashner", "Disponível"));
		livros.add(new Livro("978-0-123-45683-4", "Java: Como Programar", "Paul Deitel & Harvey Deitel", "Disponível"));
	}

	// Método simples de adicionar novo livro
	public void adicionarLivro(Livro l) {
		livros.add(l);
	}

	// 💡 Polimorfismo: o comportamento de empréstimo varia conforme o tipo de usuário
	public void emprestarLivro(Usuario u, String codigo) {
		Livro livro = null;
		
		for (Livro l : livros) {
			if (l.getCodigo().equals(codigo) && l.getStatus().equalsIgnoreCase("Disponível")) {
				livro = l;
				break;
			}
		}

		if (livro == null) {
			System.out.println("Livro indisponível ou não encontrado.");
			return;
		}

		// verifica o limite conforme tipo do usuário (Aluno ou Professor)
		ArrayList<Emprestimo> lista = emprestimos.getOrDefault(u, new ArrayList<>());
		if (lista.size() >= u.getLimiteEmprestimo()) {
			System.out.println(" Usuário atingiu o limite de empréstimos.");
			return;
		}

		livro.emprestar();
		Emprestimo e = new Emprestimo(livro, u, LocalDate.now(), LocalDate.now().plusDays(7)); 		
		emprestimos.putIfAbsent(u, new ArrayList<>());
		emprestimos.get(u).add(e);

		System.out.println("Livro '" + livro.getTitulo() + "' emprestado para " + u.getNome() + 
		                   " até " + e.getDataPDevolucao());
	}

	public void devolverLivro(Usuario u, String codigo) {
		ArrayList<Emprestimo> lista = emprestimos.get(u);

		if (lista == null || lista.isEmpty()) {
			System.out.println("Usuário não possui livros emprestados.");
			return;
		}

		Emprestimo emprestimoEncontrado = null;
		for (Emprestimo e : lista) {
			if (e.getLivro().getCodigo().equals(codigo)) {
				emprestimoEncontrado = e;
				break;
			}
		}

		if (emprestimoEncontrado != null) {
			emprestimoEncontrado.getLivro().devolver();
			lista.remove(emprestimoEncontrado);
			System.out.println("Livro devolvido por " + u.getNome());
		} else {
			System.out.println("Livro não encontrado entre os emprestados deste usuário.");
		}
	}

	// Busca de usuário por ID
	public Usuario buscarUsuario(ArrayList<Usuario> usuarios, int idUsuario) {
		for (Usuario u : usuarios) {
			if (u.getId() == idUsuario) {
				return u;
			}
		}
		return null;
	}

	// Busca de livro por código
	public Livro buscarLivro(String codigoLivro) {
		for (Livro l : livros) {
			if (l.getCodigo().equals(codigoLivro))
				return l;
		}
		return null;
	}
}

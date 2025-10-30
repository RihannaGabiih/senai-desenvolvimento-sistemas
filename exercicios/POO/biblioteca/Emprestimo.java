package biblioteca;

import java.time.LocalDate;

public class Emprestimo {
	
	private Livro livro;
	private Usuario usuario;
	private LocalDate dataEmprestimo;
	private LocalDate dataPDevolucao;

	public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataPDevolucao) {
		super();
		this.livro = livro;
		this.usuario = usuario;
		this.dataEmprestimo = dataEmprestimo; //LocalDate.now()
		this.dataPDevolucao = dataPDevolucao; //plus.day(5)
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataPDevolucao() {
		return dataPDevolucao;
	}

	public void setDataPDevolucao(LocalDate dataPDevolucao) {
		this.dataPDevolucao = dataPDevolucao;
	}

	
	
	
	

}

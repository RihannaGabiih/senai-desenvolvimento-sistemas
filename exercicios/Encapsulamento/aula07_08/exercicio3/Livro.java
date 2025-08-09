package exercicio3;

public class Livro {
	
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		if (numeroPaginas <5) {
			System.out.println("Erro. O livro deve conter no mínimo 5 páginas.");
		} else {
			this.numeroPaginas = numeroPaginas;
			System.out.println();
			System.out.println("LIVRO: ");
			System.out.println("Título: " + getTitulo());
			System.out.println("Autor: " + getAutor());
			System.out.println("Número de páginas: " +getNumeroPaginas());

			
		}
		
	}
	
	
	
	}



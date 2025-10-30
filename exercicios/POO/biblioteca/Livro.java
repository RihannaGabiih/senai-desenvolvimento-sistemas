package biblioteca;

public class Livro implements Imprestavel {
	
	private String codigo;
	private String titulo;
	private String autor;
	private String status; //Disponivel ou emprestado
	
	public Livro(String codigo, String titulo, String autor, String status) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.status = "Disponível";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void emprestar() {
		this.status = "Emprestado";
	}
	
	public void devolver() {
		this.status = "Disponível";
	}

	@Override
	public void emprestar(Usuario u) {
		if(status.equals("Disponível")) {
			emprestar();
			System.out.println("O livro foi emprestado para " + u);			
		} else {
			System.out.println("Livro indisponivel");
		}
		
	}



	
	

}

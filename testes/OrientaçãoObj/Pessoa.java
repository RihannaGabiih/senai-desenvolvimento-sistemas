package senai2dm;

public class Pessoa {
	
	public String nome;
	public int idade;
	public double peso;
	public String genero;
	public double alt;
	
	
	public Pessoa(String nome, int idade, double peso, String genero, double alt) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.genero = genero;
		this.alt = alt;
	}

	public Pessoa() {
		
	}
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	public double calculoImc () {
		return peso / (alt * alt); 
	}
	
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", genero=" + genero + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}
	
	
	

}

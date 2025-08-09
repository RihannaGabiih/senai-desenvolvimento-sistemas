package exercicio1;

public class Pessoa {
	private String nome;
	private int idade;

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

		if (idade < 0) {
			System.out.println("A idade não pode ser negativa");
		} else {
			this.idade = idade;
			System.out.println("O nome é: " + getNome());
			System.out.println("A idade é: " + getIdade());
		}

		

	}

}

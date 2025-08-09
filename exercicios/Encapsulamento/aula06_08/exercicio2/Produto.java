package exercicio2;

public class Produto {

	private String nome;
	private double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;

	}

	public void setPreco(double preco) {
		
			this.preco = preco;
	}
	

	public double aplicarDesconto(double percentual) {
		if (percentual < 0 || percentual > 100) {
			System.out.println("Percentual de desconto invalido");
		} else {
			double desconto = preco * (percentual / 100);
			preco -= desconto;
			System.out.println("O preço do " + nome + " com o desconto de  " + percentual + "% é R$" + preco);
		}
		return preco;

	}
	

}

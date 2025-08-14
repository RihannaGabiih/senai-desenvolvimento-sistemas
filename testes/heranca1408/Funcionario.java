package heranca1408;

public class Funcionario {
	private String nome;
	private double salario;
	private String rg;

	public String getNome() {
		return nome;
	}

	public Funcionario(String nome, double salario, String rg) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.rg = rg;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}

package heranca1408;

public class Contador extends Funcionario {
	
	private int numCrc;

	public Contador(String nome, double salario, String rg, int numCrc) {
		super(nome, salario, rg);
		this.numCrc = numCrc;
	}

	public int getNumCrc() {
		return numCrc;
	}

	public void setNumCrc(int numCrc) {
		this.numCrc = numCrc;
	}

	
	
	
	

}

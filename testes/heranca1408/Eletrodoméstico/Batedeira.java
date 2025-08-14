package heranca1408;

public class Batedeira extends Eletrodomestico {

	private double potencia;

	public Batedeira(String modelo, String marca, double tensao, double preço, double potencia) {
		super(modelo, marca, tensao, preço);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	
}

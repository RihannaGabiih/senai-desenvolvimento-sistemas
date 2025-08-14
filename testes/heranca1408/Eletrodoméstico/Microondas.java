package heranca1408;

public class Microondas extends Eletrodomestico{
	
	private double capacidade;

	public Microondas(String modelo, String marca, double tensao, double preço, double capacidade) {
		super(modelo, marca, tensao, preço);
		this.capacidade = capacidade;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Microondas: "
				+ "capacidade =" + capacidade + ", Modelo()=" + getModelo() + ", Marca()=" + getMarca()
				+ ", Tensao()=" + getTensao() + ", Preço()=" + getPreço() ;
			 
	}

	



	
	

	
	
	
	


	
	
	
	
	
	

}

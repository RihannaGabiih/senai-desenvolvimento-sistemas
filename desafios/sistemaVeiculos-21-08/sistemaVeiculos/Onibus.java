package sistemaVeiculos;

public class Onibus extends Veiculo{
	
	private int numero_parada;

	public int getNumero_parada() {
		return numero_parada;
	}
	public void setNumero_parada(int numero_parada) {
		this.numero_parada = numero_parada;
	}
	public Onibus(String modelo, int numero_parada) {
		super(modelo);
		this.numero_parada = numero_parada;
	}
	@Override
	public float calcularTempo(float distancia) {
		return (distancia/60) + (15f*numero_parada/60);
	}

}

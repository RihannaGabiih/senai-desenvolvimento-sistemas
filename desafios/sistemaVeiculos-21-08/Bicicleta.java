package sistemaVeiculos;

public class Bicicleta extends Veiculo{

	public Bicicleta(String modelo) {
		super(modelo);
	}
	@Override
	public float calcularTempo(float distancia) {
		 return (distancia/20);
	}
}
	

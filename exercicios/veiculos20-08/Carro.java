package veiculos2008;

public class Carro extends Veiculo {

	public Carro(String marca, String modelo, String cor, int ano) {
		super(marca, modelo, cor, ano);
	}
	
	@Override
	public void iniciar() {
		System.out.println("O carro está iniciando");
	}

}

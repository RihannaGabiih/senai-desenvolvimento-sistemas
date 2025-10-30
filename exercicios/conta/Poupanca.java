package conta;

public class Poupanca extends Conta {

	public Poupanca(int numero, String agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
		
	}

	@Override
	double calcularTarifaMensal() {
		return 0.0;
		
	}

}

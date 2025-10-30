package conta;

public class Corrente extends Conta {

	public Corrente(int numero, String agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
		
	}

	@Override
	double calcularTarifaMensal() {
		return 12.00;
		
	}

}

package conta;

abstract class Conta {

	private int numero;
	private String agencia;
	private String titular;
	private double saldo;

	public Conta(int numero, String agencia, String titular, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Deposito de R$ " + valor + "realizado com sucesso!");
		} else {
			System.out.println("Valor indisponível para deposito");
		}

	}

	public void sacar(double valor) {
		if(valor > 0 && valor<= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + "realizado com sucesso!");
		} else {
			System.out.println("Valor indisponível para saque");
		}

	}

	public void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);

	}

	abstract double calcularTarifaMensal();

}

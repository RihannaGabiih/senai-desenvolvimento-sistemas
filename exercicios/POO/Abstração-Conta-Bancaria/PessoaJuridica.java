package conta;

public class PessoaJuridica extends Conta {

    public PessoaJuridica(int numero, String agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxaSaque = 1.50;
        double total = valor + taxaSaque;

        if (valor > 0 && total <= getSaldo()) {
            setSaldo(getSaldo() - total);
            System.out.println("Saque de R$" + valor + " (Taxa R$1,50) realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return 20.0;
    }
}

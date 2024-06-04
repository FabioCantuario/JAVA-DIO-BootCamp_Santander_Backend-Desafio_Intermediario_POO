package desafio3;

public class ContaBancaria {

	private double saldo = 0d;

	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}

}

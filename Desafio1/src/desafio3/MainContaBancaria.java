package desafio3;

import java.util.Scanner;

public class MainContaBancaria {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite Saldo inicial: ");
		double saldoInicial = scanner.nextDouble();

		ContaBancaria conta = new ContaBancaria(saldoInicial);

		System.out.print("Digite o valor de deposito: ");
		double valorDeposito = scanner.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("Deposito feito.");
		System.out.println("Saldo atual: " + conta.getSaldo());

		System.out.print("Digite o valor de saque: ");
		double valorSaque = scanner.nextDouble();
		conta.sacar(valorSaque);
		System.out.println("Saque feito.");
		System.out.println("Saldo atual: " + conta.getSaldo());

		System.out.println();
		scanner.close();

	}

}

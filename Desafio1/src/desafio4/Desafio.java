package desafio4;

import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Titular: ");
		String titular = scanner.next();
		System.out.print("Conta: ");
		int numeroConta = scanner.nextInt();
		System.out.print("Valor Inicial: ");
		double saldo = scanner.nextDouble();
		System.out.print("Taxa de juros: ");
		double taxaJuros = scanner.nextDouble();

		ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

		System.out.println("Conta Poupanca:");
		contaPoupanca.exibirInformacoes();
		
		scanner.close();

	}

}

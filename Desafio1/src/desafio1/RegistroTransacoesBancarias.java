package desafio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o Saldo Inicial: ");
		double saldo = scanner.nextDouble();
		System.out.print("Digite a quantidade de Transações: ");
		int quantidadeTransacoes = scanner.nextInt();

		List<String> transacoes = new ArrayList<>();

		for (int i = 1; i <= quantidadeTransacoes; i++) {
			System.out.print("Escolha a opção (D/S): ");
			char tipoTransacao = scanner.next().toUpperCase().charAt(0);
			System.out.print("Digite o valor da Transação: ");
			double valorTransacao = scanner.nextDouble();
			if (tipoTransacao == 'D') {
				saldo += valorTransacao;
				transacoes.add("Deposito de " + valorTransacao);
			} else if (tipoTransacao == 'S') {
				saldo -= valorTransacao;
				transacoes.add("Saque de " + valorTransacao);
			} else {
				System.out.print("Opção inválida. Utilize D para depósito ou S para saque.");
				i--; // Decrementa o índice para repetir a iteração
			}
		}

		// TODO: Exibir o saldo final e a lista de transações conforme a tabela de
		// Exemplos.

		System.out.println("Saldo: " + saldo);
		System.out.println("Transacoes: ");

		int i = 1;

		for (String lista : transacoes) {
			System.out.println(i++ + ". " + lista);
		}

		// Fechar o scanner para evitar vazamentos de recursos
		scanner.close();

	}

}

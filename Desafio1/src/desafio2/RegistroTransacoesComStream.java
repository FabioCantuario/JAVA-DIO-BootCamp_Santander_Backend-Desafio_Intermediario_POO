package desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o Saldo Inicial: ");
		double saldo = scanner.nextDouble();
		System.out.print("Digite a quantidade de Transações: ");
		int quantidadeTransacoes = scanner.nextInt();

		List<Transacao> transacoes = new ArrayList<>();

		for (int i = 1; i <= quantidadeTransacoes; i++) {

			System.out.print("Escolha a opção (D/S): ");
			char tipoTransacao = scanner.next().toUpperCase().charAt(0);

			System.out.print("Digite o valor da Transação: ");
			double valorTransacao = scanner.nextDouble();

			// TODO: Criar uma nova transação e adicioná-la à lista de transações

			Transacao transacao = new Transacao(tipoTransacao, valorTransacao);

			// Verifica e atualiza o saldo da conta com base no tipo de transação
			//if(transacao.getTipo() == 'D') {
			if (transacao.getTipo() == 'D') {
				saldo += valorTransacao;
			} else if (transacao.getTipo()  == 'S') {
				saldo -= valorTransacao;
			}

			transacoes.add(transacao);

		}

		System.out.println("Saldo : " + saldo);
		System.out.println("Transacoes:");
		transacoes.stream().map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
				.collect(Collectors.toList()).forEach(System.out::println);

		// Fechar o scanner para evitar vazamentos de recursos
		scanner.close();
	}
}
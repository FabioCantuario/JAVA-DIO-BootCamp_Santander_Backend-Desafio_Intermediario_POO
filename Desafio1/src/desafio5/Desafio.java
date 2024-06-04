package desafio5;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		// Lê o tipo de cofre (primeira linha da entrada)
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual o tipo de cofre: ");
		String tipoCofre = scanner.nextLine();

		// TODO: Implemente a condição necessário para a verificação dos cofres seguros:
		if (tipoCofre.equalsIgnoreCase("digital")) {
			System.out.print("Digite a senha: ");
			int senha = scanner.nextInt();

			System.out.print("Digite a confirmação da senha: ");
			int confirmacaoSenha = scanner.nextInt();

			CofreDigital cofreDigital = new CofreDigital(senha);

			cofreDigital.imprimirInformacoes();

			if (cofreDigital.validarSenha(confirmacaoSenha) == true) {
				System.out.println("Cofre aberto!");
			} else {
				System.out.println("Senha incorreta!");
			}

		} else if (tipoCofre.equalsIgnoreCase("fisico")) {
			Cofre cofreFisico = new CofreFisico();
			cofreFisico.imprimirInformacoes();
		}
		scanner.close();

	}

}

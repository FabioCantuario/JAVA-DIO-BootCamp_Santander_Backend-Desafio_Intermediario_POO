package desafio5;

public class CofreDigital extends Cofre {

	private int senha;
	
	public CofreDigital(int senha) {
		super("Cofre Digital", "Senha");
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public boolean validarSenha(int confirmacaoSenha) {
		if (confirmacaoSenha == this.senha) {
			return true;
		} else {
			return false;
		}
		//return confirmacaoSenha == this.senha;
	}

}

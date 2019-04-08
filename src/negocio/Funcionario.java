package negocio;

public class Funcionario {
	
	private String login;
	private String senha;
	
	public Funcionario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void Cadastrar() {
		//será modificado
	}
	
	public Funcionario Consultar() {
		Funcionario funcionario = null;
		return funcionario;
		//será modificado
	}
	
	public void Remover() {
		//será modificado
	}
	
	public void Atualizar() {
		//será modificado
	}
}

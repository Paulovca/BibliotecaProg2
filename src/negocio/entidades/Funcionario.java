package negocio.entidades;

public class Funcionario extends Pessoa{
	
	private String nome;
	private String login;
	private String senha;
	
	public Funcionario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	public void cadastrar() {
		//ser� modificado
	}
	
	public Funcionario consultar() {
		Funcionario funcionario = null;
		return funcionario;
		//ser� modificado
	}
	
	public void remover() {
		//ser� modificado
	}
	
	public void atualizar() {
		//ser� modificado
	}
}

package negocio;

public class Aluno {
	
	private String cpf;
	private String nome;
	
	public Aluno(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public void Cadastrar() {
		//será modificado
	}
	
	public Aluno Consultar() {
		Aluno aluno = null;
		return aluno;
		//será modificado
	}
	
	public void Remover() {
		//será modificado
	}
	
	public void Atualizar() {
		//será modificado
	}
}

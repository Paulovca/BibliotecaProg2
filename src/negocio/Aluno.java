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
 
	public void cadastrar() {
		//será modificado
	}
	
	public Aluno consultar() {
		Aluno aluno = null;
		return aluno;
		//será modificado
	}
	
	public void remover() {
		//será modificado
	}
	
	public void atualizar() {
		//será modificado
	}
}

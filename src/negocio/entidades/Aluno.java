package negocio.entidades;

public class Aluno extends Pessoa{
	
	private String cpf;
	
	public Aluno(String cpf, String nome) {
		super(nome);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return super.getNome();
	}

	public void setNome(String nome) {
		super.setNome(nome);
	}
 
	public void cadastrar() {
		//ser� modificado
	}
	
	public Aluno consultar() {
		Aluno aluno = null;
		return aluno;
		//ser� modificado
	}
	
	public void remover() {
		//ser� modificado
	}
	
	public void atualizar() {
		//ser� modificado
	}
}

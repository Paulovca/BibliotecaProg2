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

package negocio.entidades;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable{
	
	public Aluno(String nome, String cpf) {
		super(nome,cpf);
	}
	
	public String getCpf() {
		return super.getCpf();
	}
	
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}
	
	public String getNome() {
		return super.getNome();
	}

	public void setNome(String nome) {
		super.setNome(nome);
	}
}

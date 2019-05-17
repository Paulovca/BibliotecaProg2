package negocio.exception;

public class CampoNuloException extends Exception {

	private String nome;
	private String cpf;

	public CampoNuloException(String nome, String cpf) {
		super("Cpf e/ou nome não preenchidos!");
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

}

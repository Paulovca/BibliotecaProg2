package negocio.exception;

public class CpfJaExisteException extends Exception{
	
	private String cpf;
	
	public CpfJaExisteException(String cpf) {
		super("Cpf já cadastrado!");
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
}

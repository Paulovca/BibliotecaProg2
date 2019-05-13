package dados;

import negocio.entidades.Funcionario;

public class RepositorioFuncionariosArray implements RepositorioFuncionarios {
	
	private static RepositorioFuncionariosArray instance;
	private Funcionario[] funcionarios;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	private RepositorioFuncionariosArray() {
		this.funcionarios = new Funcionario[TAMANHO];
		this.indice = 0;
	}
	
	public static RepositorioFuncionariosArray getInstance() {
		if(instance == null) {
			instance = new RepositorioFuncionariosArray();
		}
		return instance;
	}
	
	@Override
	public void cadastrar(Funcionario funcionario) {
		funcionarios[indice] = funcionario;
		indice++;
	}

	@Override
	public Funcionario consultar(String cpf) {
		Funcionario funcionario = null;
		for(int i = 0; i< indice ; i++) {
			if(funcionarios[i].getCpf().equals(cpf)) {
				funcionario = funcionarios[i];
			}
		}
		return funcionario;
	}

	@Override
	public void remover(String cpf) {
		for(int i = 0; i < indice ; i++) {
			if(funcionarios[i].getCpf().equals(cpf)) {
				funcionarios[i] = funcionarios[indice];
				funcionarios[indice] = null;
			}
		}
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		for(int i = 0; i < indice ; i++) {
			if(funcionarios[i].getCpf().equals(funcionario.getCpf())) {
				funcionarios[i] = funcionario;
			}
		}
	}
	
}

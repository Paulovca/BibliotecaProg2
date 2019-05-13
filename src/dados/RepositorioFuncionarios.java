package dados;

import negocio.entidades.Funcionario;

public interface RepositorioFuncionarios {

	public void cadastrar(Funcionario funcionario);
	public void remover(String cpf);
	public void atualizar(Funcionario funcionario);
	public Funcionario consultar(String cpf);

}

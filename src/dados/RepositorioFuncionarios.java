package dados;

import java.util.ArrayList;

import negocio.entidades.Funcionario;

public interface RepositorioFuncionarios {

	public void cadastrar(Funcionario funcionario);
	public void remover(String cpf);
	public void atualizar(Funcionario funcionario);
	public Funcionario consultar(String cpf);
	public ArrayList<Funcionario> listar();

}

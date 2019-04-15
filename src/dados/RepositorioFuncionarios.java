package dados;

import negocio.entidades.Gestor;

public interface RepositorioFuncionarios {

	public void inserir(Gestor gestor);
	public Gestor procurarCpf(String cpf);
	public void remover(String cpf);
	public void alterar(Gestor gestor);

}

package dados;

import negocio.entidades.Emprestimo;

public interface RepositorioEmprestimos {
	
	public void cadastrar(Emprestimo emprestimo);
	public void remover(int id);
	public Emprestimo consultar(int id);
	
}

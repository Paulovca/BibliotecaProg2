package dados;

import java.awt.List;

import negocio.entidades.Emprestimo;

public interface RepositorioEmprestimos {
	
	public void cadastrar(Emprestimo emprestimo);
	public void remover(int id);
	public Emprestimo consultar(int id);
	public java.util.List<Emprestimo> procurarEmprestimos(String cpf);
	
}

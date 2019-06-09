package dados;

import java.awt.List;
import java.util.ArrayList;

import negocio.entidades.Emprestimo;

public interface RepositorioEmprestimos {
	
	public void cadastrar(Emprestimo emprestimo);
	public void remover(int id);
	public Emprestimo consultar(int id);
	public ArrayList<Emprestimo> procurarEmprestimos(String cpf);
	
}

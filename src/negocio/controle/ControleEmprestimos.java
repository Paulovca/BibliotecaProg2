package negocio.controle;

import dados.RepositorioEmprestimos;
import dados.RepositorioEmprestimosArray;
import negocio.entidades.Emprestimo;

public class ControleEmprestimos {

	private RepositorioEmprestimos emprestimos = RepositorioEmprestimosArray.getInstance();
	
	public void cadastrar(Emprestimo emprestimo) {
		if(emprestimo.getAluno() != null && emprestimo.getFuncionario() != null) {
			if(emprestimos.consultar(emprestimo.getId()) == null) {
				emprestimos.cadastrar(emprestimo);
			}else {
				//Exception ja existe
			}
		}else {
			//exception campos nulos
		}
	}
	
	public void remover(int id) {
		Emprestimo emprestimo = emprestimos.consultar(id);
		if(emprestimo == null) {
			//exception de nao encontrado
		} else {
			emprestimos.remover(id);
		}
	}
	
	public Emprestimo consultar(int id) {
		Emprestimo emprestimo = emprestimos.consultar(id);
		if( emprestimo == null) {
			//exception aluno nao encontrado
		}
		return emprestimo;
	}
	
}

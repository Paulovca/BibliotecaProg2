package negocio.controle;

import java.awt.List;
import java.util.ArrayList;

import dados.RepositorioEmprestimos;
import dados.RepositorioEmprestimosArray;
import negocio.entidades.Emprestimo;
import negocio.exception.emprestimo.EmprestimoJaExisteException;
import negocio.exception.emprestimo.EmprestimoNaoEncontradoException;
import negocio.exception.emprestimo.EmprestimoNuloException;

public class ControleEmprestimos {

	private RepositorioEmprestimos emprestimos;
	
	public ControleEmprestimos() {
		emprestimos = RepositorioEmprestimosArray.getInstance();
	}
	
	public void cadastrar(Emprestimo emprestimo) throws EmprestimoJaExisteException,EmprestimoNuloException{
		if(emprestimo.getAluno() != null && emprestimo.getFuncionario() != null && emprestimo.getItens() != null) {
			if(emprestimos.consultar(emprestimo.getId()) == null) {
				emprestimos.cadastrar(emprestimo);
			}else {
				EmprestimoJaExisteException e = new EmprestimoJaExisteException(emprestimo.getId());
				throw e;
			}
		}else {
			EmprestimoNuloException e = new EmprestimoNuloException(emprestimo.getAluno(),emprestimo.getFuncionario(),emprestimo.getItens());
			throw e;
		}
	}
	
	public void remover(int id) throws EmprestimoNaoEncontradoException{
		Emprestimo emprestimo = emprestimos.consultar(id);
		if(emprestimo == null) {
			EmprestimoNaoEncontradoException e = new EmprestimoNaoEncontradoException(id);
			throw e;
		} else {
			emprestimos.remover(id);
		}
	}
	
	public Emprestimo consultar(int id) throws EmprestimoNaoEncontradoException{
		Emprestimo emprestimo = emprestimos.consultar(id);
		if( emprestimo == null) {
			EmprestimoNaoEncontradoException e = new EmprestimoNaoEncontradoException(id);
			throw e;
		}
		return emprestimo;
	}
	
	public ArrayList<Emprestimo> procurarEmprestimos(String cpf) {
		return emprestimos.procurarEmprestimos(cpf);
	}
	
}

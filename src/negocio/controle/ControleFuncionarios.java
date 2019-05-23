package negocio.controle;

import dados.RepositorioFuncionarios;
import dados.RepositorioFuncionariosArray;
import negocio.entidades.Funcionario;
import negocio.exception.aluno.CpfJaExisteException;
import negocio.exception.funcionario.FuncionarioNuloException;

public class ControleFuncionarios {
	
	private RepositorioFuncionarios funcionarios;
	
	public ControleFuncionarios() {
		funcionarios = RepositorioFuncionariosArray.getInstance();
	}
	
	public void cadastrar(Funcionario funcionario) throws CpfJaExisteException, FuncionarioNuloException{
		if(funcionario.getNome() != null && funcionario.getCpf().length() == 11 && funcionario.getSenha() != null ) {
			if(funcionarios.consultar(funcionario.getCpf()) == null) {
				funcionarios.cadastrar(funcionario);
			}else {
				CpfJaExisteException e = new CpfJaExisteException(funcionario.getCpf());
				throw e;
			}
		}else {
			FuncionarioNuloException e = new FuncionarioNuloException(funcionario.getNome(), funcionario.getCpf(), funcionario.getSenha());
			throw e;
		}
	}
	
	public void remover(String cpf) {
		Funcionario funcionario = funcionarios.consultar(cpf);
		if(funcionario == null) {
			//exception de nao encontrado
		} else {
			funcionarios.remover(cpf);
		}
	}
	
	public void atualizar(Funcionario funcionario) {
		Funcionario funcionarioAux = funcionarios.consultar(funcionario.getCpf());
		if(funcionario == null || funcionarioAux == null) {
			//exception de não encontrado
		} else {
			funcionarios.atualizar(funcionario);
		}
	}
	
	public Funcionario consultar(String cpf) {
		Funcionario funcionario = funcionarios.consultar(cpf);
		if( funcionario == null) {
			//exception aluno nao encontrado
		}
		return funcionario;
	}

	
}

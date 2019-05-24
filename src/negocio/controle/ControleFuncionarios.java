package negocio.controle;

import dados.RepositorioFuncionarios;
import dados.RepositorioFuncionariosArray;
import negocio.entidades.Funcionario;
import negocio.exception.aluno.CpfJaExisteException;
import negocio.exception.funcionario.FuncionarioNaoEncontradoException;
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
	
	public void remover(String cpf) throws FuncionarioNaoEncontradoException{
		Funcionario funcionario = funcionarios.consultar(cpf);
		if(funcionario == null) {
			FuncionarioNaoEncontradoException e = new FuncionarioNaoEncontradoException(cpf);
			throw e;
		} else {
			funcionarios.remover(cpf);
		}
	}
	
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException{
		Funcionario funcionarioAux = funcionarios.consultar(funcionario.getCpf());
		if(funcionario == null || funcionarioAux == null) {
			FuncionarioNaoEncontradoException e = new FuncionarioNaoEncontradoException(funcionario.getCpf());
			throw e;
		} else {
			funcionarios.atualizar(funcionario);
		}
	}
	
	public Funcionario consultar(String cpf) throws FuncionarioNaoEncontradoException{
		Funcionario funcionario = funcionarios.consultar(cpf);
		if( funcionario == null) {
			FuncionarioNaoEncontradoException e = new FuncionarioNaoEncontradoException(cpf);
			throw e;
		}
		return funcionario;
	}

	
}

package negocio.controle;

import java.util.ArrayList;
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

	public void cadastrar(Funcionario funcionario) throws CpfJaExisteException, FuncionarioNuloException {
		if (funcionario.getNome() != null && funcionario.getCpf().length() == 11 && funcionario.getSenha() != null) {
			if (funcionarios.consultar(funcionario.getCpf()) == null) {
				funcionarios.cadastrar(funcionario);
				RepositorioFuncionariosArray.getInstance().salvarArquivo();
			} else {
				CpfJaExisteException e = new CpfJaExisteException(funcionario.getCpf());
				throw e;
			}
		} else {
			FuncionarioNuloException e = new FuncionarioNuloException(funcionario.getNome(), funcionario.getCpf(),
					funcionario.getSenha());
			throw e;
		}
	}

	public void remover(String cpf) throws FuncionarioNaoEncontradoException {
		Funcionario funcionario = funcionarios.consultar(cpf);
		if (funcionario == null) {
			FuncionarioNaoEncontradoException e = new FuncionarioNaoEncontradoException(cpf);
			throw e;
		} else {
			funcionarios.remover(cpf);
			RepositorioFuncionariosArray.getInstance().salvarArquivo();
		}
	}

	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		Funcionario funcionarioAux = funcionarios.consultar(funcionario.getCpf());
		if (funcionario == null || funcionarioAux == null) {
			FuncionarioNaoEncontradoException e = new FuncionarioNaoEncontradoException(funcionario.getCpf());
			throw e;
		} else {
			funcionarios.atualizar(funcionario);
			RepositorioFuncionariosArray.getInstance().salvarArquivo();
		}
	}

	public Funcionario consultar(String cpf) throws FuncionarioNaoEncontradoException {
		Funcionario funcionario = funcionarios.consultar(cpf);
		if (funcionario == null) {
			FuncionarioNaoEncontradoException e = new FuncionarioNaoEncontradoException(cpf);
			throw e;
		}
		return funcionario;
	}

	public ArrayList<Funcionario> listar() {
		return funcionarios.listar();
	}

	public boolean validarFuncionario(String cpf, String senha) throws FuncionarioNaoEncontradoException {
		boolean retorno = funcionarios.validarFuncionario(cpf, senha);
		if (retorno == false) {
			FuncionarioNaoEncontradoException e = new FuncionarioNaoEncontradoException(cpf);
			throw e;
		}
		return retorno;
	}

}

package negocio.controle;

import dados.RepositorioFuncionarios;
import dados.RepositorioFuncionariosArray;
import negocio.entidades.Funcionario;

public class ControleFuncionarios {
	
	private RepositorioFuncionarios funcionarios = RepositorioFuncionariosArray.getInstance();
	
	public void cadastrar(Funcionario funcionario) {
		if(funcionario.getNome() != null && funcionario.getCpf().length() == 11 && funcionario.getSenha() != null ) {
			if(funcionarios.consultar(funcionario.getCpf()) == null) {
				funcionarios.cadastrar(funcionario);
			}else {
				//Exception ja existe
			}
		}else {
			//exception campos nulos
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

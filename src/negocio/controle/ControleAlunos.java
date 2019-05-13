package negocio.controle;

import dados.RepositorioAlunos;
import dados.RepositorioAlunosArray;
import negocio.entidades.Aluno;

public class ControleAlunos {
	
	private RepositorioAlunos alunos = RepositorioAlunosArray.getInstance();
	
	public void cadastrar(Aluno aluno) {
		if(aluno.getNome() != null && aluno.getCpf().length() == 11) {
			if(alunos.consultar(aluno.getCpf()) == null) {
				alunos.cadastrar(aluno);
			}else {
				//Exception ja existe
			}
		}else {
			//exception campos nulos
		}
	}
	
	public void remover(String cpf) {
		Aluno aluno = alunos.consultar(cpf);
		if(aluno == null) {
			//exception de nao encontrado
		} else {
			alunos.remover(cpf);
		}
	}
	
	public void atualizar(Aluno aluno) {
		Aluno alunoAux = alunos.consultar(aluno.getCpf());
		if(aluno == null || alunoAux == null) {
			//exception de não encontrado
		} else {
			alunos.atualizar(aluno);
		}
	}
	
	public Aluno consultar(String cpf) {
		Aluno aluno = alunos.consultar(cpf);
		if( aluno == null) {
			//exception aluno nao encontrado
		}
		return aluno;
	}
	
	public String[] listar() {
		return alunos.listar();
	}
}

package negocio.controle;

import java.util.ArrayList;

import dados.RepositorioAlunos;
import dados.RepositorioAlunosArray;
import negocio.entidades.Aluno;
import negocio.exception.aluno.AlunoNaoEncontradoException;
import negocio.exception.aluno.AlunoNuloException;
import negocio.exception.aluno.CpfJaExisteException;

public class ControleAlunos {
	
	private RepositorioAlunos alunos;
	
	public ControleAlunos() {
		alunos = RepositorioAlunosArray.getInstance();
	}
	
	public void cadastrar(Aluno aluno) throws CpfJaExisteException, AlunoNuloException{
		if(aluno.getNome() != null && aluno.getCpf().length() == 11) {
			if(alunos.consultar(aluno.getCpf()) == null) {
				alunos.cadastrar(aluno);
			}else {
				CpfJaExisteException e = new CpfJaExisteException(aluno.getCpf());
				throw e;
			}
		}else {
			AlunoNuloException e = new AlunoNuloException(aluno.getNome(),aluno.getCpf());
			throw e;
		}
	}
	
	public void remover(String cpf) throws AlunoNaoEncontradoException{
		Aluno aluno = alunos.consultar(cpf);
		if(aluno == null) {
			AlunoNaoEncontradoException e = new AlunoNaoEncontradoException(cpf);
			throw e;
		} else {
			alunos.remover(cpf);
		}
	}
	
	public void atualizar(Aluno aluno) throws AlunoNaoEncontradoException{
		Aluno alunoAux = alunos.consultar(aluno.getCpf());
		if(aluno == null || alunoAux == null) {
			AlunoNaoEncontradoException e = new AlunoNaoEncontradoException(aluno.getCpf());
			throw e;
		} else {
			alunos.atualizar(aluno);
		}
	}
	
	public Aluno consultar(String cpf) throws AlunoNaoEncontradoException{
		Aluno aluno = alunos.consultar(cpf);
		if( aluno == null) {
			AlunoNaoEncontradoException e = new AlunoNaoEncontradoException(cpf);
			throw e;
		}
		return aluno;
	}
	
	public ArrayList<Aluno> listar() {
		return alunos.listar();
	}
}

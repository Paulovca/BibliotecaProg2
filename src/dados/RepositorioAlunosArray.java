package dados;

import java.util.ArrayList;

import negocio.entidades.Aluno;
import negocio.entidades.Emprestimo;

public class RepositorioAlunosArray implements RepositorioAlunos {
	
	private static RepositorioAlunosArray instance;
	private Aluno[] alunos;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	private RepositorioAlunosArray() {
		this.alunos = new Aluno[TAMANHO];
		this.indice = 0;
	}
	
	public static RepositorioAlunosArray getInstance() {
		if(instance == null) {
			instance = new RepositorioAlunosArray();
		}
		return instance;
	}
	
	@Override
	public void cadastrar(Aluno aluno) {
		alunos[indice] = aluno;
		indice++;
	}
	
	@Override
	public void remover(String cpf) {
		for(int i = 0; i < indice ; i++) {
			if(alunos[i].getCpf().equals(cpf)) {
				alunos[i] = alunos[indice];
				alunos[indice] = null;
			}
		}
	}
	
	@Override
	public void atualizar(Aluno aluno) {
		for(int i = 0; i < indice ; i++) {
			if(alunos[i].getCpf().equals(aluno.getCpf())) {
				alunos[i] = aluno;
			}
		}
	}

	@Override
	public Aluno consultar(String cpf) {
		Aluno aluno = null;
		for(int i = 0; i< indice ; i++) {
			if(alunos[i].getCpf().equals(cpf)) {
				aluno = alunos[i];
			}
		}
		return aluno;
	}

	@Override
	public ArrayList<Aluno> listar() {
		ArrayList<Aluno> aluno = new ArrayList<Aluno>();
		for(Aluno aln : alunos) {
			aluno.add(aln);
		}
		return aluno;
	}
}

package dados;

import negocio.entidades.Aluno;
import negocio.entidades.Avaliacao;
import negocio.entidades.Turma;

public interface RepositorioDevolucoes {

	public void inserir(Avaliacao avaliacao);
	public void alterar(Avaliacao avaliacao);
	public Avaliacao procurar(Aluno aluno, Turma turma);
	public int[] buscarTurmasDoAluno(int idAluno);
	public int[] buscarAlunosDaTurma(Turma turma);

}

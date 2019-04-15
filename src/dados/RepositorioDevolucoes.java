package dados;

import negocio.entidades.Aluno;
import negocio.entidades.Avaliacao;
import negocio.entidades.Turma;

public interface RepositorioDevolucoes {

	public void cadastrar( );
	public Devolucao consultar();
	public Devolucao remover();
	public int[] buscarTurmasDoAluno();
	public int[] buscarAlunosDaTurma();

}

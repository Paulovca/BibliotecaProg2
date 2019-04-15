package dados;

import negocio.entidades.Disciplina;

public interface RepositorioEmprestimos {
	
	public void inserir(Disciplina disciplina);
	public Disciplina procurar(int codDisciplina);
	public void remover(int codDisciplina);
	public void alterar(Disciplina disciplina);
	public String[] listar();
	
}

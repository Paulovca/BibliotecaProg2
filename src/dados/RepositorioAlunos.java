package dados;

import negocio.entidades.Aluno;

public interface RepositorioAlunos {

	public void cadastrar(Aluno aluno);
	public Aluno consultar(String cpf);
	public void remover(String cpf);
	public void atualizar(Aluno aluno);
	public String[] listar();
	//	
}

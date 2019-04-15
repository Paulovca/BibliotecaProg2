package dados;

import negocio.entidades.Aluno;

public interface RepositorioAlunos {

	public void inserir(Aluno aluno);
	public Aluno procurar(int matricula);
	public Aluno procurar(String cpf);
	public void remover(int matricula);
	public void remover(String cpf);
	public void alterar(Aluno aluno);
	public String[] listar();
	//	
}

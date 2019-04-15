package dados;

import negocio.entidades.Professor;

public interface RepositorioItens {

	public void inserir(Professor professor);
	public Professor procurar(int professorId);
	public Professor procurar(String cpf);
	public void remover(int professorId);
	public void remover(String cpf);
	public void alterar(Professor professor);
	public String[] listar();
	
}

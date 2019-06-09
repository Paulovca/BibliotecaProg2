package dados;

import java.util.ArrayList;

import negocio.entidades.Livro;

public interface RepositorioLivros {
	
	public void cadastrar(Livro livro);
	public void remover(int id);
	public void atualizar(Livro livro);
	public Livro consultar(int id);
	public ArrayList<Livro> listar();

}

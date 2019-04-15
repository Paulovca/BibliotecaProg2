package dados;

import negocio.entidades.Livro;

public interface RepositorioLivros {
	
	public void cadastrar(Livro livro);
	public Livro consultar(int id);
	public void remover(int id);
	public void atualizar(Livro livro);

}

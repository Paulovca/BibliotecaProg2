package negocio.controle;

import dados.RepositorioLivros;
import dados.RepositorioLivrosArray;
import negocio.entidades.Livro;
import negocio.exception.livro.LivroJaExisteException;
import negocio.exception.livro.LivroNaoEncontradoException;
import negocio.exception.livro.LivroNuloException;

public class ControleLivros {
		
	private RepositorioLivros livros;
	
	public ControleLivros() {
		livros = RepositorioLivrosArray.getInstance();
	}
	
	public void cadastrar(Livro livro) throws LivroJaExisteException,LivroNuloException{
		if(livro.getTitulo() != null && livro.getAutor() != null) {
			if(livros.consultar(livro.getId()) == null) {
				livros.cadastrar(livro);
			}else {
				LivroJaExisteException e = new LivroJaExisteException(livro.getId(),livro.getTitulo());
				throw e;
			}
		}else {
			LivroNuloException e = new LivroNuloException(livro.getAutor(),livro.getTitulo());
			throw e;
		}
	}
	
	public void remover(int id) throws LivroNaoEncontradoException{
		Livro livro = livros.consultar(id);
		if(livro == null) {
			LivroNaoEncontradoException e = new LivroNaoEncontradoException(id);
			throw e;
		} else {
			livros.remover(id);
		}
	}
	
	public void atualizar(Livro livro) throws LivroNaoEncontradoException{
		Livro livroAux = livros.consultar(livro.getId());
		if(livro == null || livroAux == null) {
			LivroNaoEncontradoException e = new LivroNaoEncontradoException(livro.getId());
			throw e;
		} else {
			livros.atualizar(livro);
		}
	}
	
	public Livro consultar(int id) throws LivroNaoEncontradoException{
		Livro livro = livros.consultar(id);
		if( livro == null) {
			LivroNaoEncontradoException e = new LivroNaoEncontradoException(id);
			throw e;
		}
		return livro;
	}
}

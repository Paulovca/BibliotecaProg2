package negocio.controle;

import java.util.ArrayList;

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
		if(livro.getTitulo() != null && livro.getAutor() != null && livro.getId()>=0) {
			if(livros.consultar(livro.getId()) == null) {
				livros.cadastrar(livro);
				RepositorioLivrosArray.getInstance().salvarArquivo();
			}else {
				LivroJaExisteException e = new LivroJaExisteException(livro.getId(),livro.getTitulo());
				throw e;
			}
		}else {
			LivroNuloException e = new LivroNuloException(livro.getAutor(),livro.getTitulo(),livro.getId());
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
			RepositorioLivrosArray.getInstance().salvarArquivo();
		}
	}
	
	public void atualizar(Livro livro) throws LivroNaoEncontradoException{
		Livro livroAux = livros.consultar(livro.getId());
		if(livro == null || livroAux == null) {
			LivroNaoEncontradoException e = new LivroNaoEncontradoException(livro.getId());
			throw e;
		} else {
			livros.atualizar(livro);
			RepositorioLivrosArray.getInstance().salvarArquivo();
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
	
	public ArrayList<Livro> listar() {
		return livros.listar();
	}
}

package negocio.controle;

import dados.RepositorioLivros;
import dados.RepositorioLivrosArray;
import negocio.entidades.Livro;

public class ControleLivros {
		
	private RepositorioLivros livros = RepositorioLivrosArray.getInstance();
	
	public void cadastrar(Livro livro) {
		if(livro.getTitulo() != null && livro.getAutor() != null) {
			if(livros.consultar(livro.getId()) == null) {
				livros.cadastrar(livro);
			}else {
				//Exception ja existe
			}
		}else {
			//exception campos nulos
		}
	}
	
	public void remover(int id) {
		Livro livro = livros.consultar(id);
		if(livro == null) {
			//exception de nao encontrado
		} else {
			livros.remover(id);
		}
	}
	
	public void atualizar(Livro livro) {
		Livro livroAux = livros.consultar(livro.getId());
		if(livro == null || livroAux == null) {
			//exception de não encontrado
		} else {
			livros.atualizar(livro);
		}
	}
	
	public Livro consultar(int id) {
		Livro livro = livros.consultar(id);
		if( livro == null) {
			//exception aluno nao encontrado
		}
		return livro;
	}
}

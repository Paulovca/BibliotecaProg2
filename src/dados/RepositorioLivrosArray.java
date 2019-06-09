package dados;

import java.util.ArrayList;

import negocio.entidades.Aluno;
import negocio.entidades.Livro;

public class RepositorioLivrosArray implements RepositorioLivros{
	
	private static RepositorioLivrosArray instance;
	private Livro[] livros;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	private RepositorioLivrosArray() {
		this.livros = new Livro[TAMANHO];
		this.indice = 0;
	}
	
	public static RepositorioLivrosArray getInstance() {
		if(instance == null) {
			instance = new RepositorioLivrosArray();
		}
		return instance;
	}
	
	@Override
	public void cadastrar(Livro livro) {
		livros[indice] = livro;
		indice++;
	}

	@Override
	public void remover(int id) {
		for(int i = 0; i < indice ; i++) {
			if(livros[i].getId() == id) {
				livros[i] = livros[indice];
				livros[indice] = null;
			}
		}
	}
	
	@Override
	public void atualizar(Livro livro) {
		for(int i = 0; i < indice ; i++) {
			if(livros[i].getId() == livro.getId()) {
				livros[i] = livro;
			}
		}
	}
	
	@Override
	public Livro consultar(int id) {
		Livro livro = null;
		for(int i = 0; i< indice ; i++) {
			if(livros[i].getId() == id) {
				livro = livros[i];
			}
		}
		return livro;
	}
	
	@Override
	public ArrayList<Livro> listar() {
		ArrayList<Livro> livro = new ArrayList<Livro>();
		for(Livro lvr : livros) {
			livro.add(lvr);
		}
		return livro;
	}

}

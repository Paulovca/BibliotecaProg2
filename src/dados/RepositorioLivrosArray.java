package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import negocio.entidades.Aluno;
import negocio.entidades.Livro;

public class RepositorioLivrosArray implements RepositorioLivros{
	
	private static RepositorioLivrosArray instance;
	private Livro[] livros;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	public static RepositorioLivrosArray getInstance() {
		if(instance == null) {
			instance = lerDoArquivo();
		}
		return instance;
	}

	private static RepositorioLivrosArray lerDoArquivo() {
		RepositorioLivrosArray instanciaLocal = null;
	    File in = new File("livros.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
	    try {
	      fis = new FileInputStream(in);
	      ois = new ObjectInputStream(fis);
	      Object o = ois.readObject();
	      instanciaLocal = (RepositorioLivrosArray) o;
	    } catch (Exception e) {
	      instanciaLocal = new RepositorioLivrosArray();
	    } finally {
	      if (ois != null) {
	        try {
	          ois.close();
	        } catch (IOException e) {/* Silent exception */
	        }
	      }
	    }

	    return instanciaLocal;
	  }
	
	public void salvarArquivo() {
		if (instance == null) {
			return;
		}
		File out = new File("livros.dat");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(out);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(instance);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
				/* Silent */}
			}
		}
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
			if(lvr != null) {
				livro.add(lvr);
			}
		}
		return livro;
	}

}

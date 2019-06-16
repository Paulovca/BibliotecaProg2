package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import negocio.entidades.Devolucao;

public class RepositorioDevolucoesArray implements RepositorioDevolucoes, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8470952087014330365L;
	private static RepositorioDevolucoesArray instance;
	private Devolucao[] devolucoes;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	private RepositorioDevolucoesArray() {
		this.devolucoes = new Devolucao[TAMANHO];
		this.indice = 0;
		lerDoArquivo();
	}
	
	public static RepositorioDevolucoesArray getInstance() {
		if(instance == null) {
			instance = new RepositorioDevolucoesArray();
		}
		return instance;
	}

	private void lerDoArquivo() {

	    File in = new File("alunos.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
	    try {
	      fis = new FileInputStream(in);
	      ois = new ObjectInputStream(fis);
	      Object o = ois.readObject();
	      RepositorioDevolucoesArray repTem = (RepositorioDevolucoesArray) o;
	      this.devolucoes= repTem.devolucoes;
	      this.indice= repTem.indice;
	      
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally {
	      if (ois != null) {
	        try {
	          ois.close();
	        } catch (IOException e) {/* Silent exception */
	        }
	      }
	    }
	  }
	
	public void salvarArquivo() {
	    if (instance == null) {
	      return;
	    }
	    File out = new File("alunos.dat");
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
	public void cadastrar(Devolucao devolucao) {
		devolucoes[indice] = devolucao;
		indice++;
	}
	
	@Override
	public void remover(int id) {
		for(int i = 0; i < indice ; i++) {
			if(devolucoes[i].getId() == id) {
				devolucoes[i] = devolucoes[indice];
				devolucoes[indice] = null;
			}
		}
	}

	@Override
	public Devolucao consultar(int id) {
		Devolucao devolucao = null;
		for(int i = 0; i< indice ; i++) {
			if(devolucoes[i].getId() == id) {
				devolucao = devolucoes[i];
			}
		}
		return devolucao;
	}
	
	@Override
	public ArrayList<Devolucao> listar() {
		ArrayList<Devolucao> devolucao = new ArrayList<Devolucao>();
		for(Devolucao dvl : devolucoes) {
			devolucao.add(dvl);
		}
		return devolucao;
	}
}

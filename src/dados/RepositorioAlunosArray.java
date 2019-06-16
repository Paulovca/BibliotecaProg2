package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import negocio.entidades.Aluno;

public class RepositorioAlunosArray implements RepositorioAlunos, Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1690443057364996772L;
	
	private static RepositorioAlunosArray instance;
	private Aluno[] alunos;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	private RepositorioAlunosArray() {
		this.alunos = new Aluno[TAMANHO];
		this.indice = 0;
		lerDoArquivo();
	}
	
	public static RepositorioAlunosArray getInstance() {
		if(instance == null) {
			instance = new RepositorioAlunosArray();
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
	      RepositorioAlunosArray repTem = (RepositorioAlunosArray) o;
	      this.alunos= repTem.alunos;
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
	public void cadastrar(Aluno aluno) {
		alunos[indice] = aluno;
		indice++;
	}
	
	@Override
	public void remover(String cpf) {
		for(int i = 0; i < indice ; i++) {
			if(alunos[i].getCpf().equals(cpf)) {
				alunos[i] = alunos[indice];
				alunos[indice] = null;
			}
		}
	}
	
	@Override
	public void atualizar(Aluno aluno) {
		for(int i = 0; i < indice ; i++) {
			if(alunos[i].getCpf().equals(aluno.getCpf())) {
				alunos[i] = aluno;
			}
		}
	}

	@Override
	public Aluno consultar(String cpf) {
		Aluno aluno = null;
		for(int i = 0; i< indice ; i++) {
			if(alunos[i].getCpf().equals(cpf)) {
				aluno = alunos[i];
			}
		}
		return aluno;
	}

	@Override
	public ArrayList<Aluno> listar() {
		ArrayList<Aluno> aluno = new ArrayList<Aluno>();
		for(Aluno aln : alunos) {
			aluno.add(aln);
		}
		return aluno;
	}
}

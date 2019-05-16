package dados;

import java.util.Date;

import negocio.entidades.Devolucao;
import negocio.entidades.Emprestimo;

public class RepositorioDevolucoesArray implements RepositorioDevolucoes{
	
	private static RepositorioDevolucoesArray instance;
	private Devolucao[] devolucoes;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	private RepositorioDevolucoesArray() {
		this.devolucoes = new Devolucao[TAMANHO];
		this.indice = 0;
	}
	
	public static RepositorioDevolucoesArray getInstance() {
		if(instance == null) {
			instance = new RepositorioDevolucoesArray();
		}
		return instance;
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
	
}

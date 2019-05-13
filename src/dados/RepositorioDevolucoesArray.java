package dados;

import java.util.Date;

import negocio.entidades.Devolucao;

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
	public Devolucao consultar(Date dataDevolucao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Devolucao remover(Date dataDevolucao) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

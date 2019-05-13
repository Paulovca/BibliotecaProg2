package dados;

import negocio.entidades.Aluno;
import negocio.entidades.Item;

public class RepositorioItensArray implements RepositorioItens {
	
	private static RepositorioItensArray instance;
	private Item[] itens;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	private RepositorioItensArray() {
		this.itens = new Item[TAMANHO];
		this.indice = 0;
	}
	
	public static RepositorioItensArray getInstance() {
		if(instance == null) {
			instance = new RepositorioItensArray();
		}
		return instance;
	}
	
	@Override
	public void cadastrar(Item item) {
		itens[indice] = item;
		indice++;
	}

	@Override
	public Item consultar(int id) {
		Item item = null;
		for(int i = 0; i< indice ; i++) {
			if(itens[i].getId() == id) {
				item = itens[i];
			}
		}
		return item;
	}

	@Override
	public void remover(int id) {
		for(int i = 0; i < indice ; i++) {
			if(itens[i].getId() == id) {
				itens[i] = itens[indice];
				itens[indice] = null;
			}
		}
	}

}

package negocio.controle;

import dados.RepositorioItens;
import dados.RepositorioItensArray;
import negocio.entidades.Item;

public class ControleItens {
	
	private RepositorioItens itens;
	
	public ControleItens() {
		itens = RepositorioItensArray.getInstance();
	}
	
	public void cadastrar(Item item) {
		if(item.getLivro() != null && item.getQuantidade() >= 1) {
			if(itens.consultar(item.getId()) == null) {
				itens.cadastrar(item);
			}else {
				//Exception ja existe
			}
		}else {
			//exception campos nulos
		}
	}
	
	public void remover(int id) {
		Item item = itens.consultar(id);
		if(item == null) {
			//exception de nao encontrado
		} else {
			itens.remover(id);
		}
	}
	
	public Item consultar(int id) {
		Item item = itens.consultar(id);
		if( item == null) {
			//exception aluno nao encontrado
		}
		return item;
	}
	
}

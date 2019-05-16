package negocio.controle;

import dados.RepositorioDevolucoes;
import dados.RepositorioDevolucoesArray;
import negocio.entidades.Aluno;
import negocio.entidades.Devolucao;
import negocio.entidades.Emprestimo;

public class ControleDevolucoes {
	
	private RepositorioDevolucoes devolucoes = RepositorioDevolucoesArray.getInstance();
	
	public void cadastrar(Devolucao devolucao) {
		if(devolucao.getAluno() != null && devolucao.getFuncionario() != null && devolucao.getItens() != null) {
			if(devolucoes.consultar(devolucao.getId()) == null) {
				devolucoes.cadastrar(devolucao);
			}else {
				//Exception ja existe
			}
		}else {
			//exception campos nulos
		}
	}
	
	public void remover(int id) {
		Devolucao devolucao = devolucoes.consultar(id);
		if(devolucao == null) {
			//exception de nao encontrado
		} else {
			devolucoes.remover(id);
		}
	}
	
	public Devolucao consultar(int id) {
		Devolucao devolucao = devolucoes.consultar(id);
		if( devolucao == null) {
			//exception aluno nao encontrado
		}
		return devolucao;
	}
}

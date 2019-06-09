package negocio.controle;

import java.time.Duration;

import dados.RepositorioDevolucoes;
import dados.RepositorioDevolucoesArray;
import negocio.entidades.Aluno;
import negocio.entidades.Devolucao;
import negocio.entidades.Emprestimo;
import negocio.exception.devolucao.DevolucaoJaExisteException;
import negocio.exception.devolucao.DevolucaoNaoEncontradaException;
import negocio.exception.devolucao.DevolucaoNulaException;

public class ControleDevolucoes {
	
	private RepositorioDevolucoes devolucoes;
	
	public ControleDevolucoes () {
		devolucoes = RepositorioDevolucoesArray.getInstance();
	}
	
	public void cadastrar(Devolucao devolucao) throws DevolucaoJaExisteException,DevolucaoNulaException{
		if(devolucao.getAluno() != null && devolucao.getFuncionario() != null && devolucao.getItens() != null) {
			if(devolucoes.consultar(devolucao.getId()) == null) {
				devolucoes.cadastrar(devolucao);
			}else {
				DevolucaoJaExisteException e = new DevolucaoJaExisteException(devolucao.getId());
				throw e;
			}
		}else {
			DevolucaoNulaException e = new DevolucaoNulaException(devolucao.getAluno(),devolucao.getItens(),devolucao.getFuncionario());
			throw e;
		}
	}
	
	public float devolver(Emprestimo emprestimo, Devolucao devolucao) {
		float multa = 0;
		emprestimo.setDevolvido(true);
		if(devolucao.getDataDevolucao().isAfter(emprestimo.getDataDevolucao())) {
			multa = (float) (3.50*Duration.between(emprestimo.getDataDevolucao().atStartOfDay(), devolucao.getDataDevolucao().atStartOfDay()).toDays());
		}
		return multa;
	}
	
	public void remover(int id) throws DevolucaoNaoEncontradaException{
		Devolucao devolucao = devolucoes.consultar(id);
		if(devolucao == null) {
			DevolucaoNaoEncontradaException e = new DevolucaoNaoEncontradaException(id);
			throw e;
		} else {
			devolucoes.remover(id);
		}
	}
	
	public Devolucao consultar(int id) throws DevolucaoNaoEncontradaException{
		Devolucao devolucao = devolucoes.consultar(id);
		if( devolucao == null) {
			DevolucaoNaoEncontradaException e = new DevolucaoNaoEncontradaException(id);
			throw e;
		}
		return devolucao;
	}
	
}

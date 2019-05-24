package negocio.exception.devolucao;

import java.util.Calendar;

import negocio.entidades.Aluno;
import negocio.entidades.Funcionario;
import negocio.entidades.Item;

public class DevolucaoNulaException extends Exception{
	
	private Aluno aluno;
	private Item[] itens;
	private Funcionario funcionario;
	private Calendar dataDevolucao;
	
	public DevolucaoNulaException(Aluno aluno, Item[] itens, Funcionario funcionario, Calendar dataDevolucao) {
		super("Aluno, Itens, Funcionario e/ou Data de Devolução nulos!");
		this.aluno = aluno;
		this.itens = itens;
		this.funcionario = funcionario;
		this.dataDevolucao = dataDevolucao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Item[] getItens() {
		return itens;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}
	
	
}

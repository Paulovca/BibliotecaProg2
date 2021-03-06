package negocio.exception.emprestimo;

import negocio.entidades.Aluno;
import negocio.entidades.Funcionario;
import negocio.entidades.Item;

public class EmprestimoNuloException extends Exception {

	private Aluno aluno;
	private Funcionario funcionario;
	private Item[] itens;

	public EmprestimoNuloException(Aluno aluno, Funcionario funcionario, Item[] items) {
		super("Aluno, Funcionario e/ou Itens nulos!");
		this.aluno = aluno;
		this.funcionario = funcionario;
		this.itens = items;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Item[] getItens() {
		return itens;
	}

}

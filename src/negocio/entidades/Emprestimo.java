package negocio.entidades;

import java.sql.Date;

public class Emprestimo {
	
	private Aluno aluno;
	private Item itens[] = new Item[5];
	private Funcionario funcionario;
	private Date dataEmpretimo;
	private Date dataDevolucao;
	
	public Emprestimo(Aluno aluno, Item[] itens, Funcionario funcionario, Date dataEmpretimo, Date dataDevolucao) {
		this.aluno = aluno;
		this.itens = itens;
		this.funcionario = funcionario;
		this.dataEmpretimo = dataEmpretimo;
		this.dataDevolucao = dataDevolucao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDataEmpretimo() {
		return dataEmpretimo;
	}

	public void setDataEmpretimo(Date dataEmpretimo) {
		this.dataEmpretimo = dataEmpretimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public void cadastrar() {
		//ser� modificado
	}
	
	public Emprestimo consultar() {
		Emprestimo emprestimo = null;
		return emprestimo;
		//ser� modificado
	}
	
	public void remover() {
		//ser� modificado
	}
	
}
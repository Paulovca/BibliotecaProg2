package negocio.entidades;

import java.time.LocalDate;

public class Emprestimo {
	
	private int id = 0;
	private static int contador = 0;
	private Aluno aluno;
	private Item itens[] = new Item[5];
	private Funcionario funcionario;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	

	public Emprestimo(int id, Aluno aluno, Item[] itens, Funcionario funcionario) {
		Emprestimo.contador ++;
		this.id = contador;
		this.aluno = aluno;
		this.itens = itens;
		this.funcionario = funcionario;
		this.dataEmprestimo = LocalDate.now();
		this.dataDevolucao = dataEmprestimo.plusDays(15);
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

	public LocalDate getDataEmpretimo() {
		return dataEmprestimo;
	}

	public void setDataEmpretimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getId() {
		return id;
	}

}

package negocio.entidades;

import java.time.Duration;
import java.time.LocalDate;

public class Devolucao {
	
	private int id = 0;
	private static int contador = 0;
	private Aluno aluno;
	private Item[] itens;
	private Funcionario funcionario;
	private LocalDate dataDevolucao;
	private float multa;
	
	public Devolucao(Aluno aluno, Item[] itens, Funcionario funcionario) {
		Devolucao.contador ++;
		this.aluno = aluno;
		this.itens = itens;
		this.funcionario = funcionario;
		this.dataDevolucao = LocalDate.now();
		this.multa = 0;
		this.id = contador;

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

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getId() {
		return id;
	}

	public static int getContador() {
		return contador;
	}

	public float getMulta() {
		return multa;
	}

	public void setMulta(float multa) {
		this.multa = multa;
	}
	
	public float devolver( Emprestimo emprestimo) {
		float multa = 0;
		if(this.getDataDevolucao().isAfter(emprestimo.getDataDevolucao())) {
			multa = (float) (3.50*Duration.between(emprestimo.getDataDevolucao().atStartOfDay(), this.getDataDevolucao().atStartOfDay()).toDays());
		}
		return multa;
	}
}

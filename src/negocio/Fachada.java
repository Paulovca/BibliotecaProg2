package negocio;

import negocio.controle.ControleAlunos;
import negocio.controle.ControleDevolucoes;
import negocio.controle.ControleEmprestimos;
import negocio.controle.ControleFuncionarios;
import negocio.controle.ControleItens;
import negocio.controle.ControleLivros;
import negocio.entidades.Aluno;
import negocio.entidades.Devolucao;
import negocio.entidades.Emprestimo;
import negocio.entidades.Funcionario;
import negocio.entidades.Item;
import negocio.entidades.Livro;
import negocio.exception.aluno.AlunoNaoEncontradoException;
import negocio.exception.aluno.CampoNuloException;
import negocio.exception.aluno.CpfJaExisteException;

public class Fachada {

	private ControleAlunos alunos;
	private ControleDevolucoes devolucoes;
	private ControleEmprestimos emprestimos;
	private ControleFuncionarios funcionarios;
	private ControleItens itens;
	private ControleLivros livros;
	
	private static Fachada instance;
	
	private Fachada() {
		alunos = new ControleAlunos();
		devolucoes = new ControleDevolucoes();
		emprestimos = new ControleEmprestimos();
		funcionarios = new ControleFuncionarios();
		itens = new ControleItens();
		livros = new ControleLivros();
	}
	
	public static Fachada getInstance() {
		if(Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return instance;
	}
	
	//Alunos--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Aluno aluno) throws CpfJaExisteException, CampoNuloException{
		alunos.cadastrar(aluno);
	}
	
	public void remover(String cpf) throws AlunoNaoEncontradoException {
		alunos.remover(cpf);
	}
	
	public void atualizar(Aluno aluno) throws AlunoNaoEncontradoException {
		alunos.atualizar(aluno);
	}
	
	public Aluno consultar(String cpf) throws AlunoNaoEncontradoException {
		return alunos.consultar(cpf);
	}
	
	public String[] listar() {
		return alunos.listar();
	}
	
	//Devoluções----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Devolucao devolucao) {
		devolucoes.cadastrar(devolucao);
	}
	
	public float devolver(Emprestimo emprestimo) {
		return devolucoes.devolver(emprestimo);
	}
	
	public void removerDevolucao(int id) {
		devolucoes.remover(id);
	}
	
	public Devolucao consultarDevolucao(int id) {
		return devolucoes.consultar(id);
	}
	
	//Emprestimos---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Emprestimo emprestimo) {
		emprestimos.cadastrar(emprestimo);
	}
	
	public void removerEmprestimo(int id) {
		emprestimos.remover(id);
	}
	
	public Emprestimo consultarEmprestimo(int id) {
		return emprestimos.consultar(id);
	}
	
	//Funcionarios--------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Funcionario funcionario) {
		funcionarios.cadastrar(funcionario);
	}
	
	public void removerFuncionario(String cpf) {
		funcionarios.remover(cpf);
	}
	
	public void atualizar(Funcionario funcionario) {
		funcionarios.atualizar(funcionario);
	}
	
	public Funcionario consultarFuncionario(String cpf) {
		return funcionarios.consultar(cpf);
	}
	
	//Itens---------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Item item) {
		itens.cadastrar(item);
	}
	
	public void remover(int id) {
		itens.remover(id);
	}
	
	public Item consultarItem(int id) {
		return itens.consultar(id);
	}
	
	//Livros--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Livro livro) {
		livros.cadastrar(livro);
	}
	
	public void removerLivros(int id) {
		livros.remover(id);
	}
	
	public void atualizar(Livro livro) {
		livros.atualizar(livro);
	}
	
	public Livro consultarLivro(int id) {
		return livros.consultar(id);
	}
	
}

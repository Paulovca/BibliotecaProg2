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
import negocio.exception.aluno.AlunoNuloException;
import negocio.exception.aluno.CpfJaExisteException;
import negocio.exception.funcionario.FuncionarioNuloException;
import negocio.exception.item.ItemJaExisteException;
import negocio.exception.item.ItemNaoEncontradoException;
import negocio.exception.item.ItemNuloException;
import negocio.exception.livro.LivroJaExisteException;
import negocio.exception.livro.LivroNaoEncontradoException;
import negocio.exception.livro.LivroNuloException;

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
	
	public void cadastrar(Aluno aluno) throws CpfJaExisteException, AlunoNuloException{
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
	
	public void cadastrar(Funcionario funcionario) throws CpfJaExisteException, FuncionarioNuloException {
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
	
	public void cadastrar(Item item) throws ItemJaExisteException, ItemNuloException {
		itens.cadastrar(item);
	}
	
	public void removerItem(int id) throws ItemNaoEncontradoException {
		itens.remover(id);
	}
	
	public Item consultarItem(int id) throws ItemNaoEncontradoException {
		return itens.consultar(id);
	}
	
	//Livros--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Livro livro) throws LivroJaExisteException, LivroNuloException {
		livros.cadastrar(livro);
	}
	
	public void removerLivros(int id) throws LivroNaoEncontradoException {
		livros.remover(id);
	}
	
	public void atualizar(Livro livro) throws LivroNaoEncontradoException {
		livros.atualizar(livro);
	}
	
	public Livro consultarLivro(int id) throws LivroNaoEncontradoException {
		return livros.consultar(id);
	}
	
}

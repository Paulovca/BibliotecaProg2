package negocio;

import java.util.ArrayList;

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
import negocio.exception.devolucao.DevolucaoJaExisteException;
import negocio.exception.devolucao.DevolucaoNaoEncontradaException;
import negocio.exception.devolucao.DevolucaoNulaException;
import negocio.exception.emprestimo.AlunoSemEmprestimoException;
import negocio.exception.emprestimo.EmprestimoJaExisteException;
import negocio.exception.emprestimo.EmprestimoNaoEncontradoException;
import negocio.exception.emprestimo.EmprestimoNuloException;
import negocio.exception.funcionario.FuncionarioNaoEncontradoException;
import negocio.exception.funcionario.FuncionarioNuloException;
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
	
	public ArrayList<Aluno> listar() {
		return alunos.listar();
	}
	
	//Devoluções----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Devolucao devolucao) throws DevolucaoJaExisteException, DevolucaoNulaException {
		devolucoes.cadastrar(devolucao);
	}
	
	public float devolver(Emprestimo emprestimo, Devolucao devolucao) {
		return devolucoes.devolver(emprestimo,devolucao);
	}
	
	public void removerDevolucao(int id) throws DevolucaoNaoEncontradaException {
		devolucoes.remover(id);
	}
	
	public Devolucao consultarDevolucao(int id) throws DevolucaoNaoEncontradaException {
		return devolucoes.consultar(id);
	}
	
	public ArrayList<Devolucao> procurarDevolucoes(String cpf) {
		return devolucoes.procurarDevolucoes(cpf);
	}
	
	public ArrayList<Devolucao> listarDevolucao() {
		return devolucoes.listar();
	}
	
	//Emprestimos---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Emprestimo emprestimo) throws EmprestimoJaExisteException, EmprestimoNuloException {
		emprestimos.cadastrar(emprestimo);
	}
	
	public void removerEmprestimo(int id) throws EmprestimoNaoEncontradoException {
		emprestimos.remover(id);
	}
	
	public Emprestimo consultarEmprestimo(int id) throws EmprestimoNaoEncontradoException {
		return emprestimos.consultar(id);
	}
	
	public ArrayList<Emprestimo> listarEmprestimos(){
		return emprestimos.Listar();
	}
	
	public ArrayList<Emprestimo> procurarEmprestimos(String cpf)throws AlunoSemEmprestimoException{
		return emprestimos.procurarEmprestimos(cpf);
	}
	
	//Funcionarios--------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Funcionario funcionario) throws CpfJaExisteException, FuncionarioNuloException {
		funcionarios.cadastrar(funcionario);
	}
	
	public void removerFuncionario(String cpf) throws FuncionarioNaoEncontradoException {
		funcionarios.remover(cpf);
	}
	
	public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		funcionarios.atualizar(funcionario);
	}
	
	public Funcionario consultarFuncionario(String cpf) throws FuncionarioNaoEncontradoException {
		return funcionarios.consultar(cpf);
	}
	
	public ArrayList<Funcionario> listarFuncionarios(){
		return funcionarios.listar();
	}
	
	//Itens---------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void cadastrar(Item item) throws ItemNuloException {
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
	
	public void atualizarEstoqueEmprestimo(Emprestimo emprestimo) {
		livros.atualizarEstoqueEmprestimo(emprestimo);
	}
	
	public void atualizarEstoqueDevolucao(Devolucao devolucao) {
		livros.atualizarEstoqueDevolucao(devolucao);
	}
	
	public ArrayList<Livro> listarLivros(){
		return livros.listar();
	}
	
}

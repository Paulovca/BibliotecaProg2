package teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import negocio.entidades.Aluno;
import negocio.exception.aluno.AlunoNuloException;
import negocio.exception.aluno.CpfJaExisteException;

public class classeTeste {
	
	private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) throws CpfJaExisteException, AlunoNuloException {
		Aluno aluno1 = new Aluno("André","02408324262");
		Aluno aluno2 = new Aluno("Diego","02408324262");
		Aluno aluno3 = new Aluno("Paulo","08302424262");
		
		//Livro livro1 = new Livro("O código davinci", "Paulo Vinícius", 3);
		//Funcionario fun1 = new Funcionario("Pedrinho","asqueroso123", "comiquemtalendo");
		//Item item1 = new Item(livro1, 1);
		//deve-se criar um array de itens para passar em empréstimo, porém onde esse array será criado?
		//deve-se criar uma data de emprestimo e devolucao para passar em empréstimo, porém onde esse objeto data será criada?
	/*	
		Calendar cal = Calendar.getInstance();
	    System.out.println(sdf.format(cal.getTime()));
	    
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println(dtf.format(now));
	    	    
	    
		try {
			Fachada.getInstance().cadastrar(aluno3);
			Fachada.getInstance().cadastrar(aluno2);
			Fachada.getInstance().cadastrar(aluno1);
		} catch (AlunoNuloException e) {
			System.out.println("a");
		}catch( CpfJaExisteException e){
			System.out.println("b");
		}
		
			Fachada.getInstance().listar();
	*/
			 /*1opçao- a gente continua com esse formato de emprestimo, devolução recebe um emprestimo como parâmetro,
		     * e compara com a data que deveria receber o emprestimo (data devolucao) com a data atual gerando a multa com o metodo da devolução.
		     * 
		     * 2-opcao- interface do aluno, e o aluno possui um atributo emprestimo e devolução(arrays) e na criação de um emprestimo o aluno
		     * recebe esses objetos e ele pode selecionar os livros que vai devolver, gerando uma multa automaticamente pra ele.
		     *
		     *
		     *
		     *
		     *
		     **/
		
		//Emprestimo emp1 = new Emprestimo(aluno1, null, fun1, null, null);
		//
			
			LocalDate devolucaoEmprestimo = LocalDate.of(2019, 05, 20);
			LocalDate devolucao = LocalDate.now();
			
			
			System.out.println(Duration.between(devolucaoEmprestimo.atStartOfDay(), devolucao.atStartOfDay()).toDays());
			
//			float multa = 0;
//			//int j = deveria.getDayOfMonth();
//			
//			if(devolveu.isAfter(deveria)) {
//				for(LocalDate i = deveria ; i.isBefore(devolveu) ; i.plusDays(1)) {
//					multa += 3.50;
//				}
//			}
//			System.out.println(multa);
	}
	
}

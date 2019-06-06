package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Biblioteca extends JFrame {

	private JPanel contentPane;
	private static Biblioteca instance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Biblioteca frame = new Biblioteca();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public static Biblioteca getInstance() {
		if(instance == null) {
			instance = new Biblioteca();
		}
		return instance;
	}
	
	private Biblioteca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAluno = new JLabel("Aluno");
		lblAluno.setBounds(10, 32, 46, 14);
		contentPane.add(lblAluno);
		
		JLabel lblLivro = new JLabel("Livro");
		lblLivro.setBounds(91, 32, 46, 14);
		contentPane.add(lblLivro);
		
		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setBounds(172, 32, 71, 14);
		contentPane.add(lblFuncionario);
		
		JLabel lblEmprstimo = new JLabel("Empr\u00E9stimo");
		lblEmprstimo.setBounds(262, 32, 71, 14);
		contentPane.add(lblEmprstimo);
		
		JLabel lblDevoluo = new JLabel("Devolu\u00E7\u00E3o");
		lblDevoluo.setBounds(352, 32, 71, 14);
		contentPane.add(lblDevoluo);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrarAluno = new JButton("Cadastrar");
		btnCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CadastroAluno.getInstance().setVisible(true);
			}
		});
		btnCadastrarAluno.setBounds(0, 57, 80, 23);
		contentPane.add(btnCadastrarAluno);
		
		JButton btnCadastrarLivro = new JButton("Cadastrar");
		btnCadastrarLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrarLivro.setBounds(91, 57, 80, 23);
		contentPane.add(btnCadastrarLivro);
		
		JButton btnCadastrarFuncionario = new JButton("Cadastrar");
		btnCadastrarFuncionario.setBounds(172, 57, 80, 23);
		contentPane.add(btnCadastrarFuncionario);
		
		JButton btnCadastrarEmprestimo = new JButton("Cadastrar");
		btnCadastrarEmprestimo.setBounds(263, 57, 80, 23);
		contentPane.add(btnCadastrarEmprestimo);
		
		JButton btnCadastrarDevolucao = new JButton("Cadastrar");
		btnCadastrarDevolucao.setBounds(343, 57, 80, 23);
		contentPane.add(btnCadastrarDevolucao);
		
		JButton btnAtualizarAluno = new JButton("Atualizar");
		btnAtualizarAluno.setBounds(0, 91, 80, 23);
		contentPane.add(btnAtualizarAluno);
		
		JButton btnAtualizarLivro = new JButton("Atualizar");
		btnAtualizarLivro.setBounds(91, 91, 80, 23);
		contentPane.add(btnAtualizarLivro);
		
		JButton btnAtualizarFuncionario = new JButton("Atualizar");
		btnAtualizarFuncionario.setBounds(172, 91, 80, 23);
		contentPane.add(btnAtualizarFuncionario);
		
		JButton btnAtualizarEmprestimo = new JButton("Atualizar");
		btnAtualizarEmprestimo.setBounds(262, 91, 80, 23);
		contentPane.add(btnAtualizarEmprestimo);
		
		JButton btnAtualizarDevolucao = new JButton("Atualizar");
		btnAtualizarDevolucao.setBounds(343, 91, 80, 23);
		contentPane.add(btnAtualizarDevolucao);
		
		JButton btnRemoverAluno = new JButton("Remover");
		btnRemoverAluno.setBounds(0, 125, 80, 23);
		contentPane.add(btnRemoverAluno);
		
		JButton button = new JButton("Remover");
		button.setBounds(91, 125, 80, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Remover");
		button_1.setBounds(172, 125, 80, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Remover");
		button_2.setBounds(263, 125, 80, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Remover");
		button_3.setBounds(343, 125, 80, 23);
		contentPane.add(button_3);
		
		JButton btnConsultarAluno = new JButton("Consultar");
		btnConsultarAluno.setBounds(0, 159, 80, 23);
		contentPane.add(btnConsultarAluno);
		
		JButton button_4 = new JButton("Consultar");
		button_4.setBounds(91, 159, 80, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Consultar");
		button_5.setBounds(172, 159, 80, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Consultar");
		button_6.setBounds(263, 159, 80, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Consultar");
		button_7.setBounds(343, 159, 80, 23);
		contentPane.add(button_7);
	}
}

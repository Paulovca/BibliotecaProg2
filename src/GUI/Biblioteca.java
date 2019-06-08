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
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;

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
		setBounds(100, 100, 461, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAluno = new JLabel("Aluno");
		lblAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAluno.setForeground(new Color(255, 255, 255));
		lblAluno.setBounds(10, 32, 46, 14);
		contentPane.add(lblAluno);
		
		JLabel lblLivro = new JLabel("Livro");
		lblLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLivro.setForeground(new Color(255, 255, 255));
		lblLivro.setBounds(91, 32, 46, 14);
		contentPane.add(lblLivro);
		
		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFuncionario.setForeground(new Color(255, 255, 255));
		lblFuncionario.setBounds(181, 32, 71, 14);
		contentPane.add(lblFuncionario);
		
		JLabel lblEmprstimo = new JLabel("Empr\u00E9stimo");
		lblEmprstimo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmprstimo.setForeground(new Color(255, 255, 255));
		lblEmprstimo.setBounds(272, 32, 71, 14);
		contentPane.add(lblEmprstimo);
		
		JLabel lblDevoluo = new JLabel("Devolu\u00E7\u00E3o");
		lblDevoluo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDevoluo.setForeground(new Color(255, 255, 255));
		lblDevoluo.setBounds(366, 32, 71, 14);
		contentPane.add(lblDevoluo);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 256, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrarAluno = new JButton("Cadastrar");
		btnCadastrarAluno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CadastroAluno.getInstance().setVisible(true);
			}
		});
		btnCadastrarAluno.setBounds(0, 57, 80, 23);
		contentPane.add(btnCadastrarAluno);
		
		JButton btnCadastrarLivro = new JButton("Cadastrar");
		btnCadastrarLivro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCadastrarLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrarLivro.setBounds(91, 57, 80, 23);
		contentPane.add(btnCadastrarLivro);
		
		JButton btnCadastrarFuncionario = new JButton("Cadastrar");
		btnCadastrarFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCadastrarFuncionario.setBounds(181, 57, 80, 23);
		contentPane.add(btnCadastrarFuncionario);
		
		JButton btnCadastrarEmprestimo = new JButton("Cadastrar");
		btnCadastrarEmprestimo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCadastrarEmprestimo.setBounds(272, 57, 80, 23);
		contentPane.add(btnCadastrarEmprestimo);
		
		JButton btnCadastrarDevolucao = new JButton("Cadastrar");
		btnCadastrarDevolucao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCadastrarDevolucao.setBounds(366, 57, 80, 23);
		contentPane.add(btnCadastrarDevolucao);
		
		JButton btnAtualizarAluno = new JButton("Atualizar");
		btnAtualizarAluno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtualizarAluno.setBounds(0, 91, 80, 23);
		contentPane.add(btnAtualizarAluno);
		
		JButton btnAtualizarLivro = new JButton("Atualizar");
		btnAtualizarLivro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtualizarLivro.setBounds(91, 91, 80, 23);
		contentPane.add(btnAtualizarLivro);
		
		JButton btnAtualizarFuncionario = new JButton("Atualizar");
		btnAtualizarFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtualizarFuncionario.setBounds(181, 91, 80, 23);
		contentPane.add(btnAtualizarFuncionario);
		
		JButton btnRemoverAluno = new JButton("Remover");
		btnRemoverAluno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRemoverAluno.setBounds(0, 125, 80, 23);
		contentPane.add(btnRemoverAluno);
		
		JButton button = new JButton("Remover");
		button.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button.setBounds(91, 125, 80, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Remover");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_1.setBounds(181, 125, 80, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Remover");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_2.setBounds(272, 125, 80, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Remover");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_3.setBounds(366, 125, 80, 23);
		contentPane.add(button_3);
		
		JButton btnConsultarAluno = new JButton("Consultar");
		btnConsultarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConsultarAluno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConsultarAluno.setBounds(0, 159, 80, 23);
		contentPane.add(btnConsultarAluno);
		
		JButton button_4 = new JButton("Consultar");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_4.setBounds(91, 159, 80, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Consultar");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_5.setBounds(181, 159, 80, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Consultar");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_6.setBounds(272, 159, 80, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Consultar");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_7.setBounds(366, 159, 80, 23);
		contentPane.add(button_7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Pictures\\aaa.png"));
		lblNewLabel.setBounds(0, -17, 529, 308);
		contentPane.add(lblNewLabel);
	}
}

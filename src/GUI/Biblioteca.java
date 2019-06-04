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
	
	public Biblioteca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAluno = new JLabel("Aluno");
		lblAluno.setBounds(10, 32, 46, 14);
		contentPane.add(lblAluno);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 57, 71, 20);
		contentPane.add(comboBox);
//		comboBox.addItem(item);
		
		JLabel lblLivro = new JLabel("Livro");
		lblLivro.setBounds(91, 32, 46, 14);
		contentPane.add(lblLivro);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(91, 57, 71, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(172, 57, 71, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(253, 57, 71, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(333, 57, 71, 20);
		contentPane.add(comboBox_4);
		
		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setBounds(172, 32, 71, 14);
		contentPane.add(lblFuncionario);
		
		JLabel lblEmprstimo = new JLabel("Empr\u00E9stimo");
		lblEmprstimo.setBounds(253, 32, 71, 14);
		contentPane.add(lblEmprstimo);
		
		JLabel lblDevoluo = new JLabel("Devolu\u00E7\u00E3o");
		lblDevoluo.setBounds(333, 32, 71, 14);
		contentPane.add(lblDevoluo);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 106, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Grafica.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 191, 89, 23);
		contentPane.add(btnVoltar);
	}
}

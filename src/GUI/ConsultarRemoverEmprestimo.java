package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;

public class ConsultarRemoverEmprestimo extends JFrame {

	private JPanel contentPane;
	private static ConsultarRemoverEmprestimo instance;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRemoverEmprestimo frame = ConsultarRemoverEmprestimo.getInstance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static ConsultarRemoverEmprestimo getInstance() {
		if(instance == null) {
			instance = new ConsultarRemoverEmprestimo();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private ConsultarRemoverEmprestimo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				instance = null;
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 304, 89, 23);
		contentPane.add(btnVoltar);
		
		if (Biblioteca.flag == false) {
			JButton btnRemover = new JButton("Remover");
			btnRemover.setBounds(335, 304, 89, 23);
			contentPane.add(btnRemover);
		}
		
		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(10, 139, 31, 14);
		contentPane.add(lblAluno);
		
		JLabel lblCpfdoaluno = new JLabel("CpfDoAluno");
		lblCpfdoaluno.setBounds(53, 139, 57, 14);
		contentPane.add(lblCpfdoaluno);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio:");
		lblFuncionrio.setBounds(10, 164, 59, 14);
		contentPane.add(lblFuncionrio);
		
		JLabel lblNomedofuncionario = new JLabel("NomeDoFuncionario");
		lblNomedofuncionario.setBounds(79, 164, 95, 14);
		contentPane.add(lblNomedofuncionario);
		
		JLabel lblDataDeEmprstimo = new JLabel("Data de Empr\u00E9stimo:");
		lblDataDeEmprstimo.setBounds(10, 189, 100, 14);
		contentPane.add(lblDataDeEmprstimo);
		
		JLabel lblDatadoemprestimo = new JLabel("DataDoEmprestimo");
		lblDatadoemprestimo.setBounds(120, 189, 99, 14);
		contentPane.add(lblDatadoemprestimo);
		
		JLabel lblItens = new JLabel("Itens:");
		lblItens.setBounds(10, 239, 31, 14);
		contentPane.add(lblItens);
		
		JLabel lblDataDaDevoluo = new JLabel("Data da Devolu\u00E7\u00E3o:");
		lblDataDaDevoluo.setBounds(10, 214, 98, 14);
		contentPane.add(lblDataDaDevoluo);
		
		JLabel lblDatadadevolucao = new JLabel("DataDaDevolucao");
		lblDatadadevolucao.setBounds(118, 214, 86, 14);
		contentPane.add(lblDatadadevolucao);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 263, 200, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o cpf do aluno:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOCpf.setBounds(10, 11, 123, 14);
		contentPane.add(lblDigiteOCpf);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDadosDoEmprstimo = new JLabel("Dados do empr\u00E9stimo:");
		lblDadosDoEmprstimo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoEmprstimo.setBounds(10, 114, 156, 14);
		contentPane.add(lblDadosDoEmprstimo);
		
		JLabel lblEmprstimosEmAberto = new JLabel("Empr\u00E9stimos em aberto:");
		lblEmprstimosEmAberto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmprstimosEmAberto.setBounds(10, 64, 156, 14);
		contentPane.add(lblEmprstimosEmAberto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 86, 200, 20);
		contentPane.add(comboBox);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(220, 35, 89, 23);
		contentPane.add(btnPesquisar);
	}
}

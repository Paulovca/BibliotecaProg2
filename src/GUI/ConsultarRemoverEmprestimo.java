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

public class ConsultarRemoverEmprestimo extends JFrame {

	private JPanel contentPane;
	private static ConsultarRemoverEmprestimo instance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRemoverEmprestimo frame = new ConsultarRemoverEmprestimo();
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmprstimosCadastrados = new JLabel("Empr\u00E9stimos cadastrados:");
		lblEmprstimosCadastrados.setBounds(10, 11, 126, 14);
		contentPane.add(lblEmprstimosCadastrados);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 200, 20);
		contentPane.add(comboBox);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(335, 227, 89, 23);
		contentPane.add(btnRemover);
		
		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(220, 39, 31, 14);
		contentPane.add(lblAluno);
		
		JLabel lblCpfdoaluno = new JLabel("CpfDoAluno");
		lblCpfdoaluno.setBounds(261, 39, 57, 14);
		contentPane.add(lblCpfdoaluno);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio:");
		lblFuncionrio.setBounds(220, 64, 59, 14);
		contentPane.add(lblFuncionrio);
		
		JLabel lblNomedofuncionario = new JLabel("NomeDoFuncionario");
		lblNomedofuncionario.setBounds(289, 64, 95, 14);
		contentPane.add(lblNomedofuncionario);
		
		JLabel lblDataDeEmprstimo = new JLabel("Data de Empr\u00E9stimo:");
		lblDataDeEmprstimo.setBounds(220, 89, 100, 14);
		contentPane.add(lblDataDeEmprstimo);
		
		JLabel lblDatadoemprestimo = new JLabel("DataDoEmprestimo");
		lblDatadoemprestimo.setBounds(335, 89, 99, 14);
		contentPane.add(lblDatadoemprestimo);
		
		JLabel lblItens = new JLabel("Itens:");
		lblItens.setBounds(220, 139, 31, 14);
		contentPane.add(lblItens);
		
		JLabel lblDataDaDevoluo = new JLabel("Data da Devolu\u00E7\u00E3o:");
		lblDataDaDevoluo.setBounds(220, 114, 98, 14);
		contentPane.add(lblDataDaDevoluo);
		
		JLabel lblDatadadevolucao = new JLabel("DataDaDevolucao");
		lblDatadadevolucao.setBounds(328, 114, 86, 14);
		contentPane.add(lblDatadadevolucao);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(220, 164, 204, 20);
		contentPane.add(comboBox_1);
	}
}

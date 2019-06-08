package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class CadastroDevolucao extends JFrame {

	private JPanel contentPane;
	private static CadastroDevolucao instance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDevolucao frame = new CadastroDevolucao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static CadastroDevolucao getInstance() {
		if(instance == null) {
			instance = new CadastroDevolucao();
		}
		return instance;
	}

	/**
	 * Create the frame.
	 */
	private CadastroDevolucao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(335, 228, 89, 23);
		contentPane.add(btnOk);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 200, 20);
		contentPane.add(comboBox);
		
		JLabel lblSelecioneOEmprstimo = new JLabel("Selecione o empr\u00E9stimo a ser devolvido:");
		lblSelecioneOEmprstimo.setBounds(10, 11, 192, 14);
		contentPane.add(lblSelecioneOEmprstimo);
		
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
		
		JLabel lblDataDeEmprstimo = new JLabel("Data de empr\u00E9stimo:");
		lblDataDeEmprstimo.setBounds(220, 89, 100, 14);
		contentPane.add(lblDataDeEmprstimo);
		
		JLabel lblDatadeemprestimo = new JLabel("DataDeEmprestimo");
		lblDatadeemprestimo.setBounds(330, 89, 94, 14);
		contentPane.add(lblDatadeemprestimo);
		
		JLabel lblItens = new JLabel("Itens:");
		lblItens.setBounds(220, 114, 46, 14);
		contentPane.add(lblItens);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(220, 139, 204, 20);
		contentPane.add(comboBox_1);
	}

}

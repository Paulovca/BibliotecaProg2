package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class ConsultarRemoverDevolucao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRemoverDevolucao frame = new ConsultarRemoverDevolucao();
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
	public ConsultarRemoverDevolucao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDevoluesCadastradas = new JLabel("Devolu\u00E7\u00F5es cadastradas:");
		lblDevoluesCadastradas.setBounds(10, 11, 121, 14);
		contentPane.add(lblDevoluesCadastradas);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 200, 20);
		contentPane.add(comboBox);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 227, 89, 23);
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
		
		JLabel lblDataDoEmprstimo = new JLabel("Data do empr\u00E9stimo:");
		lblDataDoEmprstimo.setBounds(220, 89, 100, 14);
		contentPane.add(lblDataDoEmprstimo);
		
		JLabel lblDatadoemprestimo = new JLabel("DataDoEmprestimo");
		lblDatadoemprestimo.setBounds(335, 89, 99, 14);
		contentPane.add(lblDatadoemprestimo);
		
		JLabel lblDataDaDevoluo = new JLabel("Data da devolu\u00E7\u00E3o:");
		lblDataDaDevoluo.setBounds(220, 114, 95, 14);
		contentPane.add(lblDataDaDevoluo);
		
		JLabel lblDatadadevolucao = new JLabel("DataDaDevolucao");
		lblDatadadevolucao.setBounds(325, 114, 89, 14);
		contentPane.add(lblDatadadevolucao);
		
		JLabel lblMulta = new JLabel("Multa:");
		lblMulta.setBounds(220, 139, 31, 14);
		contentPane.add(lblMulta);
		
		JLabel lblValordamulta = new JLabel("ValorDaMulta");
		lblValordamulta.setBounds(261, 139, 63, 14);
		contentPane.add(lblValordamulta);
		
		JLabel lblItens = new JLabel("Itens:");
		lblItens.setBounds(220, 164, 31, 14);
		contentPane.add(lblItens);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(220, 189, 204, 20);
		contentPane.add(comboBox_1);
	}

}

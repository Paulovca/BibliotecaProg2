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

public class ConsultarRemoverDevolucao extends JFrame {

	private JPanel contentPane;
	private static ConsultarRemoverDevolucao instance;
	private JTextField textFieldCpfDoAluno;
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

	public static ConsultarRemoverDevolucao getInstance() {
		if(instance == null) {
			instance = new ConsultarRemoverDevolucao();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private ConsultarRemoverDevolucao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 396);
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
		btnVoltar.setBounds(10, 324, 89, 23);
		contentPane.add(btnVoltar);
		
		if (Biblioteca.flag == false) {
			JButton btnRemover = new JButton("Remover");
			btnRemover.setBounds(335, 324, 89, 23);
			contentPane.add(btnRemover);
		}
		
		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(10, 139, 31, 14);
		contentPane.add(lblAluno);
		
		JLabel lblCpfdoaluno = new JLabel("CpfDoAluno");
		lblCpfdoaluno.setBounds(51, 139, 57, 14);
		contentPane.add(lblCpfdoaluno);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio:");
		lblFuncionrio.setBounds(10, 164, 59, 14);
		contentPane.add(lblFuncionrio);
		
		JLabel lblNomedofuncionario = new JLabel("NomeDoFuncionario");
		lblNomedofuncionario.setBounds(79, 164, 95, 14);
		contentPane.add(lblNomedofuncionario);
		
		JLabel lblDataDoEmprstimo = new JLabel("Data do empr\u00E9stimo:");
		lblDataDoEmprstimo.setBounds(10, 192, 100, 14);
		contentPane.add(lblDataDoEmprstimo);
		
		JLabel lblDatadoemprestimo = new JLabel("DataDoEmprestimo");
		lblDatadoemprestimo.setBounds(120, 192, 99, 14);
		contentPane.add(lblDatadoemprestimo);
		
		JLabel lblDataDaDevoluo = new JLabel("Data da devolu\u00E7\u00E3o:");
		lblDataDaDevoluo.setBounds(10, 217, 95, 14);
		contentPane.add(lblDataDaDevoluo);
		
		JLabel lblDatadadevolucao = new JLabel("DataDaDevolucao");
		lblDatadadevolucao.setBounds(115, 217, 89, 14);
		contentPane.add(lblDatadadevolucao);
		
		JLabel lblMulta = new JLabel("Multa:");
		lblMulta.setBounds(10, 242, 31, 14);
		contentPane.add(lblMulta);
		
		JLabel lblValordamulta = new JLabel("ValorDaMulta");
		lblValordamulta.setBounds(51, 242, 63, 14);
		contentPane.add(lblValordamulta);
		
		JLabel lblItens = new JLabel("Itens:");
		lblItens.setBounds(10, 267, 31, 14);
		contentPane.add(lblItens);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 292, 204, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o cpf do aluno:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOCpf.setBounds(10, 11, 149, 14);
		contentPane.add(lblDigiteOCpf);
		
		textFieldCpfDoAluno = new JTextField();
		textFieldCpfDoAluno.setBounds(10, 36, 200, 20);
		contentPane.add(textFieldCpfDoAluno);
		textFieldCpfDoAluno.setColumns(10);
		
		JLabel lblDadosDaDevoluo = new JLabel("Dados da devolu\u00E7\u00E3o:");
		lblDadosDaDevoluo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDaDevoluo.setBounds(10, 114, 149, 14);
		contentPane.add(lblDadosDaDevoluo);
		
		JLabel lblDevoluesFeitas = new JLabel("Devolu\u00E7\u00F5es feitas:");
		lblDevoluesFeitas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDevoluesFeitas.setBounds(10, 64, 116, 14);
		contentPane.add(lblDevoluesFeitas);
		
		JComboBox comboBoxDevolucoes = new JComboBox();
		comboBoxDevolucoes.setBounds(10, 86, 200, 20);
		contentPane.add(comboBoxDevolucoes);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(220, 35, 89, 23);
		contentPane.add(btnConsultar);
	}
}

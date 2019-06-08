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
import javax.swing.JTextField;
import java.awt.Font;

public class CadastroDevolucao extends JFrame {

	private JPanel contentPane;
	private static CadastroDevolucao instance;
	private JTextField textField;

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
		setTitle("Cadastro Devolução");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 267, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(335, 267, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio:");
		lblFuncionrio.setBounds(10, 142, 59, 14);
		contentPane.add(lblFuncionrio);
		
		JLabel lblNomedofuncionario = new JLabel("NomeDoFuncionario");
		lblNomedofuncionario.setBounds(79, 142, 95, 14);
		contentPane.add(lblNomedofuncionario);
		
		JLabel lblDataDeEmprstimo = new JLabel("Data de empr\u00E9stimo:");
		lblDataDeEmprstimo.setBounds(10, 167, 100, 14);
		contentPane.add(lblDataDeEmprstimo);
		
		JLabel lblDatadeemprestimo = new JLabel("DataDeEmprestimo");
		lblDatadeemprestimo.setBounds(120, 167, 94, 14);
		contentPane.add(lblDatadeemprestimo);
		
		JLabel lblItensDevolvidos = new JLabel("Itens devolvidos:");
		lblItensDevolvidos.setBounds(10, 192, 83, 14);
		contentPane.add(lblItensDevolvidos);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 217, 204, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblCpfDoAluno = new JLabel("Cpf do Aluno:");
		lblCpfDoAluno.setBounds(10, 39, 66, 14);
		contentPane.add(lblCpfDoAluno);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o Cpf do aluno para pesquisar empr\u00E9stimos:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOCpf.setBounds(10, 11, 292, 14);
		contentPane.add(lblDigiteOCpf);
		
		textField = new JTextField();
		textField.setBounds(86, 36, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(263, 35, 89, 23);
		contentPane.add(btnPesquisar);
		
		JLabel lblEmprstimos = new JLabel("Empr\u00E9stimos:");
		lblEmprstimos.setBounds(10, 64, 66, 14);
		contentPane.add(lblEmprstimos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(86, 61, 167, 20);
		contentPane.add(comboBox);
		
		JLabel lblDadosDoEmprstimo = new JLabel("Dados do empr\u00E9stimo:");
		lblDadosDoEmprstimo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoEmprstimo.setBounds(10, 114, 137, 14);
		contentPane.add(lblDadosDoEmprstimo);
		
		JLabel lblMulta = new JLabel("Multa:");
		lblMulta.setBounds(263, 142, 30, 14);
		contentPane.add(lblMulta);
		
		JLabel lblValordamulta = new JLabel("ValorDaMulta");
		lblValordamulta.setBounds(303, 142, 66, 14);
		contentPane.add(lblValordamulta);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(125, 188, 89, 23);
		contentPane.add(btnAdicionar);
	}

}

package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BancoJFrame.AcaoSelecaoCombo;
import negocio.Fachada;
import negocio.entidades.Emprestimo;
import negocio.entidades.Livro;
import negocio.exception.aluno.AlunoNaoEncontradoException;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroDevolucao extends JFrame {

	private JPanel contentPane;
	private static CadastroDevolucao instance;
	private JTextField textFieldCpfDoAluno;
	private JComboBox<Emprestimo> comboBoxEmprestimos;
	private JLabel lblEmprstimo;
	private DefaultComboBoxModel<Emprestimo> comboBoxModel ;
	private JLabel lblDadosemprestimo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDevolucao frame = CadastroDevolucao.getInstance();
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
		
		AcaoSelecaoCombo acaoSelecao = new AcaoSelecaoCombo();
		
		comboBoxModel = new DefaultComboBoxModel<Emprestimo>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBoxEmprestimos = new JComboBox();
		comboBoxEmprestimos.setBounds(86, 61, 239, 20);
		contentPane.add(comboBoxEmprestimos);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				instance = null;
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 267, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOk.setBounds(335, 267, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio:");
		lblFuncionrio.setBounds(10, 142, 68, 14);
		contentPane.add(lblFuncionrio);
		
		lblEmprstimo = new JLabel("Empr\u00E9stimo:");
		lblEmprstimo.setBounds(10, 167, 110, 14);
		contentPane.add(lblEmprstimo);
		
		JLabel lblItensDevolvidos = new JLabel("Itens devolvidos:");
		lblItensDevolvidos.setBounds(239, 142, 110, 14);
		contentPane.add(lblItensDevolvidos);
		
		JComboBox comboBoxItens = new JComboBox();
		comboBoxItens.setBounds(239, 167, 185, 20);
		contentPane.add(comboBoxItens);
		
		JLabel lblCpfDoAluno = new JLabel("Cpf do Aluno:");
		lblCpfDoAluno.setBounds(10, 39, 76, 14);
		contentPane.add(lblCpfDoAluno);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o Cpf do aluno para pesquisar empr\u00E9stimos:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOCpf.setBounds(10, 11, 342, 14);
		contentPane.add(lblDigiteOCpf);
		
		textFieldCpfDoAluno = new JTextField();
		textFieldCpfDoAluno.setBounds(86, 36, 239, 20);
		contentPane.add(textFieldCpfDoAluno);
		textFieldCpfDoAluno.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					carregarComboBox(Fachada.getInstance().consultar(textFieldCpfDoAluno.getText()).getCpf());
					
				} catch (AlunoNaoEncontradoException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		btnConsultar.setBounds(335, 35, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblEmprstimos = new JLabel("Empr\u00E9stimos:");
		lblEmprstimos.setBounds(10, 64, 76, 14);
		contentPane.add(lblEmprstimos);
		
		JLabel lblDadosDoEmprstimo = new JLabel("Dados do empr\u00E9stimo:");
		lblDadosDoEmprstimo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoEmprstimo.setBounds(10, 114, 164, 14);
		contentPane.add(lblDadosDoEmprstimo);
		
		lblDadosemprestimo = new JLabel("DadosEmprestimo");
		lblDadosemprestimo.setBounds(75, 139, 154, 20);
		contentPane.add(lblDadosemprestimo);
		
		//quando o combobox está selecionado---------------------------------------------------------------
		comboBoxEmprestimos.addActionListener(acaoSelecao);
	}
	
	private void carregarComboBox(String cpf){
		ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
		emprestimos = Fachada.getInstance().procurarEmprestimos(cpf);
		for(Emprestimo emp : emprestimos){
			comboBoxModel.addElement(emp);
		}
		comboBoxEmprestimos.setModel(comboBoxModel);
	}
	
	private class AcaoSelecaoCombo implements ActionListener{ //SLIDE 42 // Definir handlers
		@Override
		public void actionPerformed(ActionEvent e) {
			lblDadosemprestimo.setText(comboBoxEmprestimos.getSelectedItem().);
		}
		
	}
}

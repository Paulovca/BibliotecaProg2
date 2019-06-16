package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import negocio.Fachada;
import negocio.entidades.Devolucao;
import negocio.entidades.Emprestimo;
import negocio.entidades.Item;
import negocio.entidades.Livro;
import negocio.exception.aluno.AlunoNaoEncontradoException;
import negocio.exception.devolucao.DevolucaoJaExisteException;
import negocio.exception.devolucao.DevolucaoNulaException;
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
import javax.swing.JTextPane;

public class CadastroDevolucao extends JFrame {

	private JPanel contentPane;
	private static CadastroDevolucao instance;
	private JTextField textFieldCpfDoAluno;
	private JComboBox<Emprestimo> comboBoxEmprestimos;
	private JLabel lblNomeDoFuncionario;
	private JList list;
	private JLabel lblDatadoemprestimo;
	private JComboBox<Item> comboBoxItens;
	private JLabel lblValordamulta;
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
		setTitle("Cadastro Devolu��o");
		
		AcaoSelecaoCombo acaoSelecao = new AcaoSelecaoCombo();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBoxEmprestimos = new JComboBox<Emprestimo>();
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
				Devolucao devolucao = new Devolucao(((Emprestimo)comboBoxEmprestimos.getSelectedItem()).getAluno(),((Emprestimo)comboBoxEmprestimos.getSelectedItem()).getItens(),Login.funcionarioAtivo);
				try {
					Fachada.getInstance().cadastrar(devolucao);
					JOptionPane.showMessageDialog(null, "Devolu��o cadatrada!");
					dispose();
					instance = null;
					Biblioteca.getInstance().setVisible(true);
				} catch (DevolucaoJaExisteException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				} catch (DevolucaoNulaException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		btnOk.setBounds(335, 267, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio:");
		lblFuncionrio.setBounds(10, 142, 68, 14);
		contentPane.add(lblFuncionrio);
		
		JLabel lblEmprstimo = new JLabel("Empr\u00E9stimo:");
		lblEmprstimo.setBounds(10, 167, 99, 14);
		contentPane.add(lblEmprstimo);
		
		JLabel lblItensDevolvidos = new JLabel("Itens devolvidos:");
		lblItensDevolvidos.setBounds(228, 142, 110, 14);
		contentPane.add(lblItensDevolvidos);
		
		comboBoxItens = new JComboBox<Item>();
		comboBoxItens.setBounds(228, 164, 195, 20);
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
		
		lblNomeDoFuncionario = new JLabel("NomeDoFuncionario");
		lblNomeDoFuncionario.setBounds(75, 139, 143, 20);
		contentPane.add(lblNomeDoFuncionario);
		
		lblDatadoemprestimo = new JLabel("DataDoEmprestimo");
		lblDatadoemprestimo.setBounds(75, 167, 143, 14);
		contentPane.add(lblDatadoemprestimo);
		
		JLabel lblMulta = new JLabel("Multa:");
		lblMulta.setBounds(10, 192, 46, 14);
		contentPane.add(lblMulta);
		
		lblValordamulta = new JLabel("ValorDaMulta");
		lblValordamulta.setBounds(53, 192, 165, 14);
		contentPane.add(lblValordamulta);
		
		//quando o emprestimo no combobox for selecionado----------------------------------------------------
		comboBoxEmprestimos.addActionListener(acaoSelecao);
	}
	
	private void carregarComboBox(String cpf){
		ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
		emprestimos = Fachada.getInstance().procurarEmprestimos(cpf);
		for(Emprestimo emp : emprestimos){
			comboBoxEmprestimos.addItem(emp);
		}
		
	}
	
	private class AcaoSelecaoCombo implements ActionListener{ 
		@Override
		public void actionPerformed(ActionEvent e) {
			lblNomeDoFuncionario.setText(((Emprestimo)comboBoxEmprestimos.getSelectedItem()).getFuncionario().getNome());
			lblDatadoemprestimo.setText(((Emprestimo)comboBoxEmprestimos.getSelectedItem()).getDataEmpretimo().toString());
			Item[] itens = ((Emprestimo)comboBoxEmprestimos.getSelectedItem()).getItens();
			for(Item itm : itens) {
				comboBoxItens.addItem(itm);
			}
			Devolucao devolucao = new Devolucao(((Emprestimo)comboBoxEmprestimos.getSelectedItem()).getAluno(),((Emprestimo)comboBoxEmprestimos.getSelectedItem()).getItens(),Login.funcionarioAtivo);
			lblValordamulta.setText(String.valueOf(Fachada.getInstance().devolver(((Emprestimo)comboBoxEmprestimos.getSelectedItem()), devolucao)));
		}
		
	}
}

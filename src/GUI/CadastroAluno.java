package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import negocio.Fachada;
import negocio.entidades.Aluno;
import negocio.exception.aluno.AlunoNuloException;
import negocio.exception.aluno.CpfJaExisteException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class CadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCpf;
	private static CadastroAluno instance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static CadastroAluno getInstance() {
		if(instance == null) {
			instance = new CadastroAluno();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private CadastroAluno() {
		setTitle("Cadastrar Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(148, 104, 46, 14);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(185, 100, 100, 26);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setForeground(new Color(255, 255, 255));
		lblCpf.setBounds(148, 132, 46, 14);
		contentPane.add(lblCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(185, 129, 100, 26);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Aluno aluno = new Aluno(textFieldNome.getText(),textFieldCpf.getText());
				try {
					Fachada.getInstance().cadastrar(aluno);
					dispose();
					Biblioteca.getInstance().setVisible(true);
				} catch (CpfJaExisteException e) {
					//System.out.println("Oi");
//					e.printStackTrace();
					System.out.println(e.getMessage());
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (AlunoNuloException e) {
					//System.out.println("Ola");
					e.getMessage();
				}
			}
		});
		btnCadastrar.setBounds(335, 228, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Pictures\\Livros.jpg"));
		lblNewLabel.setBounds(0, 0, 453, 262);
		contentPane.add(lblNewLabel);
	}

}

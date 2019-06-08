package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class CadastroLivro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldEstoque;
	private static CadastroLivro instance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLivro frame = new CadastroLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static CadastroLivro getInstance() {
		if(instance == null) {
			instance = new CadastroLivro();
		}
		return instance;
	}

	/**
	 * Create the frame.
	 */
	private CadastroLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(124, 94, 30, 14);
		contentPane.add(lblTtulo);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(174, 91, 124, 20);
		contentPane.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(124, 119, 31, 14);
		contentPane.add(lblAutor);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setBounds(174, 116, 124, 20);
		contentPane.add(textFieldAutor);
		textFieldAutor.setColumns(10);
		
		JLabel lblEstoque = new JLabel("Estoque:");
		lblEstoque.setBounds(124, 144, 46, 14);
		contentPane.add(lblEstoque);
		
		textFieldEstoque = new JTextField();
		textFieldEstoque.setBounds(174, 141, 124, 20);
		contentPane.add(textFieldEstoque);
		textFieldEstoque.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 228, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblDigiteOTtulo = new JLabel("Digite o t\u00EDtulo, autor e a quantidade em estoque para cadastrar o livro:");
		lblDigiteOTtulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOTtulo.setBounds(10, 30, 403, 14);
		contentPane.add(lblDigiteOTtulo);
	}
}

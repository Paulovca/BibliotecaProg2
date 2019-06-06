package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		lblTtulo.setBounds(144, 113, 46, 14);
		contentPane.add(lblTtulo);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(190, 110, 86, 20);
		contentPane.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(144, 141, 46, 14);
		contentPane.add(lblAutor);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setBounds(190, 138, 86, 20);
		contentPane.add(textFieldAutor);
		textFieldAutor.setColumns(10);
		
		JLabel lblEstoque = new JLabel("Estoque:");
		lblEstoque.setBounds(144, 169, 46, 14);
		contentPane.add(lblEstoque);
		
		textFieldEstoque = new JTextField();
		textFieldEstoque.setBounds(190, 166, 86, 20);
		contentPane.add(textFieldEstoque);
		textFieldEstoque.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 228, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
	}

}

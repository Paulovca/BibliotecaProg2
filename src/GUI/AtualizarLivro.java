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
import javax.swing.JTextField;
import java.awt.Font;

public class AtualizarLivro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private static AtualizarLivro instance;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarLivro frame = new AtualizarLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static AtualizarLivro getInstance() {
		if(instance == null) {
			instance = new AtualizarLivro();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private AtualizarLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(10, 92, 30, 14);
		contentPane.add(lblTtulo);
		
		JLabel lblTitulodolivro = new JLabel("TituloDoLivro");
		lblTitulodolivro.setBounds(50, 92, 62, 14);
		contentPane.add(lblTitulodolivro);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(10, 117, 31, 14);
		contentPane.add(lblAutor);
		
		JLabel lblAutordolivro = new JLabel("AutorDoLivro");
		lblAutordolivro.setBounds(49, 117, 63, 14);
		contentPane.add(lblAutordolivro);
		
		JLabel lblEstoque = new JLabel("Estoque:");
		lblEstoque.setBounds(10, 142, 43, 14);
		contentPane.add(lblEstoque);
		
		JLabel lblEstoquedelivros = new JLabel("EstoqueDeLivros");
		lblEstoquedelivros.setBounds(59, 142, 80, 14);
		contentPane.add(lblEstoquedelivros);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(335, 227, 89, 23);
		contentPane.add(btnAtualizar);
		
		JLabel lblTtulo_1 = new JLabel("T\u00EDtulo:");
		lblTtulo_1.setBounds(220, 92, 30, 14);
		contentPane.add(lblTtulo_1);
		
		textField = new JTextField();
		textField.setBounds(270, 89, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAutor_1 = new JLabel("Autor:");
		lblAutor_1.setBounds(220, 117, 31, 14);
		contentPane.add(lblAutor_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(270, 114, 154, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEstoque_1 = new JLabel("Estoque:");
		lblEstoque_1.setBounds(220, 142, 43, 14);
		contentPane.add(lblEstoque_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(270, 139, 154, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDigiteOId = new JLabel("Digite o Id do livro:");
		lblDigiteOId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOId.setBounds(10, 11, 133, 14);
		contentPane.add(lblDigiteOId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 36, 201, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDadosAntigos = new JLabel("Dados antigos:");
		lblDadosAntigos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosAntigos.setBounds(10, 67, 102, 14);
		contentPane.add(lblDadosAntigos);
		
		JLabel lblDadosAtualizados = new JLabel("Dados atualizados:");
		lblDadosAtualizados.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosAtualizados.setBounds(220, 67, 145, 14);
		contentPane.add(lblDadosAtualizados);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(220, 35, 89, 23);
		contentPane.add(btnConsultar);
	}

}

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
import java.awt.Font;
import javax.swing.JTextField;

public class ConsultarRemoverLivro extends JFrame {

	private JPanel contentPane;
	private static ConsultarRemoverLivro instance;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRemoverLivro frame = new ConsultarRemoverLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static ConsultarRemoverLivro getInstance() {
		if(instance == null) {
			instance = new ConsultarRemoverLivro();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private ConsultarRemoverLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(335, 227, 89, 23);
		contentPane.add(btnRemover);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(10, 89, 30, 14);
		contentPane.add(lblTtulo);
		
		JLabel lblTtulodolivro = new JLabel("T\u00EDtuloDoLivro");
		lblTtulodolivro.setBounds(50, 89, 62, 14);
		contentPane.add(lblTtulodolivro);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(10, 114, 31, 14);
		contentPane.add(lblAutor);
		
		JLabel lblAutordolivro = new JLabel("AutorDoLivro");
		lblAutordolivro.setBounds(50, 114, 63, 14);
		contentPane.add(lblAutordolivro);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 137, 63, 14);
		contentPane.add(lblQuantidade);
		
		JLabel lblQuantidadedelivros = new JLabel("QuantidadeDeLivros");
		lblQuantidadedelivros.setBounds(83, 137, 97, 14);
		contentPane.add(lblQuantidadedelivros);
		
		JLabel lblDigiteOId = new JLabel("Digite o Id do livro:");
		lblDigiteOId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOId.setBounds(10, 11, 159, 14);
		contentPane.add(lblDigiteOId);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDadosDoLivro = new JLabel("Dados do livro:");
		lblDadosDoLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoLivro.setBounds(10, 64, 108, 14);
		contentPane.add(lblDadosDoLivro);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(220, 35, 89, 23);
		contentPane.add(btnConsultar);
	}

}

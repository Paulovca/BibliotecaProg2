package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.Fachada;
import negocio.entidades.Funcionario;
import negocio.exception.aluno.CpfJaExisteException;
import negocio.exception.funcionario.FuncionarioNaoEncontradoException;
import negocio.exception.funcionario.FuncionarioNuloException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Window.Type;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpf;
	private JTextField textFieldSenha;
	private static Login instance;
	
	static Funcionario funcionarioAtivo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	        	System.err.println(ex);
	        } catch (InstantiationException ex) {
	        	System.err.println(ex);
	        } catch (IllegalAccessException ex) {
	        	System.err.println(ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        	System.err.println(ex);
	        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = Login.getInstance();
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
	public static Login getInstance() {
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		Funcionario god = new Funcionario("One for all","12345678910","123");
//		try {
//			Fachada.getInstance().cadastrar(god);
//		} catch (CpfJaExisteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (FuncionarioNuloException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(instance == null) {
			instance = new Login();
		}
		return instance;
	}
	
	private Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Login");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(126, 146, 46, 14);
		contentPane.add(lblCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(170, 143, 100, 26);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Senha:");
		lblNewLabel.setBounds(126, 180, 46, 14);
		contentPane.add(lblNewLabel);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(170, 177, 100, 26);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
							Fachada.getInstance().consultarFuncionario(textFieldCpf.getText());
							funcionarioAtivo = new Funcionario(Fachada.getInstance().consultarFuncionario(textFieldCpf.getText()).getNome(), Fachada.getInstance().consultarFuncionario(textFieldCpf.getText()).getCpf(), Fachada.getInstance().consultarFuncionario(textFieldCpf.getText()).getSenha());
							setVisible(false);
							Biblioteca.getInstance().setVisible(true);
					} catch (FuncionarioNaoEncontradoException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					} 
			}
			
		});
		btnEntrar.setBounds(311, 211, 93, 26);
		contentPane.add(btnEntrar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Pictures\\Biblioteca.png"));
		lblNewLabel_1.setBounds(70, -38, 340, 236);
		contentPane.add(lblNewLabel_1);
		
		
		
	}
}

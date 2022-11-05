package software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton entrar = new JButton("Entrar");
		entrar.setBounds(152, 210, 89, 23);
		contentPane.add(entrar);
		
		JButton sair = new JButton("Sair");
		sair.setBounds(53, 210, 89, 23);
		contentPane.add(sair);
		
		usuario = new JTextField();
		usuario.setColumns(10);
		usuario.setBounds(53, 101, 190, 20);
		contentPane.add(usuario);
		
		JLabel label_usuario = new JLabel("Usuário");
		label_usuario.setBounds(53, 76, 46, 14);
		contentPane.add(label_usuario);
		
		senha = new JPasswordField();
		senha.setBounds(53, 150, 188, 20);
		contentPane.add(senha);
		
		JLabel label_senha = new JLabel("Senha");
		label_senha.setBounds(53, 132, 46, 14);
		contentPane.add(label_senha);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(53, 33, 188, 14);
		contentPane.add(lblNewLabel_1);
	}
}

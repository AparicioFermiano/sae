package software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
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
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlunos = new JButton("Alunos");
		btnAlunos.setBounds(10, 11, 89, 23);
		contentPane.add(btnAlunos);
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turmas telaTurmas = new turmas();
				telaTurmas.setVisible(true);
			}
		});
		btnTurmas.setBounds(109, 11, 89, 23);
		contentPane.add(btnTurmas);
		
		JButton btnGerenciar = new JButton("Gerenciar");
		btnGerenciar.setBounds(208, 11, 89, 23);
		contentPane.add(btnGerenciar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(485, 327, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(485, 11, 89, 23);
		contentPane.add(btnPerfil);
		
		JButton btnGerar = new JButton("Gerar Resultado");
		btnGerar.setBounds(10, 327, 116, 23);
		contentPane.add(btnGerar);
	}
}

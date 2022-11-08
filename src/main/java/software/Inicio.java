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

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlunos = new JButton("Alunos");
		btnAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Alunos telaAlunos = new Alunos();
					telaAlunos.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAlunos.setBounds(10, 11, 89, 23);
		contentPane.add(btnAlunos);
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turmas telaTurmas = new Turmas();
				telaTurmas.setVisible(true);
			}
		});
		btnTurmas.setBounds(109, 11, 89, 23);
		contentPane.add(btnTurmas);
		
		JButton btnGerenciar = new JButton("Gerenciar");
		btnGerenciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gestor telaGestor = new Gestor();
					telaGestor.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnGerenciar.setBounds(208, 11, 116, 23);
		contentPane.add(btnGerenciar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "Deseja realmente sair?";
				try {
					//2 parametros: msg e tipo do confirm
					Confirm telaConfirm = new Confirm(msg, 2);
					telaConfirm.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnSair.setBounds(485, 327, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Perfil telaPerfil = new Perfil();
					telaPerfil.setVisible(true);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		btnPerfil.setBounds(485, 11, 89, 23);
		contentPane.add(btnPerfil);
		
		JButton btnGerar = new JButton("Gerar Resultado");
		btnGerar.setBounds(10, 327, 188, 23);
		contentPane.add(btnGerar);
	}
}

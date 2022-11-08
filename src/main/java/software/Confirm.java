package software;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Confirm extends JDialog {

	/**
	 Classe para caixa de confirmacao
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	public static void main(String[] args) {
		try {
			Confirm dialog = new Confirm("Deseja continuar", 3);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Confirm(String msg, Integer tipo) {
		this.setBounds(100, 100, 250, 170);
		BufferedImage logo = null;
		String iconConfirm = null;
		String title = null;
		String btn_next = "Sim";
		String btn_prev = "Cancelar";
		switch(tipo) {
			// Acerto
			case 1:
				iconConfirm = "C:\\workspace\\sae\\src\\main\\java\\image\\sucess.png";
				title = "Sucesso";
				break;
			// Informacao
			case 2:
				iconConfirm = "C:\\workspace\\sae\\src\\main\\java\\image\\atencao.png";
				title = "Atenção";
				break;
			
			case 3:
				iconConfirm = "C:\\workspace\\sae\\src\\main\\java\\image\\error.png";
				title = "Erro";
				
				break;
		}
		try {
			logo = ImageIO.read(new File(iconConfirm));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setTitle(title);
		this.setIconImage(logo);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel MsgConfirm = new JLabel(msg);
		MsgConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		MsgConfirm.setFont(new Font("Arial", Font.PLAIN, 14));
		MsgConfirm.setBounds(68, 11, 146, 76);
		contentPanel.add(MsgConfirm);
		
		//Imagem da mensagem
		JLabel IconImage = new JLabel("");
		//Verifica se existe a imagem
		BufferedImage icon = null;
		try {
			icon = ImageIO.read(new File(iconConfirm));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//O tamanho da imagem é baseado no tamanho da label
        IconImage.setBounds(25, 30, 35, 35);
		IconImage.setIcon(new ImageIcon(icon.getScaledInstance(IconImage.getWidth(), IconImage.getHeight(), Image.SCALE_DEFAULT)));
		contentPanel.add(IconImage);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Sim");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand(btn_next);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton(btn_prev);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

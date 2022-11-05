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

public class Confirm extends JDialog {

	/**
	 Classe para caixa de confirmacao
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	public static void main(String[] args) {
		try {
			Confirm dialog = new Confirm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Confirm() {
		this.setBounds(100, 100, 250, 170);
		BufferedImage logo = null;
		try {
			logo = ImageIO.read(new File("C:\\workspace\\sae\\src\\main\\java\\image\\atencao.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setTitle("Atenção");
		this.setIconImage(logo);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel MsgConfirm = new JLabel("Deseja realmente sair?");
		MsgConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		MsgConfirm.setFont(new Font("Arial", Font.PLAIN, 14));
		MsgConfirm.setBounds(68, 11, 146, 76);
		contentPanel.add(MsgConfirm);
		
		//Imagem da mensagem
		JLabel IconImage = new JLabel("");
		//Verifica se existe a imagem
		BufferedImage icon = null;
		try {
			icon = ImageIO.read(new File("C:\\workspace\\sae\\src\\main\\java\\image\\atencao.png"));
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
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

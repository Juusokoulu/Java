package GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Versiotiedot {

	public static void main(String[] args) {
		

	}
	
	boolean b = true;
	public void setVisible(boolean b) {
		JFrame ikkuna = new JFrame();
		ikkuna.getContentPane().setBackground(Color.WHITE);
		ikkuna.setBackground(new Color(240, 240, 240));
		ikkuna.setTitle("Juoma-automaatti v. 1.0");
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.getContentPane().setLayout(null);
		ikkuna.setSize(400,400);
		ikkuna.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JUOMA-AUTOMAATIN VERSIO 1.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(90, 62, 208, 48);
		ikkuna.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel2 = new JLabel("Juuso Leino");
		lblNewLabel2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel2.setBounds(90, 40, 150, 30);
		ikkuna.getContentPane().add(lblNewLabel2);
		ikkuna.setVisible(true);
	}
	
	
	
	
}

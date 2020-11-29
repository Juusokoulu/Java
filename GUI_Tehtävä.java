package GUI;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class GUI_Teht‰v‰ {

	public static void main(String[] args) {
		//Luodaan ikkuna ja layout
		JFrame ikkuna = new JFrame();
		ikkuna.setTitle("Celsius Converter");
		GridLayout sijoittelija = new GridLayout(2,2);
		ikkuna.setLayout(sijoittelija);
		
		//luodaan nappi ja kent‰t
		JLabel l1 = new JLabel("Celsius");
		JTextField aste = new JTextField();
		JButton b1 = new JButton("Convert");
		JLabel l2 = new JLabel("Fahrenheit");
		
		//lis‰t‰‰n ne ikkunaan
		ikkuna.add(l1);
		ikkuna.add(aste);
		ikkuna.add(b1);
		ikkuna.add(l2);
		
		
		//
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.pack();
		ikkuna.setVisible(true);
		
		//lis‰t‰‰n toimintoja
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
				double tulos = Integer.parseInt(aste.getText());
				tulos = tulos * 1.8 + 32;	
				l2.setText(String.valueOf("Fahrenheit: " +tulos));
				} catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, kirjoita numeroina!","Alert",JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});
		
	}

}

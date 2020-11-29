package GUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.io.Serializable;
import java.util.Scanner;

public class juoma_Automaatti implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	static juoma_Automaatti ekaJuoma = new juoma_Automaatti();
	
	
	private static JTextField txtKahvisi;
	private static JTextField txtTeesi;
	private static JTextField txtKaakaosi;
	
	public static int tee;
	public static int kahvi;
	public static int kaakao;
	
	//alustetaan
	public juoma_Automaatti () {
		tee = 0;
		kahvi= 0;
		kaakao = 0;
	}
	
	
	
	//getterit ja setterit
	public int setTee(int uusi) {
		return tee = uusi;
	}
	
	public int setKahvi(int uusi) {
		return kahvi = uusi;
	}
	
	public int setKaakao(int uusi) {
		return kaakao = uusi;
	}
	
	public int getTee() {
		return tee;
	}
	
	public int getKahvi() {
		return kahvi;
	}
	
	public int getKaakao() {
		return kaakao;
	}
	
	
	
	//Metodit
	
	JFrame ikkuna = new JFrame();
	public static void valmistaKahvi() {
		if (kahvi <= 0) {
			JFrame ikkuna = new JFrame();
			JOptionPane.showMessageDialog(ikkuna,"Kahvia ei ole enää jäljellä. Täytä säiliö!","Alert",JOptionPane.WARNING_MESSAGE);	
		} else {
		kahvi = kahvi -10;
		}
	}
	
	public static void valmistaTee() {
		if (tee <= 0) {
			JFrame ikkuna = new JFrame();
			JOptionPane.showMessageDialog(ikkuna,"Teetä ei ole enää jäljellä. Täytä säiliö!","Alert",JOptionPane.WARNING_MESSAGE);
		} else {
		tee =  tee -10;
		}
	}
	
	public static void valmistaKaakao() {
		if (kaakao <= 0) {
			JFrame ikkuna = new JFrame();
			JOptionPane.showMessageDialog(ikkuna,"Kaakaota ei ole enää jäljellä. Täytä säiliö!","Alert",JOptionPane.WARNING_MESSAGE);
		} else {
		kaakao =  kaakao -10;
		}
	}
	
	

	public static void main(String[] args) {
		JFrame ikkuna = new JFrame();
		ikkuna.setBackground(new Color(240, 240, 240));
		ikkuna.setTitle("Juoma-automaatti");
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.getContentPane().setLayout(null);
		
		
		//Napit ja kuvat niihin
		JButton btnNewButton = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\juuso\\Documents\\Java objekti\\Kahvi_1.png")).getImage()).getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
		btnNewButton.setBounds(10, 21, 89, 59);
		ikkuna.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\juuso\\Documents\\Java objekti\\Tee_1.jpg")).getImage()).getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_1.setBounds(10, 106, 89, 59);
		ikkuna.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(new ImageIcon(((new ImageIcon("C:\\Users\\juuso\\Documents\\Java objekti\\Kaakao_1.jpg")).getImage()).getScaledInstance(120, 70, java.awt.Image.SCALE_SMOOTH)));
		btnNewButton_2.setBounds(10, 189, 89, 59);
		ikkuna.getContentPane().add(btnNewButton_2);
		
		//tekstit nappien alle
		JTextArea txtrKahvi = new JTextArea();
		txtrKahvi.setText("Kahvi");
		txtrKahvi.setBounds(31, 77, 45, 22);
		txtrKahvi.setBackground(new Color(240, 240, 240));
		ikkuna.getContentPane().add(txtrKahvi);
		
		JTextArea txtrTee = new JTextArea();
		txtrTee.setText("tee");
		txtrTee.setBounds(38, 164, 38, 22);
		txtrTee.setBackground(new Color(240, 240, 240));
		ikkuna.getContentPane().add(txtrTee);
		
		JTextArea txtrKaakao = new JTextArea();
		txtrKaakao.setText("Kaakao");
		txtrKaakao.setBounds(31, 248, 53, 22);
		txtrKaakao.setBackground(new Color(240, 240, 240));
		ikkuna.getContentPane().add(txtrKaakao);
		
		txtKahvisi = new JTextField();
		txtKahvisi.setBounds(130, 45, 108, 22);
		ikkuna.getContentPane().add(txtKahvisi);
		txtKahvisi.setText("Kahvi: " + kahvi);
		txtKahvisi.setColumns(10);
		
		txtTeesi = new JTextField();
		txtTeesi.setBounds(130, 124, 108, 22);
		ikkuna.getContentPane().add(txtTeesi);
		txtTeesi.setText("Tee: " + tee);
		txtTeesi.setColumns(10);
		
		txtKaakaosi = new JTextField();
		txtKaakaosi.setBounds(130, 206, 108, 22);
		ikkuna.getContentPane().add(txtKaakaosi);
		txtKaakaosi.setText("Kaakao: " + kaakao);
		txtKaakaosi.setColumns(10);
		
		//Lisätään menu
		
		JMenu menu;
		JMenu menu2;
		
		JMenuItem m1, m2, m3, m4, m5, m6, m7, m8;
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Ylläpito");
		menu2 = new JMenu("Tietoja ohjelmasta");
		
		m1 = new JMenuItem("Aseta kahvin arvo");
		m2 = new JMenuItem("Aseta teen arvo");
		m3 = new JMenuItem("Aseta kaakaon arvo");
		m4 = new JMenuItem("Tallenna automaatin tila");
		m5 = new JMenuItem("Versiotiedot"); //toinen nappi
		m6 = new JMenuItem("Tekijä"); //toinen nappi
		//myöhänen tallennus ja lataa menu 
		m7 = new JMenuItem("Lataa automaatin tila");
		m8 = new JMenuItem("Lopeta");
		
		menu2.add(m5);
		menu2.add(m6);
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
		menu.add(m4);
		menu.add(m7);
		menu.add(m8);
		mb.add(menu);
		mb.add(menu2);
		ikkuna.setJMenuBar(mb);
		ikkuna.setSize(400,400);
		ikkuna.setLayout(null);
		ikkuna.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		//lisätään toimintoja
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					valmistaKahvi();
					ekaJuoma.getKahvi();
					txtKahvisi.setText("Kahvi: " + kahvi);
				
			} catch(Exception ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, kirjoita numeroina!","Alert",JOptionPane.WARNING_MESSAGE);
				 }
					
				
			}

		});
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					valmistaTee();
					ekaJuoma.getTee();
					txtTeesi.setText("Tee: " + tee);
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, kirjoita numeroina!","Alert",JOptionPane.WARNING_MESSAGE);
				 }
				
				
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					valmistaKaakao();
					ekaJuoma.getKaakao();
					txtKaakaosi.setText("Kaakao: " + kaakao);
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, kirjoita numeroina!","Alert",JOptionPane.WARNING_MESSAGE);
				 }
				
				
			}
		});
		
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					
					String uusiArvo = JOptionPane.showInputDialog(null, "Aseta kahvin uusi arvo: ");
					int uusiKahvi = Integer.parseInt(uusiArvo);
					uusiKahvi = ekaJuoma.setKahvi(uusiKahvi);
					
					btnNewButton.setText(String.valueOf(uusiArvo));  
					txtKahvisi.setText("Kahvi: " + kahvi);
					
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, kirjoita numeroina!","Alert",JOptionPane.WARNING_MESSAGE);
				 }
				
				
			}
		});
		
		
		
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					String uusiArvo1 = JOptionPane.showInputDialog(null, "Aseta teen uusi arvo: ");
					int uusiTee = Integer.parseInt(uusiArvo1);
					uusiTee = ekaJuoma.setTee(uusiTee);
					
					btnNewButton_1.setText(String.valueOf(uusiArvo1));
					txtTeesi.setText("Tee: " + tee);
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, kirjoita numeroina!","Alert",JOptionPane.WARNING_MESSAGE);
				 }
				
				
			}
		});
		
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					String uusiArvo2 = JOptionPane.showInputDialog(null, "Aseta kaakaon uusi arvo: ");
					int uusiKaakao = Integer.parseInt(uusiArvo2);
					uusiKaakao = ekaJuoma.setKaakao(uusiKaakao);
					
					btnNewButton_2.setText(String.valueOf(uusiArvo2));
					txtKaakaosi.setText("Kaakao: " + kaakao);
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, kirjoita numeroina!","Alert",JOptionPane.WARNING_MESSAGE);
				 }
				
				
			}
		});
		//exit
		m8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					System.exit(0);
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, jokin meni vikaan!","Alert",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		//ladataan versiotiedot
		m5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Versiotiedot ikkuna = new Versiotiedot();
					ikkuna.setVisible(true);
						
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(ikkuna,"Virhe, jokin meni vikaan!","Alert",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		//tallennus metodi
		m4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					PrintWriter writer = new PrintWriter("Tiedosto.txt");
					int sisalto = ekaJuoma.getKahvi();
					int sisalto2 = ekaJuoma.getTee();
					int sisalto3 = ekaJuoma.getKaakao();
					
					writer.println(sisalto);
					writer.println(sisalto2);
					writer.println(sisalto3);
					
					writer.flush();
					writer.close();
					
						
				} catch(Exception ex) {
					System.out.println("Virhe!");
					ex.printStackTrace();
				}
			}

			
		});
		//ladataan metodi
		m7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tiedostonNimi = "Tiedosto.txt";
				//get() muutetaan intistä Stringiin että voin asettaa sen luetturivi muuttujaan
				int a = ekaJuoma.getKahvi();
		        String luettuRivi = Integer.toString(a);
		        int b = ekaJuoma.getTee();
		        String luettuRivi2 = Integer.toString(b);
		        int c = ekaJuoma.getKaakao();
		        String luettuRivi3 = Integer.toString(c);
		        boolean rivejäJäljellä = true;
		        BufferedReader lukija = null;
		        FileReader tiedosto = null;		
				
				try {
					tiedosto = new FileReader(tiedostonNimi);
					lukija = new BufferedReader(tiedosto);
					
					while(rivejäJäljellä) {
						luettuRivi = lukija.readLine();
						luettuRivi2 = lukija.readLine();
						luettuRivi3 = lukija.readLine();
			            if (luettuRivi == null) {
			                rivejäJäljellä = false;
			               
			            } else {
			            	//luetturivi muutetaan takaisin intiksi
			            	int kahvia = Integer.parseInt(luettuRivi);
							kahvia = ekaJuoma.setKahvi(kahvia);
							int teetä = Integer.parseInt(luettuRivi2);
							teetä = ekaJuoma.setTee(teetä);
							int kaakaota = Integer.parseInt(luettuRivi3);
							kaakaota = ekaJuoma.setKaakao(kaakaota);
							//luetaan arvot 
							txtKahvisi.setText("Kahvi: " + luettuRivi);
							txtTeesi.setText("Tee: " + luettuRivi2);
							txtKaakaosi.setText("Kaakao: " + luettuRivi3); 
			            	
			            }	
					}
					lukija.close();
				} catch(Exception ex) {
					System.out.println("Tiedostoa ei löydy!");
				}
			}
				
			
		});
		
		
	}

	

}

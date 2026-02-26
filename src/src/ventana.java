package src;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana extends JFrame{
	
	public ventana() {
		
		this.setVisible(true);
		this.setSize(1000,700);
		this.setLocation(1000,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Hola");
		this.setLayout(null);
		this.getContentPane().setBackground(Color.black);

		//LOGIN
		JPanel login_container = new JPanel();
		login_container.setSize(400,520);
		login_container.setLocation(50,50);
		login_container.setBackground(Color.pink);
		login_container.setLayout(null);
		this.add(login_container);
		
		JLabel tag_title = new JLabel ();
		tag_title.setText("Bienvenido");
		tag_title.setSize(150,30);
		tag_title.setLocation(125,20);
		tag_title.setBackground(Color.white);
		tag_title.setOpaque(true);
		tag_title.setFont(new Font("Arial",Font.PLAIN,22));
		tag_title.setHorizontalAlignment(JLabel.CENTER);
		login_container.add(tag_title);
		
		JLabel tag_email = new JLabel ("Ingresar email");
		tag_email.setSize(150,30);
		tag_email.setLocation(60,125);
		tag_email.setFont(new Font("Arial",Font.PLAIN,12));
		login_container.add(tag_email);
		
		JLabel tag_password = new JLabel ("Ingresar contraseña");
		tag_password.setSize(150,30);
		tag_password.setLocation(60,235);
		tag_password.setFont(new Font("Arial",Font.PLAIN,12));
		login_container.add(tag_password);
		
		JLabel tag_passwordIncorrect = new JLabel ("¿Olvido su contraseña?");
		tag_passwordIncorrect.setSize(150,30);
		tag_passwordIncorrect.setLocation(240,305);
		tag_passwordIncorrect.setFont(new Font("Arial",Font.PLAIN,12));
		login_container.add(tag_passwordIncorrect);
		
		JTextField email_input = new JTextField();
		email_input.setSize(280,40);
		email_input.setLocation(60,150);
		email_input.setFont(new Font("Arial",Font.PLAIN,14));
		login_container.add(email_input);
		
		JTextField password_input = new JTextField();
		password_input.setSize(280,40);
		password_input.setLocation(60,260);
		password_input.setFont(new Font("Arial",Font.PLAIN,14));
		login_container.add(password_input);
		
		JCheckBox remenberme = new JCheckBox("Recordarme");
		remenberme.setSize(140,40);
		remenberme.setLocation(55,300);
		remenberme.setOpaque(false);
		remenberme.setFont(new Font("Arial",Font.PLAIN,12));
		login_container.add(remenberme);
		
		JButton acess_btn = new JButton("Acceder");
		acess_btn.setBounds(100,465,200,40);
		acess_btn.setFont(new Font("Arial",Font.ITALIC,18));
		login_container.add(acess_btn);
		
		
		//REGISTRO
		JPanel rgs_container = new JPanel();
		rgs_container.setBounds(500,50,400,520);
		rgs_container.setBackground(Color.green);
		rgs_container.setLayout(null);
		this.add(rgs_container);

		// TITULO
		JLabel bio_tag = new JLabel("REGISTRO");
		bio_tag.setBounds(50,20,300,50);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setFont(new Font("Arial",Font.PLAIN,24));
		bio_tag.setForeground(Color.black);
		rgs_container.add(bio_tag);

		// NOMBRE 
		JLabel name_label = new JLabel("NOMBRE DE USUARIO:");
		name_label.setBounds(50,90,300,35);
		name_label.setHorizontalAlignment(JLabel.CENTER);
		name_label.setFont(new Font("Arial",Font.PLAIN,14));
		rgs_container.add(name_label);

		JTextField name_input = new JTextField();
		name_input.setBounds(50,130,300,35);
		name_input.setBackground(Color.white);
		name_input.setFont(new Font("Arial",Font.PLAIN,14));
		rgs_container.add(name_input);

		// BIO
		JLabel bio_label = new JLabel("BIO");
		bio_label.setBounds(50,180,300,25);
		bio_label.setHorizontalAlignment(JLabel.CENTER);
		bio_label.setFont(new Font("Arial",Font.PLAIN,14));
		;
		rgs_container.add(bio_label);

		JTextArea bio_text = new JTextArea();
		bio_text.setBounds(50,210,300,70);
		bio_text.setBackground(Color.white);
		bio_text.setFont(new Font("Arial",Font.PLAIN,14));
		rgs_container.add(bio_text);

		// PREFERENCIAS
		JLabel pref_label = new JLabel("PREFERENCIAS");
		pref_label.setBounds(50,290,300,25);
		pref_label.setHorizontalAlignment(JLabel.CENTER);
		pref_label.setFont(new Font("Arial",Font.PLAIN,14));
		rgs_container.add(pref_label);

		JCheckBox opt_sweet = new JCheckBox("Dulces");
		opt_sweet.setBounds(50,320,100,30);
		opt_sweet.setOpaque(false);
		opt_sweet.setFont(new Font("Arial",Font.PLAIN,12));
		rgs_container.add(opt_sweet);

		JCheckBox opt_salty = new JCheckBox("Salado");
		opt_salty.setBounds(150,320,100,30);
		opt_salty.setOpaque(false);
		opt_salty.setFont(new Font("Arial",Font.PLAIN,12));
		rgs_container.add(opt_salty);

		JCheckBox opt_healty = new JCheckBox("Saludable");
		opt_healty.setBounds(250,320,100,30);
		opt_healty.setOpaque(false);
		opt_healty.setFont(new Font("Arial",Font.PLAIN,12));
		rgs_container.add(opt_healty);

		// TERMINOS
		JLabel terms_label = new JLabel("TÉRMINOS");
		terms_label.setBounds(50,360,300,30);
		terms_label.setHorizontalAlignment(JLabel.CENTER);
		terms_label.setFont(new Font("Arial",Font.PLAIN,14));
		rgs_container.add(terms_label);

		JRadioButton accept_terms = new JRadioButton("Acepto los términos");
		accept_terms.setBounds(50,395,160,30);
		accept_terms.setOpaque(false);
		accept_terms.setFont(new Font("Arial",Font.PLAIN,12));
		accept_terms.setForeground(Color.black);
		rgs_container.add(accept_terms);

		JRadioButton reject_terms = new JRadioButton("No acepto los términos");
		reject_terms.setBounds(210,395,170,30);
		reject_terms.setOpaque(false);
		reject_terms.setFont(new Font("Arial",Font.PLAIN,12));
		reject_terms.setForeground(Color.black);
		rgs_container.add(reject_terms);

		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);

		String [] colonias = {"Camino Real","Arcoiris","Villas del Encanto","8 de Octubre"};
		JComboBox colonias_combo = new JComboBox(colonias);
		colonias_combo.setBounds(50,430,300,30);
		colonias_combo.setFont(new Font("Arial",Font.PLAIN,14));
		rgs_container.add(colonias_combo);

		JButton register_btn = new JButton("Crear cuenta");
		register_btn.setBounds(50,465,300,40);
		register_btn.setBackground(Color.lightGray);
		register_btn.setFont(new Font("Arial",Font.PLAIN,18));
		register_btn.setForeground(Color.black);
		rgs_container.add(register_btn);

		this.repaint();
	}
}
package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame{
	
	public ventana() {
		
		//CONFIGURACIONES BASICAS
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setLocationRelativeTo(null);
		this.setTitle("Hola");
		this.setLayout(null);
		
		this.getContentPane().setBackground(Color.black);
		
		//this.setBounds(200, 200, 500, 500);
		JPanel login_container = new JPanel();
		login_container.setSize(400,400);
		login_container.setLocation(50,50);
		login_container.setBackground(Color.yellow);
		login_container.setLayout(null);
		this.add(login_container);
		
		
		
		
		
		//AÑADIENDO ELEMENTOS
		JLabel tag_title = new JLabel ();
		tag_title.setText("Bienvenido");
		tag_title.setSize(150,30);
		tag_title.setLocation(125,20);
		tag_title.setBackground(Color.white);
		tag_title.setOpaque(true);
		tag_title.setFont(new Font("Arial",Font.PLAIN,22));
		tag_title.setHorizontalAlignment(JLabel.CENTER);
		login_container.add(tag_title);
		
		JLabel tag_email = new JLabel ();
		tag_email.setText("Ingresar email");
		tag_email.setSize(150,30);
		tag_email.setLocation(60,125);
		tag_email.setFont(new Font("Arial",Font.PLAIN,12));
		login_container.add(tag_email);
		
		JLabel tag_password = new JLabel ();
		tag_password.setText("Ingresar contraseña");
		tag_password.setSize(150,30);
		tag_password.setLocation(60,235);
		tag_password.setFont(new Font("Arial",Font.PLAIN,12));
		login_container.add(tag_password);
		
		JLabel tag_passwordIncorrect = new JLabel ();
		tag_passwordIncorrect.setText("¿Olvido su contraseña?");
		tag_passwordIncorrect.setSize(150,30);
		tag_passwordIncorrect.setLocation(240,305);
		tag_passwordIncorrect.setFont(new Font("Arial",Font.PLAIN,12));
		login_container.add(tag_passwordIncorrect);
		
		JTextField email_input = new JTextField();
		email_input.setSize(280,40);
		email_input.setLocation(60,150);
		login_container.add(email_input);
		
		JTextField password_input = new JTextField();
		password_input.setSize(280,40);
		password_input.setLocation(60,260);
		login_container.add(password_input);
		
		JCheckBox remenberme = new JCheckBox("Recordarme");
		remenberme.setSize(140,40);
		remenberme.setLocation(55,300);
		remenberme.setOpaque(false);
		login_container.add(remenberme);
		
		JButton acess_btn = new JButton("Acceder");
		acess_btn.setBounds(100,350,200,40);;
		acess_btn.setFont(new Font("Arial",Font.ITALIC,18));
		login_container.add(acess_btn);
		
		
		this.repaint();
		
		
	}
}

package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		
		//AÑADIENDO ELEMENTOS
		JLabel tag_title = new JLabel ();
		tag_title.setText("Bienvenido");
		tag_title.setSize(150,30);
		tag_title.setLocation(175,20);
		tag_title.setBackground(Color.white);
		tag_title.setOpaque(true);
		tag_title.setFont(new Font("Arial",Font.PLAIN,22));
		tag_title.setHorizontalAlignment(JLabel.CENTER);
		this.add(tag_title);
	}
}

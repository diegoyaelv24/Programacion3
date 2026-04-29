package views;

import javax.swing.*;
import java.awt.*;

public class AuthView extends JFrame {

    public JTextField email_input;
    public JTextField password_input;
    public JButton access_btn;
    public JLabel mensaje;

    public AuthView() {

        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.black);

        JPanel login_container = new JPanel();
        login_container.setSize(400,550);
        login_container.setLocation(50,50);
        login_container.setBackground(Color.pink);
        login_container.setLayout(null);
        add(login_container);

        JLabel tag_title = new JLabel("Bienvenido");
        tag_title.setSize(150,30);
        tag_title.setLocation(125,20);
        tag_title.setOpaque(true);
        tag_title.setBackground(Color.white);
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        tag_title.setFont(new Font("Arial",Font.PLAIN,22));
        login_container.add(tag_title);

        JLabel tag_email = new JLabel("Ingresar email");
        tag_email.setBounds(60,125,150,30);
        login_container.add(tag_email);

        email_input = new JTextField();
        email_input.setBounds(60,150,280,40);
        login_container.add(email_input);

        JLabel tag_password = new JLabel("Ingresar contraseña");
        tag_password.setBounds(60,235,150,30);
        login_container.add(tag_password);

        password_input = new JTextField();
        password_input.setBounds(60,260,280,40);
        login_container.add(password_input);

        JLabel forgot = new JLabel("¿Olvidó su contraseña?");
        forgot.setBounds(240,305,160,30);
        login_container.add(forgot);

        JCheckBox remember = new JCheckBox("Recordarme");
        remember.setBounds(60,300,140,30);
        remember.setOpaque(false);
        login_container.add(remember);

        access_btn = new JButton("Acceder");
        access_btn.setBounds(100,465,200,40);
        login_container.add(access_btn);

        mensaje = new JLabel("");
        mensaje.setBounds(60,350,280,30);
        mensaje.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(mensaje);

        setVisible(true);
    }
}
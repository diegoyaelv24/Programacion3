package views;

import java.awt.Color;

import javax.swing.JFrame;

public class HomeView extends JFrame {

    public HomeView() {

        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home");
        getContentPane().setBackground(Color.black);
        setLayout(null);

        setVisible(true);
    }
}
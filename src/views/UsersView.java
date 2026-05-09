package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class UsersView extends JFrame {

    public JTable table;
    public DefaultTableModel model;
    public JButton add_button;

    public UsersView() {

        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(50,50,850,500);
        panel.setLayout(null);

        add(panel);

        JLabel title = new JLabel("Usuarios");
        title.setBounds(0,10,850,40);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Arial",Font.BOLD,28));

        panel.add(title);

        add_button = new JButton("Agregar");
        add_button.setBounds(650,20,150,35);

        panel.add(add_button);

        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");
        model.addColumn("NOMBRE");

        table = new JTable(model);

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(20,80,800,350);

        panel.add(scroll);

        setVisible(true);
    }
}
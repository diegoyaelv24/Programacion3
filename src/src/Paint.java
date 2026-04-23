package src;

import javax.swing.*;
import java.awt.*;

public class Paint extends JPanel {

    JFrame f;

    public Paint() {

        f = new JFrame("Paint");
        f.setSize(1000,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel fondo = new JPanel(new GridBagLayout());
        fondo.setBackground(new Color(70,130,180));
        f.setContentPane(fondo);

        JPanel contenedor = new JPanel(new BorderLayout(15,15));
        contenedor.setPreferredSize(new Dimension(850,500));
        contenedor.setBackground(Color.white);
        contenedor.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        fondo.add(contenedor);

        JPanel herramientas = new JPanel();
        herramientas.setPreferredSize(new Dimension(150,0));
        herramientas.setBackground(new Color(245,245,245));
        herramientas.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        herramientas.setLayout(new BorderLayout());

        JLabel tituloHerramientas = new JLabel("Herramientas");
        tituloHerramientas.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelHerr = new JPanel();
        panelHerr.setBackground(new Color(245,245,245));
        panelHerr.setLayout(new GridLayout(10,1,5,8));

        JLabel pincel = new JLabel("Pincel");
        JLabel borrador = new JLabel("Borrador");
        JLabel relleno = new JLabel("Relleno");
        JLabel seleccion = new JLabel("Seleccion");
        JLabel deshacer = new JLabel("Deshacer");
        JLabel rehacer = new JLabel("Rehacer");
       

        JLabel[] herramientasLabels = {
            pincel, borrador, relleno, seleccion,
            deshacer, rehacer};

        for (JLabel lbl : herramientasLabels) {
            lbl.setOpaque(true);
            lbl.setBackground(Color.white);
            lbl.setBorder(BorderFactory.createLineBorder(Color.gray));
            lbl.setHorizontalAlignment(SwingConstants.CENTER);
            panelHerr.add(lbl);
        }

        JLabel grosorTxt = new JLabel("Grosor");
        grosorTxt.setHorizontalAlignment(SwingConstants.CENTER);

        JSlider grosor = new JSlider(1,30,5);
        JButton limpiar = new JButton("Limpiar");

        panelHerr.add(grosorTxt);
        panelHerr.add(grosor);
        panelHerr.add(limpiar);

        herramientas.add(tituloHerramientas, BorderLayout.NORTH);
        herramientas.add(panelHerr, BorderLayout.CENTER);

        JPanel derecha = new JPanel();
        derecha.setPreferredSize(new Dimension(120,0));
        derecha.setBackground(new Color(245,245,245));
        derecha.setLayout(new GridLayout(2,1));

        JPanel figurasPanel = new JPanel(new BorderLayout());
        figurasPanel.setBackground(new Color(245,245,245));

        JLabel tituloFiguras = new JLabel("Figuras");
        tituloFiguras.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelFiguras = new JPanel(new GridLayout(4,1,5,5));
        panelFiguras.setBackground(new Color(245,245,245));

        panelFiguras.add(new JLabel("Rectángulo", SwingConstants.CENTER));
        panelFiguras.add(new JLabel("Círculo", SwingConstants.CENTER));
        panelFiguras.add(new JLabel("Triángulo", SwingConstants.CENTER));
        panelFiguras.add(new JLabel("Línea", SwingConstants.CENTER));

        figurasPanel.add(tituloFiguras, BorderLayout.NORTH);
        figurasPanel.add(panelFiguras, BorderLayout.CENTER);

        JPanel coloresPanel = new JPanel(new BorderLayout());
        coloresPanel.setBackground(new Color(245,245,245));

        JLabel tituloColores = new JLabel("Colores");
        tituloColores.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelColores = new JPanel(new GridLayout(3,2,5,5));
        panelColores.setBackground(new Color(245,245,245));

        panelColores.add(btnColor(Color.white));
        panelColores.add(btnColor(Color.black));
        panelColores.add(btnColor(Color.gray));
        panelColores.add(btnColor(Color.blue));
        panelColores.add(btnColor(Color.red));
        panelColores.add(btnColor(Color.green));

        coloresPanel.add(tituloColores, BorderLayout.NORTH);
        coloresPanel.add(panelColores, BorderLayout.CENTER);

        derecha.add(figurasPanel);
        derecha.add(coloresPanel);

        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createLineBorder(Color.lightGray));

        contenedor.add(herramientas, BorderLayout.WEST);
        contenedor.add(this, BorderLayout.CENTER);
        contenedor.add(derecha, BorderLayout.EAST);

        f.setVisible(true);
    }

    JButton btnColor(Color c){
        JButton b = new JButton();
        b.setBackground(c);
        b.setPreferredSize(new Dimension(25,25));
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        return b;
    }

    public static void main(String[] args) {
        new Paint();
    }
}
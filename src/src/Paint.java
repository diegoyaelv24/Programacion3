
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paint extends JPanel implements MouseListener, MouseMotionListener {

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
        pincel.setOpaque(true);
        pincel.setBackground(Color.white);
        pincel.setBorder(BorderFactory.createLineBorder(Color.gray));
        pincel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel borrador = new JLabel("Borrador");
        borrador.setOpaque(true);
        borrador.setBackground(Color.white);
        borrador.setBorder(BorderFactory.createLineBorder(Color.gray));
        borrador.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel relleno = new JLabel("Relleno");
        relleno.setOpaque(true);
        relleno.setBackground(Color.white);
        relleno.setBorder(BorderFactory.createLineBorder(Color.gray));
        relleno.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel seleccion = new JLabel("Seleccion");
        seleccion.setOpaque(true);
        seleccion.setBackground(Color.white);
        seleccion.setBorder(BorderFactory.createLineBorder(Color.gray));
        seleccion.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel deshacer = new JLabel("Deshacer");
        deshacer.setOpaque(true);
        deshacer.setBackground(Color.white);
        deshacer.setBorder(BorderFactory.createLineBorder(Color.gray));
        deshacer.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel rehacer = new JLabel("Rehacer");
        rehacer.setOpaque(true);
        rehacer.setBackground(Color.white);
        rehacer.setBorder(BorderFactory.createLineBorder(Color.gray));
        rehacer.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel rect = new JLabel("Rectángulo");
        rect.setOpaque(true);
        rect.setBackground(Color.white);
        rect.setBorder(BorderFactory.createLineBorder(Color.gray));
        rect.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel circ = new JLabel("Círculo");
        circ.setOpaque(true);
        circ.setBackground(Color.white);
        circ.setBorder(BorderFactory.createLineBorder(Color.gray));
        circ.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel tri = new JLabel("Triángulo");
        tri.setOpaque(true);
        tri.setBackground(Color.white);
        tri.setBorder(BorderFactory.createLineBorder(Color.gray));
        tri.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel linea = new JLabel("Línea");
        linea.setOpaque(true);
        linea.setBackground(Color.white);
        linea.setBorder(BorderFactory.createLineBorder(Color.gray));
        linea.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel grosorTxt = new JLabel("Grosor");
        grosorTxt.setHorizontalAlignment(SwingConstants.CENTER);

        JSlider grosor = new JSlider(1,30,5);

        JButton limpiar = new JButton("Limpiar");

        panelHerr.add(pincel);
        panelHerr.add(borrador);
        panelHerr.add(relleno);
        panelHerr.add(seleccion);
        panelHerr.add(deshacer);
        panelHerr.add(rehacer);
        panelHerr.add(rect);
        panelHerr.add(circ);
        panelHerr.add(tri);
        panelHerr.add(linea);
        panelHerr.add(grosorTxt);
        panelHerr.add(grosor);
        panelHerr.add(limpiar);

        herramientas.add(tituloHerramientas, BorderLayout.NORTH);
        herramientas.add(panelHerr, BorderLayout.CENTER);

        JPanel derecha = new JPanel();
        derecha.setPreferredSize(new Dimension(120,0));
        derecha.setBackground(new Color(245,245,245));
        derecha.setLayout(new GridLayout(2,1));

        JPanel figurasPanel = new JPanel();
        figurasPanel.setBackground(new Color(245,245,245));
        figurasPanel.setLayout(new BorderLayout());

        JLabel tituloFiguras = new JLabel("Figuras");
        tituloFiguras.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelFiguras = new JPanel();
        panelFiguras.setBackground(new Color(245,245,245));
        panelFiguras.setLayout(new GridLayout(4,1,5,5));

        panelFiguras.add(rect);
        panelFiguras.add(circ);
        panelFiguras.add(tri);
        panelFiguras.add(linea);

        figurasPanel.add(tituloFiguras, BorderLayout.NORTH);
        figurasPanel.add(panelFiguras, BorderLayout.CENTER);

        JPanel coloresPanel = new JPanel();
        coloresPanel.setBackground(new Color(245,245,245));
        coloresPanel.setLayout(new BorderLayout());

        JLabel tituloColores = new JLabel("Colores");
        tituloColores.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelColores = new JPanel();
        panelColores.setBackground(new Color(245,245,245));
        panelColores.setLayout(new GridLayout(3,2,5,5));

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

    public void mousePressed(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}

    public static void main(String[] args) {
        new Paint();
    }
}
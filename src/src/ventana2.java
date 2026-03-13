package src;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ventana2 {

	private JFrame frame;
	private JTextField txtNombres;
	private JTextField txtApePaterno;
	private JTextField txtApeMaterno;
	private JTextField txtFecha;
	private JTextArea txtDescripcion;
	private JList<String> listaPreferencias;
	private JRadioButton rbMasculino;
	private JRadioButton rbFemenino;
	private JComboBox<String> comboNacionalidad;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				ventana2 window = new ventana2();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public ventana2() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Registro de Usuarios");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		JLabel lblTitulo = new JLabel("Registro de Usuarios", SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		lblTitulo.setForeground(Color.RED);
		lblTitulo.setBackground(Color.GREEN);
		lblTitulo.setOpaque(true);
		frame.getContentPane().add(lblTitulo, BorderLayout.NORTH);

		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new GridLayout(2, 2, 5, 5));
		panelCentral.setBackground(Color.GREEN);
		frame.getContentPane().add(panelCentral, BorderLayout.CENTER);

		JPanel p1 = new JPanel();
		p1.setBackground(new Color(150, 240, 210));
		p1.setBorder(new TitledBorder(null, "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP));
		p1.setLayout(new GridLayout(6, 2, 5, 5));
		
		p1.add(new JLabel("Nombres:"));
		txtNombres = new JTextField();
		p1.add(txtNombres);

		p1.add(new JLabel("Apellido Paterno:"));
		txtApePaterno = new JTextField();
		p1.add(txtApePaterno);

		p1.add(new JLabel("Apellido Materno:"));
		txtApeMaterno = new JTextField();
		p1.add(txtApeMaterno);

		p1.add(new JLabel("Fecha Nacimiento:"));
		txtFecha = new JTextField("");
		p1.add(txtFecha);

		p1.add(new JLabel("Sexo:"));
		JPanel pSexo = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pSexo.setOpaque(false);
		rbMasculino = new JRadioButton("Masculino", true);
		rbFemenino = new JRadioButton("Femenino");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMasculino);
		bg.add(rbFemenino);
		pSexo.add(rbMasculino);
		pSexo.add(rbFemenino);
		p1.add(pSexo);

		p1.add(new JLabel("Nacionalidad:"));
		comboNacionalidad = new JComboBox<>(new String[] { "Perú", "México", "España", "Colombia" });
		p1.add(comboNacionalidad);

		panelCentral.add(p1);

		JPanel p2 = new JPanel();
		p2.setBackground(new Color(255, 180, 180));
		p2.setBorder(new TitledBorder("Perfil del Usuario"));
		p2.setLayout(new BorderLayout());
		JLabel lblFoto = new JLabel("IMAGEN", SwingConstants.CENTER);
		lblFoto.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		p2.add(lblFoto, BorderLayout.CENTER);
		panelCentral.add(p2);

		JPanel p3 = new JPanel();
		p3.setBackground(new Color(255, 100, 100));
		p3.setBorder(new TitledBorder("Datos Opcionales"));
		p3.setLayout(new GridLayout(2, 2, 5, 5));
		p3.add(new JLabel("Descripción:"));
		p3.add(new JLabel("Preferencias:"));
		txtDescripcion = new JTextArea("Hola amigos...");
		p3.add(new JScrollPane(txtDescripcion));
		listaPreferencias = new JList<>(new String[] { "Cantar", "Escuchar Música", "Leer", "Deportes" });
		p3.add(new JScrollPane(listaPreferencias));
		panelCentral.add(p3);

		JPanel p4 = new JPanel();
		p4.setBackground(new Color(150, 240, 210));
		p4.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));
		JButton btnNuevo = new JButton("Nuevo");
		JButton btnGuardar = new JButton("Guardar");
		JButton btnSalir = new JButton("Salir");
		p4.add(btnNuevo);
		p4.add(btnGuardar);
		p4.add(btnSalir);
		panelCentral.add(p4);
		
		btnNuevo.addActionListener(e -> {
			txtNombres.setText("");
			txtApePaterno.setText("");
			txtApeMaterno.setText("");
			txtDescripcion.setText("");
		});
		
		btnSalir.addActionListener(e -> System.exit(0));
	}
}
package src;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

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
		
		try {
		    Image icon = ImageIO.read(getClass().getResource("/src/imagenes/fantasma.png"));
		    this.setIconImage(icon);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		JMenuBar barra = new JMenuBar();
		this.setJMenuBar(barra);
		
		JMenu menu1= new JMenu("Archivo");
		barra.add(menu1);
		JMenuItem opt1_mi = new JMenuItem("Abrir");
		menu1.add(opt1_mi);
		
		JMenuItem opt2_mi = new JMenuItem("Nuevo");
		menu1.add(opt2_mi);
		
		JMenuItem opt3_mi = new JMenuItem("Cerrar");
		menu1.add(opt3_mi);
		
		menu1.addSeparator();
		
		JMenu menu2 = new JMenu("Guardar");
		menu1.add(menu2);
		
		JMenuItem opt4_mi = new JMenuItem("Guardar");
		menu2.add(opt4_mi);
		JMenuItem opt5_mi = new JMenuItem("Guardar como");
		menu2.add(opt5_mi);
		//this.login();
		//this.registro();
		//this.users();
		//this.calculadora();
		//this.interes();
		//this.pintar();
		this.factura();
		this.setVisible(true);
		this.repaint();
	}
	public void login () {
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
		
		JButton access_btn = new JButton("Acceder");
		access_btn.setBounds(100,465,200,40);
		access_btn.setFont(new Font("Arial",Font.ITALIC,18));
		login_container.add(access_btn);
		
		access_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String email = email_input.getText().trim();
				String password = password_input.getText().trim();
				
				String correoValido = "ola@uabcs.com";
				String passValido = "123456";
				
				boolean valid = true;
				
				if(email.equals("")) {
					email_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
					valid = false;
				}else {
					email_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}
				
				if(password.equals("") || password.length() < 6 || password.contains(" ")) {
					password_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
					valid = false;
				}else {
					password_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}
				
				if(valid){
					if(email.equals(correoValido) && password.equals(passValido)){
						JOptionPane.showMessageDialog(null,"Bienvenido","Acceso correcto",JOptionPane.INFORMATION_MESSAGE);
					}else{
						JOptionPane.showMessageDialog(null,"Datos incorrectos","Error",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
	}
	
	
	public void registro() {
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
		
		register_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String nombre = name_input.getText().trim();
				String bio = bio_text.getText().trim();

				boolean valid = true;

				if(nombre.equals("") || nombre.contains(" ")) {
					name_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
					valid = false;
				}else {
					name_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}

				if(bio.length() < 5) {
				    bio_text.setBorder(BorderFactory.createLineBorder(Color.red,3));
				    valid = false;
				}else {
				    bio_text.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}

				if(!opt_sweet.isSelected() && !opt_salty.isSelected() && !opt_healty.isSelected()) {
					opt_sweet.setForeground(Color.red);
					opt_salty.setForeground(Color.red);
					opt_healty.setForeground(Color.red);
					valid = false;
				}else {
					opt_sweet.setForeground(Color.black);
					opt_salty.setForeground(Color.black);
					opt_healty.setForeground(Color.black);
				}

				if(!accept_terms.isSelected()) {
					accept_terms.setForeground(Color.red);
					valid = false;
				}else {
					accept_terms.setForeground(Color.black);
				}

				if(valid){
					System.out.println("Registro correcto");
				}else{
					System.out.println("Registro incorrecto");
				}
			}
		});
		
	}
	public void users(){
	    JPanel panel_users = new JPanel();
	    panel_users.setSize(900,550);
	    panel_users.setBackground(Color.blue);
	    panel_users.setLocation(50,50);
	    panel_users.setLayout(null);
	    this.add(panel_users);
	    
	    // TITULO
	    JLabel users_title = new JLabel("Usuarios");
	    users_title.setBounds(250,10,400,70);
	    users_title.setHorizontalAlignment(JLabel.CENTER);
	    users_title.setFont(new Font("Segoe Script",Font.BOLD,48));
	    users_title.setForeground(Color.black);
	    panel_users.add(users_title);
	    
	    // BOTONES
	    JButton dowload_button = new JButton("Descargar");
	    dowload_button.setBounds(600,75,120,35);
	    dowload_button.setFont(new Font("Arial",Font.ITALIC,14));
	    panel_users.add(dowload_button);
	    
	    JButton add_button = new JButton("Añadir");
	    add_button.setBounds(740,75,120,35);
	    add_button.setFont(new Font("Arial",Font.ITALIC,14));
	    panel_users.add(add_button);
	    
	    String []table_head = {"No.Control","Nombre","Apellidos","Correo Electronico","Semestre","Carrera","Acciones"};
	    
	    Object [][]table_body = {
	        {"2023001","Luis","Martínez López","luis.martinez@uabcs.mx","1","Ingeniería en Sistemas","Editar / Eliminar"},
	        {"2023002","Ana","Gómez Pérez","ana.gomez@uabcs.mx","2","Derecho","Editar / Eliminar"},
	        {"2023003","Carlos","Hernández Ruiz","carlos.hernandez@uabcs.mx","3","Contaduría","Editar / Eliminar"},
	        {"2023004","María","Torres Sánchez","maria.torres@uabcs.mx","4","Biología Marina","Editar / Eliminar"},
	        {"2023005","Jorge","Ramírez Castro","jorge.ramirez@uabcs.mx","5","Administración","Editar / Eliminar"},
	        {"2023006","Fernanda","López Díaz","fernanda.lopez@uabcs.mx","6","Psicología","Editar / Eliminar"},
	        {"2023007","Diego","Vargas León","diego.vargas@uabcs.mx","7","Ingeniería en Sistemas","Editar / Eliminar"},
	        {"2023008","Sofía","Morales Cruz","sofia.morales@uabcs.mx","8","Turismo","Editar / Eliminar"},
	        {"2023009","Miguel","Castro Núñez","miguel.castro@uabcs.mx","1","Biología Marina","Editar / Eliminar"},
	        {"2023010","Valeria","Ríos Torres","valeria.rios@uabcs.mx","2","Administración","Editar / Eliminar"},
	        {"2023011","Ricardo","Moreno Díaz","ricardo.moreno@uabcs.mx","3","Derecho","Editar / Eliminar"},
	        {"2023012","Daniela","Ortega Silva","daniela.ortega@uabcs.mx","4","Psicología","Editar / Eliminar"},
	        {"2023013","Alejandro","Vega Cruz","alejandro.vega@uabcs.mx","5","Ingeniería en Sistemas","Editar / Eliminar"},
	        {"2023014","Camila","Navarro Ruiz","camila.navarro@uabcs.mx","6","Turismo","Editar / Eliminar"},
	        {"2023015","Eduardo","Soto Hernández","eduardo.soto@uabcs.mx","7","Contaduría","Editar / Eliminar"},
	        {"2023016","Natalia","Ponce Martínez","natalia.ponce@uabcs.mx","8","Administración","Editar / Eliminar"},
	        {"2023017","Andrés","Luna García","andres.luna@uabcs.mx","1","Psicología","Editar / Eliminar"},
	        {"2023018","Paola","Meza Castro","paola.meza@uabcs.mx","2","Biología Marina","Editar / Eliminar"},
	        {"2023019","Hugo","Salinas Torres","hugo.salinas@uabcs.mx","3","Derecho","Editar / Eliminar"},
	        {"2023020","Lucía","Cervantes Díaz","lucia.cervantes@uabcs.mx","4","Ingeniería en Sistemas","Editar / Eliminar"}
	    };
	    
	    JTable students = new JTable(table_body,table_head);
	    students.setRowHeight(25);
	    students.setBackground(Color.white);
	    
	    JScrollPane final_table = new JScrollPane(students);
	    final_table.setBounds(50,120,800,380);
	    final_table.getViewport().setBackground(Color.white);
	    
	    panel_users.add(final_table);
	}
		public void calculadora() {
		
			
			 JPanel panel_users = new JPanel();
			    panel_users.setSize(500,595);
			    panel_users.setBackground(Color.blue);
			    panel_users.setLocation(250,50);
			    panel_users.setLayout(null);
			    this.add(panel_users);
			    
			    JLabel field = new JLabel("180.00");
			    field.setSize(480,40);
			    field.setLocation(10,10);
			    field.setOpaque(true);
			    field.setBackground(Color.white);
			    field.setFont(new Font("Arial",Font.BOLD,22));
			    field.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
			    panel_users.add(field);
			    
			   
			    
			    int cor_x = 30 ,cor_y = 60;
			    
			    String []botones = {"CE"," "," "," ","7","8","9","/","6","5","4","*","3","2","1","-","0",".","=","+"
			    };
			   
			    for( int i = 0; i < 20; i++){
			    	
			    	 JButton ce= new JButton(botones[i]);
					    ce.setSize(80,80);
					    ce.setLocation(cor_x,cor_y);
					    
					    cor_x += 110;
					    panel_users.add(ce);
					    
					    if ( cor_x >= 420) {
					    	cor_x = 30;
					    	cor_y += 110;
					    }
			    
			    }
			    	
			    	
			    	
		}
		
		public void pintar() {
			JPanel pane = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2d = (Graphics2D) g;
	                g2d.drawLine(0,0, 1000, 700);
	                g2d.setColor(Color.orange);
	                g2d.drawOval(100,100,150, 50);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawPolygon(new int[]{300,100 ,500}, new int[] {100,300,300},3);
	                g2d.drawRect(300, 240, 100, 100);
	                g2d.drawRoundRect(500, 150, 100, 100, 10, 10);
	                g2d.drawArc(400, 100, 100, 100, 0, 90);
	                
	                g2d.setFont(new Font("Arial",Font.BOLD,22));
	                g2d.drawString("Hola", 100, 100);
	                
	                g2d.setColor(Color.black);
	                g2d.fillOval(500, 50, 50, 50);
	                
	                g2d.drawPolygon(new int[]{500, 300, 700}, new int[] {300, 500, 500},3);
	                
	                g2d.setColor(Color.orange);
	                g2d.fillRoundRect(550, 500, 100, 100, 10, 10);
	                
	                g2d.fillArc(450, 150, 100, 100, 0, 300);
	                
	                BufferedImage image;
					try {
						image = ImageIO.read(new File("src/image/lebron.png"));
						g2d.drawImage(image, 0, 0, null);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                
	                
	            }
	        };
			
			pane.setSize(1000,700);
			pane.setLocation(0,0);
			this.add(pane);
		}
		public void interes() {

		    JPanel fondo = new JPanel();
		    fondo.setLayout(null);
		    fondo.setBounds(0,0,800,600);
		    fondo.setBackground(new Color(30,30,30));
		    this.add(fondo);

		    JPanel panelPrincipal = new JPanel(new BorderLayout(10,10));
		    panelPrincipal.setBounds(150,50,450,500);
		    panelPrincipal.setBackground(Color.BLACK);
		    fondo.add(panelPrincipal);

		    JLabel titulo = new JLabel("Calculando el Interés");
		    titulo.setFont(new Font("Arial", Font.BOLD, 28));
		    titulo.setForeground(Color.WHITE);
		    titulo.setHorizontalAlignment(JLabel.CENTER);
		    panelPrincipal.add(titulo, BorderLayout.NORTH);

		    JPanel panelDatos = new JPanel(new GridLayout(4,2,10,20));
		    panelDatos.setBorder(BorderFactory.createTitledBorder(
		            BorderFactory.createLineBorder(Color.GREEN,2),
		            "Datos de Entrada",
		            0,0,new Font("Arial",Font.BOLD,14),Color.GREEN));
		    panelDatos.setBackground(Color.BLACK);

		    String[] etiquetas = {"Capital:", "Tiempo (años):", "Tasa Interés (%):"};

		    for(String texto : etiquetas){
		        JLabel lbl = new JLabel(texto);
		        lbl.setForeground(Color.WHITE);
		        panelDatos.add(lbl);

		        JTextField txt = new JTextField();
		        panelDatos.add(txt);
		    }

		    JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER,20,0));
		    panelBotones.setBackground(Color.white);

		    JButton btnCalcular = new JButton("Calcular");
		    JButton btnCancelar = new JButton("Cancelar");

		    panelBotones.add(btnCalcular);
		    panelBotones.add(btnCancelar);

		    panelDatos.add(new JLabel(""));
		    panelDatos.add(panelBotones);

		    panelPrincipal.add(panelDatos, BorderLayout.CENTER);

		    JPanel panelResultados = new JPanel(new GridLayout(2,2,10,10));
		    panelResultados.setBorder(BorderFactory.createTitledBorder(
		            BorderFactory.createLineBorder(Color.RED,2),
		            "Resultados",
		            0,0,new Font("Arial",Font.BOLD,14),Color.RED));
		    panelResultados.setBackground(Color.BLACK);

		    JLabel lblInteres = new JLabel("Interés:");
		    lblInteres.setForeground(Color.WHITE);
		    JTextField txtInteres = new JTextField();
		    txtInteres.setEditable(false);

		    JLabel lblMonto = new JLabel("Monto Final:");
		    lblMonto.setForeground(Color.WHITE);
		    JTextField txtMonto = new JTextField();
		    txtMonto.setEditable(false);

		    panelResultados.add(lblInteres);
		    panelResultados.add(txtInteres);
		    panelResultados.add(lblMonto);
		    panelResultados.add(txtMonto);

		    panelPrincipal.add(panelResultados, BorderLayout.SOUTH);
		}
		public void factura() {

		    JPanel contenedor = new JPanel();
		    contenedor.setBounds(50,50,850,550);
		    contenedor.setLayout(null);
		    contenedor.setBackground(new Color(240,240,240));
		    this.add(contenedor);

		    JLabel titulo = new JLabel("Sistema de Facturación");
		    titulo.setBounds(250,10,350,40);
		    titulo.setFont(new Font("Arial",Font.BOLD,26));
		    contenedor.add(titulo);

		    JPanel datos = new JPanel();
		    datos.setBounds(20,60,800,120);
		    datos.setLayout(null);
		    datos.setBackground(Color.white);
		    datos.setBorder(BorderFactory.createLineBorder(Color.gray));
		    contenedor.add(datos);

		    String[] labels = {"Documento","Nombre","Dirección","Teléfono","No. Factura","Fecha"};
		    int x = 20, y = 10;

		    for(int i=0;i<labels.length;i++){
		        JLabel l = new JLabel(labels[i]);
		        l.setBounds(x,y,100,20);
		        datos.add(l);

		        JTextField t = new JTextField();
		        t.setBounds(x,y+20,150,25);
		        datos.add(t);

		        x += 180;
		        if(i==2){
		            x = 20;
		            y += 60;
		        }
		    }

		    JPanel tablaPanel = new JPanel();
		    tablaPanel.setBounds(20,200,800,220);
		    tablaPanel.setLayout(null);
		    tablaPanel.setBackground(Color.white);
		    tablaPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
		    contenedor.add(tablaPanel);

		    JButton btnAgregar = new JButton("Añadir");
		    btnAgregar.setBounds(550,10,100,25);
		    tablaPanel.add(btnAgregar);

		    JButton btnEliminar = new JButton("Eliminar");
		    btnEliminar.setBounds(660,10,100,25);
		    tablaPanel.add(btnEliminar);

		    String[] columnas = {"Producto","Cantidad","Precio","Total"};
		    Object[][] datosTabla = {
		            {"Agua","2","20","40"},
		            {"Cereal","1","60","60"},
		            {"Leche","3","25","75"}
		    };

		    JTable tabla = new JTable(datosTabla,columnas);
		    JScrollPane scroll = new JScrollPane(tabla);
		    scroll.setBounds(20,50,740,150);
		    tablaPanel.add(scroll);

		    JPanel totales = new JPanel();
		    totales.setBounds(20,430,800,90);
		    totales.setLayout(null);
		    totales.setBackground(Color.white);
		    totales.setBorder(BorderFactory.createLineBorder(Color.gray));
		    contenedor.add(totales);

		    String[] txts = {"SubTotal:","Descuento:","IVA:","Total:"};
		    int posY = 10;

		    for(String t: txts){
		        JLabel l = new JLabel(t);
		        l.setBounds(500,posY,100,20);
		        totales.add(l);

		        JTextField tf = new JTextField();
		        tf.setBounds(600,posY,120,25);
		        totales.add(tf);

		        posY += 20;
		    }

		    JButton finalizar = new JButton("Finalizar");
		    finalizar.setBounds(300,30,150,30);
		    totales.add(finalizar);
		}
			
			

}
		



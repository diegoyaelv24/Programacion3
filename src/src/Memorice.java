
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.util.*;
import javax.swing.Timer;

public class Memorice {

	private JFrame frame;
	public Integer[] cartas = {1,1,2,2,3,3,4,4,5,5,6,6};

	public int[] status = {0,0,0,0,0,0,0,0,0,0,0,0};
	public int tarjetas_mostradas = 0;
	public int carta_1=0,carta_2=0;
	public List<JButton> botones = new ArrayList<>();

	private int movimientos = 0;
	private int pares = 0;
	private int segundos = 0;

	private JLabel lblMov;
	private JLabel lblPares;
	private JLabel lblTiempo;

	private boolean pausado = false;
	private Timer timer;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Memorice window = new Memorice();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Memorice() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		List<Integer> lista = Arrays.asList(cartas);
		Collections.shuffle(lista);
		lista.toArray(cartas);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 188, 253));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 3, 0, 0));

		lblMov = new JLabel("Movimientos: 0", SwingConstants.CENTER);
		lblPares = new JLabel("Pares: 0", SwingConstants.CENTER);
		lblTiempo = new JLabel("Tiempo: 0", SwingConstants.CENTER);

		panel.add(lblMov);
		panel.add(lblPares);
		panel.add(lblTiempo);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(171, 250, 255));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 4, 0, 0));

		for (int i = 0; i < 12; i++) {
			JButton btn = new JButton();
			int index = i;

			btn.setIcon(new ImageIcon("images/memorice/placeholder.png"));
			btn.addActionListener(e -> flip(index, btn));

			panel_1.add(btn);
			botones.add(null);
		}

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(247, 239, 127));
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);

		JButton reiniciar = new JButton("Reiniciar");
		JButton pausa = new JButton("Pausa");

		panel_2.add(reiniciar);
		panel_2.add(pausa);

		reiniciar.addActionListener(e -> reiniciarJuego());

		pausa.addActionListener(e -> {
			pausado = !pausado;
			pausa.setText(pausado ? "Reanudar" : "Pausa");

			if (pausado) timer.stop();
			else timer.start();
		});

		timer = new Timer(1000, e -> {
			segundos++;
			lblTiempo.setText("Tiempo: " + segundos);
		});

		timer.start();
	}

	public void flip(Integer n, JButton b) {
		if (pausado || status[n] != 0) return;

		b.setIcon(new ImageIcon("images/memorice/" + cartas[n] + ".png"));

		if(carta_1 == 0) carta_1 = cartas[n];
		else carta_2 = cartas[n];

		status[n] = 1;
		botones.set(n, b);

		tarjetas_mostradas++;

		if(tarjetas_mostradas == 2) {
			movimientos++;
			lblMov.setText("Movimientos: " + movimientos);

			Timer t = new Timer(800, e -> verificar());
			t.setRepeats(false);
			t.start();
		}
	}

	private void verificar() {
		if (carta_1 == carta_2 && carta_1 != 0) {

			pares++;
			lblPares.setText("Pares: " + pares);

			for (int i = 0; i < 12; i++) {
				if (status[i] == 1) {
					status[i] = 2;
					botones.get(i).setEnabled(false);
				}
			}

		} else {

			for (int i = 0; i < 12; i++) {
				if (status[i] == 1) {
					status[i] = 0;
					botones.get(i).setIcon(new ImageIcon("images/memorice/placeholder.png"));
				}
			}
		}

		tarjetas_mostradas = 0;
		carta_1 = 0;
		carta_2 = 0;
	}

	private void reiniciarJuego() {
		List<Integer> lista = Arrays.asList(cartas);
		Collections.shuffle(lista);
		lista.toArray(cartas);

		for (int i = 0; i < 12; i++) {
			status[i] = 0;
		}

		for (JButton b : botones) {
			if (b != null) {
				b.setEnabled(true);
				b.setIcon(new ImageIcon("images/memorice/placeholder.png"));
			}
		}

		tarjetas_mostradas = 0;
		carta_1 = 0;
		carta_2 = 0;

		movimientos = 0;
		pares = 0;
		segundos = 0;

		lblMov.setText("Movimientos: 0");
		lblPares.setText("Pares: 0");
		lblTiempo.setText("Tiempo: 0");

		timer.restart();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
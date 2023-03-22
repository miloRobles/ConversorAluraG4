package ventanaEncriptador;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class ventanaConversor extends JFrame {
	
									//CREAMOS ATRIBUTOS
	private JPanel panel;
	private JLabel fondo;
	private JButton salir;
	private JLabel titulo;
	private JLabel lblde;
	private JLabel lblA;
	private JLabel resultado;
	private JComboBox divisas;
	private JComboBox divisas1;
	private JLabel cantidadAIngresar;
	private JTextField cantidad;
	private JLabel textoCantidad;
	private String de;
	private String a;

	/**
	 * Launch the application.
	 */
 	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaConversor frame = new ventanaConversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ventanaConversor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\conversorONE\\src\\imagenes\\imgBT.jpg"));//IMAGEN PARA LA BARRA DE TAREAS
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
		
	}
										//INICIA COMPONENTES
	private void iniciarComponentes() {
		
		panelPrincipal();
		labelFondo();
		btnSalir();
		eventosDelMouse();
		tituloPrincipal();
		palabraDe();
		palabraA();
		resultadoConversion();
		listaDe();
		listaA();
		ingresarCantidad();
		cantidadAConvertir();
		}
										//CREANDO EL PANEL PRINCIPAL
	private void panelPrincipal(){
		
		panel = new JPanel();
			panel.setSize(this.getWidth(),this.getHeight());
		this.add(panel);
	}
										//CREANDO FONDO DE PANTALLA
	ImageIcon imagenFondo = new ImageIcon("C:\\Users\\Usuario\\Desktop\\conversorONE\\src\\imagenes\\fondoOscuro.jpg");
	private void labelFondo() {
		panel.setLayout(null);
		fondo = new JLabel();
		fondo.setBounds(0, 0, 400, 500);
			//fondo.setOpaque(false);
			fondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT)));
		panel.add(fondo);
	}
										//AGREGANDO IMAGEN PARA CERRAR VENTANA
	ImageIcon imaSalir = new ImageIcon("C:\\Users\\Usuario\\Desktop\\conversorONE\\src\\imagenes\\imagenSalir.png");
	private void btnSalir() {
		
		salir = new JButton();
			salir.setBounds(panel.getWidth()-40,10,30,30);
			salir.setIcon(new ImageIcon(imaSalir.getImage().getScaledInstance(salir.getWidth(), salir.getHeight(), Image.SCALE_DEFAULT)));
		fondo.add(salir);
		eventosDelMouse();
		
	}
										//EVENTO DEL MOUSE PARA SALIR DE LA PANTALLA OPRIMIENDO EL BOTON X
	private void eventosDelMouse() {
		MouseListener escuchademouse = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}


			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
		};
			salir.addMouseListener(escuchademouse);
	}
									    //ESTABLECER TITULO 
	private void tituloPrincipal() {
			titulo =new  JLabel();
				titulo.setOpaque(false);
				titulo.setBounds(95,50,250,20);
				titulo.setText("CONVERSOR DE MONEDA");
				titulo.setFont(new Font("cooper black",1,15));
				titulo.setForeground(Color.LIGHT_GRAY);
			fondo.add(titulo);
	}
										//JLABEL CANTIDAD A CONVERTIR
	private void cantidadAConvertir() {
		
			textoCantidad = new JLabel("Cantidad a convertir");
				textoCantidad.setBounds(112,120,250,20);
				textoCantidad.setFont(new Font("cooper black",1,15));
				textoCantidad.setForeground(Color.LIGHT_GRAY);
				
			fondo.add(textoCantidad);
	}
										//TEXTFIELD PARA INGRESAR LA CANTIDAD A CONVERTIR
	private void ingresarCantidad() {
		
			cantidad = new JTextField();
				cantidad.setBounds(145,150,100,20);
			fondo.add(cantidad);
	}	
										//DE CUAL MONEDA QUEREMOS CONVERTIR JLABEL
	private void palabraDe() {
			lblde = new JLabel();
				lblde.setBounds(100,200,30,15);
				lblde.setText("De");
				lblde.setFont(new Font("cooper black",1,15));
				lblde.setForeground(Color.LIGHT_GRAY);
			fondo.add(lblde);
	}
										//A CUAL MONEDA VAMOS A CONVERTIR JLABEL
	private void palabraA() {

			lblA = new JLabel();
				lblA.setBounds(270,200,20,15);
				lblA.setText("a");
				lblA.setFont(new Font("cooper black",1,15));
				lblA.setForeground(Color.LIGHT_GRAY);
			fondo.add(lblA);
}
										//CREANDO LISTA DESPLEGABLE 
	
	String[] monedas = {"DL","CO","MX","YN","EU"};
	
	private void listaDe() {
		
		divisas =new JComboBox(monedas);
			divisas.setBounds(50,240,120,20);
		fondo.add(divisas);
		
		
	}
	
	private void listaA() {
		
		divisas1 =new JComboBox(monedas);
			divisas1.setBounds(220,240,120,20);
		fondo.add(divisas1);
	}
	
	private void resultadoConversion() {
		
		resultado = new JLabel(); 
			resultado.setBounds(121,400,400,20);
			resultado.setText("");
			resultado.setFont(new Font("cooper black",1,15));
			resultado.setForeground(Color.LIGHT_GRAY);
		fondo.add(resultado);
	}
	
		
}




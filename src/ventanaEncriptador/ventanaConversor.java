package ventanaEncriptador;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;



public class ventanaConversor extends JFrame {
	
									//CREAMOS ATRIBUTOS
	private JPanel panel;
	private JLabel fondo;
	private JButton salir;
	private JLabel titulo;
	private JLabel lblde;
	private JLabel lblA;
	private JLabel resultado;
	private JComboBox<String> divisas;
	private JComboBox<String> divisas1;
	private JTextField cantidad;
	private JLabel textoCantidad;
	private JLabel imagAlura; 

	/**
	 * Launch the application.
	 */ 	public static void main(String[] args) {
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\proyectos-terminados\\proyectoEncriptador\\imagenes\\Vector (1).png"));//IMAGEN PARA LA BARRA DE TAREAS
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		setLocationRelativeTo(null);
		//setLayout(null);           //OPCIONAL FONDO TRANSAPARENTE 
		//setBackground(new Color(120,120,120,10));////////////////////
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
		imagenAlura();
		
		}
										//CREANDO EL PANEL PRINCIPAL
	private void panelPrincipal(){
		
		panel = new JPanel();
			panel.setSize(this.getWidth(),this.getHeight());
			//panel.setLayout(null);      // OCPIONAL FONDO TRANSPARENTE 
			//panel.setBackground(new Color(64,207,255,80));/////////////////////////
		getContentPane().add(panel);
	}
										//CREANDO FONDO DE PANTALLA
	ImageIcon imagenFondo = new ImageIcon("C:\\Users\\Usuario\\Desktop\\conversorONE\\src\\imagenes\\fondoOscuro.jpg");
	private void labelFondo() {
		panel.setLayout(null);
		fondo = new JLabel();
		fondo.setBounds(0, 0, 400, 500);
		//fondo.setOpaque(false);//////////////////////////////////////
		//fondo.setBackground(new Color(250,250,120,0));///////////////////////////////////
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
				titulo.setFont(new Font("comic sam",1,15));
				titulo.setForeground(Color.white);
			fondo.add(titulo);
	}
										//JLABEL CANTIDAD A CONVERTIR
	private void cantidadAConvertir() {
		
			textoCantidad = new JLabel("Cantidad a convertir");
			textoCantidad.setHorizontalAlignment(SwingConstants.CENTER);
				textoCantidad.setBounds(100,120,200,20);
				textoCantidad.setFont(new Font("comic sams",1,15));
				textoCantidad.setForeground(Color.white);
				
			fondo.add(textoCantidad);
	}
										//TEXTFIELD PARA INGRESAR LA CANTIDAD A CONVERTIR
	private void ingresarCantidad() {
		
			cantidad = new JTextField();
				cantidad.setBounds(150,150,100,20);
			fondo.add(cantidad);
			
	}	
										//DE CUAL MONEDA QUEREMOS CONVERTIR JLABEL
	private void palabraDe() {
			lblde = new JLabel();
			lblde.setHorizontalAlignment(SwingConstants.CENTER);
				lblde.setBounds(100,200,30,15);
				lblde.setText("De");
				lblde.setFont(new Font("cooper black",1,15));
				lblde.setForeground(Color.LIGHT_GRAY);
			fondo.add(lblde);
	}
										//A CUAL MONEDA VAMOS A CONVERTIR JLABEL
	private void palabraA() {

			lblA = new JLabel();
			lblA.setHorizontalAlignment(SwingConstants.CENTER);
				lblA.setBounds(270,200,20,15);
				lblA.setText("a");
				lblA.setFont(new Font("cooper black",1,15));
				lblA.setForeground(Color.LIGHT_GRAY);
			fondo.add(lblA);
}
										//CREANDO LISTA DESPLEGABLE 
	String[] monedas = {"EUR","USD","COP","MXN","JPY"};
	private void listaDe() {
		
		divisas = new JComboBox(monedas);
			divisas.setBounds(50,240,120,20);
		fondo.add(divisas);
		
		
		divisas.addActionListener(new ActionListener() {
			
			DecimalFormat df = new DecimalFormat("0.0000");
				
			@Override 
			public void actionPerformed(ActionEvent e) {
				
				 if  (divisas.getSelectedItem().equals(divisas1.getSelectedItem())) {
					 resultado.setText(cantidad.getText());
					 
				 }if(divisas.getSelectedItem().equals("EUR") && divisas1.getSelectedItem().toString() == "USD") {
					 resultado.setText(cantidad.getText() + " EUR --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 1.08776))+" USD");
				 }if(divisas.getSelectedItem().equals("EUR") && divisas1.getSelectedItem().toString() == "COP") {
					 resultado.setText(cantidad.getText() + " EUR -->  " + String.valueOf((Float.parseFloat(cantidad.getText())) * 5174.24)+" COP");
				 }if(divisas.getSelectedItem().equals("EUR") && divisas1.getSelectedItem().toString() == "MXN") {
					 resultado.setText(cantidad.getText() + " EUR -->  " + String.valueOf((Float.parseFloat(cantidad.getText())) * 20.1672)+" MXN");	 
				 }if(divisas.getSelectedItem().equals("EUR") && divisas1.getSelectedItem().toString() == "JPY") {
					 resultado.setText(cantidad.getText() + " EUR -->  " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 142.415))+" JPY");
				
				 }if(divisas.getSelectedItem().equals("USD") && divisas1.getSelectedItem().toString() == "EUR") {
					 resultado.setText(cantidad.getText() + " USD --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText()) * 0.91918)))+" EUR");	 
     			 }if(divisas.getSelectedItem().equals("USD") && divisas1.getSelectedItem().toString() == "COP") {
     				 resultado.setText(cantidad.getText() + " USD --> " + String.valueOf((Float.parseFloat(cantidad.getText())) * 4756.79)+" COP");
	    		 }if(divisas.getSelectedItem().equals("USD") && divisas1.getSelectedItem().toString() == "MXN") {
	    			 resultado.setText(cantidad.getText() + " USD --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 18.5401))+" MXN");
	    		 }if(divisas.getSelectedItem().equals("USD") && divisas1.getSelectedItem().toString() == "JPY") {
	    			 resultado.setText(cantidad.getText() + " USD --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 130.915 ))+" JPY");	 
				 
	    		 }if(divisas.getSelectedItem().equals("COP") && divisas1.getSelectedItem().toString() == "EUR") {
	    			 resultado.setText(cantidad.getText() + " COP --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.00019))+" EUR");
	    		 }if(divisas.getSelectedItem().equals("COP") && divisas1.getSelectedItem().toString() == "USD") {
	    			 resultado.setText(cantidad.getText() + " COP --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.00021))+" USD");	 
	    		 }if(divisas.getSelectedItem().equals("COP") && divisas1.getSelectedItem().toString() == "MXN") {
					 resultado.setText(cantidad.getText() + " COP --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.00388))+" MXN");	 
     			 }if(divisas.getSelectedItem().equals("COP") && divisas1.getSelectedItem().toString() == "JPY") {
     				 resultado.setText(cantidad.getText() + " COP --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.02743))+" JPY");
     			 
     			 }if(divisas.getSelectedItem().equals("MXN") && divisas1.getSelectedItem().toString() == "EUR") {
     				 resultado.setText(cantidad.getText() + " MXN --> " +String.valueOf((Float.parseFloat(cantidad.getText())) * 0.04956)+" EUR");
	    		 }if(divisas.getSelectedItem().equals("MXN") && divisas1.getSelectedItem().toString() == "USD") {
	    			 resultado.setText(cantidad.getText() + " MXN --> " +String.valueOf((Float.parseFloat(cantidad.getText())) * 0.05391)+" USD");	 
	    		 }if(divisas.getSelectedItem().equals("MXN") && divisas1.getSelectedItem().toString() == "COP") {
					 resultado.setText(cantidad.getText() + " MXN --> " +String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 256.457))+" COP");	 
     			 }if(divisas.getSelectedItem().equals("MXN") && divisas1.getSelectedItem().toString() == "JPY") {
     				 resultado.setText(cantidad.getText() + " MXN --> " +String.valueOf((Float.parseFloat(cantidad.getText())) * 7.05815)+" JPY");
	    		
     			 }if(divisas.getSelectedItem().equals("JPY") && divisas1.getSelectedItem().toString() == "EUR") {
     				 resultado.setText(cantidad.getText() + " JPY --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.00702))+" EUR");
    	   		 }if(divisas.getSelectedItem().equals("JPY") && divisas1.getSelectedItem().toString() == "USD") {
    	   			 resultado.setText(cantidad.getText() + " JPY --> " +String.valueOf((Float.parseFloat(cantidad.getText())) * 0.00764)+" USD");	 
        		 }if(divisas.getSelectedItem().equals("JPY") && divisas1.getSelectedItem().toString() == "COP") {
  					 resultado.setText(cantidad.getText() + " JPY --> " +String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 36.3292))+" COP");	 
       			 }if(divisas.getSelectedItem().equals("JPY") && divisas1.getSelectedItem().toString() == "MXN") {
    				 resultado.setText(cantidad.getText() + " JPY --> " +String.valueOf((Float.parseFloat(cantidad.getText())) * 0.1416)+" MXN");
    	    		 }
			}
	    });
		
	}
	
	private void listaA() {
		
		divisas1 = new JComboBox(monedas);
			divisas1.setBounds(220,240,120,20);
		fondo.add(divisas1);
		
		divisas1.addActionListener(new ActionListener() {
			
			DecimalFormat df = new DecimalFormat("0.0000");
				
			@Override 
			public void actionPerformed(ActionEvent e) {
				
				 if  (divisas.getSelectedItem().equals(divisas1.getSelectedItem())) {
					 resultado.setText(cantidad.getText());
					 
				 }if(divisas.getSelectedItem().equals("EUR") && divisas1.getSelectedItem().toString() == "USD") {
					 resultado.setText(cantidad.getText() + " USD --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText()) * 0.91918)))+" EUR");
				 }if(divisas.getSelectedItem().equals("EUR") && divisas1.getSelectedItem().toString() == "COP") {
					 resultado.setText(cantidad.getText() + " COP --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.00019))+" EUR");
				 }if(divisas.getSelectedItem().equals("EUR") && divisas1.getSelectedItem().toString() == "MXN") {
					 resultado.setText(cantidad.getText() + " MXN --> " +String.valueOf((Float.parseFloat(cantidad.getText())) * 0.04956)+" EUR");	 
				 }if(divisas.getSelectedItem().equals("EUR") && divisas1.getSelectedItem().toString() == "JPY") {
					 resultado.setText(cantidad.getText() + " JPY --> " + String.valueOf((Float.parseFloat(cantidad.getText())) * 0.00702)+" EUR");
					 
				 }if(divisas.getSelectedItem().equals("USD") && divisas1.getSelectedItem().toString() == "EUR") {
					 resultado.setText(cantidad.getText() + " EUR --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 1.08776))+" USD");	 
     			 }if(divisas.getSelectedItem().equals("USD") && divisas1.getSelectedItem().toString() == "COP") {
     				 resultado.setText(cantidad.getText() + " COP --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.00021))+" USD");
	    		 }if(divisas.getSelectedItem().equals("USD") && divisas1.getSelectedItem().toString() == "MXN") {
	    			 resultado.setText(cantidad.getText() + " MXN --> " +String.valueOf((Float.parseFloat(cantidad.getText())) * 0.05391)+" USD");
	    		 }if(divisas.getSelectedItem().equals("USD") && divisas1.getSelectedItem().toString() == "JPY") {
	    			 resultado.setText(cantidad.getText() + " JPY --> " +String.valueOf((Float.parseFloat(cantidad.getText())) * 0.00764)+" USD");	 
				 
	    		 }if(divisas.getSelectedItem().equals("COP") && divisas1.getSelectedItem().toString() == "EUR") {
	    			 resultado.setText(cantidad.getText() + " EUR --> " + String.valueOf((Float.parseFloat(cantidad.getText())) * 5174.24)+" COP");
	    		 }if(divisas.getSelectedItem().equals("COP") && divisas1.getSelectedItem().toString() == "USD") {
	    			 resultado.setText(cantidad.getText() + " USD --> " + String.valueOf((Float.parseFloat(cantidad.getText())) * 4756.79)+" COP");	 
	    		 }if(divisas.getSelectedItem().equals("COP") && divisas1.getSelectedItem().toString() == "MXN") {
	    			 resultado.setText(cantidad.getText() + " MXN --> " +String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 256.457))+" COP");
     			 }if(divisas.getSelectedItem().equals("COP") && divisas1.getSelectedItem().toString() == "JPY") {
     				 resultado.setText(cantidad.getText() + " JPY --> " +String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 36.3292))+" COP");
     			 
     			 }if(divisas.getSelectedItem().equals("MXN") && divisas1.getSelectedItem().toString() == "EUR") {
     				 resultado.setText(cantidad.getText() + " EUR --> " + String.valueOf((Float.parseFloat(cantidad.getText())) * 20.1672)+" MXN");
	    		 }if(divisas.getSelectedItem().equals("MXN") && divisas1.getSelectedItem().toString() == "USD") {
	    			 resultado.setText(cantidad.getText() + " USD --> " + String.valueOf((Float.parseFloat(cantidad.getText())) * 18.5401)+" MXN");
	    		 }if(divisas.getSelectedItem().equals("MXN") && divisas1.getSelectedItem().toString() == "COP") {
	    			 resultado.setText(cantidad.getText() + " COP --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.00388))+" MXN");	 
     			 }if(divisas.getSelectedItem().equals("MXN") && divisas1.getSelectedItem().toString() == "JPY") {
     				 resultado.setText(cantidad.getText() + " JPY --> " +String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.1416))+" MXN");
	    		
     			 }if(divisas.getSelectedItem().equals("JPY") && divisas1.getSelectedItem().toString() == "EUR") {
     				 resultado.setText(cantidad.getText() + " EUR --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 142.415))+" JPY");
    	   		 }if(divisas.getSelectedItem().equals("JPY") && divisas1.getSelectedItem().toString() == "USD") {
    	   			 resultado.setText(cantidad.getText() + " USD --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 130.915 ))+" JPY");	 
        		 }if(divisas.getSelectedItem().equals("JPY") && divisas1.getSelectedItem().toString() == "COP") {
        			 resultado.setText(cantidad.getText() + " COP --> " + String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 0.02743))+" JPY");	 
       			 }if(divisas.getSelectedItem().equals("JPY") && divisas1.getSelectedItem().toString() == "MXN") {
       				 resultado.setText(cantidad.getText() + " MXN --> " +String.valueOf(df.format((Float.parseFloat(cantidad.getText())) * 7.05815))+" JPY");
    	    		 }
     			 
			
			
			}
	    });
		
	}
										//JLABEL DONDE SE MOSTRARÁ EL RESULTADO					
	private void resultadoConversion() {
		
		resultado = new JLabel(); 
			resultado.setHorizontalAlignment(SwingConstants.CENTER);
			resultado.setBounds(40,320,300,130);
			resultado.setFont(new Font("arial",1,20));
			resultado.setForeground(Color.LIGHT_GRAY);
		fondo.add(resultado);
		
	}
										//IMAGEN ALURA
	ImageIcon imgAlura = new ImageIcon("C:\\Users\\Usuario\\Desktop\\proyectos-terminados\\proyectoEncriptador\\imagenes\\Vector (1).png");
	private void imagenAlura() {
		
		imagAlura =new JLabel("C:\\Users\\Usuario\\Desktop\\proyectos-terminados\\proyectoEncriptador\\imagenes\\Vector (1).png");
			imagAlura.setBounds(10,10,50,50);
			imagAlura.setIcon(new ImageIcon(imgAlura.getImage().getScaledInstance(imagAlura.getWidth(),imagAlura.getHeight(), Image.SCALE_DEFAULT)));
		fondo.add(imagAlura);
	}
	}			 
		
	
	





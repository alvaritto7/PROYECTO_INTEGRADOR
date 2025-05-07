package vistas;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


	
		public class DatosPersonales extends JPanel {

		    // Campos de texto para coger datos del usuario
		    private JTextField textNombre;
		    private JTextField textApellidos; // Apellidos
		    private JTextField textMail;   // Email
		    private JTextField textMatricula;
		    private JTextField textCiclo;
		    private JPasswordField passwordField; // Campo para contraseña (oculta)

		    // Constructor de la clase
		    public DatosPersonales() {
		        // Establece la fuente predeterminada para la ventana
		        setFont(new Font("Dialog", Font.BOLD, 12));
		        setTitle("Datos Personales"); // Título de la ventana

		        // Inicializa y configura los campos de texto
		        textNombre = new JTextField();
		        textNombre.setBackground(Color.WHITE);
		        textNombre.setColumns(10);
		        getContentPane().add(textNombre);

		        textApellidos = new JTextField(); // Apellidos
		        textApellidos.setBackground(Color.WHITE);
		        textApellidos.setColumns(10);
		        getContentPane().add(textApellidos);

		        textMail = new JTextField(); // Email
		        textMail.setBackground(Color.WHITE);
		        textMail.setColumns(10);
		        getContentPane().add(textMail);

		        textMatricula = new JTextField(); //matricula
		        textMatricula.setBackground(Color.WHITE);
		        textMatricula.setColumns(10);
		        getContentPane().add(textMatricula);

		        textCiclo = new JTextField(); //ciclo
		        textCiclo.setBackground(Color.WHITE);
		        textCiclo.setColumns(10);
		        getContentPane().add(textCiclo);

		        // Campo para contraseña
		        passwordField = new JPasswordField();
		        getContentPane().add(passwordField);

		        // Crear etiquetas para cada campo
		        JLabel lblNombre = new JLabel("Nombre:");
		        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));

		        JLabel lblApellidos = new JLabel("Apellidos:");
		        lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 12));

		        JLabel lblEmail = new JLabel("Email:");
		        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));

		        JLabel lblMatricula = new JLabel("Matrícula:");
		        lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 12));

		        JLabel lblContraseña = new JLabel("Contraseña:");
		        lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));

		        JLabel lblCiclo = new JLabel("Ciclo:");
		        lblCiclo.setFont(new Font("Tahoma", Font.BOLD, 12));

		        // Botón para borrar los campos
		        JButton btnBorrar = new JButton("Borrar");
		        btnBorrar.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		               
		            }
		        });

		        // Botón para guardar los datos
		        JButton btnGuardar = new JButton("Guardar");
		        btnGuardar.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                
		            }
		        });

		        
		        JButton btnNuevo_2 = new JButton("Nuevo");

		        
		        // Aplica el layout configurado a la ventana
		        getContentPane().setLayout(groupLayout);

		        // Configura el menú superior
		        JMenuBar menuBar = new JMenuBar();
		        setJMenuBar(menuBar);

		        // Menús de la barra
		        JMenu mnActividades = new JMenu("Actividades");
		        menuBar.add(mnActividades);

		        JMenu mnSalas = new JMenu("Salas");
		        menuBar.add(mnSalas);

		        JMenu mnNewMenu_2 = new JMenu("Datos Personales");
		        menuBar.add(mnNewMenu_2);
		    }

		   public void mostrarVentana() {
			   
			   setVisible(true);
		   }
		    
		    
		   
		    
		}


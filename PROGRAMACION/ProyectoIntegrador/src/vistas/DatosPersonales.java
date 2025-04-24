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


	
		public class DatosPersonales extends JFrame {

		    // Campos de texto para coger datos del usuario
		    private JTextField textNombre;
		    private JTextField textField_1; // Apellidos
		    private JTextField textField;   // Email
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

		        textField_1 = new JTextField(); // Apellidos
		        textField_1.setBackground(Color.WHITE);
		        textField_1.setColumns(10);

		        textField = new JTextField(); // Email
		        textField.setBackground(Color.WHITE);
		        textField.setColumns(10);

		        textMatricula = new JTextField(); //matricula
		        textMatricula.setBackground(Color.WHITE);
		        textMatricula.setColumns(10);

		        textCiclo = new JTextField(); //ciclo
		        textCiclo.setBackground(Color.WHITE);
		        textCiclo.setColumns(10);

		        // Campo para contraseña
		        passwordField = new JPasswordField();

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

		        // Diseño del panel con GroupLayout(tipo de layout) para alinear componentes
		        GroupLayout groupLayout = new GroupLayout(getContentPane());
		        groupLayout.setHorizontalGroup(
		            groupLayout.createParallelGroup(Alignment.LEADING)
		                .addGroup(groupLayout.createSequentialGroup()
		                		
		                		//TODO
		                    .addGap(59)
		                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
		                        // Campo Contraseña
		                        .addGroup(groupLayout.createSequentialGroup()
		                            .addComponent(lblContraseña, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
		                            .addPreferredGap(ComponentPlacement.RELATED)
		                            .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
		                        // Campos de texto (nombre, apellidos, etc.)
		                        .addGroup(groupLayout.createSequentialGroup()
		                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
		                                .addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                .addComponent(lblApellidos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                .addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                .addComponent(lblMatricula, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
		                            .addPreferredGap(ComponentPlacement.RELATED)
		                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
		                                .addComponent(textMatricula, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
		                                .addComponent(textField, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
		                                .addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
		                                .addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)))
		                        // Botones en la parte inferior
		                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
		                            .addComponent(btnNuevo_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		                            .addPreferredGap(ComponentPlacement.RELATED)
		                            .addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
		                            .addPreferredGap(ComponentPlacement.RELATED)
		                            .addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
		                        // Campo ciclo
		                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
		                            .addComponent(lblCiclo, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
		                            .addPreferredGap(ComponentPlacement.RELATED)
		                            .addComponent(textCiclo, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)))
		                    .addGap(125))
		        );

		        groupLayout.setVerticalGroup(
		            groupLayout.createParallelGroup(Alignment.LEADING)
		                .addGroup(groupLayout.createSequentialGroup()
		                    .addGap(78)
		                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
		                        .addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		                        .addComponent(lblNombre))
		                    .addGap(18)
		                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
		                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		                        .addComponent(lblApellidos))
		                    .addGap(18)
		                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
		                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		                        .addComponent(lblEmail))
		                    .addGap(18)
		                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
		                        .addComponent(lblMatricula)
		                        .addComponent(textMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		                    .addGap(18)
		                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
		                        .addComponent(lblContraseña, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
		                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		                    .addGap(18)
		                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
		                        .addComponent(lblCiclo, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
		                        .addComponent(textCiclo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		                    .addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
		                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
		                        .addComponent(btnBorrar)
		                        .addComponent(btnNuevo_2)
		                        .addComponent(btnGuardar))
		                    .addGap(21))
		        );

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


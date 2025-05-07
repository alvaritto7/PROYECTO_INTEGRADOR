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

public class Login extends JFrame {

    // Campo de texto para ingresar la matrícula
    private JTextField textMatricula;

    // Campo de contraseña (texto oculto)
    private JPasswordField passwordField;

    // Constructor de la clase
    public Login() {
    	
    	getContentPane().setLayout(null);
        // Configura la fuente de la ventana
        setFont(new Font("Dialog", Font.BOLD, 12));
        // Establece el título que aparecerá en la barra de la ventana
        setTitle("Ventana de Inicio UEM");

        // Campo para introducir la matrícula
        textMatricula = new JTextField();
        textMatricula.setLocation(138, 26);
        textMatricula.setSize(186, 30);
        textMatricula.setBackground(new Color(255, 255, 255)); // Fondo blanco
        textMatricula.setColumns(10); // Número de columnas visibles
        getContentPane().add(textMatricula);

        // Etiqueta para la matrícula
        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setLocation(21, 24);
        lblMatricula.setSize(107, 30);
        lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 12));
        getContentPane().add(lblMatricula);

        // Etiqueta para la contraseña
        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setLocation(21, 64);
        lblContraseña.setSize(95, 30);
        lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));
        getContentPane().add(lblContraseña);

        // Botón de "Guardar" (aunque actúa como "Login", por el nombre confunde un poco)
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setLocation(21, 118);
        btnGuardar.setSize(144, 30);
        getContentPane().add(btnGuardar);
//        // Acción que se ejecuta cuando se presiona el botón (actualmente vacía)
//        btnGuardar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                
//            }
//        });

        // Campo para ingresar la contraseña
        passwordField = new JPasswordField();
        passwordField.setBounds(138, 66, 186, 30);
        getContentPane().add(passwordField);

        
    }
    
    public void mostrarLogin() {
    	setVisible(true);
    }
}
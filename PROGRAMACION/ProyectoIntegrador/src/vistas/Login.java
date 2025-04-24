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
    private JTextField textSala;

    // Campo de contraseña (texto oculto)
    private JPasswordField passwordField;

    // Constructor de la clase
    public Login() {
        // Configura la fuente de la ventana
        setFont(new Font("Dialog", Font.BOLD, 12));
        // Establece el título que aparecerá en la barra de la ventana
        setTitle("Ventana de Inicio UEM");

        // Campo para introducir la matrícula
        textSala = new JTextField();
        textSala.setBackground(new Color(255, 255, 255)); // Fondo blanco
        textSala.setColumns(10); // Número de columnas visibles

        // Etiqueta para la matrícula
        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 12));

        // Etiqueta para la contraseña
        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));

        // Botón de "Guardar" (aunque actúa como "Login", por el nombre confunde un poco)
        JButton btnGuardar = new JButton("Guardar");
        // Acción que se ejecuta cuando se presiona el botón (actualmente vacía)
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        // Campo para ingresar la contraseña
        passwordField = new JPasswordField();

        // Layout de la ventana usando GroupLayout
        //TODO
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(363)
                            .addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(98)
                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                .addComponent(lblContraseña, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMatricula))
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                .addComponent(passwordField)
                                .addComponent(textSala, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(37, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(157)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(textSala, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMatricula))
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblContraseña)
                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(168)
                    .addComponent(btnGuardar)
                    .addContainerGap(21, Short.MAX_VALUE))
        );

        // Se asigna el layout a la ventana
        getContentPane().setLayout(groupLayout);
        
        
        
    }
    
    public void mostrarLogin() {
    	login.setVisible(true);
    }
}
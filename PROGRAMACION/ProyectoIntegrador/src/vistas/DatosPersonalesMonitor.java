package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatosPersonalesMonitor extends JPanel {
    private JTextField textNombre;
    private JTextField textApellidos;
    private JTextField textEmail;
    private JTextField textMatricula;
    private JTextField textCiclo;
    private JPasswordField passwordField;

    public DatosPersonalesMonitor() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblApellidos = new JLabel("Apellidos:");
        JLabel lblEmail = new JLabel("Correo electrónico:");
        JLabel lblMatricula = new JLabel("Matrícula:");
        JLabel lblContraseña = new JLabel("Contraseña:");
        JLabel lblCiclo = new JLabel("Ciclo:");

        textNombre = new JTextField(15);
        textApellidos = new JTextField(15);
        textEmail = new JTextField(15);
        textMatricula = new JTextField(15);
        passwordField = new JPasswordField(15);
        textCiclo = new JTextField(15);

      
        gbc.gridx = 0; gbc.gridy = 0;
        add(lblNombre, gbc);
        gbc.gridx = 1;
        add(textNombre, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(lblApellidos, gbc);
        gbc.gridx = 1;
        add(textApellidos, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(lblEmail, gbc);
        gbc.gridx = 1;
        add(textEmail, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(lblMatricula, gbc);
        gbc.gridx = 1;
        add(textMatricula, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(lblContraseña, gbc);
        gbc.gridx = 1;
        add(passwordField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(lblCiclo, gbc);
        gbc.gridx = 1;
        add(textCiclo, gbc);

    
        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnBorrar = new JButton("Borrar");

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.add(btnNuevo);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnBorrar);

        gbc.gridx = 0; gbc.gridy++;
        gbc.gridwidth = 2;
        add(panelBotones, gbc);

        
        btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNombre.setText("");
                textApellidos.setText("");
                textEmail.setText("");
                textMatricula.setText("");
                passwordField.setText("");
                textCiclo.setText("");
            }
        });
    }

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario Datos Personales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DatosPersonalesMonitor());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


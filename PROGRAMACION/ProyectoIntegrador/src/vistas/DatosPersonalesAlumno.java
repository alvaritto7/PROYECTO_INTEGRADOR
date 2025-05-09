package vistas;

import javax.swing.*;
import java.awt.*;

public class DatosPersonalesAlumno extends JPanel {
    private JTextField textNombre;
    private JTextField textApellidos;
    private JTextField textEmail;
    private JTextField textMatricula;
    private JTextField textCiclo;
    private JPasswordField passwordField;

    public DatosPersonalesAlumno() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        textNombre = new JTextField(15);
        add(textNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Apellidos:"), gbc);
        gbc.gridx = 1;
        textApellidos = new JTextField(15);
        add(textApellidos, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Correo electrónico:"), gbc);
        gbc.gridx = 1;
        textEmail = new JTextField(15);
        add(textEmail, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Matrícula:"), gbc);
        gbc.gridx = 1;
        textMatricula = new JTextField(15);
        add(textMatricula, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Contraseña:"), gbc);
        gbc.gridx = 1;
        passwordField = new JPasswordField(15);
        add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Ciclo:"), gbc);
        gbc.gridx = 1;
        textCiclo = new JTextField(15);
        add(textCiclo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(new JButton("Guardar"), gbc);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario Datos Personales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DatosPersonalesAlumno());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

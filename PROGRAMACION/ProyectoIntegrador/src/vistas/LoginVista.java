package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginVista extends JFrame {
    private JTextField txtUsuario = new JTextField(15);
    private JPasswordField txtPassword = new JPasswordField(15);
    private JButton btnLogin = new JButton("Aceptar");

    public LoginVista() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Usuario:"));
        add(txtUsuario);
        add(new JLabel("Contraseña:"));
        add(txtPassword);
        add(new JLabel(""));
        add(btnLogin);
    }

    public void hacerVisible() {
    	setLocationRelativeTo(null);
        setVisible(true);        
    }

    public String getUsuario() {
        return txtUsuario.getText();
    }

    public String getPassword() {
        return new String(txtPassword.getPassword());
    }

    public void setLoginListener(ActionListener listener) {
        btnLogin.addActionListener(listener);
    }
}
package vistas;

import javax.swing.*;

import Controladores.LoginControl;

import java.awt.*;

/**
 * Ventana de inicio de sesión para usuarios o monitores del gimnasio.
 * Permite introducir matrícula y contraseña para acceder al sistema.
 */
public class LoginVista extends JFrame {

    /** Campo de texto para introducir la matrícula del usuario. */
    private JTextField txtUsuario;

    /** Campo de texto para introducir la contraseña. */
    private JPasswordField txtPassword;

    /** Botón para enviar los datos de inicio de sesión. */
    private JButton btnLogin;

    /** Controlador encargado de gestionar el evento de login. */
    private LoginControl escuchador;

    /**
     * Constructor de la ventana de login.
     * Inicializa los componentes gráficos y configura sus posiciones.
     */
    public LoginVista() {
        setTitle("Login - Usuario/Monitor Gimnasio.");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(452, 200);
        getContentPane().setLayout(null);

        JLabel lblUsuario = new JLabel("Matrícula: ");
        lblUsuario.setLocation(46, 27);
        lblUsuario.setSize(100, 30);
        getContentPane().add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setLocation(150, 28);
        txtUsuario.setSize(186, 30);
        getContentPane().add(txtUsuario);

        JLabel lblpassword = new JLabel("Contraseña: ");
        lblpassword.setLocation(46, 68);
        lblpassword.setSize(100, 30);
        getContentPane().add(lblpassword);

        txtPassword = new JPasswordField();
        txtPassword.setLocation(150, 68);
        txtPassword.setSize(186, 30);
        getContentPane().add(txtPassword);

        JButton btnLogin = new JButton("Login");
        btnLogin.setLocation(150, 108);
        btnLogin.setSize(100, 30);
        getContentPane().add(btnLogin);

        escuchador = new LoginControl(this);
        btnLogin.addActionListener(escuchador);
    }

    /**
     * Devuelve el campo de texto donde se introduce la matrícula del usuario.
     * @return JTextField correspondiente a la matrícula.
     */
    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    /**
     * Devuelve el campo de texto para introducir la contraseña.
     * @return JPasswordField correspondiente a la contraseña.
     */
    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    /**
     * Devuelve el botón utilizado para iniciar sesión.
     * @return JButton del login.
     */
    public JButton getBtnLogin() {
        return btnLogin;
    }

    /**
     * Devuelve el texto introducido en el campo de matrícula.
     * @return Matrícula como cadena de texto.
     */
    public String getUsuario() {
        return txtUsuario.getText();
    }

    /**
     * Devuelve la contraseña introducida en el campo correspondiente.
     * @return Contraseña como cadena de texto.
     */
    public String getPassword() {
        return new String(txtPassword.getPassword());
    }

    /**
     * Muestra la ventana de login.
     */
    public void hacerVisible() {
        setVisible(true);
    }
}


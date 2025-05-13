package vistas;

import javax.swing.*;

import Controladores.LoginControl;

import java.awt.*;
import java.awt.event.ActionListener;

public class LoginVista extends JFrame {
	
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	
	private LoginControl escuchador;
	
	
	
	public LoginVista() {
		
		setTitle("Login - Usuario/Monitor Gimnasio.");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,400);
		
		getContentPane().setLayout(null);
		
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setLocation(46, 27);
		lblUsuario.setSize(54, 30);
		getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setLocation(121, 28);
		txtUsuario.setSize(186, 30);
		getContentPane().add(txtUsuario);
		
		
		JLabel lblpassword = new JLabel("Contraseña: ");
		lblpassword.setLocation(46, 68);
		lblpassword.setSize(68, 30);
		getContentPane().add(lblpassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setLocation(121, 68);
		txtPassword.setSize(186, 30);
		getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setLocation(169, 108);
		btnLogin.setSize(93, 30);
		getContentPane().add(btnLogin);
		
		escuchador = new LoginControl(this);
		btnLogin.addActionListener(escuchador);
	}
	
	 public JTextField getTxtUsuario() {
	        return txtUsuario;
	 	}

	 public JPasswordField getTxtPassword() {
	        return txtPassword;
	    }

	 public JButton getBtnLogin() {
	        return btnLogin;
	    }
	 
	 public String getUsuario() {
		    return txtUsuario.getText();
		}
	 
	 public String getPassword() {
		    return new String(txtPassword.getPassword());
		}
	 
	 public void hacerVisible() {
	        setVisible(true);
	    }

}

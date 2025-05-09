package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Modelo.LoginModelo;
import vistas.Alumno;
import vistas.LoginVista;
import vistas.Monitor;

public class LoginControl {
    
	private LoginModelo modelo;
    
    private LoginVista vista;

    public LoginControl(LoginModelo modelo, LoginVista vista) {
        this.modelo = modelo; 
        
        this.vista = vista;

        this.vista.setLoginListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = vista.getUsuario();                
                String password = vista.getPassword();
                
                String resultado = modelo.validarUsuario(usuario, password);

                switch (resultado) {
                    case "Usuario no existe":
                        JOptionPane.showMessageDialog(vista, "El usuario introducido no existe en la base de datos.");
                        break;
                        
                    case "Contraseña incorrecta":
                       JOptionPane.showMessageDialog(vista, "Contraseña Incorrecta, porfavor vuelva a intentarlo.");
                       
                        break;
                    
                    case "Login exitoso":
                     JOptionPane.showMessageDialog(vista, "Login exitoso!");
                       vista.dispose();                        
                        modelo.cerrarConexion(); 
                        
                        if(modelo.getTipo_usuario().equals("A")) {
                        	new Alumno().setVisible(true);
                        }
                        else {
                        	new Monitor().setVisible(true);
                        }
                        
                      
                        
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(vista, "Error en la validación.");
                }

                
            }
        });
    }
}
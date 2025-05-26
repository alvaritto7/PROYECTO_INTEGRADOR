package Main;

import javax.swing.JOptionPane;


import Controladores.LoginControl;
import Modelo.AccesoBD;

import vistas.LoginVista;

/**
 * Clase principal que inicia la aplicacion mostrando la ventana de login.
 */
public class Login {

    /**
     * Metodo principal que se ejecuta al iniciar el programa.
     * Se encarga de crear el modelo, la vista y el controlador del login.
     * 
     * @param args argumentos que se pueden pasar al programa desde la linea de comandos
     */
    public static void main(String[] args) {
    	
    	
	java.awt.EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				// TODO Auto-generated method stub        
		        LoginVista vista = new LoginVista();
		        LoginControl control = new LoginControl(vista);
		        vista.hacerVisible(); 
				
				

				
			}
			
		});
		
    	
   
        
    }

}

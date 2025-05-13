package Main;

import Controladores.LoginControl;
import Modelo.LoginModelo;
import vistas.LoginVista;

public class VentanaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LoginModelo modelo = new LoginModelo();
		 
	     LoginVista vista = new LoginVista();
	     vista.hacerVisible(); 
	     
	     new LoginControl(vista);
		

	}

}

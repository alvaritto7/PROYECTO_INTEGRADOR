package Main;

import Controladores.LoginControl;
import Modelo.AccesoBD;
import vistas.LoginVista;

public class VentanaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AccesoBD modelo = new AccesoBD();
		 
	     LoginVista vista = new LoginVista();
	     vista.hacerVisible(); 
	     
	     LoginControl control = new LoginControl(vista);
		

	}

}

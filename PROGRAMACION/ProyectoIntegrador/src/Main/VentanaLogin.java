package Main;

import Controladores.LoginControl;
import Modelo.AccesoBD;
import vistas.LoginVista;

/**
 * Clase principal que inicia la aplicacion mostrando la ventana de login.
 */
public class VentanaLogin {

    /**
     * Metodo principal que se ejecuta al iniciar el programa.
     * Se encarga de crear el modelo, la vista y el controlador del login.
     * 
     * @param args argumentos que se pueden pasar al programa desde la linea de comandos
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AccesoBD modelo = new AccesoBD();

        LoginVista vista = new LoginVista();
        vista.hacerVisible(); 

        LoginControl control = new LoginControl(vista);
    }

}

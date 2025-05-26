package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Modelo.Actividad;
import Modelo.Usuario;
import Modelo.AccesoBD;
import vistas.Alumno;
import vistas.LoginVista;
import vistas.Monitor;
import Main.Sesion;

/**
 * Controlador para gestionar el login de usuarios.
 * Escucha los eventos de la vista de login y valida las credenciales.
 */
public class LoginControl implements ActionListener {

    private AccesoBD modelo;

    private LoginVista vista;

    /**
     * Constructor que recibe la vista de login y crea el modelo de acceso a base de datos.
     * 
     * @param vista la ventana de login que controla
     */
    public LoginControl(LoginVista vista) {
        this.modelo = new AccesoBD();
        this.vista = vista;
    }

    /**
     * Metodo que se ejecuta cuando se realiza una accion en la vista.
     * Valida el usuario y password, y abre la ventana correspondiente segun el tipo de usuario.
     * 
     * @param e evento de accion (como presionar el boton de login)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = vista.getUsuario();
        String password = vista.getPassword();

        String resultado = modelo.validarUsuario(usuario, password);
        System.out.println("---> "+resultado);

        switch (resultado) {
            case "Usuario no existe":
                JOptionPane.showMessageDialog(vista, "Matricula incorrecta, por favor vuelva a intentarlo.");
                break;

            case "Contraseña incorrecta":
                JOptionPane.showMessageDialog(vista, "Contraseña Incorrecta, por favor vuelva a intentarlo.");
                break;

            case "Login exitoso":
                JOptionPane.showMessageDialog(vista, "Login exitoso!");
                vista.dispose();
                Usuario usuarioLogin = modelo.getUsuarioPorMatricula(usuario);
                Sesion.setUsuarioLogado(usuarioLogin);
                
                int seleccion = 0;
                
                if (modelo.getTipo_usuario().equals("M")) {
                
	                Object[] opciones = {"Alumno", "Monitor"};
	               
	                seleccion = JOptionPane.showOptionDialog(null,"Por favor, selecciona el modo en el que deseas acceder al programa.", 
	                    "Tipo de Acceso al programa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0] 
	                );
                }
                
                
                if(seleccion == 0)
                {
                	 AlumnoControl alumnoControl = new AlumnoControl();
                     Alumno alumnoVista = new Alumno(alumnoControl);
                     alumnoVista.setVisible(true);
                }
                else
                {
                	 ArrayList<Actividad> actividades = modelo.consultaActividades();
                     // pedir a la bbdd la lista de actividades
                     // pasarsela a Monitor
                     MonitorControl control = new MonitorControl();
                     Monitor monitor = new Monitor(control);
                     //monitor.setActividades(actividades);
                     monitor.setVisible(true);
                }
                
                
//
//                if (modelo.getTipo_usuario().equals("A")) {
//                    AlumnoControl alumnoControl = new AlumnoControl();
//                    Alumno alumnoVista = new Alumno(alumnoControl);
//                    alumnoVista.setVisible(true);
//                } else {
//                    ArrayList<Actividad> actividades = modelo.consultaActividades();
//                    // pedir a la bbdd la lista de actividades
//                    // pasarsela a Monitor
//                    MonitorControl control = new MonitorControl();
//                    Monitor monitor = new Monitor(control);
//                    //monitor.setActividades(actividades);
//                    monitor.setVisible(true);
//                }
//                
                
                
                break;

            default:
                JOptionPane.showMessageDialog(vista, "Error en la validacion.");
        }

        //modelo.cerrarConexion();
    }
}

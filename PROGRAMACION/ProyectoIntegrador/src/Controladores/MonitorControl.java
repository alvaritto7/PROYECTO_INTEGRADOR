package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Main.Sesion;
import Modelo.AccesoBD;
import Modelo.Actividad;
import Modelo.Usuario;
import vistas.Alumno;
import vistas.Monitor;
import vistas.VistaDatosAlumno;
import vistas.VistaListaActividadesA;
import vistas.VistaListaActividadesAlumno;
import vistas.VistaListaActividadesM;
import vistas.VistaListaActividadesMonitor;

/**
 * Controlador para la gestion de acciones del monitor.
 * Atiende eventos de la interfaz y muestra diferentes vistas segun la opcion elegida.
 */
public class MonitorControl implements ActionListener {

    private Monitor vista;
    private AccesoBD accesobd = new AccesoBD();	

    /**
     * Metodo que se llama cuando se realiza una accion en la interfaz.
     * Dependiendo del comando realiza la accion correspondiente.
     *
     * @param e evento que contiene el comando accion
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        AccesoBD accesobd = new AccesoBD();

        switch (e.getActionCommand()) {
            case "ACTIVIDADES_DISPONIBLES":
                MostrarActividadesDisponibles();
                break;

            case "ACTIVIDADES_MONITOR":
                MostrarActividadesMonitor();
                break;

            case "MIS_INSCRIPCIONES":
                MostrarActividadesAlumno();
                break;

            case "VER_SALAS":
                // Pendiente implementar
                break;

            case "DATOS_ALUMNO":
                // Pendiente implementar
                break;

            case "NUEVA_ACTIVIDAD":
                // Pendiente implementar
                break;

            case "BORRAR_ACTIVIDAD":
                // Pendiente implementar
                break;

            case "INSCRIBIR_ALUMNO":
                InscribirAlumno();
                break;

            default:
                System.out.println("Comando no reconocido: " );
                break;
        }
    }

    /**
     * Metodo para inscribir un alumno en una actividad.
     * Actualmente esta comentado y pendiente de implementacion.
     */
    private void InscribirAlumno() { 
        // Codigo comentado, pendiente de implementar
    }

    /**
     * Muestra las actividades disponibles para el usuario logueado.
     * Crea un panel con la lista de actividades y la asigna a la vista.
     */
    private void MostrarActividadesDisponibles() {
        // Se crea como JPanel para pasarselo a la vista
        VistaListaActividadesM panelListaActividades = new VistaListaActividadesM(this);
        ArrayList<Actividad> actividades = accesobd.consultaActividadesDisponibles(Sesion.getUsuarioLogado().getIdUsuario());
        // Esto convierte el JPanel a VistaListaActividades para poder llamar a sus metodos
        panelListaActividades.setTitulo("Actividades Disponibles");   
        panelListaActividades.setActividades(actividades);        	 	
        vista.setPanel(panelListaActividades);            
    }

    /**
     * Muestra las actividades en las que el monitor esta asignado.
     * Carga la lista y la muestra en el panel correspondiente.
     */
    private void MostrarActividadesMonitor() {
        VistaListaActividadesM misActividades = new VistaListaActividadesM(this);
        ArrayList<Actividad> activ = accesobd.consultaActividadesMonitor(Sesion.getUsuarioLogado().getIdUsuario());
        misActividades.setTitulo("Actividades como Monitor");
        misActividades.setActividades(activ);  
        vista.setPanel(misActividades);
    }

    /**
     * Muestra las actividades en las que el monitor esta inscrito como alumno.
     * Carga y muestra las actividades en el panel.
     */
    private void MostrarActividadesAlumno() {
        VistaListaActividadesM misActividades = new VistaListaActividadesM(this);
        ArrayList<Actividad> activ = accesobd.consultaActividadesAlumno(Sesion.getUsuarioLogado().getIdUsuario());
        misActividades.setTitulo("Actividades como Alumno");
        misActividades.setActividades(activ);  
        vista.setPanel(misActividades);
    }

    /**
     * Obtiene la vista Monitor asociada a este controlador.
     * 
     * @return la vista Monitor
     */
    public Monitor getVista() {
        return vista;
    }

    /**
     * Asigna la vista Monitor a este controlador.
     * 
     * @param monitorVista la vista Monitor que se usara
     */
    public void setVista(Monitor monitorVista) {
        this.vista = monitorVista;
    }

}

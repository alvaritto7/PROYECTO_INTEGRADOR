package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import Main.Sesion;
import Modelo.AccesoBD;
import Modelo.Actividad;
import Modelo.Usuario;
import vistas.Alumno;

import vistas.VistaDatosAlumno;
import vistas.VistaListaActividadesA;
import vistas.VistaListaActividadesAlumno;

/**
 * Controlador para la clase Alumno.
 * Gestiona las acciones que realiza el alumno en la interfaz.
 */
public class AlumnoControl implements ActionListener {

    private Alumno vista;
    private AccesoBD accesobd = new AccesoBD();

    /**
     * Devuelve la vista asociada a este controlador.
     * 
     * @return vista del alumno
     */
    public Alumno getVista() {
        return vista;
    }

    /**
     * Asigna la vista del alumno a este controlador.
     * 
     * @param alumnoVista la vista que se va a manejar
     */
    public void setVista(Alumno alumnoVista) {
        this.vista = alumnoVista;
    }

    /**
     * Metodo que se ejecuta al hacer una accion en la interfaz.
     * Dependiendo del comando recibido, llama a diferentes metodos para gestionar la accion.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        VistaListaActividadesAlumno misActividades;
        VistaDatosAlumno panelDatosAlumno;
        VistaListaActividadesA panelListaActividades;
        Usuario datosAlumno;
        
        switch (e.getActionCommand()) {
            case "MIS_ACTIVIDADES":
                MostrarMisActividades();            
                break;
                
            case "DATOS_ALUMNO":
                MostrarDatosPersonales();  
                break;       
                
            case "ACTIVIDADES_DISPONIBLES":
                MostrarActividadesDisponibles();                        
                break;
                
            case "GUARDAR_DATOS_PERSONALES":
                GuardarDatosPersonales();            
                break;
                
            case "INSCRIBIR_ALUMNO":
                InscribirAlumno();
                break;
                
            case "BORRAR_INSCRIPCION" :
                BorrarInscripcion();               
                break;
            
            default:
                System.out.println("Comando no reconocido: " );
                break;
        }
    }

    /**
     * Borra la inscripcion del alumno en la actividad seleccionada.
     * Muestra un mensaje de confirmacion o error.
     */
    private void BorrarInscripcion() {
        VistaListaActividadesA misActividades = ((VistaListaActividadesA)vista.getPanel());
        Integer actividad_seleccionada = misActividades.getActividadSelecionada();    
        
        if(actividad_seleccionada != 0) {
            accesobd.BorrarInscripcion(Sesion.getUsuarioLogado().getIdUsuario(), actividad_seleccionada);        
            MostrarMisActividades();
            JOptionPane.showMessageDialog(vista, "Inscripcion eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una actividad.");
        }
    }
    
    /**
     * Inscribe al alumno en la actividad seleccionada.
     * Muestra un mensaje de confirmacion o error.
     */
    private void InscribirAlumno() {         
        VistaListaActividadesA panelListaActividades = new VistaListaActividadesA(this);
        panelListaActividades = ((VistaListaActividadesA)vista.getPanel());
        Integer actividad_seleccionada = panelListaActividades.getActividadSelecionada();      
        
        if(actividad_seleccionada != 0) {
            accesobd.RealizarInscripcion(Sesion.getUsuarioLogado().getIdUsuario(), actividad_seleccionada);
            JOptionPane.showMessageDialog(vista, "Inscripcion realizada correctamente.");
            MostrarActividadesDisponibles();
        } else {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una Inscripcion.");
        }
    }
    
    /**
     * Muestra en la vista las actividades en las que el alumno esta inscrito.
     */
    private void MostrarMisActividades() {
        //VistaListaActividadesAlumno misActividades = new VistaListaActividadesAlumno(this);
        VistaListaActividadesA misActividades = new VistaListaActividadesA(this);
        ArrayList<Actividad> activ = accesobd.consultaActividadesAlumno(Sesion.getUsuarioLogado().getIdUsuario());
        misActividades.setTitulo("Mis Actividades / Inscripciones");
        misActividades.MostrarBotonInscripcion("N");
        misActividades.MostrarBotonBorrar("S");
        misActividades.setActividades(activ);  
        vista.setPanel(misActividades);
    }
    
    /**
     * Muestra los datos personales del alumno en la vista.
     */
    private void MostrarDatosPersonales() {
        VistaDatosAlumno panelDatosAlumno = new VistaDatosAlumno(this);
        Usuario datosAlumno = Sesion.getUsuarioLogado();
        panelDatosAlumno.setDatosAlumno(datosAlumno);             
        vista.setPanel(panelDatosAlumno);           
    }
    
    /**
     * Muestra en la vista las actividades disponibles para que el alumno pueda inscribirse.
     */
    private void MostrarActividadesDisponibles() {
        //Se crea como JPanel para pasarselo a la vista
        VistaListaActividadesA panelListaActividades = new VistaListaActividadesA(this);
        ArrayList<Actividad> actividades = accesobd.consultaActividadesDisponibles(Sesion.getUsuarioLogado().getIdUsuario());
        //Esto convierte el JPanel a VistaListaActividades para poder llamar a sus metodos
        panelListaActividades.setTitulo("Actividades Disponibles");
        panelListaActividades.MostrarBotonInscripcion("S");
        panelListaActividades.MostrarBotonBorrar("N");
        panelListaActividades.setActividades(actividades);                 
        vista.setPanel(panelListaActividades);            
    }
    
    /**
     * Guarda los datos personales que el alumno haya modificado.
     * Muestra un mensaje confirmando el guardado.
     */
    private void GuardarDatosPersonales() {
        VistaDatosAlumno panelDatosAlumno = (VistaDatosAlumno)vista.getPanel();
        Usuario datosAlumno = panelDatosAlumno.getDatosAlumno();        
        accesobd.GuardarDatosPersonales(datosAlumno);
        JOptionPane.showMessageDialog(vista, "Datos guardados correctamente.");
    }
}

package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Main.Sesion;
import Modelo.AccesoBD;
import Modelo.Actividad;
import Modelo.Sala;
import Modelo.Usuario;
import vistas.*;

/**
 * Controlador para la gestion de acciones del monitor.
 * Atiende eventos de la interfaz y muestra diferentes vistas segun la opcion elegida.
 */
public class MonitorControl implements ActionListener {

    private Monitor vista;
    private AccesoBD modelo = new AccesoBD();

    /**
     * Metodo que se llama cuando se realiza una accion en la interfaz.
     * Dependiendo del comando realiza la accion correspondiente.
     *
     * @param e evento que contiene el comando accion
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        AccesoBD modelo = new AccesoBD();

        switch (e.getActionCommand()) {
            case "ACTIVIDADES_DISPONIBLES":
                MostrarActividadesDisponibles();
                break;

            case "MIS_ACTIVIDADES":
                MostrarActividadesMonitor();
                break;

            case "DATOS_MONITOR":
                MostrarDatosPersonales();
                break;

            case "GUARDAR_DATOS_PERSONALES":
                GuardarDatosPersonales();
                break;

            case "NUEVA_ACTIVIDAD":
                NuevaActividad();
                break;

            case "EDITAR_ACTIVIDAD":
                EditarActividad();
                break;

            case "BORRAR_ACTIVIDAD":
                BorrarActividad();
                break;

            case "GUARDAR_ACTIVIDAD":
                GuardarActividad();
                break;

            case "VER_SALAS":
                VerSalas();
                break;
                
            case "CERRAR_SESION" :
            	CerrarSesion();               
                break;
            
//
//            case "NUEVA_SALA":
//                NuevaSala();
//                break;
//
//            case "EDITAR_SALA":
//                EditarSala();
//                break;
//
//            case "BORRAR_SALA":
//                BorrarSala();
//                break;
//
//            case "GUARDAR_SALA":
//                GuardarSala();
//                break;

            case "VOLVER_A_SALAS":
                VerSalas();
                break;

            case "VOLVER_A_DISPONIBLES":
            	MostrarActividadesMonitor();
                break;

            default:
                System.out.println("Comando no reconocido: ");
                break;
        }
    }

    
    private void CerrarSesion()
    {
    	vista.dispose();
    	System.exit(0);
    	
    }
    
    
    
    /**
     * Muestra la lista de salas disponibles.
     * Recupera las salas desde el modelo y actualiza el panel de la vista.
     */
    private void VerSalas() {
        VistaListaSalas panelSalas = new VistaListaSalas(this);
        ArrayList<Sala> listaSalas = modelo.getListaSalas();
        panelSalas.setSalas(listaSalas);
        vista.setPanel(panelSalas);
    }

//    /**
//     * Crea un nuevo formulario para registrar una sala.
//     */ 
//    private void NuevaSala() {
//        VistaDatosSala datosSala = new VistaDatosSala(this);
//        datosSala.setTitulo("Crear Nueva Sala");
//        vista.setPanel(datosSala);
//    }
//
//    /**
//     * Borra una sala seleccionada por el usuario.
//     * Si no se selecciona ninguna, no hace nada.
//     */
//    private void BorrarSala() {
//        VistaListaSalas panelSalas = (VistaListaSalas) vista.getPanel();
//        Integer id_sala = panelSalas.getSalaSelecionada();
//        if (id_sala != 0) {
//            modelo.BorrarSala(id_sala);
//            VerSalas();
//        }
//    }
//
//    /**
//     * Guarda una nueva sala o actualiza una existente.
//     * Recupera los datos desde el panel actual.
//     */
//    private void GuardarSala() {
//        VistaDatosSala datosSala = (VistaDatosSala) vista.getPanel();
//        Sala sala = datosSala.getDatosSala();
//        modelo.GuardarSala(sala);
//        VerSalas();
//    }
//
//    /**
//     * Muestra un formulario para editar los datos de una sala existente.
//     * Recupera la sala seleccionada por el usuario y carga sus datos.
//     */
//    private void EditarSala() {
//        VistaListaSalas panelListaSalas = (VistaListaSalas) vista.getPanel();
//        Integer id_sala = panelListaSalas.getSalaSelecionada();
//
//        VistaDatosSala editarPanel = new VistaDatosSala(this);
//        editarPanel.setTitulo("Modificar Datos Sala");
//        if (id_sala != 0) {
//            editarPanel.setDatosSala(modelo.getSalaById(id_sala));
//            vista.setPanel(editarPanel);
//        }
//    }

    /**
     * Elimina una actividad seleccionada por el monitor.
     * Si no hay seleccion, no realiza ninguna accion.
     */
    private void BorrarActividad() {
    	
    	
	        VistaListaActividadesM panelDetalle = (VistaListaActividadesM) vista.getPanel();
	        Integer id_actividad = panelDetalle.getActividadSelecionada();
	        if (id_actividad != 0) {
	            modelo.BorrarActividad(id_actividad);
	            MostrarActividadesMonitor();
	        }
    	
        
        
    }

    /**
     * Guarda una nueva actividad o actualiza una existente.
     * Actualiza la vista una vez guardado.
     */
    private void GuardarActividad() {
        VistaDatosActividad panelDetalle = (VistaDatosActividad) vista.getPanel();
        Actividad a = panelDetalle.getDatos();
        panelDetalle.setDatos(modelo.guardarActividad(a));
        MostrarActividadesMonitor();
    }

    /**
     * Muestra un formulario vacio para registrar una nueva actividad.
     */
    private void NuevaActividad() {
        VistaDatosActividad editarPanel = new VistaDatosActividad(this);
        editarPanel.setTitulo("Nueva Actividad");
        vista.setPanel(editarPanel);
    }

    /**
     * Muestra un formulario con los datos de una actividad para su edicion.
     */
    private void EditarActividad() {
        VistaListaActividadesM panelDetalle = (VistaListaActividadesM) vista.getPanel();
        Integer id_actividad = panelDetalle.getActividadSelecionada();

        VistaDatosActividad editarPanel = new VistaDatosActividad(this);
        editarPanel.setTitulo("Modificar Datos Actividad");
        if (id_actividad != 0) {
            editarPanel.setDatos(modelo.getActividadById(id_actividad));
            vista.setPanel(editarPanel);
        }
    }

    /**
     * Guarda los datos personales del monitor en el modelo.
     * Muestra un mensaje de confirmacion al finalizar.
     */
    private void GuardarDatosPersonales() {
        VistaDatosMonitor panelDatosMonitor = (VistaDatosMonitor) vista.getPanel();
        Usuario datosMonitor = panelDatosMonitor.getDatosMonitor();
        Usuario usuarioGuardado = modelo.GuardarDatosPersonales(datosMonitor);
        Sesion.setUsuarioLogado(usuarioGuardado);
        JOptionPane.showMessageDialog(vista, "Datos guardados correctamente.");
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
        VistaListaActividadesM panelListaActividades = new VistaListaActividadesM(this);
        ArrayList<Actividad> actividades = modelo.consultaActividades();
        panelListaActividades.setTitulo("Lista de Actividades de todos los monitores");
        panelListaActividades.setActividades(actividades);
        panelListaActividades.OcultarBotones();
        vista.setPanel(panelListaActividades);
    }

    /**
     * Muestra las actividades en las que el monitor esta asignado.
     * Carga la lista y la muestra en el panel correspondiente.
     */
    private void MostrarActividadesMonitor() {
        VistaListaActividadesM misActividades = new VistaListaActividadesM(this);
        ArrayList<Actividad> activ = modelo.consultaActividadesMonitor(Sesion.getUsuarioLogado().getIdUsuario());
        misActividades.setTitulo("Mis Actividades como Monitor");
        misActividades.setActividades(activ);
        vista.setPanel(misActividades);
    }

    /**
     * Muestra las actividades en las que el monitor esta inscrito como alumno.
     * Carga y muestra las actividades en el panel.
     */
    private void MostrarActividadesAlumno() {
        VistaListaActividadesM misActividades = new VistaListaActividadesM(this);
        ArrayList<Actividad> activ = modelo.consultaActividadesAlumno(Sesion.getUsuarioLogado().getIdUsuario());
        misActividades.setTitulo("Mis Actividades como Alumno");
        misActividades.setActividades(activ);
        vista.setPanel(misActividades);
    }

    /**
     * Muestra los datos personales del monitor logueado.
     * Se carga un panel con los datos actuales.
     */
    private void MostrarDatosPersonales() {
        VistaDatosMonitor panelDatosMonitor = new VistaDatosMonitor(this);
        Usuario datosMonitor = Sesion.getUsuarioLogado();
        panelDatosMonitor.setDatosMonitor(datosMonitor);
        vista.setPanel(panelDatosMonitor);
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

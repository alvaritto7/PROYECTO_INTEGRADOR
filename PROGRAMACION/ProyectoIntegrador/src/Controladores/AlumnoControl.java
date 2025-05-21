package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import Main.Sesion;
import Modelo.AccesoBD;
import Modelo.Actividad;
import Modelo.Usuario;
import vistas.Alumno;
import vistas.VistaDatosAlumno;
import vistas.VistaListaActividades;
import vistas.VistaListaActividadesAlumno;

public class AlumnoControl implements ActionListener {

	private Alumno vista;
	
	
	public Alumno getVista() {
		return vista;
	}


	public void setVista(Alumno alumnoVista) {
		this.vista = alumnoVista;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		AccesoBD accesobd = new AccesoBD();
		
		switch (e.getActionCommand()) {
        case "MIS_ACTIVIDADES":
        	 JPanel misActividades = new VistaListaActividadesAlumno();
        	 ArrayList<Actividad> activ = accesobd.consultaActividadesAlumno(Sesion.getUsuarioLogado().getIdUsuario());
        	 ((VistaListaActividadesAlumno)misActividades).setActividades(activ);  
        	 vista.setPanel(misActividades);
           break;
        case "DATOS_ALUMNO":
        	 JPanel panelDatosAlumno = new VistaDatosAlumno();
        	 Usuario datosAlumno = Sesion.getUsuarioLogado();
        	 ((VistaDatosAlumno)panelDatosAlumno).setDatosAlumno(datosAlumno);        	 
        	 vista.setPanel(panelDatosAlumno);            
            break;       
            
        case "ACTIVIDADES_DISPONIBLES":
        	//Se crea como JPanel para pasarselo a la vista
        	JPanel panelListaActividades = new VistaListaActividades();
        	ArrayList<Actividad> actividades = accesobd.consultaActividades();
        	//Esto convierte el JPanel a VistaListaActividades para poder llamar a sus metodos
        	((VistaListaActividades)panelListaActividades).setActividades(actividades);        	 	
        	vista.setPanel(panelListaActividades);            
            break;
        
        default:
            System.out.println("Comando no reconocido: " );
            break;
    }
		
		
		
	}

}

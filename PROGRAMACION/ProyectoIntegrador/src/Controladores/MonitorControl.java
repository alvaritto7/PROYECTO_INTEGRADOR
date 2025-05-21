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
import vistas.Monitor;
import vistas.VistaDatosAlumno;
import vistas.VistaListaActividades;
import vistas.VistaListaActividadesAlumno;

public class MonitorControl implements ActionListener{

private Monitor vista;
	
	
	public Monitor getVista() {
		return vista;
	}


	public void setVista(Monitor monitorVista) {
		this.vista = monitorVista;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
				AccesoBD accesobd = new AccesoBD();
				
				switch (e.getActionCommand()) {
		        case "MIS_ACTIVIDADES":
		        	
		           break;
		        case "DATOS_MONITOR":
		        	   
		            break;       
		            
		        case "ACTIVIDADES_DISPONIBLES":
		        	      
		            break;
		        
		        case "SALAS_LISTA":
	        	      
		            break;    
		        case "ACTIVIDADES_LISTA":
	        	      
		            break;       
		            
		        default:
		            System.out.println("Comando no reconocido: " );
		            break;
		
		
		
	}

}}

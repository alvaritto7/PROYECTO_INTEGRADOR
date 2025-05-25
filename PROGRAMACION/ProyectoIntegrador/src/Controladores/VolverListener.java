package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.Monitor;

public class VolverListener implements ActionListener {

	private Monitor monitor;
	
	public VolverListener(Monitor m) {
		monitor = m;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//monitor.mostrarVista("crearActividades", "Crear Actividades");
	}

}

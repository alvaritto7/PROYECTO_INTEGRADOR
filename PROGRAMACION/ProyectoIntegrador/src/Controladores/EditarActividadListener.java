/**
 * 
 */
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Actividad;
import vistas.EditarActividadPanel;
import vistas.Monitor;
import vistas.VistaListaActividadesMonitor;

/**
 * 
 */
public class EditarActividadListener implements ActionListener {

	private Monitor monitor;
	private VistaListaActividadesMonitor vista;

	public EditarActividadListener(VistaListaActividadesMonitor vistaListaActividadesMonitor, Monitor m) {
		monitor = m;
		this.vista = vistaListaActividadesMonitor;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// obtienes el elemento seleccionado de la lista (que está en la vistaListaAct...)
		
		Actividad a = vista.getList().getSelectedValue();		
		
		System.out.println(a);
		
		EditarActividadPanel editarPanel = new EditarActividadPanel(monitor, a);
		
		

		// después de crear el panel, metes en los JTextField (que has declarado como
		// atributos y que por tanto puedes hacer un setter del texto que tienen dentro)
		// los datos de la actividad

		monitor.getPanelContenido().add(editarPanel, "editarActividad");
		//monitor.mostrarVista("editarActividad", "Editar Actividad");

	}

}

package vistas;

import javax.swing.*;

import Controladores.AlumnoControl;
import Controladores.MonitorControl;
import Main.Sesion;
import Modelo.Actividad;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * Clase que representa la ventana principal para el monitor.
 * Muestra un menu para gestionar actividades, salas y datos personales.
 */
public class Monitor extends JFrame {
   
    private JLabel lblTitulo;
    
    
    private JPanel panelActual;
    private JPanel panelContenido;
    private MonitorControl control;
    
   
    
    /**
     * Constructor que crea la ventana con el menu y las vistas iniciales.
     * Recibe la lista de actividades para mostrarlas.
     * 
     * @param actividades lista de actividades para mostrar en la vista
     */
    //public Monitor(ArrayList<Actividad> actividades) 
    public Monitor(MonitorControl controlador) 
    {
    	
    	control = controlador;
    	control.setVista(this);
    	
        setTitle("MONITOR " + Sesion.getUsuarioLogado().getNombreUsuario() + " " + Sesion.getUsuarioLogado().getApellidosUsuario());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // Barra de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Menu Actividades
        JMenu mnActividades = new JMenu("Actividades");
        menuBar.add(mnActividades);

        JMenuItem mntmCrearActividades = new JMenuItem("Actividades Disponibles");
        mnActividades.add(mntmCrearActividades);

        JMenuItem mntmMisInscripciones = new JMenuItem("Mis Actividades");
        mnActividades.add(mntmMisInscripciones);

        // Menu Salas
        JMenu mnSalas = new JMenu("Salas");
        menuBar.add(mnSalas);

        JMenuItem mntmVerSalas = new JMenuItem("Ver Salas");
        mntmVerSalas.addActionListener(control);
        mntmVerSalas.setActionCommand("VER_SALAS");
        
        mnSalas.add(mntmVerSalas);

        // Menu Datos Personales
        JMenu mnDatosPersonales = new JMenu("Datos Personales");
        menuBar.add(mnDatosPersonales);

        JMenuItem mntmDatosPersonales = new JMenuItem("Ver Datos");
        mnDatosPersonales.add(mntmDatosPersonales);

        // Panel superior con titulo
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        lblTitulo = new JLabel("");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        panelSuperior.add(lblTitulo);
        getContentPane().add(panelSuperior, BorderLayout.NORTH);

        // Panel de contenido con CardLayout para cambiar vistas
        panelContenido = new JPanel(new CardLayout());
        getContentPane().add(panelContenido, BorderLayout.CENTER);

        // Vistas que se podran mostrar en el panel contenido        
        //JPanel vistaCrearActividades = new VistaListaActividadesMonitor(this, actividades);
        
        
         
        // Listeners para cambiar la vista segun opcion del menu
        mntmCrearActividades.addActionListener(control);
        mntmCrearActividades.setActionCommand("ACTIVIDADES_DISPONIBLES");

        mntmMisInscripciones.addActionListener(control);
        mntmMisInscripciones.setActionCommand("MIS_ACTIVIDADES");

        mntmVerSalas.addActionListener(control);

        mntmDatosPersonales.addActionListener(control);
        mntmDatosPersonales.setActionCommand("DATOS_MONITOR");
        
        JMenu mnCerrarSesion = new JMenu("Sesion");       
        menuBar.add(mnCerrarSesion);
        
        JMenuItem mnitemLogout = new JMenuItem("Logout");
        mnitemLogout.addActionListener(control);
        mnitemLogout.setActionCommand("CERRAR_SESION");
        mnCerrarSesion.add(mnitemLogout);

        // Mostrar la vista inicial por defecto
        //mostrarVista("crearActividades", "Crear Actividades");
    }

    

    /**
     * Devuelve el panel donde se muestran las vistas.
     * 
     * @return el panel de contenido
     */
	public JPanel getPanelContenido() {
		// TODO Auto-generated method stub
		return panelContenido;
	}
	
    /**
     * Cambia el panel que se muestra dentro de panelContenido.
     * Remueve el panel anterior y añade el nuevo.
     * 
     * @param nuevoPanel el nuevo panel que se quiere mostrar
     */
	 public void setPanel(JPanel nuevoPanel) {
	        if (panelActual != null) {
	        	panelContenido.remove(panelActual);
	        }

	        panelActual = nuevoPanel;
	        panelContenido.add(panelActual, BorderLayout.CENTER);

	        revalidate();  
	        repaint();    
	    }
	 
	
	 public JPanel getPanel() {    	
	        return panelActual;
	    }
	 
	 
}

package vistas;

import javax.swing.*;

import Controladores.AlumnoControl;
import Controladores.MonitorControl;
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
    private ArrayList<Actividad> actividades;
    
    private JPanel panelActual;
    private JPanel panelContenido;
    private MonitorControl control;
    
    /**
     * Constructor que crea la ventana con el menu y las vistas iniciales.
     * Recibe la lista de actividades para mostrarlas.
     * 
     * @param actividades lista de actividades para mostrar en la vista
     */
    public Monitor(ArrayList<Actividad> actividades) {
    	
    	//this.control = control;
    	//this.control.setVista(this);
    	
        setTitle("MONITOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Barra de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Menu Actividades
        JMenu mnActividades = new JMenu("Ver todas las Actividades");
        menuBar.add(mnActividades);

        JMenuItem mntmCrearActividades = new JMenuItem("Nueva actividad");
        mnActividades.add(mntmCrearActividades);

        JMenuItem mntmMisInscripciones = new JMenuItem("Mis Inscripciones");
        mnActividades.add(mntmMisInscripciones);

        // Menu Salas
        JMenu mnSalas = new JMenu("Salas");
        menuBar.add(mnSalas);

        JMenuItem mntmVerSalas = new JMenuItem("Ver Salas");
        mnSalas.add(mntmVerSalas);

        // Menu Datos Personales
        JMenu mnDatosPersonales = new JMenu("Datos Personales");
        menuBar.add(mnDatosPersonales);

        JMenuItem mntmDatosPersonales = new JMenuItem("Ver Datos");
        mnDatosPersonales.add(mntmDatosPersonales);

        // Panel superior con titulo
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        lblTitulo = new JLabel("Mis Actividades");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        panelSuperior.add(lblTitulo);
        add(panelSuperior, BorderLayout.NORTH);

        // Panel de contenido con CardLayout para cambiar vistas
        panelContenido = new JPanel(new CardLayout());
        add(panelContenido, BorderLayout.CENTER);

        // Vistas que se podran mostrar en el panel contenido
        JPanel vistaCrearActividades = new VistaListaActividadesMonitor(this, actividades);
        JPanel vistaMisInscripciones = new VistaListaActividades();
        JPanel vistaSalas = new VistaListaSalas();
        JPanel vistaDatosSala = new VistaDatosSala(this.control);
        //JPanel vistaDatosPersonales = new VistaDatosAlumno(this.control);

        // Se añaden las vistas con un nombre para identificarlas
        panelContenido.add(vistaCrearActividades, "crearActividades");
        panelContenido.add(vistaMisInscripciones, "misInscripciones");
        panelContenido.add(vistaSalas, "salas");
        //panelContenido.add(vistaDatosPersonales, "datospersonales");
        panelContenido.add(vistaDatosSala, "datossala");
         
        // Listeners para cambiar la vista segun opcion del menu
        mntmCrearActividades.addActionListener((ActionEvent e) -> {
            mostrarVista("crearActividades", "Crear Actividades");
        });

        mntmMisInscripciones.addActionListener((ActionEvent e) -> {
            mostrarVista("misInscripciones", "Mis Inscripciones");
        });

        mntmVerSalas.addActionListener((ActionEvent e) -> {
            mostrarVista("salas", "Salas Disponibles");
        });

        mntmDatosPersonales.addActionListener((ActionEvent e) -> {
            mostrarVista("datospersonales", "Datos Personales");
        });

        // Mostrar la vista inicial por defecto
        mostrarVista("crearActividades", "Crear Actividades");
    }

    /**
     * Metodo para cambiar la vista que se muestra en el panelContenido.
     * Actualiza tambien el titulo en el panel superior.
     * 
     * @param nombreVista nombre de la vista que se quiere mostrar
     * @param titulo titulo que se pone en la etiqueta superior
     */
    public void mostrarVista(String nombreVista, String titulo) {
        CardLayout cl = (CardLayout) panelContenido.getLayout();
        cl.show(panelContenido, nombreVista);
        lblTitulo.setText(titulo);
    }

    /**
     * Devuelve la lista de actividades actuales.
     * 
     * @return lista de actividades
     */
	public ArrayList<Actividad> getActividades() {
		return actividades;
	}

    /**
     * Establece la lista de actividades que se manejaran.
     * 
     * @param actividades lista de actividades a establecer
     */
	public void setActividades(ArrayList<Actividad> actividades) {
		this.actividades = actividades;
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
}

package vistas;

import javax.swing.*;

import Controladores.AlumnoControl;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Alumno extends JFrame {
	
	private JPanel panelActual;
    private JPanel panelContenido;
    private AlumnoControl control;

    public Alumno(AlumnoControl controlador) {
    	this.control = controlador;
    	this.control.setVista(this);
    	
      setTitle("ALUMNO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnActividades = new JMenu("Actividades");
        menuBar.add(mnActividades);

        JMenuItem mntmMisActividades = new JMenuItem("Inscripciones");
        mnActividades.add(mntmMisActividades);

        JMenuItem mntmActividadesDisponibles = new JMenuItem("Actividades disponibles");
        mnActividades.add(mntmActividadesDisponibles);

        JMenu mnDatosPersonales = new JMenu("Datos Personales");
        menuBar.add(mnDatosPersonales);

        JMenuItem mntmDatosPersonales = new JMenuItem("Ver Datos");
        mnDatosPersonales.add(mntmDatosPersonales);

        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        getContentPane().add(panelSuperior, BorderLayout.NORTH);

        panelContenido = new JPanel(new CardLayout());
        getContentPane().add(panelContenido, BorderLayout.CENTER);

        
        mntmMisActividades.addActionListener(control );
        mntmMisActividades.setActionCommand("MIS_ACTIVIDADES");

        mntmActividadesDisponibles.addActionListener(control);
        mntmActividadesDisponibles.setActionCommand("ACTIVIDADES_DISPONIBLES");

        mntmDatosPersonales.addActionListener(control);
        mntmDatosPersonales.setActionCommand("DATOS_ALUMNO");

        
    }

    

   
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

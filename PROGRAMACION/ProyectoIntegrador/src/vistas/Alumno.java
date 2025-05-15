package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Alumno extends JFrame {
    private JPanel panelContenido;
    private JLabel lblTitulo;

    public Alumno() {
      setTitle("ALUMNO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

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
        lblTitulo = new JLabel("Mis Actividades");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        panelSuperior.add(lblTitulo);
        add(panelSuperior, BorderLayout.NORTH);

        panelContenido = new JPanel(new CardLayout());
        add(panelContenido, BorderLayout.CENTER);

        //JPanel panelMisActividadesAlumno = new MisActividadesAlumno();
        JPanel VistaListaActividades = new VistaListaActividades();
       // JPanel panelActividadesDisponibles = new ActividadesDisponiblesAlumnos();
        JPanel VistaListaActividadesAlumno = new VistaListaActividadesAlumno();
        //JPanel panelDatosPersonales = new DatosPersonalesAlumno();
        JPanel VistaDatosAlumno = new VistaDatosAlumno();
        //panelContenido.add(panelMisActividadesAlumno, "misactividades");
        panelContenido.add(VistaListaActividades, "misactividades");
        panelContenido.add(VistaListaActividadesAlumno, "actividadesdisponibles");
        panelContenido.add(VistaDatosAlumno, "datospersonales");

        mntmMisActividades.addActionListener((ActionEvent e) -> {
            //mostrarVista("misactividades", "Inscripciones");
        	 mostrarVista("misactividades", " ");
        });

        mntmActividadesDisponibles.addActionListener((ActionEvent e) -> {
           // mostrarVista("actividadesdisponibles", "Actividades Disponibles");
        	 mostrarVista("actividadesdisponibles", " ");
        });

        mntmDatosPersonales.addActionListener((ActionEvent e) -> {
            mostrarVista("datospersonales", "Datos Personales");
        });

        mostrarVista("datospersonales", "Datos Personales");
    }

    private void mostrarVista(String nombreVista, String titulo) {
        CardLayout cl = (CardLayout) (panelContenido.getLayout());
        cl.show(panelContenido, nombreVista);
        lblTitulo.setText(titulo);
    }

   
}

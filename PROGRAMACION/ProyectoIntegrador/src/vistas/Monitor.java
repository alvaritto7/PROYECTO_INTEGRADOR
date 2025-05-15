package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Monitor extends JFrame {
    protected JPanel panelContenido;
    private JLabel lblTitulo;

    public Monitor() {
        setTitle("MONITOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Menú Actividades
        JMenu mnActividades = new JMenu("Actividades");
        menuBar.add(mnActividades);

        JMenuItem mntmCrearActividades = new JMenuItem("Listad de actividades");
        mnActividades.add(mntmCrearActividades);

        JMenuItem mntmMisInscripciones = new JMenuItem("Mis Inscripciones");
        mnActividades.add(mntmMisInscripciones);

        // Menú Salas
        JMenu mnSalas = new JMenu("Salas");
        menuBar.add(mnSalas);

        JMenuItem mntmVerSalas = new JMenuItem("Ver Salas");
        mnSalas.add(mntmVerSalas);

        // Menú Datos Personales
        JMenu mnDatosPersonales = new JMenu("Datos Personales");
        menuBar.add(mnDatosPersonales);

        JMenuItem mntmDatosPersonales = new JMenuItem("Ver Datos");
        mnDatosPersonales.add(mntmDatosPersonales);

        // Panel superior con título
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        lblTitulo = new JLabel("Mis Actividades");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        panelSuperior.add(lblTitulo);
        add(panelSuperior, BorderLayout.NORTH);

        // Panel de contenido con CardLayout
        panelContenido = new JPanel(new CardLayout());
        add(panelContenido, BorderLayout.CENTER);

        // Vistas
        JPanel vistaCrearActividades = new VistaListaActividadesMonitor();
        JPanel vistaMisInscripciones = new VistaListaActividades();
        JPanel vistaSalas = new VistaListaSalas();
        JPanel vistaDatosSala = new VistaDatosSala(this);
        JPanel vistaDatosPersonales = new VistaDatosAlumno();

        // Añadir vistas al panel
        panelContenido.add(vistaCrearActividades, "crearActividades");
        panelContenido.add(vistaMisInscripciones, "misInscripciones");
        panelContenido.add(vistaSalas, "salas");
        panelContenido.add(vistaDatosPersonales, "datospersonales");
        panelContenido.add(vistaDatosSala, "datossala");
         

        // Listeners de menú
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

        // Vista inicial
        mostrarVista("crearActividades", "Crear Actividades");
    }

    public void mostrarVista(String nombreVista, String titulo) {
        CardLayout cl = (CardLayout) panelContenido.getLayout();
        cl.show(panelContenido, nombreVista);
        lblTitulo.setText(titulo);
    }
}

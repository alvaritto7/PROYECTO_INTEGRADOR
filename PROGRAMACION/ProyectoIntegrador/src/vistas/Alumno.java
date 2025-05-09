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
        setSize(800, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnActividades = new JMenu("Actividades");
        menuBar.add(mnActividades);

        JMenuItem mntmMisActividades = new JMenuItem("Mis actividades");
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

        JPanel panelMisActividades = new MisActividadesAlumno();
        JPanel panelActividadesDisponibles = new ActividadesDisponiblesAlumnos();
        JPanel panelDatosPersonales = new DatosPersonalesAlumno();

        panelContenido.add(panelMisActividades, "misactividades");
        panelContenido.add(panelActividadesDisponibles, "actividadesdisponibles");
        panelContenido.add(panelDatosPersonales, "datospersonales");

        mntmMisActividades.addActionListener((ActionEvent e) -> {
            mostrarVista("misactividades", "Mis Actividades");
        });

        mntmActividadesDisponibles.addActionListener((ActionEvent e) -> {
            mostrarVista("actividadesdisponibles", "Actividades Disponibles");
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

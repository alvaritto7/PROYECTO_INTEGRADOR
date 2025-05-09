package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Monitor extends JFrame {
    private JPanel panelContenido;
    private JLabel lblTitulo;

    public Monitor() {
        setTitle("MONITOR");
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

        JMenu mnSalas = new JMenu("Salas");
        menuBar.add(mnSalas);

        JMenuItem mntmVerSalas = new JMenuItem("Ver Salas");
        mnSalas.add(mntmVerSalas);

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

        JPanel panelActividades = new MisActividadesMonitor();
        JPanel panelSalas = new Salas();
        JPanel panelDatosPersonales = new DatosPersonalesMonitor();

        panelContenido.add(panelActividades, "actividades");
        panelContenido.add(panelSalas, "salas");
        panelContenido.add(panelDatosPersonales, "datospersonales");

        mntmMisActividades.addActionListener((ActionEvent e) -> {
            mostrarVista("actividades", "Mis Actividades");
        });

        mntmVerSalas.addActionListener((ActionEvent e) -> {
            mostrarVista("salas", "Salas");
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

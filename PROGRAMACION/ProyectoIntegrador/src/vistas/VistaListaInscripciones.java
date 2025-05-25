package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * Clase que representa la vista para mostrar una lista de inscripciones.
 * Esta clase hereda de JPanel y organiza una tabla con los datos de inscripciones,
 * asi como botones para anadir y eliminar entradas.
 */
public class VistaListaInscripciones extends JPanel {

    /** Tabla donde se muestran las inscripciones */
    private JTable table;

    /** Componente que permite el desplazamiento sobre la tabla */
    private JScrollPane scrollPane;

    /** Etiqueta del titulo principal de la vista */
    private JLabel lblTitulo;

    /** Boton para crear una nueva inscripcion */
    private JButton btnNuevo;

    /** Boton para eliminar una inscripcion seleccionada */
    private JButton btnBorrar;

    /**
     * Constructor que inicializa y organiza los componentes graficos de la vista.
     * Define el diseño del panel y carga los datos de ejemplo en la tabla.
     */
    public VistaListaInscripciones() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{37, 48, 301, 172, 88, 16, 0};
        gridBagLayout.rowHeights = new int[]{35, 0, 0, 101, 0, 0, 0, 0, 0, 29, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);

        // Inicializacion de la etiqueta del titulo
        lblTitulo = new JLabel("Lista de Incripciones");
        lblTitulo.setMinimumSize(new Dimension(196, 60));
        lblTitulo.setMaximumSize(new Dimension(196, 60));
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
        GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
        gbc_lblTitulo.gridwidth = 2;
        gbc_lblTitulo.fill = GridBagConstraints.BOTH;
        gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
        gbc_lblTitulo.gridx = 2;
        gbc_lblTitulo.gridy = 0;
        add(lblTitulo, gbc_lblTitulo);

        // Creacion de la tabla y su scroll
        table = new JTable();
        scrollPane = new JScrollPane(table); 
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridheight = 6;
        gbc_scrollPane.gridwidth = 3;
        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 2;
        gbc_scrollPane.gridy = 1;
        add(scrollPane, gbc_scrollPane); 
        
                // Creacion del boton Nuevo
                btnNuevo = new JButton("Nuevo");
                GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
                gbc_btnNuevo.anchor = GridBagConstraints.EAST;
                gbc_btnNuevo.insets = new Insets(0, 0, 5, 5);
                gbc_btnNuevo.gridx = 3;
                gbc_btnNuevo.gridy = 8;
                add(btnNuevo, gbc_btnNuevo);

        // Definicion de las columnas de la tabla
        String[] columnas = {"ID", "Nombre", "Fecha", "Hora", "Duracion", "Plazas", "Sala"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);                    
        table.setModel(modelo); 
        
                // Creacion del boton Borrar
                btnBorrar = new JButton("Borrar");
                GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
                gbc_btnBorrar.anchor = GridBagConstraints.EAST;
                gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
                gbc_btnBorrar.gridx = 4;
                gbc_btnBorrar.gridy = 8;
                add(btnBorrar, gbc_btnBorrar);

        // Datos de ejemplo para la tabla
        Object[][] datos = {
            {"1", "Voleybol", "2025-04-15", "10:00:00", "60", "20", "V100"},
            {"2", "Futbol", "2025-04-16", "11:00:00", "60", "15", "F505"},
            {"3", "Baloncesto", "2025-04-17", "09:00:00", "45", "10", "B101"},
            {"4", "Natacion", "2025-04-18", "12:00:00", "90", "25", "P100"},
            {"5", "Baloncesto", "2025-04-19", "16:00:00", "90", "10", "B502"},
            {"1", "Voleybol", "2025-04-15", "10:00:00", "60", "20", "V100"},
            {"2", "Futbol", "2025-04-16", "11:00:00", "60", "15", "F505"},
            {"3", "Baloncesto", "2025-04-17", "09:00:00", "45", "10", "B101"},
            {"4", "Natacion", "2025-04-18", "12:00:00", "90", "25", "P100"},
            {"5", "Baloncesto", "2025-04-19", "16:00:00", "90", "10", "B502"},
            {"1", "Voleybol", "2025-04-15", "10:00:00", "60", "20", "V100"},
            {"2", "Futbol", "2025-04-16", "11:00:00", "60", "15", "F505"},
            {"3", "Baloncesto", "2025-04-17", "09:00:00", "45", "10", "B101"},
            {"4", "Natacion", "2025-04-18", "12:00:00", "90", "25", "P100"},
            {"5", "Baloncesto", "2025-04-19", "16:00:00", "90", "10", "B502"}
        };

        // Carga de los datos en la tabla
        for (Object[] fila : datos) {
            modelo.addRow(fila);
        }
    }
}


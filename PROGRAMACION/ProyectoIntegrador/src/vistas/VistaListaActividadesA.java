package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controladores.AlumnoControl;
import Main.Sesion;

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
 * Clase que representa la vista de actividades disponibles para el alumno.
 * Permite mostrar una tabla con las actividades y gestionar inscripciones y eliminaciones.
 */
public class VistaListaActividadesA extends JPanel {

    /** Tabla donde se listan las actividades */
    private JTable table;

    /** Scroll que contiene la tabla */
    private JScrollPane scrollPane;

    /** Etiqueta del titulo de la vista */
    private JLabel lblTitulo;

    /** Boton para borrar una inscripcion */
    private JButton btnBorrar;

    /** Lista de actividades mostradas en la tabla */
    private ArrayList<Actividad> actividades;

    /** Boton para inscribirse en una actividad */
    private JButton btnInscribirse;

    /** Controlador asociado a la vista */
    private AlumnoControl controlador;

    /**
     * Constructor de la clase. Inicializa los componentes y estructura de la vista.
     * 
     * @param control controlador que gestiona los eventos de esta vista
     */
    public VistaListaActividadesA(AlumnoControl control) {
        this.controlador = control;

        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 37, 48, 90, 165, 132, 107, 46, 16, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 20, 0, 0, 80, 45, 49, 29, 32, 0, 0, 29, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);
        
                // Configuracion del titulo
                lblTitulo = new JLabel("Actividades Disponibles");
                lblTitulo.setMinimumSize(new Dimension(196, 60));
                lblTitulo.setMaximumSize(new Dimension(196, 60));
                lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
                GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
                gbc_lblTitulo.gridwidth = 5;
                gbc_lblTitulo.fill = GridBagConstraints.BOTH;
                gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
                gbc_lblTitulo.gridx = 1;
                gbc_lblTitulo.gridy = 2;
                add(lblTitulo, gbc_lblTitulo);

        // Tabla de actividades
        table = new JTable();
        scrollPane = new JScrollPane(table);
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridheight = 6;
        gbc_scrollPane.gridwidth = 6;
        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 1;
        gbc_scrollPane.gridy = 3;
        add(scrollPane, gbc_scrollPane);
        

        // Columnas iniciales de la tabla
        String[] columnas = { "ID", "Nombre", "Fecha", "Hora", "Duracion", "Plazas", "Sala" };
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        table.setModel(modelo);
                        
                                // Boton para inscribirse en la actividad seleccionada
                                btnInscribirse = new JButton("Inscribirse");
                                btnInscribirse.addActionListener(control);
                                btnInscribirse.setActionCommand("INSCRIBIR_ALUMNO");
                                GridBagConstraints gbc_btnInscribirse = new GridBagConstraints();
                                gbc_btnInscribirse.anchor = GridBagConstraints.EAST;
                                gbc_btnInscribirse.insets = new Insets(0, 0, 5, 5);
                                gbc_btnInscribirse.gridx = 5;
                                gbc_btnInscribirse.gridy = 10;
                                add(btnInscribirse, gbc_btnInscribirse);
                                
                                        // Boton para borrar inscripcion
                                        btnBorrar = new JButton("Borrar");
                                        btnBorrar.addActionListener(control);
                                        btnBorrar.setActionCommand("BORRAR_INSCRIPCION");
                                        GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
                                        gbc_btnBorrar.anchor = GridBagConstraints.EAST;
                                        gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
                                        gbc_btnBorrar.gridx = 6;
                                        gbc_btnBorrar.gridy = 10;
                                        add(btnBorrar, gbc_btnBorrar);
                
                        
                        
    }

    /**
     * Devuelve la tabla de actividades.
     * 
     * @return tabla JTable con las actividades
     */
    public JTable getTable() {
        return table;
    }

    /**
     * Devuelve el identificador de la actividad seleccionada.
     * 
     * @return id de la actividad seleccionada o 0 si no hay seleccion
     */
    public Integer getActividadSelecionada() {
        Integer id_actividad = 0;
        int fila = table.getSelectedRow();
        if (fila != -1) {
            id_actividad = Integer.parseInt(table.getValueAt(fila, 0).toString());
        }
        return id_actividad;
    }

    /**
     * Establece la lista de actividades a mostrar en la tabla.
     * 
     * @param listaActividades lista de objetos Actividad
     */
    public void setActividades(ArrayList<Actividad> listaActividades) {
        actividades = listaActividades;

        String[] columnas = { "ID", "Nombre", "Fecha", "Hora", "Duracion", "Plazas", "Sala", "Monitor" };
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        table.setModel(modelo);

        for (Actividad a : actividades) {
            modelo.addRow(new Object[] {
                a.getId(),
                a.getNombre(),
                a.getFecha(),
                a.getHora(),
                a.getDuracion(),
                a.getParticipantesMax(),
                a.getSala().getCodigoSala(),
                a.getMonitor().getNombreUsuario()
            });
        }
    }

    /**
     * Cambia el texto del titulo principal de la vista.
     * 
     * @param titulo nuevo titulo a mostrar
     */
    public void setTitulo(String titulo) {
        lblTitulo.setText(titulo);
    }

    /**
     * Controla la visibilidad del boton de inscripcion.
     * 
     * @param mostrar "S" para mostrar, cualquier otro valor para ocultar
     */
    public void MostrarBotonInscripcion(String mostrar) {
        if (mostrar.equals("S")) {
            btnInscribirse.setVisible(true);
        } else {
            btnInscribirse.setVisible(false);
        }
    }

    /**
     * Controla la visibilidad del boton de borrado.
     * 
     * @param mostrar "S" para mostrar, cualquier otro valor para ocultar
     */
    public void MostrarBotonBorrar(String mostrar) {
        if (mostrar.equals("S")) {
            btnBorrar.setVisible(true);
        } else {
            btnBorrar.setVisible(false);
        }
    }

}

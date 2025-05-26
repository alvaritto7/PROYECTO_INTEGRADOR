package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controladores.AlumnoControl;
import Controladores.MonitorControl;
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
 * Clase que representa la vista de lista de actividades para el monitor.
 * Esta vista permite visualizar, crear, editar y borrar actividades disponibles.
 */
public class VistaListaActividadesM extends JPanel {

    /** Tabla que contiene las actividades */
    private JTable table;

    /** Contenedor de desplazamiento para la tabla */
    private JScrollPane scrollPane;

    /** Etiqueta que muestra el titulo de la vista */
    private JLabel lblTitulo;

    /** Boton para crear una nueva actividad */
    private JButton btnNuevo;

    /** Lista de actividades a mostrar en la tabla */
    private ArrayList<Actividad> actividades;

    /** Controlador asociado a esta vista */
    private MonitorControl controlador;

    /** Boton para editar una actividad seleccionada */
    private JButton btnEditar;

    /** Boton para borrar una actividad seleccionada */
    private JButton btnBorrar;

    /**
     * Constructor que inicializa la vista con el controlador especificado.
     * 
     * @param control instancia del controlador de monitor
     */
    public VistaListaActividadesM(MonitorControl control) {
        this.controlador = control;

        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 37, 48, 0, 0, 0, 257, 119, 83, 55, 69, 16, 0 };
        gridBagLayout.rowHeights = new int[] { 85, 0, 0, 101, 150, 27, 29, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);

        // Configuracion del titulo
        lblTitulo = new JLabel("Actividades Disponibles (M)");
        lblTitulo.setMinimumSize(new Dimension(196, 60));
        lblTitulo.setMaximumSize(new Dimension(196, 60));
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
        GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
        gbc_lblTitulo.gridwidth = 8;
        gbc_lblTitulo.fill = GridBagConstraints.BOTH;
        gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
        gbc_lblTitulo.gridx = 1;
        gbc_lblTitulo.gridy = 0;
        add(lblTitulo, gbc_lblTitulo);

        // Inicializacion de la tabla
        //table = new JTable();
         table = new JTable() ;
        
        
        scrollPane = new JScrollPane(table);
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridheight = 4;
        gbc_scrollPane.gridwidth = 9;
        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 1;
        gbc_scrollPane.gridy = 1;
        add(scrollPane, gbc_scrollPane);

        // Configuracion de columnas iniciales
        String[] columnas = { "ID", "Nombre", "Fecha", "Hora", "Duracion", "Plazas", "Sala" };
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        table.setModel(modelo);

        // Boton Borrar
        btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(control);

        // Boton Editar
        btnEditar = new JButton("Editar");
        btnEditar.addActionListener(control);

        // Boton Nuevo
        btnNuevo = new JButton("Nuevo");
        btnNuevo.addActionListener(control);
        btnNuevo.setActionCommand("NUEVA_ACTIVIDAD");
        GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
        gbc_btnNuevo.anchor = GridBagConstraints.EAST;
        gbc_btnNuevo.insets = new Insets(0, 0, 0, 5);
        gbc_btnNuevo.gridx = 7;
        gbc_btnNuevo.gridy = 6;
        add(btnNuevo, gbc_btnNuevo);

        // Boton Editar con su comando
        btnEditar.setActionCommand("EDITAR_ACTIVIDAD");
        GridBagConstraints gbc_btnEditar = new GridBagConstraints();
        gbc_btnEditar.anchor = GridBagConstraints.EAST;
        gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
        gbc_btnEditar.gridx = 8;
        gbc_btnEditar.gridy = 6;
        add(btnEditar, gbc_btnEditar);

        // Boton Borrar con su comando
        btnBorrar.setActionCommand("BORRAR_ACTIVIDAD");
        GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
        gbc_btnBorrar.anchor = GridBagConstraints.EAST;
        gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
        gbc_btnBorrar.gridx = 9;
        gbc_btnBorrar.gridy = 6;
        add(btnBorrar, gbc_btnBorrar);
    }

    /**
     * Devuelve el componente de la tabla.
     * 
     * @return JTable con las actividades
     */
    public JTable getTable() {
        return table;
    }

    /**
     * Obtiene el identificador de la actividad seleccionada en la tabla.
     * Muestra un mensaje si no hay ninguna seleccion.
     * 
     * @return ID de la actividad seleccionada, o 0 si no se ha seleccionado ninguna
     */
    public Integer getActividadSelecionada() {
        Integer id_actividad = 0;
        int fila = table.getSelectedRow();
        if (fila != -1) {
            id_actividad = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Sala.");
        }

        return id_actividad;
    }

    /**
     * Establece una nueva lista de actividades y actualiza la tabla.
     * 
     * @param listaActividades lista de actividades a mostrar
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
     * Establece el titulo que se muestra en la parte superior de la vista.
     * 
     * @param titulo texto del titulo
     */
    public void setTitulo(String titulo) {
        lblTitulo.setText(titulo);
    }
    
    
    public void OcultarBotones()
    {
    	
    	this.btnBorrar.setEnabled(false);
    	this.btnEditar.setEnabled(false);
    	
    }
    
    
    
    
}

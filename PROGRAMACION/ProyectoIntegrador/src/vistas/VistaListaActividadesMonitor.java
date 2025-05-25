package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import Controladores.EditarActividadListener;
import Controladores.MonitorControl;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase que representa la vista de lista de actividades de un monitor.
 * Permite visualizar, crear, editar y eliminar actividades asociadas a un monitor.
 */
public class VistaListaActividadesMonitor extends JPanel {

    /** Lista visual de actividades */
    private JList<Actividad> list;

    /** Panel de desplazamiento para la lista de actividades */
    private JScrollPane scrollPane;

    /** Etiqueta del titulo de la vista */
    private JLabel lblTitulo;

    /** Boton para crear una nueva actividad */
    private JButton btnNuevo;

    /** Boton para eliminar una actividad seleccionada */
    private JButton btnBorrar;

    /** Boton para editar la actividad seleccionada */
    private JButton btnEditar;

    /** Objeto monitor relacionado con esta vista */
    private Monitor monitor;

    /** Lista de actividades asociadas al monitor */
    private ArrayList<Actividad> actividades;

    /** Modelo de datos para la lista de actividades */
    private DefaultListModel<Actividad> listModel;

    /** Controlador que gestiona las acciones de la vista */
    private MonitorControl controlador;

    /**
     * Constructor de la vista que recibe el controlador.
     * Configura la interfaz y los componentes graficos de la vista.
     * 
     * @param control el controlador que gestionara las acciones del usuario
     */
    public VistaListaActividadesMonitor(MonitorControl control) {
        this.controlador = control;

        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{37, 48, 242, 0, 188, 105, 16, 0};
        gridBagLayout.rowHeights = new int[]{85, 0, 100, 101, 0, 0, 29, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);

        // Inicializacion del titulo de la vista
        lblTitulo = new JLabel(" ");
        lblTitulo.setMinimumSize(new Dimension(196, 60));
        lblTitulo.setMaximumSize(new Dimension(196, 60));
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
        GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
        gbc_lblTitulo.gridwidth = 3;
        gbc_lblTitulo.fill = GridBagConstraints.BOTH;
        gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
        gbc_lblTitulo.gridx = 2;
        gbc_lblTitulo.gridy = 0;
        add(lblTitulo, gbc_lblTitulo);

        // Creacion del modelo y la lista de actividades
        listModel = new DefaultListModel<Actividad>();
        list = new JList<Actividad>(listModel);
        scrollPane = new JScrollPane(list);
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridheight = 3;
        gbc_scrollPane.gridwidth = 4;
        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 2;
        gbc_scrollPane.gridy = 1;
        add(scrollPane, gbc_scrollPane);

        // Configuracion del boton Editar
        btnEditar = new JButton("Editar");
        //TODO ESTO NO PUEDE ESTAR AQUI CAMBIALO CAMBIALO CAMBIALOOOOO
        btnEditar.addActionListener(control);
        btnEditar.setActionCommand("EDITAR_ACTIVIDAD");
        GridBagConstraints gbc_btnEditar = new GridBagConstraints();
        gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
        gbc_btnEditar.gridx = 2;
        gbc_btnEditar.gridy = 6;
        add(btnEditar, gbc_btnEditar);

        // Configuracion del boton Nuevo
        btnNuevo = new JButton("Nuevo");
        btnNuevo.addActionListener(control);
        btnNuevo.setActionCommand("NUEVA_ACTIVIDAD");
        GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
        gbc_btnNuevo.anchor = GridBagConstraints.EAST;
        gbc_btnNuevo.insets = new Insets(0, 0, 0, 5);
        gbc_btnNuevo.gridx = 3;
        gbc_btnNuevo.gridy = 6;
        add(btnNuevo, gbc_btnNuevo);

        // Configuracion del boton Borrar
        btnBorrar = new JButton("Borrar");
        GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
        gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
        gbc_btnBorrar.gridx = 4;
        gbc_btnBorrar.gridy = 6;
        add(btnBorrar, gbc_btnBorrar);
    }

    /**
     * Devuelve la lista de actividades asociadas a la vista.
     * 
     * @return lista de actividades
     */
    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    /**
     * Establece una nueva lista de actividades en la vista.
     * Tambien actualiza el modelo de la lista visual.
     * 
     * @param actividades la lista de actividades a mostrar
     */
    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;

        for (Actividad a : actividades) {
            listModel.addElement(a);
        }
    }

    /**
     * Devuelve el componente JList que muestra las actividades.
     * 
     * @return componente JList de actividades
     */
    public JList<Actividad> getList() {
        return list;
    }

    /**
     * Establece el texto del titulo de la vista.
     * 
     * @param titulo el texto a mostrar en el titulo
     */
    public void setTitulo(String titulo) {
        lblTitulo.setText(titulo);
    }
}

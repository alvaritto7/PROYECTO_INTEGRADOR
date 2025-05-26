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

import Controladores.MonitorControl;

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
 * Vista que muestra una lista de salas disponibles.
 * Permite crear, editar y borrar salas a traves de botones asociados a un controlador.
 */
public class VistaListaSalas extends JPanel {

    private JTable table;
    private JScrollPane scrollPane;
    private JLabel lblTitulo;
    private JButton btnNuevo;
    private JButton btnBorrar;
    private MonitorControl controlador;
    private JButton btnEditar;

    /**
     * Constructor de la clase. Inicializa la interfaz grafica de la lista de salas.
     * 
     * @param control controlador que gestionara los eventos de la interfaz
     */
    public VistaListaSalas(MonitorControl control) {
        this.controlador = control;
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{28, 32, 118, 239, 141, 66, 75, 16, 0};
        gridBagLayout.rowHeights = new int[]{20, 33, 0,0, 50, 50, 0, 0, 29, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);

        lblTitulo = new JLabel("Lista de Salas");
        lblTitulo.setMinimumSize(new Dimension(196, 60));
        lblTitulo.setMaximumSize(new Dimension(196, 60));
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
        GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
        gbc_lblTitulo.gridwidth = 4;
        gbc_lblTitulo.fill = GridBagConstraints.BOTH;
        gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
        gbc_lblTitulo.gridx = 2;
        gbc_lblTitulo.gridy = 1;
        add(lblTitulo, gbc_lblTitulo);

        table = new JTable();
        scrollPane = new JScrollPane(table); 
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridheight = 3;
        gbc_scrollPane.gridwidth = 5;
        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 2;
        gbc_scrollPane.gridy = 3;
        add(scrollPane, gbc_scrollPane); 
        
//                btnEditar = new JButton("Editar");
//                btnEditar.addActionListener(control);
//                
//                        btnNuevo = new JButton("Nuevo");
//                        btnNuevo.addActionListener(control);
//                        btnNuevo.setActionCommand("NUEVA_SALA");
//                        GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
//                        gbc_btnNuevo.anchor = GridBagConstraints.EAST;
//                        gbc_btnNuevo.insets = new Insets(0, 0, 5, 5);
//                        gbc_btnNuevo.gridx = 4;
//                        gbc_btnNuevo.gridy = 8;
//                        add(btnNuevo, gbc_btnNuevo);
//                btnEditar.setActionCommand("EDITAR_SALA");
//                GridBagConstraints gbc_btnEditar = new GridBagConstraints();
//                gbc_btnEditar.anchor = GridBagConstraints.EAST;
//                gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
//                gbc_btnEditar.gridx = 5;
//                gbc_btnEditar.gridy = 8;
//                add(btnEditar, gbc_btnEditar);

        String[] columnas = { "Codigo Sala", "Tipo Sala", "Capacidad Sala" /*,  "ID", "Utilizacion", "Ocupacion"*/};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        table.setModel(modelo);
        
//                btnBorrar = new JButton("Borrar");
//                btnBorrar.addActionListener(control);
//                btnBorrar.setActionCommand("BORRAR_SALA");
//                GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
//                gbc_btnBorrar.anchor = GridBagConstraints.EAST;
//                gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
//                gbc_btnBorrar.gridx = 6;
//                gbc_btnBorrar.gridy = 8;
//                add(btnBorrar, gbc_btnBorrar);
  }

    /**
     * Devuelve el identificador de la sala seleccionada en la tabla.
     * Si no hay seleccion, muestra un mensaje de aviso.
     * 
     * @return ID de la sala seleccionada o 0 si no hay seleccion
     */
    public Integer getSalaSelecionada() {
        Integer id_sala = 0;
        int fila = table.getSelectedRow();
        if (fila != -1) {
            id_sala = Integer.parseInt(table.getValueAt(fila, 0).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Sala.");
        }
        return id_sala;
    }

    /**
     * Establece el titulo de la vista.
     * 
     * @param titulo texto que se mostrara como titulo
     */
    public void setTitulo(String titulo) {
        lblTitulo.setText(titulo);
    }

    /**
     * Carga la lista de salas en la tabla para su visualizacion.
     * 
     * @param listaSalas lista de objetos Sala a mostrar
     */
    public void setSalas(ArrayList<Sala> listaSalas) {
        String[] columnas = {  "Codigo Sala", "Tipo Sala", "Capacidad Sala" /*, "ID", "Utilizacion", "Ocupacion"*/};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        table.setModel(modelo);

        for (Sala s : listaSalas) {
            modelo.addRow(new Object[] {
              //  s.getIdSala(),
                s.getCodigoSala(),
                s.getTipoSala(),
                s.getCapacidadSala()
               // s.getUtilizacion(),
               // s.getOcupacion()
            });
        }
    }
}

package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import Controladores.EditarActividadListener;

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

public class VistaListaActividadesMonitor extends JPanel {
    private JList<Actividad> list;
    private JScrollPane scrollPane;
    private JLabel lblTitulo;
    private JButton btnNuevo;
    private JButton btnBorrar;
    private JButton btnNewButton;
    private Monitor monitor;
    private ArrayList<Actividad> actividades;

    public VistaListaActividadesMonitor(Monitor monitor, ArrayList<Actividad> actividades2) {
    	
    	this.monitor = monitor;
    	this.actividades = actividades2;
    	
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{37, 48, 242, 0, 188, 105, 16, 0};
        gridBagLayout.rowHeights = new int[]{85, 0, 100, 101, 0, 0, 29, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);

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

        //DefaultListModel<String> listModel = new DefaultListModel<>();
        DefaultListModel<Actividad> listModel = new DefaultListModel<Actividad>();
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

        btnNewButton = new JButton("Editar");
        
        //TODO ESTO NO PUEDE ESTAR AQUÍ CÁMBIALO CÁMBIALO CÁMBIALOOOOO
        
        EditarActividadListener escuchadorEditar = new EditarActividadListener(this, monitor);
        btnNewButton.addActionListener(escuchadorEditar);
        GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
        gbc_btnNewButton.gridx = 2;
        gbc_btnNewButton.gridy = 6;
        add(btnNewButton, gbc_btnNewButton);

        btnNuevo = new JButton("Nuevo");
        GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
        gbc_btnNuevo.anchor = GridBagConstraints.EAST;
        gbc_btnNuevo.insets = new Insets(0, 0, 0, 5);
        gbc_btnNuevo.gridx = 3;
        gbc_btnNuevo.gridy = 6;
        add(btnNuevo, gbc_btnNuevo);

        btnBorrar = new JButton("Borrar");
        GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
        gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
        gbc_btnBorrar.gridx = 4;
        gbc_btnBorrar.gridy = 6;
        add(btnBorrar, gbc_btnBorrar);

//        Object[][] datos = {
//            {"1", "Voleybol", "2025-04-15", "10:00:00", "60", "20", "V100"},
//            {"2", "Futbol", "2025-04-16", "11:00:00", "60", "15", "F505"},
//            {"3", "Baloncesto", "2025-04-17", "09:00:00", "45", "10", "B101"},
//            {"4", "Natación", "2025-04-18", "12:00:00", "90", "25", "P100"},
//            {"5", "Baloncesto", "2025-04-19", "16:00:00", "90", "10", "B502"},
//            {"1", "Voleybol", "2025-04-15", "10:00:00", "60", "20", "V100"},
//            {"2", "Futbol", "2025-04-16", "11:00:00", "60", "15", "F505"},
//            {"3", "Baloncesto", "2025-04-17", "09:00:00", "45", "10", "B101"},
//            {"4", "Natación", "2025-04-18", "12:00:00", "90", "25", "P100"},
//            {"5", "Baloncesto", "2025-04-19", "16:00:00", "90", "10", "B502"},
//            {"5", "Voleybol", "2025-04-15", "10:00:00", "60", "20", "V100"},
//            {"7", "Futbol", "2025-04-16", "11:00:00", "60", "15", "F505"},
//            {"8", "Baloncesto", "2025-04-17", "09:00:00", "45", "10", "B101"},
//            {"9", "Natación", "2025-04-18", "12:00:00", "90", "25", "P100"},
//            {"10", "Baloncesto", "2025-04-19", "16:00:00", "90", "10", "B502"}
//        };
        
//        Actividad[] actividadesArray= {
//        		new Actividad(1, "Voleibol", "2025-04-15", "10:00:00", 60, 20, "V100")
//        };
        
//        actividades = new ArrayList<Actividad>();
//        actividades.add(new Actividad(1, "Voleibol", "2025-04-15", "10:00:00", 60, 20, "V100"));
        

//        for (Object[] fila : datos) {
//            String texto = String.format("ID: %s - %s | %s %s | Duración: %sm | Plazas: %s | Sala: %s",
//                fila[0], fila[1], fila[2], fila[3], fila[4], fila[5], fila[6]);
//            listModel.addElement(texto);
//        }
        
        for (Actividad a : actividades) {
        	listModel.addElement(a);
        }
    }

	/**
	 * @return the actividades
	 */
	public ArrayList<Actividad> getActividades() {
		return actividades;
	}

	/**
	 * @param actividades the actividades to set
	 */
	public void setActividades(ArrayList<Actividad> actividades) {
		this.actividades = actividades;
	}
	
	/**
	 * @return the list
	 */
	public JList<Actividad> getList() {
		return list;
	}
}



	
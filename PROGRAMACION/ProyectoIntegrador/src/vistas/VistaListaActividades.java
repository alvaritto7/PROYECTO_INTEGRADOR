package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

public class VistaListaActividades extends JPanel {
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblTitulo;
	private JButton btnNuevo;
	private JButton btnBorrar;
	private ArrayList<Actividad> actividades;
	private JButton btnInscribirse;

	public VistaListaActividades() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 37, 0, 48, 0, 242, 193, 76, 75, 16, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 25, 0, 0, 101, 150, 50, 29, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblTitulo = new JLabel("Actividades Disponibles");
		lblTitulo.setMinimumSize(new Dimension(196, 60));
		lblTitulo.setMaximumSize(new Dimension(196, 60));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 5;
		gbc_lblTitulo.fill = GridBagConstraints.BOTH;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 2;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);

		table = new JTable();
		scrollPane = new JScrollPane(table);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
		
		
		
		
		btnInscribirse = new JButton("Inscribirse");
		GridBagConstraints gbc_btnInscribirse = new GridBagConstraints();
		gbc_btnInscribirse.anchor = GridBagConstraints.EAST;
		gbc_btnInscribirse.insets = new Insets(0, 0, 0, 5);
		gbc_btnInscribirse.gridx = 5;
		gbc_btnInscribirse.gridy = 7;
		add(btnInscribirse, gbc_btnInscribirse);
		
		
		
		
		btnNuevo = new JButton("Nuevo");
		GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
		gbc_btnNuevo.anchor = GridBagConstraints.EAST;
		gbc_btnNuevo.insets = new Insets(0, 0, 0, 5);
		gbc_btnNuevo.gridx = 6;
		gbc_btnNuevo.gridy = 7;
		add(btnNuevo, gbc_btnNuevo);

		btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.anchor = GridBagConstraints.EAST;
		gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrar.gridx = 7;
		gbc_btnBorrar.gridy = 7;
		add(btnBorrar, gbc_btnBorrar);

		String[] columnas = { "ID", "Nombre", "Fecha", "Hora", "Duracion", "Plazas", "Sala" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo);
}
	

	

	
	
	/**
	 * Establece la lista de actividades que se mostraran en la tabla.
	 * 
	 * @param listaActividades lista de objetos Actividad a mostrar
	 */	
	public void setActividades(ArrayList<Actividad> listaActividades)
	{
		actividades = listaActividades;
		
		String[] columnas = { "ID", "Nombre", "Fecha", "Hora", "Duracion", "Plazas", "Sala" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo);
		
		for(Actividad a : actividades)
		{
			modelo.addRow( new Object[] { a.getId(),
						   a.getNombre(),
						   a.getFecha(),
						   a.getHora(),
						   a.getDuracion(),
						   a.getParticipantesMax(),
						   a.getIdSala()});
		}
		
		
	}
	
	
	
}

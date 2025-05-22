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

public class VistaListaActividadesA extends JPanel {
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblTitulo;
	private JButton btnNuevo;
	private JButton btnBorrar;
	private ArrayList<Actividad> actividades;
	private JButton btnInscribirse;
	private AlumnoControl controlador;

	public VistaListaActividadesA(AlumnoControl control) {
		
		this.controlador = control;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 37, 48, 90, 73, 132, 124, 105, 16, 0 };
		gridBagLayout.rowHeights = new int[] { 85, 0, 80, 45, 49, 29, 32, 29, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 0;
		add(lblTitulo, gbc_lblTitulo);

		table = new JTable();
		scrollPane = new JScrollPane(table);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		
		
		
		btnInscribirse = new JButton("Inscribirse");
		btnInscribirse.addActionListener(control);
		btnInscribirse.setActionCommand("INSCRIBIR_ALUMNO");
		
		GridBagConstraints gbc_btnInscribirse = new GridBagConstraints();
		gbc_btnInscribirse.insets = new Insets(0, 0, 0, 5);
		gbc_btnInscribirse.gridx = 4;
		gbc_btnInscribirse.gridy = 7;
		add(btnInscribirse, gbc_btnInscribirse);
		
		
		//Solo se muestran los botones nuevo y borrar para Monitor
		if(Sesion.getUsuarioLogado().getCicloEducativo().equals("TAFD"))
		{
		
			btnNuevo = new JButton("Nuevo");
			GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
			gbc_btnNuevo.anchor = GridBagConstraints.EAST;
			gbc_btnNuevo.insets = new Insets(0, 0, 0, 5);
			gbc_btnNuevo.gridx = 5;
			gbc_btnNuevo.gridy = 6;
			add(btnNuevo, gbc_btnNuevo);
		}
		
		String[] columnas = { "ID", "Nombre", "Fecha", "Hora", "Duracion", "Plazas", "Sala" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo);
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(control);
		
        btnBorrar.setActionCommand("BORRAR_INSCRIPCION");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrar.gridx = 5;
		gbc_btnBorrar.gridy = 7;
		add(btnBorrar, gbc_btnBorrar);

		

	}

	
	 public JTable getTable()
	    {
	    	return table;
	    }
	
	
	 public Integer getActividadSelecionada()
	    {
	    	Integer id_actividad = 0;
	    	int fila = table.getSelectedRow();
	    	if(fila != -1)
	    	{
	    		id_actividad = Integer.parseInt( table.getValueAt(table.getSelectedRow(), 0).toString());
	    	}
	    	
	    	return id_actividad;
	    }
	 
	 
	public void setActividades(ArrayList<Actividad> listaActividades)
	{
		actividades = listaActividades;
		
		String[] columnas = { "ID", "Nombre", "Fecha", "Hora", "Duracion", "Plazas", "Sala", "Monitor" };
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
						   a.getSala().getCodigoSala(),
						   a.getMonitor().getNombreUsuario()});
		}
		
		
	}
	
	public void setTitulo(String titulo)
    {
    	lblTitulo.setText(titulo);
    }
	
	
	public void MostrarBotonInscripcion(String mostrar)
	{
		if(mostrar.equals("S") )
		{
			btnInscribirse.setVisible(true);
		}
		else
		{
			btnInscribirse.setVisible(false);
		}
	}
	
	public void MostrarBotonBorrar(String mostrar)
	{
		if(mostrar.equals("S") )
		{
			btnBorrar.setVisible(true);
		}
		else
		{
			btnBorrar.setVisible(false);
		}
	}
	
	
}

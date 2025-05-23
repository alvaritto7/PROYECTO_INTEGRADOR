package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

public class VistaListaActividadesMonitor extends JPanel {
	 private JTable table;
	    private JScrollPane scrollPane;
	    private JButton btnNuevo;
	    private JButton btnBorrar;
	    private JLabel lblTitulo;
	    private ArrayList<Actividad> actividades;

	    public VistaListaActividadesMonitor(MonitorControl control) {
	    	setBackground(new Color(240, 240, 240));
	        GridBagLayout gridBagLayout = new GridBagLayout();
	        gridBagLayout.columnWidths = new int[]{122, 48, 274, 138, 70, 123, 0};
	        gridBagLayout.rowHeights = new int[]{85, 0, 20, 48, 82, 51, 20,20, 31, 29, 29, 0};
	        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	        setLayout(gridBagLayout);
	                                        
	                                        lblTitulo = new JLabel("Actividades como Alumno");
	                                        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
	                                        GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
	                                        gbc_lblTitulo.gridwidth = 3;
	                                        gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
	                                        gbc_lblTitulo.gridx = 1;
	                                        gbc_lblTitulo.gridy = 0;
	                                        add(lblTitulo, gbc_lblTitulo);
	                                
	                                        table = new JTable();
	                                        scrollPane = new JScrollPane(table); 
	                                        scrollPane.setPreferredSize(new Dimension(800, 600));
	                                        scrollPane.setBackground(new Color(255, 255, 0));
	                                        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
	                                        gbc_scrollPane.gridheight = 6;
	                                        gbc_scrollPane.gridwidth = 6;
	                                        gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
	                                        gbc_scrollPane.fill = GridBagConstraints.BOTH;
	                                        gbc_scrollPane.gridx = 0;
	                                        gbc_scrollPane.gridy = 1;
	                                        add(scrollPane, gbc_scrollPane); 
	                                
	                                btnNuevo = new JButton("Nuevo");
	                                btnNuevo.addActionListener(control);
	                                btnNuevo.setActionCommand("NUEVA_ACTIVIDAD");
	                                
	                                
	                                GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
	                                gbc_btnNuevo.anchor = GridBagConstraints.EAST;
	                                gbc_btnNuevo.insets = new Insets(0, 0, 0, 5);
	                                gbc_btnNuevo.gridx = 4;
	                                gbc_btnNuevo.gridy = 10;
	                                add(btnNuevo, gbc_btnNuevo);
	                                
	                                btnBorrar = new JButton("Borrar");
	                                btnBorrar.addActionListener(control);
	                                btnBorrar.setActionCommand("BORRAR_ACTIVIDAD");
	                                
	                                GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
	                                gbc_btnBorrar.gridx = 5;
	                                gbc_btnBorrar.gridy = 10;
	                                add(btnBorrar, gbc_btnBorrar);

	    
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
	    
	    
	    
	    
	    
}



	
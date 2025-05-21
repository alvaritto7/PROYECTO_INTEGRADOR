package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
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

public class VistaListaActividadesAlumno extends JPanel {
    private JTable table;
    private JScrollPane scrollPane;
    private JLabel lblTitulo;
    private JButton btnBorrar;
    private ArrayList<Actividad> actividades;

    public VistaListaActividadesAlumno() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{37, 48, 242, 188, 105, 16, 0};
        gridBagLayout.rowHeights = new int[]{85, 0, 20, 101, 50, 20, 0, 29, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);
                                        
                                                lblTitulo = new JLabel("Lista de Inscripciones Alumno");
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
                                
                                        table = new JTable();
                                        scrollPane = new JScrollPane(table); 
                                        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
                                        gbc_scrollPane.gridheight = 5;
                                        gbc_scrollPane.gridwidth = 3;
                                        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
                                        gbc_scrollPane.fill = GridBagConstraints.BOTH;
                                        gbc_scrollPane.gridx = 2;
                                        gbc_scrollPane.gridy = 1;
                                        add(scrollPane, gbc_scrollPane);
                                
                                btnBorrar = new JButton("Borrar");
                                GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
                                gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
                                gbc_btnBorrar.gridx = 4;
                                gbc_btnBorrar.gridy = 7;
                                add(btnBorrar, gbc_btnBorrar);
                                
                                			

    
    }

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

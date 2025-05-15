package vistas;

import javax.swing.JPanel;
import Modelo.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;


import java.awt.Insets;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VistaDatosActividad extends JPanel {
	private JTextField txtNombreActividad;
	private JTextField txtFecha;
	private JTextField txtHora;
	private JTextField txtDuracion;
	private JTextField txtPlazas;
	private JLabel lblNewLabel_5;
	private JButton btnGuardar;
	private JButton btnBorrar;
	private JTextField txtActividadId;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField txtSala;
	
	public VistaDatosActividad() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 13, 0, 0, 160, 0, 60, 49, 20};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel_8 = new JLabel("  ");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 0;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		lblNewLabel_7 = new JLabel("ID Actividad:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 2;
		gbc_lblNewLabel_7.gridy = 1;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		txtActividadId = new JTextField();
		GridBagConstraints gbc_txtActividadId = new GridBagConstraints();
		gbc_txtActividadId.gridwidth = 2;
		gbc_txtActividadId.insets = new Insets(0, 0, 5, 5);
		gbc_txtActividadId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtActividadId.gridx = 4;
		gbc_txtActividadId.gridy = 1;
		add(txtActividadId, gbc_txtActividadId);
		txtActividadId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre Actividad:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtNombreActividad = new JTextField();
		GridBagConstraints gbc_txtNombreActividad = new GridBagConstraints();
		gbc_txtNombreActividad.gridwidth = 2;
		gbc_txtNombreActividad.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreActividad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreActividad.gridx = 4;
		gbc_txtNombreActividad.gridy = 2;
		add(txtNombreActividad, gbc_txtNombreActividad);
		txtNombreActividad.setColumns(10);
		
		lblNewLabel_5 = new JLabel("                ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 7;
		gbc_lblNewLabel_5.gridy = 2;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha Actividad:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtFecha = new JTextField();
		GridBagConstraints gbc_txtFecha = new GridBagConstraints();
		gbc_txtFecha.gridwidth = 2;
		gbc_txtFecha.anchor = GridBagConstraints.NORTH;
		gbc_txtFecha.insets = new Insets(0, 0, 5, 5);
		gbc_txtFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFecha.gridx = 4;
		gbc_txtFecha.gridy = 3;
		add(txtFecha, gbc_txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hora Actividad:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 4;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtHora = new JTextField();
		GridBagConstraints gbc_txtHora = new GridBagConstraints();
		gbc_txtHora.gridwidth = 2;
		gbc_txtHora.insets = new Insets(0, 0, 5, 5);
		gbc_txtHora.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHora.gridx = 4;
		gbc_txtHora.gridy = 4;
		add(txtHora, gbc_txtHora);
		txtHora.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Duración Actividad:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtDuracion = new JTextField();
		GridBagConstraints gbc_txtDuracion = new GridBagConstraints();
		gbc_txtDuracion.gridwidth = 2;
		gbc_txtDuracion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDuracion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDuracion.gridx = 4;
		gbc_txtDuracion.gridy = 5;
		add(txtDuracion, gbc_txtDuracion);
		txtDuracion.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Plazas Actividad:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 6;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtPlazas = new JTextField();
		GridBagConstraints gbc_txtPlazas = new GridBagConstraints();
		gbc_txtPlazas.gridwidth = 2;
		gbc_txtPlazas.insets = new Insets(0, 0, 5, 5);
		gbc_txtPlazas.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPlazas.gridx = 4;
		gbc_txtPlazas.gridy = 6;
		add(txtPlazas, gbc_txtPlazas);
		txtPlazas.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Sala Actividad:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 7;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtSala = new JTextField();
		GridBagConstraints gbc_txtSala = new GridBagConstraints();
		gbc_txtSala.gridwidth = 2;
		gbc_txtSala.insets = new Insets(0, 0, 5, 5);
		gbc_txtSala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSala.gridx = 4;
		gbc_txtSala.gridy = 7;
		add(txtSala, gbc_txtSala);
		txtSala.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 4;
		gbc_btnGuardar.gridy = 10;
		add(btnGuardar, gbc_btnGuardar);
		
		btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrar.gridx = 5;
		gbc_btnBorrar.gridy = 10;
		add(btnBorrar, gbc_btnBorrar);
		
		
	}

	
	
	
	
    
	
}

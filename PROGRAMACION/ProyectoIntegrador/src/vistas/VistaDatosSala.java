package vistas;

import javax.swing.JPanel;
import Modelo.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

 

import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VistaDatosSala extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtMatricula;
	private JTextField txtCiclo;
	private JLabel lblNewLabel_5;
	private JButton btnGuardar;
	private JButton btnNuevo;
	private JButton btnBorrar;
	private JTextField txtUsuarioId;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	
	public VistaDatosSala(JFrame vista) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 74, 160, 0, 57, 49, 20};
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
		
		lblNewLabel_7 = new JLabel("ID Sala:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 2;
		gbc_lblNewLabel_7.gridy = 1;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		txtUsuarioId = new JTextField();
		GridBagConstraints gbc_txtUsuarioId = new GridBagConstraints();
		gbc_txtUsuarioId.gridwidth = 2;
		gbc_txtUsuarioId.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuarioId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuarioId.gridx = 4;
		gbc_txtUsuarioId.gridy = 1;
		add(txtUsuarioId, gbc_txtUsuarioId);
		txtUsuarioId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Codigo Sala:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblNewLabel_5 = new JLabel("                ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 7;
		gbc_lblNewLabel_5.gridy = 2;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo Sala:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtApellido = new JTextField();
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.gridwidth = 2;
		gbc_txtApellido.anchor = GridBagConstraints.NORTH;
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridx = 4;
		gbc_txtApellido.gridy = 3;
		add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Capacidad Sala:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 4;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtMatricula = new JTextField();
		GridBagConstraints gbc_txtMatricula = new GridBagConstraints();
		gbc_txtMatricula.gridwidth = 2;
		gbc_txtMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_txtMatricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMatricula.gridx = 4;
		gbc_txtMatricula.gridy = 4;
		add(txtMatricula, gbc_txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Utilizacion:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtCiclo = new JTextField();
		GridBagConstraints gbc_txtCiclo = new GridBagConstraints();
		gbc_txtCiclo.gridwidth = 2;
		gbc_txtCiclo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiclo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiclo.gridx = 4;
		gbc_txtCiclo.gridy = 5;
		add(txtCiclo, gbc_txtCiclo);
		txtCiclo.setColumns(10);
		
		btnNuevo = new JButton("Nuevo");
		GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
		gbc_btnNuevo.insets = new Insets(0, 0, 5, 5);
		gbc_btnNuevo.gridx = 3;
		gbc_btnNuevo.gridy = 9;
		add(btnNuevo, gbc_btnNuevo);
		
		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 4;
		gbc_btnGuardar.gridy = 9;
		add(btnGuardar, gbc_btnGuardar);
		
		btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 5;
		gbc_btnBorrar.gridy = 9;
		add(btnBorrar, gbc_btnBorrar);
		
		 btnNuevo.addActionListener((ActionEvent e) -> {
	            ((Monitor)vista).mostrarVista("datossala", "Datos Sala");
	        });
	}

	
 
	
	
  
	
}

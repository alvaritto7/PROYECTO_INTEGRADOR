package vistas;

import javax.swing.JPanel;
import Modelo.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

 

import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VistaDatosAlumno extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtMatricula;
	private JTextField txtCiclo;
	private JTextField txtEmail;
	private JPasswordField txtPass;
	private JLabel lblNewLabel_5;
	private JButton btnGuardar;
	private JTextField txtUsuarioId;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	
	public VistaDatosAlumno() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 100, 0, 0, 0, 0, 160, 0, 114, 49, 20};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel_8 = new JLabel("  ");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 4;
		gbc_lblNewLabel_8.gridy = 0;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		lblNewLabel_5 = new JLabel("                ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 9;
		gbc_lblNewLabel_5.gridy = 2;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		lblNewLabel_7 = new JLabel("Usuario ID:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 5;
		gbc_lblNewLabel_7.gridy = 3;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		txtUsuarioId = new JTextField();
		txtUsuarioId.setText(" ");
		GridBagConstraints gbc_txtUsuarioId = new GridBagConstraints();
		gbc_txtUsuarioId.gridwidth = 2;
		gbc_txtUsuarioId.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuarioId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuarioId.gridx = 6;
		gbc_txtUsuarioId.gridy = 3;
		add(txtUsuarioId, gbc_txtUsuarioId);
		txtUsuarioId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setToolTipText("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setText(" ");
		txtNombre.setToolTipText("");
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 6;
		gbc_txtNombre.gridy = 4;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos:");
		lblNewLabel_1.setToolTipText("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtApellido = new JTextField();
		txtApellido.setText(" ");
		txtApellido.setToolTipText("");
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.gridwidth = 2;
		gbc_txtApellido.anchor = GridBagConstraints.NORTH;
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridx = 6;
		gbc_txtApellido.gridy = 5;
		add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Matricula:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 5;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtMatricula = new JTextField();
		txtMatricula.setText(" ");
		GridBagConstraints gbc_txtMatricula = new GridBagConstraints();
		gbc_txtMatricula.gridwidth = 2;
		gbc_txtMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_txtMatricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMatricula.gridx = 6;
		gbc_txtMatricula.gridy = 6;
		add(txtMatricula, gbc_txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ciclo Educativo:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 7;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtCiclo = new JTextField();
		txtCiclo.setText(" ");
		GridBagConstraints gbc_txtCiclo = new GridBagConstraints();
		gbc_txtCiclo.gridwidth = 2;
		gbc_txtCiclo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiclo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiclo.gridx = 6;
		gbc_txtCiclo.gridy = 7;
		add(txtCiclo, gbc_txtCiclo);
		txtCiclo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 5;
		gbc_lblNewLabel_4.gridy = 8;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtEmail = new JTextField();
		txtEmail.setText(" ");
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 6;
		gbc_txtEmail.gridy = 8;
		add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Contraseña:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 5;
		gbc_lblNewLabel_6.gridy = 9;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtPass = new JPasswordField();
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.gridwidth = 2;
		gbc_txtPass.insets = new Insets(0, 0, 5, 5);
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.gridx = 6;
		gbc_txtPass.gridy = 9;
		add(txtPass, gbc_txtPass);
		
		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 7;
		gbc_btnGuardar.gridy = 13;
		add(btnGuardar, gbc_btnGuardar);
		
		
	}

	
 
	
  
	
}

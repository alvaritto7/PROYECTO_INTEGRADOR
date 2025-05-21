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
	private JTextField txtCiclo;
	private JPasswordField txtPass;
	private JLabel lblNewLabel_5;
	private JButton btnGuardar;
	private JTextField txtUsuarioId;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_1;
	private JTextField txtTipoUsuario;
	
	public VistaDatosAlumno() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 160, 0, 114, 49, 20};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel_8 = new JLabel("  ");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 3;
		gbc_lblNewLabel_8.gridy = 0;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		lblNewLabel_5 = new JLabel("                ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 8;
		gbc_lblNewLabel_5.gridy = 2;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		lblNewLabel_7 = new JLabel("Usuario ID:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 4;
		gbc_lblNewLabel_7.gridy = 3;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		txtUsuarioId = new JTextField();
		txtUsuarioId.setText(" ");
		GridBagConstraints gbc_txtUsuarioId = new GridBagConstraints();
		gbc_txtUsuarioId.gridwidth = 2;
		gbc_txtUsuarioId.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuarioId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuarioId.gridx = 5;
		gbc_txtUsuarioId.gridy = 3;
		add(txtUsuarioId, gbc_txtUsuarioId);
		txtUsuarioId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setToolTipText("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setText(" ");
		txtNombre.setToolTipText("");
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 5;
		gbc_txtNombre.gridy = 4;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ciclo Educativo:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtCiclo = new JTextField();
		txtCiclo.setText(" ");
		GridBagConstraints gbc_txtCiclo = new GridBagConstraints();
		gbc_txtCiclo.gridwidth = 2;
		gbc_txtCiclo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiclo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiclo.gridx = 5;
		gbc_txtCiclo.gridy = 5;
		add(txtCiclo, gbc_txtCiclo);
		txtCiclo.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Tipo Usuario:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 6;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtTipoUsuario = new JTextField();
		txtTipoUsuario.setText(" ");
		txtTipoUsuario.setColumns(10);
		GridBagConstraints gbc_txtTipoUsuario = new GridBagConstraints();
		gbc_txtTipoUsuario.gridwidth = 2;
		gbc_txtTipoUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtTipoUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTipoUsuario.gridx = 5;
		gbc_txtTipoUsuario.gridy = 6;
		add(txtTipoUsuario, gbc_txtTipoUsuario);
		
		JLabel lblNewLabel_6 = new JLabel("Contraseña:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 4;
		gbc_lblNewLabel_6.gridy = 7;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtPass = new JPasswordField();
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.gridwidth = 2;
		gbc_txtPass.insets = new Insets(0, 0, 5, 5);
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.gridx = 5;
		gbc_txtPass.gridy = 7;
		add(txtPass, gbc_txtPass);
		
		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 6;
		gbc_btnGuardar.gridy = 9;
		add(btnGuardar, gbc_btnGuardar);
		
		
	}

	
	public void setDatosAlumno(Usuario alumno)
	{
		txtNombre.setText(alumno.getNombreUsuario());
		txtUsuarioId.setText(alumno.getIdUsuario().toString());
		txtCiclo.setText(alumno.getCicloEducativo());
		txtTipoUsuario.setText(alumno.getTipoUsuario());
		txtPass.setText(alumno.getPassword());
		
	}
	
 
	
  
	
}

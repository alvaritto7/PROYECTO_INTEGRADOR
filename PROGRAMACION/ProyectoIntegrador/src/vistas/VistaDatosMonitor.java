package vistas;

import javax.swing.JPanel;
import Modelo.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import Controladores.AlumnoControl;
import Controladores.MonitorControl;

import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;

public class VistaDatosMonitor extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JPasswordField txtPass;
	private JLabel lblNewLabel_5;
	private JButton btnGuardar;
	private JTextField txtUsuarioId;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private MonitorControl controlador;
	private JLabel lblNewLabel_2;
	private JTextField txtMatricula;
	private JLabel lblNewLabel_4;
	private JTextField txtCiclo;
	private JLabel lblNewLabel_9;
	private JTextField txtEmail;
	private JLabel lblNewLabel_1;
	
	/**
	 * Constructor de la clase VistaDatosMonitor.
	 * Recibe el controlador de los eventos del boton.
	 * Configura el layout y agrega los componentes al panel.
	 * @param control controlador que maneja eventos del monitor
	 */
	public VistaDatosMonitor(MonitorControl control) {
		
		this.controlador = control;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 40, 40, 0, 0, 160, 0, 114, 49, 20};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel_8 = new JLabel("  ");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 3;
		gbc_lblNewLabel_8.gridy = 0;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		lblNewLabel_1 = new JLabel("Datos Personales");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_5 = new JLabel("                ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 8;
		gbc_lblNewLabel_5.gridy = 2;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		lblNewLabel_7 = new JLabel("ID Usuario:");
		lblNewLabel_7.setVisible(false);
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 4;
		gbc_lblNewLabel_7.gridy = 3;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		txtUsuarioId = new JTextField();
		txtUsuarioId.setVisible(false);
		txtUsuarioId.setEnabled(false);
		txtUsuarioId.setText("");
		GridBagConstraints gbc_txtUsuarioId = new GridBagConstraints();
		gbc_txtUsuarioId.gridwidth = 2;
		gbc_txtUsuarioId.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuarioId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuarioId.gridx = 5;
		gbc_txtUsuarioId.gridy = 3;
		add(txtUsuarioId, gbc_txtUsuarioId);
		txtUsuarioId.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Matrícula:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 4;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtMatricula = new JTextField();
		txtMatricula.setToolTipText("");
		txtMatricula.setText(" ");
		txtMatricula.setColumns(10);
		txtMatricula.setEnabled(false);
		
		GridBagConstraints gbc_txtMatricula = new GridBagConstraints();
		gbc_txtMatricula.gridwidth = 2;
		gbc_txtMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_txtMatricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMatricula.gridx = 5;
		gbc_txtMatricula.gridy = 4;
		add(txtMatricula, gbc_txtMatricula);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setToolTipText("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 5;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setText(" ");
		txtNombre.setToolTipText("");
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 5;
		gbc_txtNombre.gridy = 5;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 6;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtApellidos = new JTextField();
		txtApellidos.setText(" ");
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 2;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 5;
		gbc_txtApellidos.gridy = 6;
		add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 4;
		gbc_lblNewLabel_9.gridy = 7;
		add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		txtEmail = new JTextField();
		txtEmail.setText(" ");
		txtEmail.setColumns(10);
		txtEmail.setEnabled(false);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 5;
		gbc_txtEmail.gridy = 7;
		add(txtEmail, gbc_txtEmail);
		
		lblNewLabel_4 = new JLabel("Ciclo:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 4;
		gbc_lblNewLabel_4.gridy = 8;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtCiclo = new JTextField();
		txtCiclo.setText(" ");
		txtCiclo.setEnabled(false);
		txtCiclo.setColumns(10);
		GridBagConstraints gbc_txtCiclo = new GridBagConstraints();
		gbc_txtCiclo.gridwidth = 2;
		gbc_txtCiclo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCiclo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCiclo.gridx = 5;
		gbc_txtCiclo.gridy = 8;
		add(txtCiclo, gbc_txtCiclo);
		
		JLabel lblNewLabel_6 = new JLabel("Contraseña:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 4;
		gbc_lblNewLabel_6.gridy = 9;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtPass = new JPasswordField();
		txtPass.setEditable(false);
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.gridwidth = 2;
		gbc_txtPass.insets = new Insets(0, 0, 5, 5);
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.gridx = 5;
		gbc_txtPass.gridy = 9;
		add(txtPass, gbc_txtPass);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(control);
		btnGuardar.setActionCommand("GUARDAR_DATOS_PERSONALES");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 6;
		gbc_btnGuardar.gridy = 11;
		add(btnGuardar, gbc_btnGuardar);
		
		
	}

	/**
	 * Actualiza los campos con los datos del alumno recibido.
	 * @param alumno objeto Usuario con los datos del alumno
	 */
	public void setDatosMonitor(Usuario alumno)
	{
		txtNombre.setText(alumno.getNombreUsuario());
		txtUsuarioId.setText(alumno.getIdUsuario().toString());
		txtCiclo.setText(alumno.getCicloEducativo());
		txtPass.setText(alumno.getPassword());
		txtMatricula.setText(alumno.getMatricula());
		txtApellidos.setText(alumno.getApellidosUsuario());
		txtEmail.setText(alumno.getEmail());
		
	}
	
	/**
	 * Recupera los datos introducidos en el formulario del monitor
	 * y construye un objeto Usuario con esa informacion.
	 * 
	 * @return objeto Usuario con los datos ingresados
	 */
	public Usuario getDatosMonitor()
	{
		Usuario usuario = new Usuario();
		usuario.setIdUsuario( Integer.parseInt(   txtUsuarioId.getText()));
		usuario.setNombreUsuario(txtNombre.getText());
		usuario.setCicloEducativo(txtCiclo.getText());
		usuario.setPassword(new String(txtPass.getPassword()));
		usuario.setMatricula(txtMatricula.getText());
		usuario.setApellidosUsuario(txtApellidos.getText());
		usuario.setEmail(txtEmail.getText());
		
		return usuario;
	}
	
	
	/**
	 * Obtiene el nombre que ingreso el usuario en el campo correspondiente.
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return txtNombre.getText();
	}
	
	/**
	 * Obtiene el ciclo educativo que ingreso el usuario en el campo correspondiente.
	 * @return ciclo educativo del alumno
	 */
	public String getCicloEducativo() {
		return txtApellidos.getText();
	}
	
	/**
	 * Obtiene el id del usuario desde el campo correspondiente.
	 * @return id del usuario en formato Integer
	 */
	public Integer getIdUsuario() {
		return Integer.parseInt( txtUsuarioId.getText());
	}
	
	/**
	 * Obtiene la contraseña que ingreso el usuario.
	 * @return contraseña en formato String
	 */
	public String getPassword() {
		return new String(txtPass.getPassword());
	}
	
	/**
	 * Obtiene el número de Matrícula del usuario en el campo correspondiente.
	 * @return Matricula
	 */
	public String getMatricula() {
		return txtMatricula.getText();
	}
	/**
	 * Obtiene los Apellidos del usuario en el campo correspondiente.
	 * @return Apellidos
	 */
	public String getApellidosUsuario() {
		return txtApellidos.getText();
	}
	/**
	 * Obtiene el correo electrónico del usuario en el campo correspondiente.
	 * @return Email
	 */
	public String getEmail() {
		return txtEmail.getText();
	}
  
  
	
}

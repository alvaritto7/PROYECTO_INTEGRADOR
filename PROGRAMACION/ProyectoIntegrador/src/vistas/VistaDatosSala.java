package vistas;

import javax.swing.JPanel;
import Modelo.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import Controladores.MonitorControl;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;

/**
 * VistaDatosSala representa un panel de interfaz grafica que permite
 * ver y modificar los datos de una sala. Esta clase se usa para mostrar
 * informacion como el codigo, tipo, capacidad, ocupacion y utilizacion
 * de una sala determinada.
 * 
 * Esta vista es utilizada por el controlador MonitorControl para gestionar
 * las acciones del usuario.
 */
public class VistaDatosSala extends JPanel {

	private JTextField txtCodigoSala;
	private JTextField txtTipoSala;
	private JTextField txtCapacidadSala;
	private JTextField txtUtilizacionSala;
	private JLabel lblNewLabel_5;
	private JButton btnGuardar;
	private JTextField txtIdSala;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JButton btnVolver;
	private JTextField txtOcupacionSala;
	private JLabel lblNewLabel_4;
	private JLabel lblTitulo;

	/**
	 * Constructor de la vista. Inicializa los componentes graficos y
	 * establece el layout del formulario. Los botones se conectan con
	 * el controlador recibido como parametro.
	 * 
	 * @param control instancia de MonitorControl que gestiona las acciones
	 */
	public VistaDatosSala(MonitorControl control) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 40, 40, 0, 0, 66, 31, 0, 0, 160, 0, 57, 49, 20};
		gridBagLayout.rowHeights = new int[]{50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblTitulo = new JLabel("Modificar Sala");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.WEST;
		gbc_lblTitulo.gridwidth = 6;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 5;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);
		
		lblNewLabel_8 = new JLabel("  ");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 5;
		gbc_lblNewLabel_8.gridy = 2;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		lblNewLabel_7 = new JLabel("ID Sala:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 5;
		gbc_lblNewLabel_7.gridy = 3;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		txtIdSala = new JTextField();
		txtIdSala.setEditable(false);
		txtIdSala.setText("0");
		GridBagConstraints gbc_txtIdSala = new GridBagConstraints();
		gbc_txtIdSala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdSala.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdSala.gridx = 6;
		gbc_txtIdSala.gridy = 3;
		add(txtIdSala, gbc_txtIdSala);
		txtIdSala.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Codigo Sala:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtCodigoSala = new JTextField();
		GridBagConstraints gbc_txtCodigoSala = new GridBagConstraints();
		gbc_txtCodigoSala.gridwidth = 3;
		gbc_txtCodigoSala.insets = new Insets(0, 0, 5, 5);
		gbc_txtCodigoSala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCodigoSala.gridx = 6;
		gbc_txtCodigoSala.gridy = 4;
		add(txtCodigoSala, gbc_txtCodigoSala);
		txtCodigoSala.setColumns(10);
		
		lblNewLabel_5 = new JLabel("                ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 12;
		gbc_lblNewLabel_5.gridy = 4;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo Sala:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtTipoSala = new JTextField();
		GridBagConstraints gbc_txtTipoSala = new GridBagConstraints();
		gbc_txtTipoSala.gridwidth = 3;
		gbc_txtTipoSala.anchor = GridBagConstraints.NORTH;
		gbc_txtTipoSala.insets = new Insets(0, 0, 5, 5);
		gbc_txtTipoSala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTipoSala.gridx = 6;
		gbc_txtTipoSala.gridy = 5;
		add(txtTipoSala, gbc_txtTipoSala);
		txtTipoSala.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Capacidad:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 5;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtCapacidadSala = new JTextField();
		GridBagConstraints gbc_txtCapacidadSala = new GridBagConstraints();
		gbc_txtCapacidadSala.insets = new Insets(0, 0, 5, 5);
		gbc_txtCapacidadSala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCapacidadSala.gridx = 6;
		gbc_txtCapacidadSala.gridy = 6;
		add(txtCapacidadSala, gbc_txtCapacidadSala);
		txtCapacidadSala.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Utilizacion:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 7;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtUtilizacionSala = new JTextField();
		txtUtilizacionSala.setText("0.0");
		GridBagConstraints gbc_txtUtilizacionSala = new GridBagConstraints();
		gbc_txtUtilizacionSala.insets = new Insets(0, 0, 5, 5);
		gbc_txtUtilizacionSala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUtilizacionSala.gridx = 6;
		gbc_txtUtilizacionSala.gridy = 7;
		add(txtUtilizacionSala, gbc_txtUtilizacionSala);
		txtUtilizacionSala.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Ocupacion:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 5;
		gbc_lblNewLabel_4.gridy = 8;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtOcupacionSala = new JTextField();
		txtOcupacionSala.setText("0.0");
		GridBagConstraints gbc_txtOcupacionSala = new GridBagConstraints();
		gbc_txtOcupacionSala.insets = new Insets(0, 0, 5, 5);
		gbc_txtOcupacionSala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOcupacionSala.gridx = 6;
		gbc_txtOcupacionSala.gridy = 8;
		add(txtOcupacionSala, gbc_txtOcupacionSala);
		txtOcupacionSala.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(control);
		btnGuardar.setActionCommand("GUARDAR_SALA");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 7;
		gbc_btnGuardar.gridy = 10;
		add(btnGuardar, gbc_btnGuardar);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(control);
		btnVolver.setActionCommand("VOLVER_A_SALAS");
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.anchor = GridBagConstraints.WEST;
		gbc_btnVolver.insets = new Insets(0, 0, 5, 5);
		gbc_btnVolver.gridx = 8;
		gbc_btnVolver.gridy = 10;
		add(btnVolver, gbc_btnVolver);
	}

	/**
	 * Establece el titulo del formulario
	 * 
	 * @param titulo texto que se mostrara como titulo
	 */
	public void setTitulo(String titulo) {
		lblTitulo.setText(titulo);
	}

	/**
	 * Recupera los datos ingresados en el formulario
	 * y construye un objeto Sala con ellos.
	 * 
	 * @return objeto Sala con los datos actuales
	 */
	public Sala getDatosSala() {
		Sala sala = new Sala();
		sala.setIdSala(Integer.parseInt(txtIdSala.getText()));
		sala.setCodigoSala(txtCodigoSala.getText());		
		sala.setTipoSala(txtTipoSala.getText());
		sala.setCapacidadSala(Integer.parseInt(txtCapacidadSala.getText()));
		sala.setOcupacion(Double.parseDouble(txtOcupacionSala.getText()));
		sala.setUtilizacion(Double.parseDouble(txtUtilizacionSala.getText()));
		return sala;
	}

	/**
	 * Establece los datos del formulario a partir de un objeto Sala
	 * 
	 * @param sala objeto Sala que contiene la informacion a mostrar
	 */
	public void setDatosSala(Sala sala) {
		txtIdSala.setText(String.valueOf(sala.getIdSala()));
		txtCodigoSala.setText(sala.getCodigoSala());
		txtTipoSala.setText(sala.getTipoSala());
		txtCapacidadSala.setText(String.valueOf(sala.getCapacidadSala()));
		txtOcupacionSala.setText(String.valueOf(sala.getOcupacion()));
		txtUtilizacionSala.setText(String.valueOf(sala.getUtilizacion()));
	}
}

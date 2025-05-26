package vistas;

import javax.swing.JPanel;
import Modelo.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.text.DateFormatter;
import javax.swing.text.MaskFormatter;

import Controladores.MonitorControl;
import Main.Sesion;

import java.awt.Insets;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;

/**
 * Vista que representa el formulario de entrada de datos para una actividad.
 * Permite visualizar y editar los campos principales de una actividad y
 * enviar los datos al controlador correspondiente.
 */
public class VistaDatosActividad extends JPanel {
	private JTextField txtNombreActividad;
	//private JTextField txtFecha;
	//private JTextField txtHora;
	//private JTextField txtDuracion;
	private JTextField txtPlazas;
	private JLabel lblNewLabel_5;
	private JButton btnGuardar;
	private JTextField txtActividadId;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField txtSala;
	private JButton btnVolver;
	private MonitorControl controlador;
	private JLabel lblTitulo;
	private JFormattedTextField txtDuracion;
	private JFormattedTextField txtHora;
	private JFormattedTextField txtFecha;
	
	/**
	 * Constructor de la clase VistaDatosActividad.
	 * Inicializa todos los componentes del formulario y establece los listeners.
	 * 
	 * @param control controlador que gestiona los eventos de los botones
	 * @throws ParseException 
	 */
	
	public VistaDatosActividad(MonitorControl control)  {
		this.controlador = control;
		
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 13, 75, 67, 40, 209, 62, 0, 49, 20};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblTitulo = new JLabel("Datos de la Actividad");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.WEST;
		gbc_lblTitulo.gridwidth = 5;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 3;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);
		
		lblNewLabel_8 = new JLabel("  ");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 2;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		lblNewLabel_7 = new JLabel("ID:");
		lblNewLabel_7.setVisible(false);
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 3;
		gbc_lblNewLabel_7.gridy = 3;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		txtActividadId = new JTextField();
		txtActividadId.setVisible(false);
		txtActividadId.setText("0");
		txtActividadId.setEditable(false);
		GridBagConstraints gbc_txtActividadId = new GridBagConstraints();
		gbc_txtActividadId.insets = new Insets(0, 0, 5, 5);
		gbc_txtActividadId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtActividadId.gridx = 4;
		gbc_txtActividadId.gridy = 3;
		add(txtActividadId, gbc_txtActividadId);
		txtActividadId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtNombreActividad = new JTextField();
		GridBagConstraints gbc_txtNombreActividad = new GridBagConstraints();
		gbc_txtNombreActividad.gridwidth = 3;
		gbc_txtNombreActividad.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreActividad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreActividad.gridx = 4;
		gbc_txtNombreActividad.gridy = 4;
		add(txtNombreActividad, gbc_txtNombreActividad);
		txtNombreActividad.setColumns(10);
		
		lblNewLabel_5 = new JLabel("                ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 8;
		gbc_lblNewLabel_5.gridy = 4;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		  // Formato de hora
		
				try {
					MaskFormatter maskFecha;
					maskFecha = new MaskFormatter("####-##-##");
					txtFecha = new JFormattedTextField(maskFecha);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		//txtFecha = new JTextField();
		txtFecha.setText("yyyy-mm-dd");
		GridBagConstraints gbc_txtFecha = new GridBagConstraints();
		gbc_txtFecha.gridwidth = 3;
		gbc_txtFecha.anchor = GridBagConstraints.NORTH;
		gbc_txtFecha.insets = new Insets(0, 0, 5, 5);
		gbc_txtFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFecha.gridx = 4;
		gbc_txtFecha.gridy = 5;
		add(txtFecha, gbc_txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hora:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		
		
		  // Formato de hora
		MaskFormatter mask;
		try {
			mask = new MaskFormatter("##:##:##");
			txtHora = new JFormattedTextField(mask);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Campo con formato
        
		
		
		//txtHora = new JTextField();
		//txtHora.setText("hh:mm:ss");
		GridBagConstraints gbc_txtHora = new GridBagConstraints();
		gbc_txtHora.gridwidth = 3;
		gbc_txtHora.insets = new Insets(0, 0, 5, 5);
		gbc_txtHora.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHora.gridx = 4;
		gbc_txtHora.gridy = 6;
		add(txtHora, gbc_txtHora);
		txtHora.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Duración:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 7;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
//		txtDuracion = new JTextField();
//		GridBagConstraints gbc_txtDuracion = new GridBagConstraints();
//		gbc_txtDuracion.insets = new Insets(0, 0, 5, 5);
//		gbc_txtDuracion.fill = GridBagConstraints.HORIZONTAL;
//		gbc_txtDuracion.gridx = 4;
//		gbc_txtDuracion.gridy = 7;
//		add(txtDuracion, gbc_txtDuracion);
//		txtDuracion.setColumns(10);
		
		
		 try {
	            MaskFormatter formatter = new MaskFormatter("##");
	            formatter.setPlaceholderCharacter('_');
	            txtDuracion = new JFormattedTextField(formatter);
	        } catch (ParseException e) {
	            e.printStackTrace(); 
	        }
		
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 4;
		gbc_formattedTextField.gridy = 7;
		add(txtDuracion, gbc_formattedTextField);

		
		
		
		JLabel lblNewLabel_4 = new JLabel("Plazas:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 3;
		gbc_lblNewLabel_4.gridy = 8;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		
		try {
            MaskFormatter formatter = new MaskFormatter("##");
            formatter.setPlaceholderCharacter('_');
            txtPlazas = new JFormattedTextField(formatter);
        } catch (ParseException e) {
            e.printStackTrace(); 
        }
		
		
		
		//txtPlazas = new JTextField();
		GridBagConstraints gbc_txtPlazas = new GridBagConstraints();
		gbc_txtPlazas.insets = new Insets(0, 0, 5, 5);
		gbc_txtPlazas.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPlazas.gridx = 4;
		gbc_txtPlazas.gridy = 8;
		add(txtPlazas, gbc_txtPlazas);
		txtPlazas.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Sala:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 3;
		gbc_lblNewLabel_6.gridy = 9;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtSala = new JTextField();
		GridBagConstraints gbc_txtSala = new GridBagConstraints();
		gbc_txtSala.insets = new Insets(0, 0, 5, 5);
		gbc_txtSala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSala.gridx = 4;
		gbc_txtSala.gridy = 9;
		add(txtSala, gbc_txtSala);
		txtSala.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(control);
		
		 SpinnerDateModel model = new SpinnerDateModel();
		btnGuardar.setActionCommand("GUARDAR_ACTIVIDAD");
		
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 5;
		gbc_btnGuardar.gridy = 11;
		add(btnGuardar, gbc_btnGuardar);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(control);
		btnVolver.setActionCommand("VOLVER_A_DISPONIBLES");
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.anchor = GridBagConstraints.EAST;
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 6;
		gbc_btnVolver.gridy = 11;
		add(btnVolver, gbc_btnVolver);
		
		
	}
	
	/**
	 * Establece los datos de una actividad en el formulario.
	 * 
	 * @param a objeto Actividad cuyos datos se van a mostrar
	 */
	
	public void setDatos(Actividad a)
	{
		
		
		
		txtActividadId.setText(String.valueOf(a.getId()));
		
		txtDuracion.setText(String.valueOf(a.getDuracion()));
		txtFecha.setText(a.getFecha().toString());
		txtHora.setText(a.getHora().toString());
		
		txtNombreActividad.setText(a.getNombre());
		txtPlazas.setText(String.valueOf(a.getParticipantesMax()));
		txtSala.setText(String.valueOf(a.getIdSala()));
	}
	
	/**
	 * Obtiene los datos introducidos en el formulario y construye un objeto Actividad.
	 * 
	 * @return objeto Actividad con los datos del formulario
	 */
	
	public Actividad getDatos()
	{
		Actividad a = new Actividad();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null ;
		try {
			fecha = new Date(sdf.parse(txtFecha.getText()).getTime());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a.setId( Integer.parseInt(txtActividadId.getText()));
		a.setDuracion(Integer.parseInt(txtDuracion.getText()));
		a.setNombre(txtNombreActividad.getText());
		a.setHora(Time.valueOf(txtHora.getText()));
		a.setParticipantesMax(Integer.parseInt(txtPlazas.getText()));
		a.setFecha(fecha);
		a.setIdSala(Integer.parseInt(txtSala.getText()));
		a.setIdMonitor(Sesion.getUsuarioLogado().getIdUsuario());
		
		
		
		
		
		
		return a;
				
		
	}

	/**
	 * Establece el titulo que se muestra en la parte superior del formulario.
	 * 
	 * @param titulo texto a mostrar como titulo
	 */
	 public void setTitulo(String titulo)
	    {
	    	lblTitulo.setText(titulo);
	    }
	
    
	
}

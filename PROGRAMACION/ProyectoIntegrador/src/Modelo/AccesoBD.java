package Modelo;

import java.sql.*;
import java.util.ArrayList;

public class AccesoBD {
	private Connection conexion;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/Script_BasesDeDatos_ProyectoIntegrador_ManchesterPitis";
	private String usuario = "root";
	private String password = "Telerin12";	
	//private String password = "11111111";

	private String tipo_usuario = "A";

	public AccesoBD() {

		try {
			conexion = DriverManager.getConnection(url, usuario, password);
		}

		catch (SQLException e) {
			System.out.println("Error de conexión con la BBDD");
			e.printStackTrace();
		}
	}

	public String validarUsuario(String usuario, String password) {
		String consultaUsuario = "SELECT password, tipo_usuario FROM usuario WHERE nombre_usuario = ?";

		try (PreparedStatement stmt = conexion.prepareStatement(consultaUsuario)) {
			stmt.setString(1, usuario);
			ResultSet rs = stmt.executeQuery();

			if (!rs.next()) {
				return "Usuario no existe"; // Cuando no se encuentra al Usuario
			}
			// TODO aquí falta el ELSE que lo que hace es crear un objeto de tipo Usuario
			// y devolverlo para poder pasárselo a la vista y que la vista tenga la info del
			// usuario

			String passwordCorrecta = rs.getString("password");
			if (!passwordCorrecta.equals(password)) {
				return "Contraseña incorrecta"; // El Usuario es correcto, sin embargo no coincide con la contraseña
												// asignada a este.
			}

			this.tipo_usuario = rs.getString("tipo_usuario");

			return "Login exitoso"; // Tanto Usuario como Contraseña son correctos.

		} catch (SQLException e) {

			return "Error " + e.getMessage();
		}
	}

	public String getTipo_usuario() {
		return this.tipo_usuario;
	}

	public ArrayList<Actividad> consultaActividades() {
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();

		try {
			Statement stmt = conexion.createStatement();

			ResultSet resultados = stmt.executeQuery("select * from Actividades");

			while (resultados.next()) {
				/*
				 * estas son las cosas que tiene una actividad: 
				 * private int id; 
				 * private String nombre; 
				 * private String fecha; 
				 * private String hora; 
				 * private int duracion;
				 * private int participantesMax; 
				 * private String idSala; 
				 * private int idMonitor;
				 * 
				 * 
				 */
				
				int id = resultados.getInt(1);
				String nombre = resultados.getString(2);
				String fecha = resultados.getString(3);
				String hora = resultados.getString(4);
				int duracion = resultados.getInt(5);
				int participantesMax = resultados.getInt(6);
				String idSala = resultados.getString(7);
				int idMonitor = resultados.getInt(8);
				
				Actividad a = new Actividad(id, nombre, fecha, hora, duracion, participantesMax, idSala, idMonitor);
				
				actividades.add(a);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return actividades;
	}

public ArrayList<Actividad> consultaActividadesAlumno(Integer id_alumno) {
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();

		try {
			String consulta = "SELECT * FROM ACTIVIDADES WHERE id_actividades IN (select actividad_id FROM inscripciones WHERE usuario_id = ?)";
			
			PreparedStatement stmt = conexion.prepareStatement(consulta);
			stmt.setInt(1, id_alumno);

			ResultSet resultados = stmt.executeQuery();
			

			while (resultados.next()) {
				/*
				 * estas son las cosas que tiene una actividad: 
				 * private int id; 
				 * private String nombre; 
				 * private String fecha; 
				 * private String hora; 
				 * private int duracion;
				 * private int participantesMax; 
				 * private String idSala; 
				 * private int idMonitor;
				 * 
				 * 
				 */
				
				int id = resultados.getInt(1);
				String nombre = resultados.getString(2);
				String fecha = resultados.getString(3);
				String hora = resultados.getString(4);
				int duracion = resultados.getInt(5);
				int participantesMax = resultados.getInt(6);
				String idSala = resultados.getString(7);
				int idMonitor = resultados.getInt(8);
				
				Actividad a = new Actividad(id, nombre, fecha, hora, duracion, participantesMax, idSala, idMonitor);
				
				
				
				actividades.add(a);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return actividades;
	}

	
	
	 public Usuario getUsuarioPorNombre(String nombre)
	    {
	    	 String consultaUsuario = "SELECT id_usuario, nombre_usuario,password , cicloEducativo, tipo_usuario FROM usuario WHERE nombre_usuario = ?";
	    	 Usuario usuario = new Usuario();
	         try  {
	        	 PreparedStatement stmt = conexion.prepareStatement(consultaUsuario);
	             stmt.setString(1, nombre);            
	             ResultSet rs = stmt.executeQuery();
	             
	             while (rs.next())
	 			{	            	
	            	 
	            	 usuario.setIdUsuario(rs.getInt("id_usuario"));
	            	 usuario.setNombreUsuario(nombre);
	            	 usuario.setCicloEducativo(rs.getString("cicloEducativo"));
	            	 usuario.setTipoUsuario(rs.getString("tipo_usuario"));
	            	 usuario.setPassword(rs.getString("password"));            	 
	            	
	            	
	 			}

	             
	         } catch (SQLException e) {
	             
	             return usuario;
	         }
	    	
	    	
	    	return usuario;
	    }
	    
	
	
	public void cerrarConexion() {
		try {
			if (conexion != null && !conexion.isClosed()) {
				conexion.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
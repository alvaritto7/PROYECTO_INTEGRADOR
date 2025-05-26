package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona el acceso a la base de datos y operaciones relacionadas con usuarios, actividades, salas e inscripciones.
 */
public class AccesoBD {
	private Connection conexion;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/Script_BasesDeDatos_ProyectoIntegrador_ManchesterPitis";
	private String usuario = "root";
	private String password = "Telerin12";	
	private String tipo_usuario = "A";

	/**
	 * Constructor. Intenta establecer conexión con la base de datos.
	 * Muestra un mensaje de error en consola si ocurre algún problema durante la conexión.
     */
	public AccesoBD() {
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
		} catch (SQLException e) {
			System.out.println("Error de conexión con la BBDD");
			e.printStackTrace();
		}
	}

	/**
	 * Valida el usuario y la contraseña introducidos.
	 * 
	 * @param usuario es el codigo de matrículo.
	 * @param password Contraseña del usuario.
	 * @return Mensaje indicando si el inicio de sesión fue exitoso o el tipo de error.
	 */
	public String validarUsuario(String usuario, String password) {
		String consultaUsuario = "SELECT password, cicloEducativo FROM usuario WHERE matricula = ?";

		try (PreparedStatement stmt = conexion.prepareStatement(consultaUsuario)) {
			stmt.setString(1, usuario);
			ResultSet rs = stmt.executeQuery();

			if (!rs.next()) {
				return "Usuario no existe";
			}

			String passwordCorrecta = rs.getString("password");
			if (!passwordCorrecta.equals(password)) {
				return "Contraseña incorrecta";
			}

			String ciclo = rs.getString("cicloEducativo");
			if(ciclo.equals("TAFD"))
				this.tipo_usuario = "M";
			else
				this.tipo_usuario = "A";
			
			return "Login exitoso";

		} catch (SQLException e) {
			return "Error " + e.getMessage();
		}
	}

	/**
	 * Obtiene el tipo de usuario actual.
	 * 
	 * @return Tipo de usuario (por ejemplo, 'A' o 'U').
	 */
	public String getTipo_usuario() {
		return this.tipo_usuario;
	}

	/**
	 * Busca un usuario por su ID.
	 * 
	 * @param id ID del usuario.
	 * @return Objeto Usuario con los datos encontrados.
	 */
	public Usuario getUsuarioById(Integer id) {
		String consultaUsuario = "SELECT id_usuario, nombre_usuario, password ,cicloEducativo, apellidos_usuario, email, matricula FROM usuario WHERE id_usuario = ?";
		Usuario usuario = new Usuario();

		try {
			PreparedStatement stmt = conexion.prepareStatement(consultaUsuario);
			stmt.setInt(1, id);            
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				usuario.setIdUsuario(id);
				usuario.setNombreUsuario(rs.getString("nombre_usuario"));
				usuario.setCicloEducativo(rs.getString("cicloEducativo"));
				usuario.setPassword(rs.getString("password"));
				usuario.setApellidosUsuario(rs.getString("apellidos_usuario"));
				usuario.setEmail(rs.getString("email"));
				usuario.setMatricula(rs.getString("matricula"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}

	/**
	 * Busca una sala por su ID.
	 * 
	 * @param id ID de la sala.
	 * @return Objeto Sala con los datos encontrados.
	 */
	public Sala getSalaById(Integer id) {
		String sql = "SELECT id_sala,codigo_sala, tipo_sala, capacidad_sala, utilizacion, ocupacion FROM sala WHERE id_sala = ?";
		Sala sala = new Sala();

		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				sala.setIdSala(id);
				sala.setCodigoSala(rs.getString("codigo_sala"));
				sala.setTipoSala(rs.getString("tipo_sala"));
				sala.setCapacidadSala(rs.getInt("capacidad_sala"));
				sala.setUtilizacion(rs.getDouble("utilizacion"));
				sala.setOcupacion(rs.getDouble("ocupacion"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sala;
	}

	/**
	 * Busca una actividad por su ID.
	 * 
	 * @param id ID de la actividad.
	 * @return Objeto Actividad con los datos encontrados.
	 */
	public Actividad getActividadById(Integer id) {
		String sql = "SELECT nombre_actividad, fecha_actividad, hora_actividad, duracion_actividad, plazas_actividad, monitor_id, sala_id FROM actividades   WHERE fecha_actividad > CURRENT_DATE AND id_actividades = ?";
		Actividad actividad = new Actividad();

		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				actividad.setId(id);
				actividad.setNombre(rs.getString("nombre_actividad"));
				actividad.setFecha(rs.getDate("fecha_actividad")); 
				actividad.setHora(rs.getTime("hora_actividad"));
				actividad.setDuracion(rs.getInt("duracion_actividad"));
				actividad.setParticipantesMax(rs.getInt("plazas_actividad"));
				actividad.setIdMonitor(rs.getInt("monitor_id"));
				actividad.setIdSala(rs.getInt("sala_id"));
				actividad.setSala(this.getSalaById(actividad.getIdSala()));
				actividad.setMonitor(this.getUsuarioById(actividad.getIdMonitor()));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return actividad;
	}

	/**
	 * Busca una inscripción por su ID.
	 * 
	 * @param id ID de la inscripción.
	 * @return Objeto Inscripcion con los datos encontrados.
	 */
	public Inscripcion getInscripcionById(Integer id) {
		String sql = "SELECT id, usuario_id, actividad_id FROM inscripciones WHERE id = ?";
		Inscripcion inscripcion = new Inscripcion();

		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				inscripcion.setId(id);
				inscripcion.setActividadId(rs.getInt("actividad_id"));
				inscripcion.setUsuarioId(rs.getInt("usuario_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return inscripcion;
	}

	/**
	 * Devuelve una lista de actividades en las que el usuario no está inscrito.
	 * 
	 * @param id_usuario ID del usuario.
	 * @return Lista de actividades disponibles.
	 */
	public ArrayList<Actividad> consultaActividadesDisponibles(Integer id_usuario) {
		ArrayList<Actividad> actividades = new ArrayList<>();

		try {
			String consulta = "SELECT a.* FROM Actividades a WHERE  fecha_actividad > CURRENT_DATE AND a.id_actividades NOT IN (SELECT actividad_id FROM Inscripciones WHERE usuario_id = ?)";
			PreparedStatement stmt = conexion.prepareStatement(consulta);
			stmt.setInt(1, id_usuario);
			ResultSet resultados = stmt.executeQuery();

			while (resultados.next()) {
				int id = resultados.getInt(1);
				String nombre = resultados.getString(2);
				Date fecha = resultados.getDate(3);
				Time hora = resultados.getTime(4);
				int duracion = resultados.getInt(5);
				int participantesMax = resultados.getInt(6);
				int idSala = resultados.getInt(7);
				int idMonitor = resultados.getInt(8);
				Usuario monitor = this.getUsuarioById(idMonitor);
				Sala sala = this.getSalaById(idSala);

				Actividad a = new Actividad(id, nombre, fecha, hora, duracion, participantesMax, idSala, idMonitor, sala, monitor);
				actividades.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return actividades;
	}
	   /**
     * Guarda una nueva actividad o actualiza una existente en la base de datos.
     *
     * @param a Objeto Actividad a guardar o actualizar.
     * @return Objeto Actividad con el ID actualizado si fue insertada.
     */

	public Actividad guardarActividad(Actividad a) {
	    String sql;

	    boolean esNuevo = (a.getId() == 0);

	    if (esNuevo) {
	        sql = "INSERT INTO actividades (nombre_actividad, fecha_actividad, hora_actividad, duracion_actividad, plazas_actividad, sala_id, monitor_id) "
	            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
	    } else {
	        sql = "UPDATE actividades SET nombre_actividad = ?, fecha_actividad = ?, hora_actividad = ?, duracion_actividad = ?, "
	            + "plazas_actividad = ?, sala_id = ?, monitor_id = ? WHERE id_actividades = " + a.getId();
	    }

	    try 
	    {
	    	PreparedStatement stmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	        stmt.setString(1, a.getNombre());
	        stmt.setDate(2, a.getFecha());
	        stmt.setTime(3, a.getHora());
	        stmt.setInt(4, a.getDuracion());
	        stmt.setInt(5, a.getParticipantesMax());
	        stmt.setInt(6, a.getIdSala());
	        stmt.setInt(7, a.getIdMonitor());

	        int filas = stmt.executeUpdate();

	        if (filas > 0 && esNuevo) {
	            try (ResultSet rs = stmt.getGeneratedKeys()) {
	                if (rs.next()) {
	                    a.setId(rs.getInt(1));
	                }
	            }
	        }

	    } catch (SQLException e) {
	        e.printStackTrace(); // Considera usar un logger para producción
	    }

	    return a;
	}

	
	
	/**
	 * Consulta todas las actividades registradas.
	 * 
	 * @return Lista de todas las actividades.
	 */
	public ArrayList<Actividad> consultaActividades() {
		ArrayList<Actividad> actividades = new ArrayList<>();

		try {
			Statement stmt = conexion.createStatement();
			ResultSet resultados = stmt.executeQuery("SELECT * FROM Actividades WHERE  fecha_actividad > CURRENT_DATE");

			while (resultados.next()) {
				int id = resultados.getInt(1);
				String nombre = resultados.getString(2);
				Date fecha = resultados.getDate(3);
				Time hora = resultados.getTime(4);
				int duracion = resultados.getInt(5);
				int participantesMax = resultados.getInt(6);
				int idSala = resultados.getInt(7);
				int idMonitor = resultados.getInt(8);
				Usuario monitor = this.getUsuarioById(idMonitor);
				Sala sala = this.getSalaById(idSala);
				

				Actividad a = new Actividad(id, nombre, fecha, hora, duracion, participantesMax, idSala, idMonitor, sala, monitor);
				actividades.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return actividades;
	}

	/**
	 * Consulta actividades a cargo de un monitor específico.
	 * 
	 * @param id_monitor ID del monitor.
	 * @return Lista de actividades que imparte el monitor.
	 */
	public ArrayList<Actividad> consultaActividadesMonitor(Integer id_monitor) {
		ArrayList<Actividad> actividades = new ArrayList<>();

		try {
			String consulta = "SELECT * FROM ACTIVIDADES  WHERE   fecha_actividad > CURRENT_DATE AND monitor_id = ?";
			PreparedStatement stmt = conexion.prepareStatement(consulta);
			stmt.setInt(1, id_monitor);
			ResultSet resultados = stmt.executeQuery();

			while (resultados.next()) {
				int id = resultados.getInt(1);
				String nombre = resultados.getString(2);
				Date fecha = resultados.getDate(3);
				Time hora = resultados.getTime(4);
				int duracion = resultados.getInt(5);
				int participantesMax = resultados.getInt(6);
				int idSala = resultados.getInt(7);
				int idMonitor = resultados.getInt(8);
				Usuario monitor = this.getUsuarioById(idMonitor);
				Sala sala = this.getSalaById(idSala);

				Actividad a = new Actividad(id, nombre, fecha, hora, duracion, participantesMax, idSala, idMonitor, sala, monitor);
				actividades.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return actividades;
	}

	/**
	 * Consulta las actividades en las que está inscrito un alumno.
	 * 
	 * @param id_alumno ID del alumno.
	 * @return Lista de actividades del alumno.
	 */
	public ArrayList<Actividad> consultaActividadesAlumno(Integer id_alumno) {
		ArrayList<Actividad> actividades = new ArrayList<>();

		try {
			String consulta = "SELECT * FROM ACTIVIDADES WHERE   fecha_actividad > CURRENT_DATE AND id_actividades IN (SELECT actividad_id FROM inscripciones WHERE usuario_id = ?)";
			PreparedStatement stmt = conexion.prepareStatement(consulta);
			stmt.setInt(1, id_alumno);
			ResultSet resultados = stmt.executeQuery();

			while (resultados.next()) {
				int id = resultados.getInt(1);
				String nombre = resultados.getString(2);
				Date fecha = resultados.getDate(3);
				Time hora = resultados.getTime(4);
				int duracion = resultados.getInt(5);
				int participantesMax = resultados.getInt(6);
				int idSala = resultados.getInt(7);
				int idMonitor = resultados.getInt(8);
				Usuario monitor = this.getUsuarioById(idMonitor);
				Sala sala = this.getSalaById(idSala);

				Actividad a = new Actividad(id, nombre, fecha, hora, duracion, participantesMax, idSala, idMonitor, sala, monitor);
				actividades.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return actividades;
	}

	/**
	 * Busca un usuario por su nombre.
	 * 
	 * @param nombre Nombre del usuario.
	 * @return Objeto Usuario con los datos encontrados.
	 */
	public Usuario getUsuarioPorNombre(String nombre) {
		String consultaUsuario = "SELECT id_usuario, nombre_usuario, password ,cicloEducativo, apellidos_usuario, email, matricula FROM usuario WHERE id_usuario = ?";
		Usuario usuario = new Usuario();

		try {
			PreparedStatement stmt = conexion.prepareStatement(consultaUsuario);
			stmt.setString(1, nombre);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				usuario.setIdUsuario(rs.getInt("id_usuario"));
				usuario.setNombreUsuario(nombre);
				usuario.setCicloEducativo(rs.getString("cicloEducativo"));
				usuario.setPassword(rs.getString("password"));
				usuario.setApellidosUsuario(rs.getString("apellidos_usuario"));
				usuario.setEmail(rs.getString("email"));
				usuario.setMatricula(rs.getString("matricula"));
			}
		} catch (SQLException e) {
			return usuario;
		}

		return usuario;
	}
	 /**
     * Recupera un usuario según su matrícula.
     *
     * @param matricula Matrícula del usuario.
     * @return Objeto Usuario con los datos correspondientes.
     */
	
	public Usuario getUsuarioPorMatricula(String matricula) {
		String consultaUsuario = "SELECT id_usuario, nombre_usuario, password ,cicloEducativo, apellidos_usuario, email, matricula FROM usuario WHERE matricula = ?";
		Usuario usuario = new Usuario();

		try {
			PreparedStatement stmt = conexion.prepareStatement(consultaUsuario);
			stmt.setString(1, matricula);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				usuario.setIdUsuario(rs.getInt("id_usuario"));
				usuario.setNombreUsuario(rs.getString("nombre_usuario"));
				usuario.setCicloEducativo(rs.getString("cicloEducativo"));
				usuario.setPassword(rs.getString("password"));
				usuario.setApellidosUsuario(rs.getString("apellidos_usuario"));
				usuario.setEmail(rs.getString("email"));
				usuario.setMatricula(matricula);
			}
		} catch (SQLException e) {
			return usuario;
		}

		return usuario;
	}
	
	
	/**
	 * Actualiza los datos personales de un usuario.
	 * 
	 * @param datosUsuario Objeto con los nuevos datos del usuario.
	 * @return El mismo objeto con los datos actualizados si fue exitoso.
	 */
	public Usuario GuardarDatosPersonales(Usuario datosUsuario) {
		Integer id_usuario = datosUsuario.getIdUsuario();
		String sql;

		try {
			sql = "UPDATE usuario SET nombre_usuario = ?, password = ?, cicloEducativo = ?, apellidos_usuario = ? , matricula = ?, email = ?  WHERE id_usuario = " + id_usuario;
			PreparedStatement stmt = conexion.prepareStatement(sql);

			stmt.setString(1, datosUsuario.getNombreUsuario());
			stmt.setString(2, datosUsuario.getPassword());
			stmt.setString(3, datosUsuario.getCicloEducativo());
			stmt.setString(4, datosUsuario.getApellidosUsuario());
			stmt.setString(5, datosUsuario.getMatricula());
			stmt.setString(6, datosUsuario.getEmail());

			Integer filas = stmt.executeUpdate();

			if (filas > 0) {
				return datosUsuario;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return datosUsuario;
	}

	/**
	 * Elimina una inscripción de un usuario a una actividad a la que se  ha apuntado o inscripto.
	 * 
	 * @param id_usuario ID del usuario.
	 * @param id_actividad ID de la actividad.
	 * @return true si se borró correctamente.
	 */
	public boolean BorrarInscripcion(int id_usuario, int id_actividad) {
		String sql;

		try {
			sql = "DELETE FROM INSCRIPCIONES WHERE usuario_id = ? AND actividad_id = ?";
			PreparedStatement stmt = conexion.prepareStatement(sql);

			stmt.setInt(1, id_usuario);
			stmt.setInt(2, id_actividad);

			Integer filas = stmt.executeUpdate();

			if (filas > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	/**
	 * Inserta una nueva inscripción de un usuario en una actividad.
	 * 
	 * @param usuario_id ID del usuario.
	 * @param actividad_id ID de la actividad.
	 * @return ID de la inscripción creada.
	 */
	public Integer RealizarInscripcion(int usuario_id, int actividad_id) {
		String sql = "INSERT INTO inscripciones (usuario_id, actividad_id) VALUES (?, ?)";
		int id_inscripcion = 0;

		try {
			PreparedStatement stmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, usuario_id);
			stmt.setInt(2, actividad_id);

			int filas = stmt.executeUpdate();

			if (filas > 0) {
				try (ResultSet rs = stmt.getGeneratedKeys()) {
					if (rs.next()) {
						id_inscripcion = rs.getInt(1);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id_inscripcion;
	}
	
	  /**
     * Elimina una actividad existente en la base de datos.
     *
     * @param id_actividad ID de la actividad a eliminar.
     * @return Número de filas afectadas (0 si no se eliminó).
     */
	
	public Integer BorrarActividad(int id_actividad)
	 {
		 int filas = 0;
		 String  sql = "DELETE FROM actividades WHERE id_actividades = ?";
	      

	        try  {
	        	PreparedStatement stmt = conexion.prepareStatement(sql);
	            stmt.setInt(1, id_actividad);	            
	       
	            filas = stmt.executeUpdate();          	
	            

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return filas;
		 
	 }
	
	 /**
     * Elimina una sala registrada en la base de datos.
     *
     * @param id_sala ID de la sala a eliminar.
     * @return Número de filas afectadas.
     */
	
	
	public Integer BorrarSala(int id_sala)
	 {
		 int filas = 0;
		 String  sql = "DELETE FROM Sala WHERE id_sala = ?";
	      

	        try  {
	        	PreparedStatement stmt = conexion.prepareStatement(sql);
	            stmt.setInt(1, id_sala);	            
	       
	            filas = stmt.executeUpdate();          	
	            

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return filas;
		 
	 }
	
	 /**
     * Devuelve una lista con todas las salas registradas.
     *
     * @return Lista de objetos Sala.
     */
	 public ArrayList<Sala> getListaSalas()
	    {
		    ArrayList<Sala> listaSalas = new ArrayList<>();
	    	
	    	String consulta = "SELECT id_sala, codigo_sala, tipo_sala, capacidad_sala, utilizacion, ocupacion FROM Sala";
	        try  {
	        	Statement stmt = conexion.createStatement();	                  
	            ResultSet rs = stmt.executeQuery(consulta);
	            
	            while (rs.next())
				{
	            	
	            	Sala sala = new Sala();
	            	
	            	sala.setIdSala(rs.getInt("id_sala"));
	            	sala.setCodigoSala(rs.getString("codigo_sala"));
	            	sala.setTipoSala(rs.getString("tipo_sala"));
	            	sala.setCapacidadSala(rs.getInt("capacidad_sala"));
	            	sala.setUtilizacion(rs.getDouble("utilizacion"));
	            	sala.setOcupacion(rs.getDouble("ocupacion"));          	
	             
	           	
	             listaSalas.add(sala);
				}

	            
	        } catch (SQLException e) {
	            
	        	System.out.println("Error de conexión con la base de datos." + e.getMessage());
	            return listaSalas;
	        }
	        
	        catch (Exception e) {
	            
	        	System.out.println("Error de conexión con la base de datos." + e.getMessage());
	            return listaSalas;
	        }
	    	
	    	
	    	return listaSalas;
	    	
	    	
	    	
	    }
	    
	 /**
	  * Inserta o actualiza una sala en la base de datos.
	  * <p>
	  * Si la sala tiene un ID igual a 0, se insertará como una nueva sala.
	  * En caso contrario, se actualizará la sala existente con ese ID.
	  * </p>
	  *
	  * @param sala Objeto {@link Sala} que contiene la información de la sala a guardar o actualizar.
	  * @return El ID generado de la sala si fue insertada, o 0 si fue una actualización o si ocurrió un error.
	  */
	
 
	 public Integer GuardarSala(Sala sala) {
	       
	        String sql;
	        Integer idSala = 0;

	       
	        if (sala.getIdSala() == 0) { 
	            sql = "INSERT INTO sala (codigo_Sala, tipo_Sala, capacidad_Sala, utilizacion, ocupacion) "
	                + "VALUES (?, ?, ?, ?, ?)";
	        } else {
	            sql = "UPDATE sala SET codigo_Sala = ?, tipo_Sala = ?, capacidad_Sala = ?, utilizacion = ?, ocupacion = ? "
	                + "WHERE id_sala = " + sala.getIdSala();
	        }

	        try  {
	        	PreparedStatement stmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	            
	            stmt.setString(1, sala.getCodigoSala());
	            stmt.setString(2, sala.getTipoSala());
	            stmt.setInt(3, sala.getCapacidadSala());
	            
	            if (sala.getUtilizacion() != null) {
	                stmt.setDouble(4, sala.getUtilizacion());
	            } else {
	                stmt.setNull(4, java.sql.Types.DOUBLE); 
	            }

	            if (sala.getOcupacion() != null) {
	                stmt.setDouble(5, sala.getOcupacion());
	            } else {
	                stmt.setNull(5, java.sql.Types.DOUBLE); 
	            }

	            
	            
	            int filas = stmt.executeUpdate();

	            
	            if (filas > 0) {
	                if (sala.getIdSala() == 0) { // Si es una inserción
	                    try (ResultSet rs = stmt.getGeneratedKeys()) {
	                        if (rs.next()) {
	                            idSala = rs.getInt(1);	                            
	                        }
	                    }
	                } 
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return idSala;
	    }

	 
	 
	
	

	/**
	 * Cierra la conexión con la base de datos si está abierta.
	 */
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

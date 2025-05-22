package Modelo;

import java.sql.*;
import java.util.ArrayList;

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
	 * @param usuario Nombre del usuario.
	 * @param password Contraseña del usuario.
	 * @return Mensaje indicando si el inicio de sesión fue exitoso o el tipo de error.
	 */
	public String validarUsuario(String usuario, String password) {
		String consultaUsuario = "SELECT password, tipo_usuario FROM usuario WHERE nombre_usuario = ?";

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

			this.tipo_usuario = rs.getString("tipo_usuario");
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
		String consultaUsuario = "SELECT id_usuario, nombre_usuario, password ,cicloEducativo, tipo_usuario FROM usuario WHERE id_usuario = ?";
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
				usuario.setPassword(rs.getString("tipo_usuario"));
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
		String sql = "SELECT nombre_actividad, fecha_actividad, hora_actividad, duracion_actividad, plazas_actividad, monitor_id, sala_id FROM actividades WHERE id_actividades = ?";
		Actividad actividad = new Actividad();

		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
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
			String consulta = "SELECT a.* FROM Actividades a WHERE a.id_actividades NOT IN (SELECT actividad_id FROM Inscripciones WHERE usuario_id = ?)";
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
	 * Consulta todas las actividades registradas.
	 * 
	 * @return Lista de todas las actividades.
	 */
	public ArrayList<Actividad> consultaActividades() {
		ArrayList<Actividad> actividades = new ArrayList<>();

		try {
			Statement stmt = conexion.createStatement();
			ResultSet resultados = stmt.executeQuery("SELECT * FROM Actividades");

			while (resultados.next()) {
				int id = resultados.getInt(1);
				String nombre = resultados.getString(2);
				Date fecha = resultados.getDate(3);
				Time hora = resultados.getTime(4);
				int duracion = resultados.getInt(5);
				int participantesMax = resultados.getInt(6);
				int idSala = resultados.getInt(7);
				int idMonitor = resultados.getInt(8);

				Actividad a = new Actividad(id, nombre, fecha, hora, duracion, participantesMax, idSala, idMonitor);
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
			String consulta = "SELECT * FROM ACTIVIDADES WHERE monitor_id = ?";
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
			String consulta = "SELECT * FROM ACTIVIDADES WHERE id_actividades IN (SELECT actividad_id FROM inscripciones WHERE usuario_id = ?)";
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
		String consultaUsuario = "SELECT id_usuario, nombre_usuario,password , cicloEducativo, tipo_usuario FROM usuario WHERE nombre_usuario = ?";
		Usuario usuario = new Usuario();

		try {
			PreparedStatement stmt = conexion.prepareStatement(consultaUsuario);
			stmt.setString(1, nombre);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
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
			sql = "UPDATE usuario SET nombre_usuario = ?, password = ?, cicloEducativo = ?, tipo_usuario = ? WHERE id_usuario = " + id_usuario;
			PreparedStatement stmt = conexion.prepareStatement(sql);

			stmt.setString(1, datosUsuario.getNombreUsuario());
			stmt.setString(2, datosUsuario.getPassword());
			stmt.setString(3, datosUsuario.getCicloEducativo());
			stmt.setString(4, datosUsuario.getTipoUsuario());

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
	 * Elimina una inscripción de un usuario a una actividad.
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

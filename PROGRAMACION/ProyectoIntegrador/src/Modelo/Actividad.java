package Modelo;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa una actividad que se realiza en el centro.
 * Incluye información como el nombre, fecha, hora, duración, sala, monitor, etc.
 */
public class Actividad {

	private int id;
	private String nombre;
	private Date fecha;
	private Time hora;
	private int duracion;
	private int participantesMax;
	private int idSala;
	private int idMonitor;
	private Sala sala;
	private Usuario monitor;

	/**
	 * Constructor vacío por defecto.
	 */
	public Actividad() {}

	/**
	 * Constructor que inicializa una actividad sin objetos relacionados (sólo IDs).
	 * 
	 * @param id Identificador de la actividad
	 * @param nombre Nombre de la actividad
	 * @param fecha Fecha en la que se realiza
	 * @param hora Hora de inicio
	 * @param duracion Duración en minutos
	 * @param participantesMax Número máximo de participantes
	 * @param idSala ID de la sala donde se realiza
	 * @param idMonitor ID del monitor responsable
	 */
	public Actividad(int id, String nombre, Date fecha, Time hora, int duracion, int participantesMax,
			int idSala, int idMonitor) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.participantesMax = participantesMax;
		this.idSala = idSala;
		this.setIdMonitor(idMonitor);
	}

	/**
	 * Constructor que incluye objetos Sala y Usuario además de los datos básicos.
	 * 
	 * @param id Identificador de la actividad
	 * @param nombre Nombre de la actividad
	 * @param fecha Fecha de la actividad
	 * @param hora Hora de inicio
	 * @param duracion Duración en minutos
	 * @param participantesMax Número máximo de participantes
	 * @param idSala ID de la sala
	 * @param idMonitor ID del monitor
	 * @param sala Objeto Sala asignado a la actividad
	 * @param monitor Objeto Usuario que actúa como monitor
	 */
	public Actividad(int id, String nombre, Date fecha, Time hora, int duracion, int participantesMax, int idSala,
			int idMonitor, Sala sala, Usuario monitor) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.participantesMax = participantesMax;
		this.idSala = idSala;
		this.idMonitor = idMonitor;
		this.sala = sala;
		this.monitor = monitor;
	}
	
	
	
	public void setHora(Time hora) {
		this.hora = hora;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	

	/**
	 * Devuelve el ID de la actividad.
	 * @return ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * Establece el ID de la actividad.
	 * @param id ID de la actividad
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Devuelve el nombre de la actividad.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la actividad.
	 * @param nombre Nombre de la actividad
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la fecha de la actividad.
	 * @return fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * Establece la fecha de la actividad.
	 * @param fecha Fecha de la actividad
	 */


	/**
	 * Devuelve la hora de inicio de la actividad.
	 * @return hora
	 */


	/**
	 * Establece la hora de inicio de la actividad.
	 * @param hora Hora de la actividad
	 */
	

	public Time getHora() {
		return hora;
	}

	/**
	 * Devuelve la duración de la actividad en minutos.
	 * @return duración
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Establece la duración de la actividad en minutos.
	 * @param duracion Duración en minutos
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * Devuelve el número máximo de participantes.
	 * @return participantes máximos
	 */
	public int getParticipantesMax() {
		return participantesMax;
	}

	/**
	 * Establece el número máximo de participantes.
	 * @param participantesMax Límite de participantes
	 */
	public void setParticipantesMax(int participantesMax) {
		this.participantesMax = participantesMax;
	}

	/**
	 * Devuelve el ID de la sala.
	 * @return ID de la sala
	 */
	public int getIdSala() {
		return idSala;
	}

	/**
	 * Establece el ID de la sala.
	 * @param idSala ID de la sala
	 */
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	/**
	 * Devuelve el ID del monitor que dirige la actividad.
	 * @return ID del monitor
	 */
	public int getIdMonitor() {
		return idMonitor;
	}

	/**
	 * Establece el ID del monitor.
	 * @param idMonitor ID del monitor
	 */
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}

	/**
	 * Devuelve el objeto Sala asignado a la actividad.
	 * @return Sala
	 */
	public Sala getSala() {
		return sala;
	}

	/**
	 * Asigna una sala a la actividad.
	 * @param sala Objeto Sala
	 */
	public void setSala(Sala sala) {
		this.sala = sala;
	}

	/**
	 * Devuelve el monitor de la actividad.
	 * @return Usuario que actúa como monitor
	 */
	public Usuario getMonitor() {
		return monitor;
	}

	/**
	 * Establece el monitor de la actividad.
	 * @param monitor Objeto Usuario
	 */
	public void setMonitor(Usuario monitor) {
		this.monitor = monitor;
	}

	/**
	 * Representación en texto de la actividad.
	 * @return Cadena con nombre, fecha, hora y número de participantes
	 */
	public String toString() {
		return nombre + " - " + fecha + " a las " + hora + " Max participantes: " + participantesMax;
	}
}

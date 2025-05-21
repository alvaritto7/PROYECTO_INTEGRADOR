
package Modelo;

public class Actividad {

	//{ "2", "Futbol", "2025-04-16", "11:00:00", "60", "15", "F505" },
	private int id;
	private String nombre;
	private String fecha;
	private String hora;
	private int duracion;
	private int participantesMax;
	private String idSala;
	private int idMonitor;
	
	
	public Actividad(int id, String nombre, String fecha, String hora, int duracion, int participantesMax,
			String idSala, int idMonitor) {
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}


	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}


	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}


	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	/**
	 * @return the participantesMax
	 */
	public int getParticipantesMax() {
		return participantesMax;
	}


	/**
	 * @param participantesMax the participantesMax to set
	 */
	public void setParticipantesMax(int participantesMax) {
		this.participantesMax = participantesMax;
	}


	/**
	 * @return the idSala
	 */
	public String getIdSala() {
		return idSala;
	}


	/**
	 * @param idSala the idSala to set
	 */
	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}
	
	
	/**
	 * @return the idMonitor
	 */
	public int getIdMonitor() {
		return idMonitor;
	}


	/**
	 * @param idMonitor the idMonitor to set
	 */
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}


	public String toString() {
		return nombre + " - " + fecha + " a las "+ hora + " Max participantes: "+ participantesMax;
	}
	
	
}
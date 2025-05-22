package Modelo;

/**
 * Clase que representa una inscripción de un usuario a una actividad.
 * Guarda el ID de la inscripción, el ID del usuario y el ID de la actividad.
 */
public class Inscripcion {

    private int id;
    private Integer usuarioId;
    private Integer actividadId;

    /**
     * Constructor vacío. Se puede usar cuando se va a rellenar luego.
     */
    public Inscripcion() {
    }

    /**
     * Constructor con todos los campos.
     * 
     * @param id ID de la inscripción
     * @param usuarioId ID del usuario que se inscribe
     * @param actividadId ID de la actividad a la que se inscribe
     */
    public Inscripcion(int id, Integer usuarioId, Integer actividadId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.actividadId = actividadId;
    }

    /**
     * Devuelve el ID de la inscripción.
     * 
     * @return ID de la inscripción
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la inscripción.
     * 
     * @param id Nuevo ID de la inscripción
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el ID del usuario inscrito.
     * 
     * @return ID del usuario
     */
    public Integer getUsuarioId() {
        return usuarioId;
    }

    /**
     * Establece el ID del usuario inscrito.
     * 
     * @param usuarioId ID del usuario
     */
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    /**
     * Devuelve el ID de la actividad a la que se ha inscrito el usuario.
     * 
     * @return ID de la actividad
     */
    public Integer getActividadId() {
        return actividadId;
    }

    /**
     * Establece el ID de la actividad.
     * 
     * @param actividadId ID de la actividad
     */
    public void setActividadId(Integer actividadId) {
        this.actividadId = actividadId;
    }
}

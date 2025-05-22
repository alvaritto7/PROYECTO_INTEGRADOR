package Modelo;

/**
 * Clase que representa a un usuario del sistema.
 * Puede ser un alumno, un monitor o un administrador dependiendo del tipo de usuario.
 */
public class Usuario {

    private Integer idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private String cicloEducativo;
    private String password; // Campo duplicado en nombre con "contrasena", pero lo incluyo tal cual en la tabla
    private String tipoUsuario;

    /**
     * Constructor vacio.
     * Se usa cuando se quiere crear el objeto sin asignar valores aun.
     */
    public Usuario() {
    }

    /**
     * Constructor con todos los atributos del usuario.
     *
     * @param idUsuario identificador del usuario
     * @param nombreUsuario nombre de inicio de sesion del usuario
     * @param contrasena contrasena del usuario
     * @param cicloEducativo ciclo educativo al que pertenece el usuario
     * @param password campo duplicado de contrasena, se mantiene por compatibilidad
     * @param tipoUsuario tipo de usuario (puede ser alumno, monitor, admin, etc.)
     */
    public Usuario(Integer idUsuario, String nombreUsuario, String contrasena, String cicloEducativo, String password, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.cicloEducativo = cicloEducativo;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Devuelve el ID del usuario.
     *
     * @return idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param idUsuario nuevo id del usuario
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Devuelve el nombre del usuario.
     *
     * @return nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombreUsuario nombre que se asigna al usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Devuelve la contrasena del usuario.
     *
     * @return contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contrasena del usuario.
     *
     * @param contrasena nueva contrasena del usuario
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Devuelve el ciclo educativo del usuario.
     *
     * @return cicloEducativo
     */
    public String getCicloEducativo() {
        return cicloEducativo;
    }

    /**
     * Establece el ciclo educativo del usuario.
     *
     * @param cicloEducativo nuevo ciclo educativo al que pertenece el usuario
     */
    public void setCicloEducativo(String cicloEducativo) {
        this.cicloEducativo = cicloEducativo;
    }

    /**
     * Devuelve el campo de password duplicado.
     * Se mantiene por si en la base de datos se usa este nombre.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece el valor del campo password.
     *
     * @param password nuevo valor de password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Devuelve el tipo de usuario.
     *
     * @return tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Establece el tipo de usuario.
     *
     * @param tipoUsuario tipo asignado al usuario
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}

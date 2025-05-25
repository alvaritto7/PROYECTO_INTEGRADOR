package Modelo;

/**
 * Representa un usuario del sistema, con información personal y de acceso.
 */
public class Usuario {

    /** Identificador único del usuario */
    private Integer idUsuario;

    /** Matrícula o código del usuario */
    private String matricula;

    /** Nombre del usuario */
    private String nombreUsuario;

    /** Apellidos del usuario */
    private String apellidosUsuario;

    /** Correo electrónico del usuario */
    private String email;

    /** Contraseña del usuario (campo 1) */
    private String contrasena;

    /** Ciclo educativo al que pertenece el usuario */
    private String cicloEducativo;

    /** Contraseña del usuario (campo 2, duplicado del anterior) */
    private String password;

    /** Tipo de usuario (por ejemplo, administrador, estudiante, etc.) */
    private String tipoUsuario;

    /**
     * Constructor por defecto.
     */
    public Usuario() {
    }

    /**
     * Constructor con todos los atributos.
     * 
     * @param idUsuario       Identificador del usuario
     * @param matricula       Matrícula del usuario
     * @param nombreUsuario   Nombre del usuario
     * @param apellidosUsuario Apellidos del usuario
     * @param email           Correo electrónico
     * @param contrasena      Contraseña (campo 1)
     * @param cicloEducativo  Ciclo educativo
     * @param password        Contraseña (campo 2, duplicado)
     * @param tipoUsuario     Tipo de usuario
     */
    public Usuario(Integer idUsuario, String matricula, String nombreUsuario, String apellidosUsuario, String email,
                   String contrasena, String cicloEducativo, String password, String tipoUsuario) {
        super();
        this.idUsuario = idUsuario;
        this.matricula = matricula;
        this.nombreUsuario = nombreUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.email = email;
        this.contrasena = contrasena;
        this.cicloEducativo = cicloEducativo;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return Identificador del usuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario Establece el identificador del usuario
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return Nombre del usuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario Establece el nombre del usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return Contraseña del usuario (campo 1)
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena Establece la contraseña (campo 1)
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return Ciclo educativo del usuario
     */
    public String getCicloEducativo() {
        return cicloEducativo;
    }

    /**
     * @param cicloEducativo Establece el ciclo educativo
     */
    public void setCicloEducativo(String cicloEducativo) {
        this.cicloEducativo = cicloEducativo;
    }

    /**
     * @return Contraseña del usuario (campo 2)
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password Establece la contraseña (campo 2)
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Tipo de usuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario Establece el tipo de usuario
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return Matrícula del usuario
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula Establece la matrícula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return Apellidos del usuario
     */
    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    /**
     * @param apellidosUsuario Establece los apellidos del usuario
     */
    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    /**
     * @return Correo electrónico del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email Establece el correo electrónico
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

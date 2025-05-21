package Modelo;


	public class Usuario {

	    private Integer idUsuario;
	    private String nombreUsuario;
	    private String contrasena;
	    private String cicloEducativo;
	    private String password; // Campo duplicado en nombre con "contrasena", pero lo incluyo tal cual en la tabla
	    private String tipoUsuario;

	   

	    // Constructor vacío
	    public Usuario() {
	    }

	    // Constructor con todos los campos
	    public Usuario(Integer idUsuario, String nombreUsuario, String contrasena, String cicloEducativo, String password, String tipoUsuario) {
	        this.idUsuario = idUsuario;
	        this.nombreUsuario = nombreUsuario;
	        this.contrasena = contrasena;
	        this.cicloEducativo = cicloEducativo;
	        this.password = password;
	        this.tipoUsuario = tipoUsuario;
	    }

	    // Getters y Setters
	    public Integer getIdUsuario() {
	        return idUsuario;
	    }

	    public void setIdUsuario(Integer idUsuario) {
	        this.idUsuario = idUsuario;
	    }

	    public String getNombreUsuario() {
	        return nombreUsuario;
	    }

	    public void setNombreUsuario(String nombreUsuario) {
	        this.nombreUsuario = nombreUsuario;
	    }

	    public String getContrasena() {
	        return contrasena;
	    }

	    public void setContrasena(String contrasena) {
	        this.contrasena = contrasena;
	    }

	    public String getCicloEducativo() {
	        return cicloEducativo;
	    }

	    public void setCicloEducativo(String cicloEducativo) {
	        this.cicloEducativo = cicloEducativo;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getTipoUsuario() {
	        return tipoUsuario;
	    }

	    public void setTipoUsuario(String tipoUsuario) {
	        this.tipoUsuario = tipoUsuario;
	    }

	   
	}

	



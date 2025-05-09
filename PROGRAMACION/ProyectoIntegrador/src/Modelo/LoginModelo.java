package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginModelo {
    private Connection conexion;
    private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/login";
	private String usuario =  "root";
	private String password = "Telerin12";
	
	private String tipo_usuario = "A";

    public LoginModelo() {
        
    	try {	
            conexion = DriverManager.getConnection(url, usuario, password);
        } 
        
    	catch (SQLException e) {
        	System.out.println("Error de conexión con la BBDD");
            e.printStackTrace();
        }
    }

    public String validarUsuario(String usuario, String password) {
        String consultaUsuario = "SELECT password, tipo_usuario FROM usuarios WHERE usuario = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(consultaUsuario)) {
            stmt.setString(1, usuario);            
            ResultSet rs = stmt.executeQuery();

            if (!rs.next()) {
                return "Usuario no existe"; // Cuando no se encuentra al Usuario 
            }

            String passwordCorrecta = rs.getString("password");
            if (!passwordCorrecta.equals(password)) {
                return "Contraseña incorrecta"; // El Usuario es correcto, sin embargo no coincide con la contraseña asignada a este.
            }
            
            this.tipo_usuario = rs.getString("tipo_usuario");

            return "Login exitoso"; // Tanto Usuario como Contraseña son correctos.

        } catch (SQLException e) {
            
            return "Error";
        }
    }
    
    public String getTipo_usuario() {
    	return this.tipo_usuario;
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
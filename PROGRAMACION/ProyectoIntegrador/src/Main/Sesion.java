package Main;

import Modelo.Usuario;

/**
 * Clase que maneja la sesion actual del usuario.
 * Utiliza el patron singleton para que solo haya una instancia de usuario logado.
 */
public class Sesion {
   
    private static Usuario usuario;

    /**
     * Constructor privado para evitar que se creen instancias de esta clase.
     */
    private Sesion() {
      
    }

    /**
     * Devuelve el usuario que ha iniciado sesion.
     * 
     * @return usuario logado
     */
    public static Usuario getUsuarioLogado() {
        return usuario;
    }

    /**
     * Establece el usuario que ha iniciado sesion.
     * 
     * @param usuarioLogado usuario que se acaba de logar
     */
    public static void setUsuarioLogado(Usuario usuarioLogado) {
        usuario = usuarioLogado;
    }

}

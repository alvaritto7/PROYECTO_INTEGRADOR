package Main;

import Modelo.Usuario;

public class Sesion {
	   
    private static  Usuario usuario;

    private Sesion() {
      
    }


    public static Usuario getUsuarioLogado() {
        return usuario;
    }

    public static void setUsuarioLogado(Usuario usuarioLogado) {
        usuario = usuarioLogado;
    }

}

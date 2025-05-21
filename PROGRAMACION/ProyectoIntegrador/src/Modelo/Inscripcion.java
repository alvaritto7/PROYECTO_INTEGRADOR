package Modelo;

public class Inscripcion {

    private int id;
    private Integer usuarioId;
    private Integer actividadId;

    
    public Inscripcion() {
    }

    
    public Inscripcion(int id, Integer usuarioId, Integer actividadId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.actividadId = actividadId;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getActividadId() {
        return actividadId;
    }

    public void setActividadId(Integer actividadId) {
        this.actividadId = actividadId;
    }

   
}


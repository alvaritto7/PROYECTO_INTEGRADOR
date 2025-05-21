package Modelo;

public class Sala {

    private int idSala;
    private String codigoSala;
    private String tipoSala;
    private int capacidadSala;
    private Double utilizacion;
    private Double ocupacion;

    
    public Sala() {
    }

    
    public Sala(int idSala, String codigoSala, String tipoSala, int capacidadSala, Double utilizacion, Double ocupacion) {
        this.idSala = idSala;
        this.codigoSala = codigoSala;
        this.tipoSala = tipoSala;
        this.capacidadSala = capacidadSala;
        this.utilizacion = utilizacion;
        this.ocupacion = ocupacion;
    }

    
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public int getCapacidadSala() {
        return capacidadSala;
    }

    public void setCapacidadSala(int capacidadSala) {
        this.capacidadSala = capacidadSala;
    }

    public Double getUtilizacion() {
        return utilizacion;
    }

    public void setUtilizacion(Double utilizacion) {
        this.utilizacion = utilizacion;
    }

    public Double getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(Double ocupacion) {
        this.ocupacion = ocupacion;
    }

   
    
}

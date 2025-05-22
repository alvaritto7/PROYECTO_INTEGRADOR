package Modelo;

/**
 * Clase que representa una sala dentro del sistema.
 * Contiene información como el código de la sala, tipo, capacidad y estadisticas de uso.
 */
public class Sala {

    private int idSala;
    private String codigoSala;
    private String tipoSala;
    private int capacidadSala;
    private Double utilizacion;
    private Double ocupacion;

    /**
     * Constructor vacío. Útil cuando se va a establecer la información más tarde.
     */
    public Sala() {
    }

    /**
     * Constructor con todos los atributos de la sala.
     *
     * @param idSala ID unico de la sala
     * @param codigoSala Código identificativo de la sala
     * @param tipoSala Tipo de sala (por ejemplo, gimnasio, sala de reuniones, etc.)
     * @param capacidadSala Número máximo de personas que caben en la sala
     * @param utilizacion Porcentaje de uso de la sala
     * @param ocupacion Porcentaje de ocupacion actual
     */
    public Sala(int idSala, String codigoSala, String tipoSala, int capacidadSala, Double utilizacion, Double ocupacion) {
        this.idSala = idSala;
        this.codigoSala = codigoSala;
        this.tipoSala = tipoSala;
        this.capacidadSala = capacidadSala;
        this.utilizacion = utilizacion;
        this.ocupacion = ocupacion;
    }

    /**
     * Devuelve el ID de la sala.
     *
     * @return ID de la sala
     */
    public int getIdSala() {
        return idSala;
    }

    /**
     * Establece el ID de la sala.
     *
     * @param idSala ID que se asigna a la sala
     */
    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    /**
     * Devuelve el código de la sala.
     *
     * @return Código de la sala
     */
    public String getCodigoSala() {
        return codigoSala;
    }

    /**
     * Establece el código de la sala.
     *
     * @param codigoSala Nuevo código de la sala
     */
    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    /**
     * Devuelve el tipo de sala.
     *
     * @return Tipo de sala
     */
    public String getTipoSala() {
        return tipoSala;
    }

    /**
     * Establece el tipo de sala.
     *
     * @param tipoSala Tipo que se asigna a la sala
     */
    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    /**
     * Devuelve la capacidad maxima de la sala.
     *
     * @return Capacidad de la sala
     */
    public int getCapacidadSala() {
        return capacidadSala;
    }

    /**
     * Establece la capacidad maxima de la sala.
     *
     * @param capacidadSala numero maximo de personas que puede contener la sala
     */
    public void setCapacidadSala(int capacidadSala) {
        this.capacidadSala = capacidadSala;
    }

    /**
     * Devuelve el porcentaje de utilización de la sala.
     *
     * @return Porcentaje de utilización
     */
    public Double getUtilizacion() {
        return utilizacion;
    }

    /**
     * Establece el porcentaje de utilización de la sala.
     *
     * @param utilizacion Porcentaje que indica con que frecuencia se usa la sala
     */
    public void setUtilizacion(Double utilizacion) {
        this.utilizacion = utilizacion;
    }

    /**
     * Devuelve el porcentaje de ocupación actual de la sala.
     *
     * @return Porcentaje de ocupación
     */
    public Double getOcupacion() {
        return ocupacion;
    }

    /**
     * Establece el porcentaje de ocupación actual de la sala.
     *
     * @param ocupacion Porcentaje que indica lo llena esta la sala
     */
    public void setOcupacion(Double ocupacion) {
        this.ocupacion = ocupacion;
    }
}

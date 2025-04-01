public class Vehiculo {

    private String id;
    private String modelo;
    private String fechafabricacion;
    private String kilometraje;
    private EstadoOperativo estadoOperativo;
    private String misionesCompletadas;

    public Vehiculo(String id, String modelo, String fechafabricacion, String kilometraje, String misionesCompletadas, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.fechafabricacion = fechafabricacion;
        this.kilometraje = kilometraje;
        this.misionesCompletadas = misionesCompletadas;
        this.estadoOperativo = estadoOperativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechafabricacion() {
        return fechafabricacion;
    }

    public void setFechafabricacion(String fechafabricacion) {
        this.fechafabricacion = fechafabricacion;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public String getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(String misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechafabricacion='" + fechafabricacion + '\'' +
                ", kilometraje='" + kilometraje + '\'' +
                ", estadoOperativo=" + estadoOperativo +
                ", misionesCompletadas='" + misionesCompletadas + '\'' +
                '}';
    }
}

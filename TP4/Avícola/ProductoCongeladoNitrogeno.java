import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends ProductoCongelado{
    private String metodoCongelacion;
    private int tiempoExposicion;

    public ProductoCongeladoNitrogeno (String nombre, LocalDate fechaVencimiento, int lote, LocalDate envasado, String granja, int codigo, int temperatura, String metodoCongelacion, int tiempoExposicion){
        super(nombre, fechaVencimiento, lote, envasado, granja, codigo, temperatura);
        setMetodoCongelacion (metodoCongelacion);
        setTiempoExposicion (tiempoExposicion);
    }


    private void setTiempoExposicion(int tiempoExposicion2) {
        this.tiempoExposicion = tiempoExposicion2;
    }

    public int getTiempo() {
        return tiempoExposicion;
    }


    private void setMetodoCongelacion(String metodoCongelacion2) {
        this.metodoCongelacion = metodoCongelacion2;
    }

    public String getMetodo () {
        return metodoCongelacion;
    }


    public String toString() {
        return super.toString() +
               ", Método de Congelación: " + getMetodo() +
               ", Tiempo de Exposición: " + getTiempo() + " segundos";
    }
}

import java.time.LocalDate;

public class ProductoCongelado extends Producto{
    String tipoCongelado;

    public ProductoCongelado (String nombre, LocalDate fechaVencimiento, int lote, LocalDate envasado, String granja, int codigo, int temperatura){
        super(nombre, fechaVencimiento, lote, envasado, granja, codigo, temperatura);
    }

    public String toString () {
        return super.toString() +
                ", Código del organismo de supervisión: " + getCodigo() +
                ", Temperatura de mantenimiento: " + getTemperatura();
    }
}

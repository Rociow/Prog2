package videoclub;

import java.time.LocalDate;

public class ProductoAlquilado extends Productos {
    private LocalDate fechaAlquilado;
    private Productos producto;

    public ProductoAlquilado(LocalDate fechaAlquilado, Productos producto){
        this.fechaAlquilado=fechaAlquilado;
        this.producto=producto;
    }

    public void setFechaAlquilado(LocalDate fechaAlquilado) {
        this.fechaAlquilado = fechaAlquilado;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public LocalDate getFechaAlquilado () {
        return fechaAlquilado;
    }

    @Override
    public boolean sePuedeAlquilar() {
        return false;
    }
}

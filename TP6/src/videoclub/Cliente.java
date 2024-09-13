package videoclub;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    ArrayList <ProductoAlquilado> productosAlquilados;

    public Cliente (String nombre) {
        this.nombre = nombre;
        this.productosAlquilados = new ArrayList<>();
    }

    public void addProductoAlquilado (Productos p) {
        ProductoAlquilado pAlquilado = new ProductoAlquilado(LocalDate.now(), p);
        productosAlquilados.add(pAlquilado);
    }

    public LocalDate getFechaProductoAlquilado(Productos p) {
        LocalDate fecha=null;
        ArrayList<ProductoAlquilado> alquilados = new ArrayList<>(productosAlquilados);
        for (ProductoAlquilado pAlq : alquilados) {
            if (pAlq.getProducto().equals(p)){
                 fecha=pAlq.getFechaAlquilado();
                break;
            }
        }
        return fecha;
    }
}

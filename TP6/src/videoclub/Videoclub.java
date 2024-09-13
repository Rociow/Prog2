package videoclub;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Productos> productos;
    private ArrayList<Cliente> clientes;

    public Videoclub () {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void addProducto (Productos producto){
        productos.add(producto);
    }

    public void addCliente (Cliente cliente){
        clientes.add(cliente);
    }

    public void alquilarProducto (Cliente c, Productos p){
        LocalDate hoy = LocalDate.now();
        if (p.getFechaAlquiler() == null && p.sePuedeAlquilar()) {
            c.addProductoAlquilado(p);
            p.setFechaAlquiler(hoy);
        } else {
            System.out.println("No se puede");
        }
    }
    public void alquilarPelicula(Cliente c, Peliculas p){


    }
}

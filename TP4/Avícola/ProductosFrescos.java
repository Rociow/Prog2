import java.time.LocalDate;

public class ProductosFrescos extends Producto{

    public ProductosFrescos (String nombre, LocalDate fechaVencimiento, int lote, LocalDate envasado, String granja){
        super(nombre, fechaVencimiento, lote, envasado, granja);

    }   
    
}

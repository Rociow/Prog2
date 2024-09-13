import java.time.LocalDate;

public class Flores extends Planta{
    String color;

    public Flores (String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra, String color) {
        super(nombreCientifico, nombreComun, paisOrigen, fechaCompra);
        this.color = color;
    }
}

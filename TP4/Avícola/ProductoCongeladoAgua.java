import java.time.LocalDate;

public class ProductoCongeladoAgua extends ProductoCongelado{
    private double salinidad;

    public ProductoCongeladoAgua (String nombre, LocalDate fechaVencimiento, int lote, LocalDate envasado, String granja, int codigo, int temperatura, double salinidad){
        super(nombre, fechaVencimiento, lote, envasado, granja, codigo, temperatura);
        setSalinidad (salinidad);
  
}

    private void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    public double getSalinidad (){
        return salinidad;
    }


    public String toString () {

            return super.toString() +
                   ", Salinidad: " + getSalinidad() + " g/L";
        }
}

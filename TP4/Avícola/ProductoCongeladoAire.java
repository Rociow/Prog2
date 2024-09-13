import java.time.LocalDate;

public class ProductoCongeladoAire extends ProductoCongelado {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public ProductoCongeladoAire (String nombre, LocalDate fechaVencimiento, int lote, LocalDate envasado, String granja, int codigo, int temperatura, double nitro, double oxigen, double dioxido, double vapor){
        super(nombre, fechaVencimiento, lote, envasado, granja, codigo, temperatura);
        setNitrogeno (nitro);
        setOxigeno(oxigen);
        setCarbono (dioxido);
        setVapor(vapor);
}

    private void setVapor(double vapor) {
        this.porcentajeVaporAgua = vapor;
    }

    private void setCarbono(double dioxido) {
        this.porcentajeDioxidoCarbono = dioxido;
    }

    private void setOxigeno(double oxigen) {
        this.porcentajeOxigeno = oxigen;
    }

    private void setNitrogeno(double nitro) {
        this.porcentajeNitrogeno = nitro;
    }

    public String toString () {

        return super.toString() +
        ", % Nitrógeno: " + porcentajeNitrogeno +
        ", % Oxígeno: " + porcentajeOxigeno +
        ", % Dióxido de Carbono: " + porcentajeDioxidoCarbono +
        ", % Vapor de Agua: " + porcentajeVaporAgua;

    }
}
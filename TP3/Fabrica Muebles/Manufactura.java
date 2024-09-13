
public class Manufactura {
    String nombreProducto;
    String tipoMadera;
    String color;
    double peso;
    double costo;
    double precioVenta;
    boolean disponible;

    public Manufactura (String nombreProducto1, String tipoMadera1,String color1,double peso1,double costo1, boolean disponible1){
        setNombre(nombreProducto1);
        setMadera(tipoMadera1);
        setColor(color1);
        setPeso(peso1);
        setCosto(costo1);
        setDisponible(disponible1);
    }

    private void setDisponible(boolean disponible1) {
        this.disponible=disponible1;
    }

    public boolean getDisponible () {
        return disponible;
    }


    public double getPrecio(){
        return costo+(costo*0.35);
    }

    private void setCosto(double costo1) {
        this.costo=costo1;
    }

    public double getCosto(){
        return costo;
    }

    private void setPeso(double peso1) {
        this.peso=peso1;
    }

    private void setColor(String color1) {
        this.color=color1;
    }

    private void setMadera(String tipoMadera1) {
        this.tipoMadera=tipoMadera1;
    }

    private void setNombre(String nombreProducto1) {
        this.nombreProducto=nombreProducto1;
    }

    public String getNombre(){
        return nombreProducto;
    }
}

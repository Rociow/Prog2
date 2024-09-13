public class Electrodomesticos {
    private String nombre;
    private String color;
    private double consumoEnergetico;
    private double peso;
    private int precioBase;

    public Electrodomesticos () {

        this.color = "gris plata";
        this.consumoEnergetico = 10;
        this.precioBase = 100;
        this.peso = 2.0;
    }

    public boolean esBajoConsumo () {
        if (consumoEnergetico < 45) {
            return true;
        }
            else {
                return false;
            }
    }

    public double balance () {
        return consumoEnergetico/peso;
    }

    public boolean esAltaGama () {
        if (balance() > 3){
            return true;
        } else {
            return false;
        }
    }

}



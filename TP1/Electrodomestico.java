public class Electrodomestico {

    String nombre;
    String color;
    int precioBase;
    int consumoEnergetico;
    int peso;
    int balance;

    public Electrodomestico(){
        color = "gris plata";
        precioBase = 100;
        consumoEnergetico = 10;
        peso = 2;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public int getPrecio(){
        return precioBase;
    }

    public void setPrecio(int newPrecio){
        this.precioBase=newPrecio;
    }
    
    public int getConsumo(){
        return consumoEnergetico;
    }

    public void setConsumo(int newConsumo){
        this.consumoEnergetico=newConsumo;
    }

    public int getPeso(){
        return peso;
    }

    public void setPeso(int newPeso){
        this.peso=newPeso;
    }

    public boolean esBajoConsumo (){
        if ( consumoEnergetico <= 45){
            return true;
        } else {
            return false;
        }
    }

    public int balance(){
        balance = consumoEnergetico/peso;
        
        return balance;
    }

    public boolean esAltaGama(){
        if (balance>3){
            return true;
        } else {
            return false;
        }
    }

    
}

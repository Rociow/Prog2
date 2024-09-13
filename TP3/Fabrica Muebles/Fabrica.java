public class Fabrica {
    Manufactura producto;
    Manufactura [] stock;

    public Fabrica (){
        stock = new Manufactura[0];
    }

    public void agregarProducto (Manufactura producto) {

        if (producto.getDisponible() == true){
        Manufactura [] stockAux = new Manufactura[stock.length+1];

        for (int i = 0; i < stock.length; i++){
            stockAux[i]=stock[i];
        }

        stockAux[stockAux.length-1]=producto;
        stock=stockAux;
    } else {
        System.out.println("No se puede agregar producto al stock ya que no esta disponible");
    }
    }

    public void calcularCosto(){
        double costo;
        for (int i = 0; i < stock.length; i++){
            costo = stock[i].getCosto();
            System.out.println("El producto " + stock[i].getNombre() + " tiene un costo de fabricación de: $" + costo);
        }
    }

    public void calcularCostoVenta(){
        double costo;
        for (int i = 0; i < stock.length; i++){
            costo = stock[i].getPrecio();
            System.out.println("El producto " + stock[i].getNombre() + " tiene un costo de fabricación de: $" + costo);
        }
    }

    public static void main(String[] args) {
        Fabrica muebles = new Fabrica();
        muebles.agregarProducto(new Manufactura("Silla", "rrr", "blanco", 20, 400, true));

        muebles.calcularCosto();
        muebles.calcularCostoVenta();
    }

}
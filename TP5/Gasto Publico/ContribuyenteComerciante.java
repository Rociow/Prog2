public class ContribuyenteComerciante extends ContribuyenteSimple {
    int montoVentas;
    int impuestoFijo;
    double impuestoVentas;

    public ContribuyenteComerciante(String nombre, int id, int monto, int ventas) {
        super(nombre, id, monto);
        this.montoVentas = ventas;
        this.impuestoFijo = monto / 2;
        this.impuestoVentas = (ventas * 3.5);
    }
    
}

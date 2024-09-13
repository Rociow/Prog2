public class ContribuyenteSimple extends Contribuyente {
    int montoFijo;
    
    public ContribuyenteSimple(String nombre, int id, int monto) {
        super(nombre, id);
        this.montoFijo = monto;
    }

    public int getMonto () {
        return montoFijo;
    }

    public void setMonto (int monto) {
        this.montoFijo = monto;
    }
}

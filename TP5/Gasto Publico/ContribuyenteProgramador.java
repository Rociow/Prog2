public class ContribuyenteProgramador extends ContribuyenteSimple{
    double impuestoFijo;
    double impuestoDesarrollador;

    public ContribuyenteProgramador(String nombre, int id, int monto) {
        super(nombre, id, monto);
        this.impuestoFijo = (20/monto*100);
        this.impuestoDesarrollador = (2/impuestoFijo*100);
        
    }
    
}

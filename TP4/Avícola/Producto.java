import java.time.LocalDate;

public class Producto {
    String nombre;
    LocalDate fechaVencimiento;
    int numeroLote;
    LocalDate fechaEnvasado;
    String granjaOrigen;

    int codigoOrganismo;
    int tempMantenimiento;

    public Producto (String nombre, LocalDate fecha, int lote, LocalDate envasado, String granja){
        setNombre (nombre);
        setFechaVencimiento (fecha);
        setLote (lote);
        setFechaEnvasado(envasado);
        setGranjaOrigen(granja);
    }

    public Producto (String nombre, LocalDate fecha, int lote, LocalDate envasado, String granja, int codigo, int temperatura){
        setNombre (nombre);
        setFechaVencimiento (fecha);
        setLote (lote);
        setFechaEnvasado(envasado);
        setGranjaOrigen(granja);
        setCodigo(codigo);
        setTemperatura(temperatura);
    }

    private void setCodigo(int codigo) {
        this.codigoOrganismo = codigo;
    }

    public int getCodigo(){
        return codigoOrganismo;
    }

    private void setTemperatura(int temperatura) {
        this.tempMantenimiento = temperatura;
    }

    public int getTemperatura () {
        return tempMantenimiento;
    }

    private void setNombre(String nombre2) {
        this.nombre = nombre2;
    }

    public String getNombre () {
        return nombre;
    }

    private void setLote(int lote) {
        this.numeroLote = lote;
    }

    public LocalDate getFecha (){
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fecha) {
        this.fechaVencimiento = fecha;
    }

    public int getNumeroLote () {
        return numeroLote;
    }

    public void setGranjaOrigen(String granja) {
        this.granjaOrigen = granja;
    }

    public void setFechaEnvasado(LocalDate envasado) {
        this.fechaEnvasado = envasado;
    }
    
    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String toString () {
        return "Producto fresco - " + getNombre() +" Fecha de vencimiento: " + getFecha() +
                ", Número de Lote: " + getNumeroLote() +
                ", Fecha de envasado: " + getFechaEnvasado() +
                ", Granja de Origen: " + getGranjaOrigen();
    }
    
}
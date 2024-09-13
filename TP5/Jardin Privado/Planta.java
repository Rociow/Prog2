import java.time.LocalDate;

public abstract class Planta extends Entidad{
    String nombreCientifico; 
    String nombreComun;
    String paisOrigen;
    LocalDate fechaCompra;

    public Planta (String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra) {
            super();
            this.nombreCientifico = nombreCientifico;
            this.nombreComun = nombreComun;
            this.paisOrigen = paisOrigen;
            this.fechaCompra = fechaCompra;
        }
    
        public String getNombreCientifico() {
            return nombreCientifico;
        }
    
        public String getNombreComun() {
            return nombreComun;
        }
    
        public String getPaisOrigen() {
            return paisOrigen;
        }
    
        public LocalDate getFechaCompra() {
            return fechaCompra;
        }

        public String toString() {
            return "Planta{id= "+getId()+ " , nombreCientifico= " + nombreCientifico + ", nombreComun= " + nombreComun + ", paisOrigen=" + paisOrigen + ", fechaCompra= " + fechaCompra;
    }


}
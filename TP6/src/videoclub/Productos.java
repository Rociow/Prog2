package videoclub;

import java.time.LocalDate;

public abstract class Productos {
     private LocalDate fechaAlquiler;
     public void setFechaAlquiler(LocalDate fecha){
         this.fechaAlquiler = fecha;
     }

     public LocalDate getFechaAlquiler(){
        return  this.fechaAlquiler;
     }

     public abstract boolean sePuedeAlquilar();
}

import java.time.LocalDate;

public class Contingente {
    String nombre, apellido, estado;
    int pasaporte;
    LocalDate fechaNacimiento;
    
    public Contingente (String nombre, String apellido, String estado, int pasaporte, LocalDate fecha) {
        setNombre (nombre);
        setApellido (apellido);
        setEstado (estado);
        setPasaporte (pasaporte);
        setFecha (fecha);
    }

    private void setEstado(String estado2) {
        this.estado = estado2;
    }

    public String getEstado (){
        return estado;
    }

    public boolean disponibleSolidario () {
        if (estado == "En pais de origen"){
            return true;
        }

        else {
            return false;
        }
    }

    private void setFecha(LocalDate fecha) {
        this.fechaNacimiento = fecha;
    }

    private void setPasaporte(int pasaporte2) {
        this.pasaporte = pasaporte2;
    }

    private void setApellido(String apellido2) {
        this.apellido=apellido2;
    }

    private void setNombre(String nombre2) {
        this.nombre = nombre2;
    }
}
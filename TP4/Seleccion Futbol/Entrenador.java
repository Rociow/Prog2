import java.time.LocalDate;

public class Entrenador extends Contingente{
    int identificador; 

    public Entrenador (String nombre, String apellido,  String estado, int pasaporte, LocalDate fecha, int id){
        super(nombre, apellido, estado, pasaporte, fecha);
        setIdentificador (id);
    }

    private void setIdentificador(int id) {
        this.identificador = id;
    }
}

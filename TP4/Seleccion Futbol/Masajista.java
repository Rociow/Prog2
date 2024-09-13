import java.time.LocalDate;

public class Masajista extends Contingente{
    String titulo;
    int añosExperiencia;

    public Masajista (String nombre, String apellido,  String estado, int pasaporte, LocalDate fecha, String titulo, int años){
        super(nombre, apellido, estado, pasaporte, fecha);
        setTitulo (titulo);
        setAños (años);
    }

    private void setAños(int años) {
        this.añosExperiencia = años;
    }

    private void setTitulo(String titulo2) {
        this.titulo = titulo2;
    }

}

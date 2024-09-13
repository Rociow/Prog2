import java.time.LocalDate;

public class Futbolista extends Contingente{
    String posicion;
    String pie;
    int goles;

    public Futbolista (String nombre, String apellido, String estado, int pasaporte, LocalDate fecha, String pie, int num){
        super (nombre,apellido, estado, pasaporte,fecha);
        setPie (pie);
        setGoles (num);
    }

    private void setGoles(int num) {
        this.goles = num;
    }

    private void setPie(String pie2) {
        this.pie = pie2;
    }
}

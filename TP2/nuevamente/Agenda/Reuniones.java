import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reuniones {
    private String lugar;
    private String tema;
    private int duracion;
    LocalDate diaReunion;
    LocalTime horaReunion;
    ArrayList <Personas> participantes;

    public Reuniones (String lugar, String tema, int duracion, LocalDate fecha, LocalTime hora) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.diaReunion = fecha;
        this.horaReunion = hora;
        participantes = new ArrayList<>();

    }

    public void setLugar (String lugar) {
        this.lugar = lugar;
    }

    public String getLugar () {
        return lugar;
    }

    public void setTema (String tema) {
        this.tema = tema;
    }

    public String getTema () {
        return tema;
    }

    public void setDuracion (int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion () {
        return duracion;
    }

    public void setDia (LocalDate fecha) {
        this.diaReunion = fecha;
    }

    public LocalDate getDia () {
        return diaReunion;
    }

    public void setHora (LocalTime hora) {
        this.horaReunion = hora;
    }

    public LocalTime getHora () {
        return horaReunion;
    }
}

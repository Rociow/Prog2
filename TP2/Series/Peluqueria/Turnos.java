import java.time.LocalDate;
import java.time.LocalTime;

public class Turnos {
    Personas cliente;
    Personas peluquero;
    LocalDate fecha;
    LocalTime horario;

    public Turnos (Personas cliente, Personas peluquero, int anio, int mes, int dia, int hora, int minutos){
        setCliente(cliente);
        setPeluquero(peluquero);
        this.fecha = LocalDate.of(anio, mes, dia);
        this.horario = LocalTime.of(hora, minutos);
    }

    public void setCliente(Personas cliente2) {
        this.cliente = cliente2;
    }

    public void setPeluquero(Personas peluquero2) {
        this.peluquero = peluquero2;
    }

    public LocalDate getDia (){
        return fecha;
    }

    public LocalTime getHorario (){
        return horario;
    }


}

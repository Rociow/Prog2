import java.time.LocalDate;


public class Turnos {
    Canchas cancha;
    Clientes usuario;
    LocalDate fecha;

    public Turnos (Canchas newCancha, Clientes nombreUsuario, int dia, int mes, int año) {
        this.cancha = newCancha;
        this.usuario = nombreUsuario;
        this.fecha = LocalDate.of(dia, mes, año);
    }

}

public class Clientes {
    String nombre; 
    int [] reservasRealizadas;

    public Clientes (String newNombre, int [] reserva) {
        this.nombre = newNombre;
        this.reservasRealizadas = reserva;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void agregarReserva (int nuevaReserva){
        int [] reservaAux = new int[reservasRealizadas.length+1];

        for (int i = 0; i < reservasRealizadas.length; i++){
            reservaAux[i]=reservasRealizadas[i];
        }

        reservaAux[reservaAux.length-1]=nuevaReserva;
        reservasRealizadas=reservaAux;
    }

    public boolean esSocio (){
        if (reservasRealizadas.length >= 4){
            return true;
        } else {
            return false;
        }
    }
}

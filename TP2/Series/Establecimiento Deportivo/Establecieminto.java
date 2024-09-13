import java.time.LocalDate;

public class Establecieminto {
    Canchas cancha;
    Clientes [] cliente;
    Turnos turno;
    
    public Establecieminto(){
        for (int i = 0; i < 2; i++){
        Canchas Futbol = new Canchas("Futbol");
    }

    for (int y=0; y <=4; y++){
        Canchas Paddle = new Canchas("Paddle");
    }
    }

    public void registrarUsuario(Clientes nuevoUsuario){
        Clientes [] clienteAux = new Clientes[cliente.length+1];

        for(int i = 0; i<cliente.length; i++){
            clienteAux[i]=cliente[i];
        }

        clienteAux[clienteAux.length-1]=nuevoUsuario;
        cliente=clienteAux;
    }

    public void reservarCancha (Clientes nombreUsuario, Canchas tipoCancha, int dia, int mes, int anio) {
        int i = 0;
            while (nombreUsuario.getNombre() != cliente[i].getNombre()){
                i++;
            }

            if (i > cliente.length){
                System.out.println("usuario no registrado");
            } else {
                //return nombreUsuario == cliente[i].getNombre();
                /* decir cancha, fecha y chequear si usuario es */

                Turnos nuevoTurno = new Turnos(tipoCancha, nombreUsuario, dia, mes, anio);
                if (nombreUsuario.esSocio()){
                    double descuento = 0;
                    descuento = tipoCancha.obtenerCosto(tipoCancha.getTipo()) - tipoCancha.obtenerCosto(tipoCancha.getTipo())*(0.1);

                    nombreUsuario.agregarReserva(1);
                }

                else {
                    nombreUsuario.agregarReserva(1);
                }
            }

        }
    }



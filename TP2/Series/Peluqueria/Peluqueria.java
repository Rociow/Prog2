public class Peluqueria {
    Personas [] peluqueros;
    Personas [] clientes;
    Turnos [] turnos;

    public Peluqueria () {
        peluqueros = new Personas[4];
        for (int i = 0; i < 4; i++){
            peluqueros[i] = new Personas("Peluquero"+i, "peluquero"+i);
            System.out.println(peluqueros[i].getNombre());
        }

        turnos = new Turnos[0];
   
    }

    /*public void chequearTurnoDisponible (Turnos turno) {

        int i = 0;

        //while ( dia =! )
        //chequear en el arreglo de turnos si ese dia a esa hora el peluquero correspondiente no esta ocupado, y si no es asi agregarTurno();
    }*/

    public void agregarTurno (Turnos turno) {
        Turnos [] turnosAux = new Turnos[turnos.length+1];

        for ( int i = 0; i < turnos.length; i++){
            turnosAux[i]=turnos[i];
        }

        turnosAux[turnosAux.length-1]=turno;
        turnos = turnosAux;

    }

    public static void main(String[] args) {
        Peluqueria pelus = new Peluqueria();



        Turnos turno1 = new Turnos(new Personas("Pepito", "Cliente"), new Personas("Peluquero1", "Peluquero"), 2024, 9, 1, 10, 00);
        pelus.agregarTurno(turno1);

        System.out.println("El peluquero " + pelus.peluqueros[1].getNombre() + " tiene un turno el dia " + turno1.getDia());

        }
        
    }

public class Agenda {
    Reuniones [] reuniones;
    //REUNIONES -> lugar, arreglo Personas, temas, duracion
    //PERSONAS - > numero e email.


public Agenda () {
    reuniones = new Reuniones[0];
}

public void agregarReunion (Reuniones nuevaReu) {
    Reuniones [] reunionAux = new Reuniones[reuniones.length+1];

    for (int i = 0; i < reuniones.length; i++){
        reunionAux[i]=reuniones[i];
    }

    reunionAux[reunionAux.length-1]=nuevaReu;
    reuniones = reunionAux;
}

public static void main(String[] args) {
    
    Agenda dentist = new Agenda();
    Reuniones reunion1 = new Reuniones();
    Persona empleado1 = new Persona(333, "pepito@gmail.com");
    reunion1.agregarPersona(empleado1);
    reunion1.setLugar("Campus");
    reunion1.setTema("Seminario");


    dentist.agregarReunion(reunion1);

}

}


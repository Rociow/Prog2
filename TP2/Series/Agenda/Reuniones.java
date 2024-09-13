import java.time.LocalTime;

public class Reuniones {
    String lugar, tema;
    //arreglo Personas;
    LocalTime horario;
    Persona [] personas;

    public Reuniones () {
        personas = new Persona[0];
    }

    public void agregarPersona (Persona person) {
        Persona [] personasAux = new Persona[personas.length+1];

        for (int i = 0; i < personas.length; i++) {
            personasAux[i]=personas[i];
        }

        personasAux[personasAux.length-1]=person;
        personas = personasAux;
    }

    public void setLugar (String newLugar) {
        this.lugar = newLugar;
    }

    public String getLugar () {
        return lugar;
    }

    public void setTema (String newTema) {
        this.tema = newTema;
    }

    public String getTema () {
        return tema;
    }

    public void setHorario (LocalTime newHorario) {
        this.horario = newHorario;
    }

    //public Localtime getHorario () {
     //   return horario;
    //}
    
}


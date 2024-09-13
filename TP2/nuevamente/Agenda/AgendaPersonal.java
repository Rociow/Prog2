import java.util.ArrayList;

public class AgendaPersonal{
    ArrayList <Reuniones> reuniones;

    public AgendaPersonal () {
        reuniones = new ArrayList<>();
    }

    public boolean agregarReunion (Reuniones reunion) {
        for (int i = 0; i < reuniones.size(); i++){
        if ((reuniones.get(i).getDia()).equals(reunion.getDia())) {
            if ((reuniones.get(i).getHora()).equals(reunion.getHora())){
                return false;
            } else {
                reuniones.add(reunion);
                return true;
            }
        } else {
            reuniones.add(reunion);
            return true;
        }
    } return false;
}
}
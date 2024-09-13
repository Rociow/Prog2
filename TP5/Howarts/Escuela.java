import java.util.ArrayList;

public class Escuela {
    ArrayList <Casa> casas;

    public Escuela () {
        casas = new ArrayList<>();
    }

    public void agregarCasa(Casa casa) {
        casas.add(casa);
    }

    public boolean asignarAlumno (Alumnos alumno) { //primero verificar que existe la casa a la que se quiere asignar 
        Casa casa = encontrarCasa(casaAsignada);

        if (casa == null){
            System.out.println("Casa no encontrada");
            return false;
        }

        //ahora hay que verificar si puede ser aceptado por otra casa
        //y si tiene familiares
        
        
    }

    public Casa encontrarCasa(Casa casa){
        for ( int i = 0; 0 < casas.size(); i++){
            if (casas.get(i).getNombre().equals(casa.getNombre())){
                return casa;
            }
    }

    return null;
}
}

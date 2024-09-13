import java.util.ArrayList;

public class Empresa {
    ArrayList <Empleados> empleados;

    public Empresa () {
        empleados = new ArrayList<>();
    }

    public double totalSueldos () {
        double contadorSueldos = 0;

        for ( int i = 0; i < empleados.size(); i++){
            contadorSueldos += empleados.get(i).getSueldo();
        }

        return contadorSueldos;
    }
}
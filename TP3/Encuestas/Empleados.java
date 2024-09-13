
public class Empleados {
    String nombreEmpleado;
    int cantEncuestasRealizadas;

    public Empleados(String nombreEmpleado, int cantEncuestasRealizadas){
        setNombre(nombreEmpleado);
        setCantidadEncuestas(cantEncuestasRealizadas);
    }

    public void setNombre(String nombreEmpleado2) {
        this.nombreEmpleado=nombreEmpleado2;
    }

    public String getNombre () {
        return nombreEmpleado;
    }

    public void setCantidadEncuestas(int cantEncuestasRealizadas2) {
        this.cantEncuestasRealizadas=cantEncuestasRealizadas2;
    }

    public int getCantidad(){
        return cantEncuestasRealizadas;
    }
}

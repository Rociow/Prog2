
public class Encuesta {
    String nombreEncuesta;
    int documento;
    Empleados empleado;

    public Encuesta(String nombreEncuesta, int documento){
        setNombre (nombreEncuesta);
        setDocumento (documento);
    }

    public void setDocumento(int documento2) {
        this.documento = documento2;
    }

    public int getDocumento(){
        return documento;
    }

    public void setNombre(String nombreEncuesta2) {
        this.nombreEncuesta=nombreEncuesta2;
    }

}


public class Personas {
    String nombre, apellido;
    int edad;

    public Personas(String nombre2, String apellido2, int edad2) {
        setNombre(nombre2);
        setApellido(apellido2);
        setEdad(edad2);
    }

    private void setNombre(String nombre2) {
        this.nombre = nombre2;
    }

    private void setEdad(int edad2) {
        this.edad = edad2;
    }

    private void setApellido(String apellido2) {
        this.apellido = apellido2;
    }

    
}

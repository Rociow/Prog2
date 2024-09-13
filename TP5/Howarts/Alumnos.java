import java.util.ArrayList;

public class Alumnos {
    String nombre;
    ArrayList<String> cualidades;
    ArrayList<String> familiares; //Alumnos


    public Alumnos(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }
    public ArrayList<String> getFamiliares() {
        return familiares;
    }
    
    public boolean tieneCualidad(String cualidad) {
        return cualidades.contains(cualidad);
    }

    public boolean tieneFamiliar(String familiar) {
        return familiares.contains(familiar);
    }
}

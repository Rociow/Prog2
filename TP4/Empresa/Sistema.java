import java.util.ArrayList;

public class Sistema {
    ArrayList <Personas> personas;

    public Sistema () {
        personas = new ArrayList<>();
    }

    public void agregarPersona (Personas persona){
        personas.add(persona);
    }

    public void imprimirDatos (ArrayList <Personas> personas){
        for (int i = 0; i < personas.size(); i++){
        System.out.println(personas.obtenerDescripcion() + "");

        }
    }

    public static void main(String[] args) {
        Sistema empresa = new Sistema();

        empresa.agregarPersona(new Jerarquico("juan", "pepito", 45, 435345, 120));
        empresa.agregarPersona(new Empleado("ana", "maria", 20, 23423, 10));
        empresa.agregarPersona(new Usuario("alo", "nose", 12, "sldkfjsdlk", "lksdjfslk"));



    }

}
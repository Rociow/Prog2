public class Contribuyente {
    String nombre;
    int idTributaria;

    public Contribuyente (String nombre, int id){
        this.nombre = nombre;
        this.idTributaria = id;
    }

    public String getNombre () {
        return nombre;
    }

    public int getID() {
        return idTributaria;
    }
}

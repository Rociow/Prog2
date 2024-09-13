

public abstract class Entidad {
    
    int id;

    public static int nextId= 1;

    public Entidad() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }
}
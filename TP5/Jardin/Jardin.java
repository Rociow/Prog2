import java.util.ArrayList;

public class Jardin {
    ArrayList <Planta> plantas;

    public Jardin () {
        plantas = new ArrayList<>();
    }

    public void agregarPlanta (Planta tt) {
        plantas.add(tt);
    }
}

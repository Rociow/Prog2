import java.util.ArrayList;

public class Cereales {
    String nombreCereal;
    ArrayList <String> minerales;
    protected String tipo;


    public Cereales (String nombreCereal){
        this.nombreCereal = nombreCereal;
        minerales = new ArrayList<>();

  
    }


    public void agregarMineral (String mineral) {
        minerales.add(mineral);
    }


    public String getNombreCereal () {
        return nombreCereal;
    }

    public ArrayList<String> getMinerales () {
        return minerales;
    }

    public String getTipo () {
        return tipo;
    }
}
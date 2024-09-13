import java.util.ArrayList;

public class Granja {
    ArrayList <Cereales> cereales;
    ArrayList <Lote> lotes;

    public Granja () {
        cereales = new ArrayList<>();
        lotes = new ArrayList<>();
    }

    public void agregarCereal (Cereales cereal) {
        cereales.add(cereal);
    }

    public void agregarLote (Lote lote){
        lotes.add(lote);
    }

    public boolean puedeSembrar (Cereales cereal, Lote lote) {
 

        String tipo = cereal.getTipo();

        switch (tipo) {
            case "pastura": 
                return (lote.getMineralesLote().containsAll(cereal.getMinerales())) && (lote.superficie >= 50);

            default: return lote.getMineralesLote().containsAll(cereal.getMinerales());

        }

    }
}

import java.util.ArrayList;

public class Lote {
    ArrayList <String> mineralesLote; 
    int superficie;

    public Lote ( int sup){
        mineralesLote = new ArrayList<>();
        this.superficie = sup;
    }

    public ArrayList<String> getMineralesLote () {
        return mineralesLote;
    }

    public int getSuperficie () {
        return superficie;
    }

    public void agregarMineral (String mineral) {
        mineralesLote.add(mineral);
    }
}

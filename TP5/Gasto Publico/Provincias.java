import java.util.ArrayList;

public class Provincias {

        ArrayList<Ciudades> ciudades;
        String nombre; 
        

    public Provincias(int i) {
        ciudades = new ArrayList<>(i);
    }

    public void agregarCiudad (Ciudades newCiudad){
        if(newCiudad.getCant() >= newCiudad.cantidadMinima)
        ciudades.add(newCiudad);
    }

    public int contarciudadesDeficit () {
        int contador = 0; 

        for ( int i = 0; i < ciudades.size(); i++){
            if (ciudades.get(i).estaenDeficit()){
                contador++;
            }
        }

        return contador;
    }

    public boolean mitadenDeficit(){
        if (contarciudadesDeficit() < ciudades.size()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Provincias BSAS = new Provincias(23);
        Ciudades BUE = new Ciudades("BSAS", 30000, 0);
        BSAS.agregarCiudad(BUE);
        System.out.println(BUE.getCant());
    }
}

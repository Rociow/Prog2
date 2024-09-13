
public class Provincias {

        Ciudades [] ciudades;
        String nombre; 
        

    public Provincias(int i) {
        ciudades = new Ciudades [i];
    }

    public void agregarCiudad (Ciudades newCiudad){
        Ciudades [] ciudadesAux = new Ciudades[ciudades.length+1];

        if(newCiudad.getCant() >= newCiudad.cantidadMinima)

        for (int i = 0; i < ciudades.length; i++){
            ciudadesAux[i]=ciudades[i];
        }

        ciudadesAux[ciudadesAux.length-1] = newCiudad;
        ciudades = ciudadesAux;
    }

    public int contarciudadesDeficit () {
        int contador = 0; 

        for ( int i = 0; i < ciudades.length; i++){
            if (ciudades[i].estaenDeficit()){
                contador++;
            }
        }

        return contador;
    }

    public boolean mitadenDeficit(){
        if (contarciudadesDeficit() < ciudades.length){
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

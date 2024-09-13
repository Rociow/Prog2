

public class Sistema {
    Provincias [] provincias;
    final static int cantProvincias = 23;


public Sistema() {
    provincias = new Provincias [23];
}

public void agregarProvincia (Provincias newProvincia) {
    Provincias [] provinciasAux = new Provincias[provincias.length+1];

    if (provincias.length < cantProvincias){
        for (int i = 0; i < provincias.length; i++){
            provinciasAux[i]=provincias[i];
        }

        provinciasAux[provinciasAux.length-1] = newProvincia;
        provincias = provinciasAux;
    }

}


}

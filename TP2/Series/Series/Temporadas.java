
public class Temporadas {
Episodios [] episodios;


public Temporadas() {
     episodios = new Episodios[0]; //nuevo arreglo de episodios por cada temporada creadas
}

public void agregarEpisodio(Episodios episodioNuevo){
    Episodios [] nuevoArrayEpisodios = new Episodios[episodios.length+1];
    for (int i = 0; i < episodios.length; i++){
        nuevoArrayEpisodios[i]=episodios[i];
    }

    nuevoArrayEpisodios[nuevoArrayEpisodios.length-1]=episodioNuevo;
    episodios=nuevoArrayEpisodios;
}

public int totalEpisodios(){
    return episodios.length;
}

public int totalEpisodiosVISTOS(){
    int sumatoria = 0;
    for (int i = 0; i < episodios.length; i++){
        if (episodios[i].seVio()){
            sumatoria+=1;
        }
    }

    return sumatoria;
}

public int promedioCalificaciones (){
    int sumatoria = 0;
    for (int i = 0; i < episodios.length; i++){
        sumatoria+=episodios[i].getCalificacion();
    }

    return sumatoria/totalEpisodiosVISTOS();
}

public static void main(String[] args) {
    Temporadas temp1 = new Temporadas();
    temp1.agregarEpisodio(new Episodios("EP1", "ALO", true, 5));
    temp1.agregarEpisodio(new Episodios("EP1", "ALO", true, 1));
    temp1.agregarEpisodio(new Episodios("EP1", "ALO", true, 5));
    System.out.println(temp1.totalEpisodios());
    System.out.println(temp1.totalEpisodiosVISTOS());

    System.out.println(temp1.promedioCalificaciones());
}



}
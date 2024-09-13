import java.util.ArrayList;

public class Temporadas {
    ArrayList <Episodios> episodios;

    public Temporadas () {
        episodios = new ArrayList<>();
    }

    public int totalEpisodios () {
        return episodios.size();
    }

    public int totalEpisodiosVistos () {
        int contadorEpisodios = 0;

        for ( int i = 0; i < episodios.size(); i++){
            if (episodios.get(i).getSeVio() == true) {
                contadorEpisodios++;
            }
        }

        return contadorEpisodios;
    }

    public int calificacionPromedio () {
        int calificacionPromedio = 0;
        

        for (int i = 0; i < episodios.size(); i++){
            boolean seVio = episodios.get(i).getSeVio();
            double calificacion = episodios.get(i).getCalificacion();

                if ( seVio == true && calificacion > 0 && calificacion < 5) {
                calificacionPromedio += calificacion;
            }
        }

        return calificacionPromedio/totalEpisodiosVistos();
    }
}

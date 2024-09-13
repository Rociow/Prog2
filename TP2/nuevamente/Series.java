import java.util.ArrayList;

public class Series {
    ArrayList <Temporadas> temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    public Series () {
        temporadas = new ArrayList<>();
    }

    public int totalTemporadas () {
        return temporadas.size();
    }

    public boolean seVioTodo () {
        int temporadaVista = 0;
        for (int i = 0; i < temporadas.size(); i++){
            if (temporadas.get(i).totalEpisodios() == temporadas.get(i).totalEpisodiosVistos()){
                temporadaVista++;
            } 
        }

        if (temporadaVista == totalTemporadas()){
            return true;
        } else {
            return false;
        }
    }

    public int calificacionPromedio () {
        int calificacionPromedio = 0;

        for (int i = 0; i < temporadas.size(); i++){
                calificacionPromedio += temporadas.get(i).calificacionPromedio();
            }
        

        return calificacionPromedio/totalTemporadas();
    }
}
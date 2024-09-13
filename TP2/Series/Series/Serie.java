public class Serie {
    String titulo, descripcion, creador, genero;
    Temporadas [] temporadas;

    public Serie (String newTitulo,String newDescripcion,String newCreador,String newGenero){
        titulo = newTitulo;
        descripcion = newDescripcion;
        creador = newCreador;
        genero = newGenero;
        temporadas = new Temporadas[0];
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String newTitulo){
        titulo = newTitulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String newDescripcion){
        descripcion = newDescripcion;
    }
    public String getCreador(){
        return creador;
    }

    public void setCreador(String newCreador){
        creador = newCreador;
    }
    public String getGenero(){
        return genero;
    }

    public void setGenero(String newGenero){
        genero = newGenero;
    }

    public void agregarTemporada(Temporadas temporada){
        Temporadas [] nuevoArrayTemporadas = new Temporadas [temporadas.length+1];
        for (int i = 0; i < temporadas.length; i++){
            nuevoArrayTemporadas[i]=temporadas[i];}

        nuevoArrayTemporadas[nuevoArrayTemporadas.length-1]=temporada;
        this.temporadas = nuevoArrayTemporadas;
    }

    public int totalEpisodiosTemporada (){ //de una temporada en particular TODOS LOS CAPITULOS VISTOS O NO
        int vistos = 0;
        for (int i = 0; i<temporadas.length; i++){
            vistos += temporadas[i].totalEpisodios();
        }

        return vistos;
    }

    public int totalEpisodiosSERIE(){
        int sumatoria = 0;
        int eptemp = 0;
        for (int i = 0; i < temporadas.length; i++){
            eptemp = temporadas[i].totalEpisodiosVISTOS();
            sumatoria+=eptemp;
            }

        return sumatoria;
    }

    public int promedioCalificacionesSERIE (){
        int sumatoria = 0;
        for (int i = 0; i < temporadas.length; i++){
            sumatoria+=temporadas[i].promedioCalificaciones();
        }
    
        return sumatoria/temporadas.length;
    }

    public boolean seVioTODO () {
        boolean seVio = true;
        int i = 0;

        while (seVio && i < temporadas.length){
            if (temporadas[i].totalEpisodios() == temporadas[i].totalEpisodiosVISTOS()){
                seVio = true;
                i++;
            } else {
                seVio = false;
            }
        }

        return seVio;
    }
    
    

    public static void main(String[] args) {
        Serie TWD = new Serie("The Walking Dead", "Serie de zombies", "Nidea", "Survival");
        Temporadas temp1 = new Temporadas();
        Temporadas temp2 = new Temporadas();
        temp1.agregarEpisodio(new Episodios("CAP1", "Presentacion", true, -3));
        temp1.agregarEpisodio(new Episodios("CAP1", "Presentacion", true, -3));
        temp1.agregarEpisodio(new Episodios("CAP1", "Presentacion", true, -3));
        temp1.agregarEpisodio(new Episodios("CAP1", "Presentacion", true, -3));
        temp2.agregarEpisodio(new Episodios("CAP1", "Presentacion", true, -3));
        temp2.agregarEpisodio(new Episodios("CAP1", "Presentacion", true, -3));

        
        
        TWD.agregarTemporada(temp1);
        TWD.agregarTemporada(temp2);

        System.out.println(TWD);
        System.out.println(TWD.totalEpisodiosTemporada());
        System.out.println(TWD.totalEpisodiosSERIE());
        System.out.println(TWD.seVioTODO());

    }
  

}
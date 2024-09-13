/* 
Ejercicio 1 Práctico 2  John David Molina Velarde
1 Series
    Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una
    cantidad de episodios. Cada episodio posee un título, una descripción, un flag indicando
    si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un
    episodio particular, la calificación dada será un valor negativo.
    
    Las series poseen como atributos (además de los episodios correspondientes) un título,
    una descripción, un creador y un género.
    
    Implementar en Java las clases involucradas, determinar qué clase es responsable de
    responder los siguientes servicios e implementar en Java.
        ● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
        no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
        ● Obtener el total episodios vistos de una temporada particular.
        ● Obtener el total de episodios vistos de una serie.
        ● Obtener el promedio de las calificaciones dadas para una temporada particular.
        ● Obtener el promedio de las calificaciones dadas para una serie.
        ● Determinar si se vio todos los episodios de la serie.
    
    Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos 
*/


public class Serie {
    private String titulo, descripcion, creador, genero;
    private Temporada[] temporadas;
    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        temporadas = new Temporada[0]; //arreglo vacío de temporadas
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getCreador() {
        return creador;
    }


    public void setCreador(String creador) {
        this.creador = creador;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void agregarTemporada(Temporada temporada){
        Temporada[] nuevoArrayTemporadas = new Temporada[temporadas.length+1];   // creo un nuevo array de temporadas con lugar para una temporada más
        for (int i=0; i<temporadas.length; i++)        //copio los elementos del viejo arreglo al nuevo con más lugar
            nuevoArrayTemporadas[i] = temporadas[i];
        nuevoArrayTemporadas[nuevoArrayTemporadas.length-1] = temporada; // agrego al final la nueva temporada
        this.temporadas = nuevoArrayTemporadas;         // hago que temporadas sea nuevoArrayTemporadas.
    }
    

    public int totalEpisodios(){
        int cant = 0;
        for (int i=0; i<temporadas.length; i++)
            cant += temporadas[i].totalEpisodios();
        return cant;
    }


    public int totalEpisodiosVistos(){
        int cant = 0;
        for (int i=0; i<temporadas.length; i++)
            cant += temporadas[i].totalEpisodiosVistos();
        return cant;
        
    }


    public int sumaDeCalificaciones(){
        int sumaCalificaciones = 0;
        for (int i = 0; i < temporadas.length; i++)
            sumaCalificaciones += temporadas[i].sumaDeCalificaciones();
        return sumaCalificaciones;
    }


    public double promedioCalificaciones(){
        int vistos = this.totalEpisodiosVistos();
        if (vistos == 0) {
            System.out.println("No hay episodios vistos para calcular el promedio de calificaciones");
            return 0;
        } else
            return (double) this.sumaDeCalificaciones() / vistos;
    }


    public boolean vistosTodosLosEpisodios(){
        return this.totalEpisodiosVistos() == this.totalEpisodios();
    }


    @Override
    public String toString() {
        String devolver = "Serie " + titulo + " [" + descripcion + "] (Creador: " + creador + ", genero="
                + genero + ")\n";
        for (int i=0; i<temporadas.length; i++)
            devolver += temporadas[i] + "=====================================================\n";
        return devolver;
    }


    public static void main(String[] args){
        Serie serie = new Serie("Las mejores películas", "Perlas de la cinematografía", "Steven Spielberg", "Acción");

        Temporada temporada = new Temporada();
        temporada.agregarEpisodio(new Episodio("Lo que el viento se llevó", "De guerra y amor", true, 4));
        temporada.agregarEpisodio(new Episodio("Batman forever", "Otra de Batman", true, 3));
        serie.agregarTemporada(temporada);

        temporada = new Temporada();
        temporada.agregarEpisodio(new Episodio("Superman", "El hombre de acero", true, 2));
        temporada.agregarEpisodio(new Episodio("Garganta Profunda", "Historia de una mujer con anginas", true, 5));
        temporada.agregarEpisodio(new Episodio("El Padrino", "De mafia", true, 5));
        serie.agregarTemporada(temporada);

        System.out.println(serie);
        System.out.println(serie.totalEpisodiosVistos());
        System.out.println(serie.promedioCalificaciones());
        System.out.println(serie.vistosTodosLosEpisodios());
    }
}

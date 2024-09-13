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

public class Temporada {
    private Episodio[] episodios;
    
    public Temporada() {
        episodios = new Episodio[0]; // arreglo vacío
    }

    public void agregarEpisodio(Episodio episodio){
        Episodio[] nuevoArrayEpisodios = new Episodio[episodios.length+1];   // creo un nuevo array de episodios con lugar para un episodio más
        for (int i=0; i<episodios.length; i++)        //copio los elementos del viejo arreglo de episodios al nuevo con más lugar
            nuevoArrayEpisodios[i] = episodios[i];
        nuevoArrayEpisodios[nuevoArrayEpisodios.length-1] = episodio; // agrego al final el nuevo episodio
        this.episodios = nuevoArrayEpisodios;         // hago que episodios sea nuevo ArrayEpisodios.
    }

    @Override
    public String toString() {
        String respuesta = "Episodios de la temporada: \n";
        for (int i=0; i<episodios.length; i++) 
            respuesta += "   " + episodios[i].toString() + "\n";
        return respuesta;
    }


    public int totalEpisodios(){
        return episodios.length;
    }


    public int totalEpisodiosVistos(){
        int vistos = 0;
        for (int i = 0; i < episodios.length; i++)
            if (episodios[i].isYaVisto())
                vistos++;
        return vistos;
    }


    public int sumaDeCalificaciones(){
        int sumaCalificaciones = 0;
        for (int i = 0; i < episodios.length; i++)
            if (episodios[i].isYaVisto()) {
                sumaCalificaciones += episodios[i].getCalificacion();
            }
        return sumaCalificaciones;
    }


    public double promedioCalificaciones(){
        int vistos = totalEpisodiosVistos();
        if (vistos == 0) {
            System.out.println("No hay episodios vistos para calcular el promedio de calificaciones");
            return 0;
        } else
            return (double) sumaDeCalificaciones() / vistos;
    }
    
    public static void main(String[] args){ //para probar la clase
        Temporada temporada = new Temporada();
        Episodio episodio = new Episodio("Lo que el viento se llevó", "De guerra y amor", true, 4);
        temporada.agregarEpisodio(episodio);
        episodio = new Episodio("Batman forever", "Otra de Batman");
        temporada.agregarEpisodio(episodio);
        System.out.println(temporada);
        System.out.println(temporada.totalEpisodiosVistos());
        System.out.println(temporada.promedioCalificaciones());
        episodio.Calificar(true, 3);
        System.out.println(temporada.promedioCalificaciones());
    }
}

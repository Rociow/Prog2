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


public class Episodio {
    private String titulo, descripcion;
    private boolean yaVisto;
    private int calificacion; // 1 a 5. Si no se vió es negativo.
    
    
    /******* CONSTRUCTORES  ********/
    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.yaVisto = false;
        this.calificacion = -1;
    }
    
    
    public Episodio(String titulo, String descripcion, boolean yaVisto, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.yaVisto = yaVisto;
        this.calificacion = calificacion;
    }
    
    
    /******* METODOS  ********/

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


    public boolean isYaVisto() {
        return yaVisto;
    }


    /* Define la película como ya vista o no y le da una calificación. Retorna true si pudo cambiar la calificación */
    public boolean Calificar(boolean yaVisto, int calificacion) {
        if (yaVisto && (calificacion <1 || calificacion > 5)){
            /* PREGUNTAR: dado que no es bueno mostrar mensajes por consola, cómo informamos de una situación anómala. */
            System.out.println("No se puede modificar calificación de película, calificación no válida.");
            return false;
        }
        else if (yaVisto && calificacion >=1 && calificacion <= 5) {
            this.yaVisto = yaVisto;
            this.calificacion = calificacion;
            return true;
        }
        else if (! yaVisto && calificacion<0){
            this.yaVisto = yaVisto;
            this.calificacion = calificacion;
            return true;
        }
        else { // ! yaVisto && calificacion>=0
            System.out.println("No se puede calificar con positivo un episodio no visto");
            return false;
        }
    } // setYaVisto


    public int getCalificacion() {
        return calificacion;
    }


    @Override
    public String toString() {
        return titulo + " [" + descripcion + "] (" + ((yaVisto)?"Visto, ":"No visto, " + "Calif: ") + calificacion + ")";
    }

    
}

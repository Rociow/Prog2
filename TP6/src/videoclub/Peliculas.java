package videoclub;

public class Peliculas extends Productos {
    private String nombre;
    private String director;
    private int year;
    private String genero;
    private int stock = 0;

    public Peliculas(String nombre, String director, int year, String genero) {
        this.nombre = nombre;
        this.director = director;
        this.year = year;
        this.genero = genero;
    }

    public void actualizarStock (int alqui) {
        this.stock+=alqui;
    }

    public boolean sePuedeAlquilar (Productos p) {
        return stock > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

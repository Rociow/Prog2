import java.util.ArrayList;


public class Casa {
    private String nombreCasa;
    private int capacidadMaxima;
    private ArrayList<String> cualidadesRequeridas;
    private ArrayList <Alumnos> alumnos;
    private ArrayList <Casa> enemigos;
    private boolean familiar;

    public Casa (String nombreCasa, int capacidadMaxima, boolean familiar) {
        this.nombreCasa = nombreCasa;
        this.capacidadMaxima = capacidadMaxima;
        this.cualidadesRequeridas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.enemigos = new ArrayList<>();
        this.familiar = familiar;
    }

    public String getNombre() {
        return nombreCasa;
    }

    public ArrayList<String> getCualidadesRequeridas() {
        return cualidadesRequeridas;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public ArrayList<String> getEnemigos() {
        return enemigos;
    }

    public void agregarEnemigo(String casaEnemiga) {
        if (!enemigos.contains(casaEnemiga)) {
            enemigos.add(casaEnemiga);
        }
    }

    public boolean puedeAceptarAlumno(Alumnos alumno) {
        if (alumnos.size() >= capacidadMaxima) {
            return false;
        }
        if (!alumno.getCualidades().containsAll(cualidadesRequeridas)) {
            return false;
        }
        return true;
    }

    public boolean aceptarAlumno(Alumnos alumno) {
        if (puedeAceptarAlumno(alumno)) {
            alumnos.add(alumno);
            return true;
        }
        return false;
    }
}
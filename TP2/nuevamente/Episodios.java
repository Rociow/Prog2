
public class Episodios {
    private String titulo;
    private String descripcion;
    private boolean seVio;
    private double calificacion;

    public Episodios () {
        this.titulo = "null";
        this.descripcion = "null";
        this.seVio = false;
        this.calificacion = -1;
    }

    public Episodios (String tit, String des, boolean vis, double cal){
        this.titulo = tit;
        this.descripcion = des;
        this.seVio = vis;
        this.calificacion = cal;
    }

    public boolean getSeVio () {
        return seVio;
    }

    public double getCalificacion () {
        return calificacion;
    }

    public boolean calificacionBienSeteada () {
        if (this.calificacion > 0 && this.calificacion < 5){
            return true;
        } else {
            return false;
        }
    }

    public void ingresarCalificacion (double cal) {
        if (calificacionBienSeteada()){
            calificacion = cal;
        } else {
            System.out.println("valor incorrecto");
        }
    }



}

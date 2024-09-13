
public class Empleados {
    private String nombre;
    private String apellido;
    private int dni;
    private double sueldoMensual;

    public Empleados (String nombre, String apellido, int dni, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoMensual = sueldo;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String n) {
        this.nombre = n;
    }

    public String getApellido () {
        return apellido;
    }

    public void setApellido (String n) {
        this.apellido = n;
    }

    public int getDni () {
        return dni;
    }

    public void setDni (int n) {
        this.dni = n;
    }

    public double getSueldo () {
        return sueldoMensual;
    }

    public void setSueldo (double n) {
        this.sueldoMensual = n;
    }
}

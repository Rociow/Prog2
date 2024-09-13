import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String sexo;
    private double peso;
    private double altura;
    private int edad;
    private int dni;
    private LocalDate fechaNacimiento;
    LocalDate hoy = LocalDate.now();

    public Persona (int dni){ // constructor con DNI
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.sexo = "femenino";
        this.peso = 1.0;
        this.altura = 1.0;
        this.edad = 0;
        this.fechaNacimiento = LocalDate.of (2000,1,1);
    }

    public Persona (int dni, String nombre, String apellido){ // constructor con DNI, nombre y apellido
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = apellido;
        this.peso = 1.0;
        this.altura = 1.0;
        this.edad = 0;
        this.fechaNacimiento = LocalDate.of (2000,1,1);
    }

    public Persona (int dni, String nombre, String apellido, LocalDate fecha){ // constructor con DNI, nombre, apellido y fecha
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = apellido;
        this.peso = 1.0;
        this.altura = 1.0;
        this.edad = 0;
        this.fechaNacimiento = fecha;
    }

    public double indiceMasaCorporal () {
        return peso / (altura * altura);
    }

    public boolean estaEnForma () {
        if (indiceMasaCorporal() < 25 && indiceMasaCorporal() > 18.5){
            return true;
        } else {
            return false;
        }
    }

    public boolean cumpleAños () {

        if ( fechaNacimiento.getMonth() == hoy.getMonth() && fechaNacimiento.getDayOfMonth() == hoy.getDayOfMonth()){
            return true;
        } else {
            return false;
        }
    }

    public boolean esMayor () {
        if (hoy.getYear() - fechaNacimiento.getYear() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString () {
        return getNombre() + " " + getApellido() + " etceteraaaa";
    }

}
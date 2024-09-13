public class Empleado extends Personas {
    int numLegajo;
    int sueldo;

    public Empleado (String nombre, String apellido, int edad, int numLegajo, int sueldo){
        super(nombre,apellido,edad);
        setNumLegajo(numLegajo);
        setSueldo(sueldo);
    }

    private void setSueldo(int sueldo2) {
        this.sueldo=sueldo2;
    }

    private void setNumLegajo(int numLegajo2) {
        this.numLegajo = numLegajo2;
    }
    
    public String obtenerDescripcion() {
        return "Empleado: " + nombre + " " + apellido + ", Edad: " + edad + ", Legajo: " + numLegajo + ", Sueldo: " + sueldo;
    }
}

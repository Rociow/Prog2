import java.util.ArrayList;

public class Jerarquico extends Empleado{
    ArrayList <Empleado> empleados;

    public Jerarquico (String nombre, String apellido, int edad, int numLegajo, int sueldo){
        super(nombre, apellido, sueldo, numLegajo, sueldo);
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado (Empleado empleado){
        empleados.add(empleado);
    }

    public String obtenerDescripcion() {
        StringBuilder descripcion = new StringBuilder("Jerárquico: " + nombre + " " + apellido + ", Edad: " + edad + ", Legajo: " + numLegajo + ", Sueldo: " + sueldo);

        if (!empleados.isEmpty()) {
            descripcion.append("\nEmpleados a cargo:");
                for (Empleado empleado : empleados) {
                    descripcion.append("\n - ").append(empleado.obtenerDescripcion());
                }
        }

        return descripcion.toString();
}
}

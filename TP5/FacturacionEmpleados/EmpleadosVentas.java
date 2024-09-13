public class EmpleadosVentas extends Empleados {
    private double porcentaje;

    public EmpleadosVentas (String nombre, String apellido, int dni, double sueldo, double n){
       super(nombre, apellido, dni, sueldo);
       this.porcentaje = n;
    }

    public double getSueldo (){
        return (super.getSueldo()*porcentaje);
    }
}

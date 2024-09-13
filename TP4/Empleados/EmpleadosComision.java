public class EmpleadosComision extends Empleados{

    private double salarioBase;
    private double porcentajeComision;
    private double ventasRealizadas;

    public EmpleadosComision(String nombre, double salarioBase, double porcentajeComision, double ventasRealizadas) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.porcentajeComision = porcentajeComision;
        this.ventasRealizadas = ventasRealizadas;
    }


    public double calcularPago() {
        return salarioBase + (porcentajeComision / 100 * ventasRealizadas);
    }
}

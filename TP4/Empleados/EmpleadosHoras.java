public class EmpleadosHoras extends Empleados {

    private double salarioBase;
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadosHoras(String nombre, double salarioBase, double tarifaPorHora, int horasTrabajadas) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularPago() {
        return salarioBase + (tarifaPorHora * horasTrabajadas);
    }


}

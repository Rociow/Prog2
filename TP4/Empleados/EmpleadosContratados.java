public class EmpleadosContratados extends Empleados{
    private double salarioFijo;

    final static double fijo = 500;

    public EmpleadosContratados(String nombre, double fijo){
        super(nombre);
        setsalarioFijo(fijo);
    }

    public void setsalarioFijo(double salario){
        this.salarioFijo = salario;
    }
    public double calcularPago (){
        return salarioFijo;
    }
}

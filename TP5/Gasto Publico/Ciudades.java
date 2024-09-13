import java.util.ArrayList;

public class Ciudades {
    ArrayList<Impuestos> impuestos;
    String nombreCiudad;
    int cant, gastos;
    int cantidadMinima = 100000;
    final static int presupuestoFijo = 3000;

    public Ciudades(String newNombre, int cant, int gasto) {
        setNombre(newNombre);
        setCant(cant);
        setGastos(gasto);
        impuestos = new ArrayList<>();
    }

    public void agregarImpuesto(Impuestos newImpuesto) {
        impuestos.add(newImpuesto);
    }

    public int calcularGastoPublico() {
        int sumatoriaImpuesto = 0;

        for (int i = 0; i < impuestos.size(); i++) {
            sumatoriaImpuesto += (impuestos.get(i).getValor());
        }

        return sumatoriaImpuesto;
    }

    public boolean estaenDeficit() {
        return calcularGastoPublico() < this.gastos;
    }

    public void setNombre(String newNombre) {
        this.nombreCiudad = newNombre;
    }

    public void setGastos(int gastos2) {
        this.gastos = gastos2;
    }

    public void setCant(int cantidad) {
        this.cant = cantidad;
    }

    public int getCant() {
        return this.cant;
    }

    public static void main(String[] args) {
        Ciudades JUJUY = new Ciudades("jujuy", 30000, presupuestoFijo);
        JUJUY.calcularGastoPublico();
    }

}

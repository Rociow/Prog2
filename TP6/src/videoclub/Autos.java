package videoclub;

public class Autos extends Productos {
    private String marca;
    private String modelo;
    private int kilometros;
    private String patente;
    private String tipo;
    private boolean estaAlquilado;

    public Autos(String marca, String modelo, int kilometros, String patente, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.patente =patente;
        this.tipo = tipo;
        this.estaAlquilado = false;
    }

    public boolean sePuedeAlquilar (Productos p){
        return estaAlquilado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstaAlquilado() {
        return estaAlquilado;
    }

    public void setEstaAlquilado(boolean estaAlquilado) {
        this.estaAlquilado = estaAlquilado;
    }
}

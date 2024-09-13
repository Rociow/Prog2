
public class Sensores {
 String nombreZona;
 boolean estaActivado;

 public Sensores () {
    setNombre("NN");
    setActivado(false);
 }

 private void setNombre(String string) {
    this.nombreZona = string;
}

private void setActivado(boolean b) {
    this.estaActivado = b;
}

public String getZona() {
    return nombreZona;
}

public boolean activado() {
    return estaActivado;
}

public void activar() {
    this.estaActivado = true;
}

public void desactivar() {
    this.estaActivado = false;
}


}


public class Canchas {
    String tipoCancha;

    int costoFutbol = 400;
    int costoPaddle = 100;

    public Canchas (String tipoCancha) {
        setTipo(tipoCancha);
    }

    public void setTipo(String tipoCancha2) {
        this.tipoCancha = tipoCancha2;
    }

    public String getTipo() {
        return tipoCancha;
    }


    public int obtenerCosto (String tipoCancha) {
        if (tipoCancha == "Futbol"){
            return costoFutbol;
        } else {
            return costoPaddle;
        }
    }
}

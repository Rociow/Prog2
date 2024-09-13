public class Alarma {
    protected boolean vidrioRoto;
    protected boolean ventanaAbierta;
    protected boolean movimientoDentro;
    Timbre timbre;
    Luz luz;

    public Alarma(){
        setvidrioRoto(false);
        setventanaAbierta(false);
        setmovimientoDentro(false);
        timbre = new Timbre();
        luz = new Luz();
    }

    private void setvidrioRoto(boolean b) {
        this.vidrioRoto = b;
    }

    private void setventanaAbierta(boolean b) {
        this.ventanaAbierta= b;
    }

    private void setmovimientoDentro(boolean b) {
        this.movimientoDentro = b;
    }

    public void comprobar(){
        if ( vidrioRoto || ventanaAbierta || movimientoDentro ) {
            timbre.hacerSonar();
        }
    }
}
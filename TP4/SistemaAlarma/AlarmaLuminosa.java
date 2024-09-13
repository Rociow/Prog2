public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(){
        super();
        luz = new Luz();
    }

    public void comprobar(){
        super.comprobar();
        if ( vidrioRoto || ventanaAbierta || movimientoDentro){
            luz.encenderLuz();
        }
    }
}

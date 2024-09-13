public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(){
        super();
        luz = new Luz();
    }

    public void comprobar(){
        super.comprobar();
        for (int i = 0; i < sensores.size(); i++){
            if ( sensores.get(i).activado()){
                System.out.println("El sensor de la zona " + sensores.get(i).getZona() + " se ha activado.");
                luz.encenderLuz();
            }
        }
    }
}

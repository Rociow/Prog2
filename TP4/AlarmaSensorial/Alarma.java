import java.util.ArrayList;

public class Alarma {
    ArrayList<Sensores> sensores = new ArrayList<>();
    Timbre timbre;
    
    public Alarma(){
        sensores = new ArrayList<>();
        timbre = new Timbre();
    }

    public void agregarSensor(Sensores sensor) {
        sensores.add(sensor);
    }



    public void comprobar(){

        
        for (int i = 0; i < sensores.size(); i++){
            if ( sensores.get(i).activado()){
                System.out.println("El sensor de la zona " + sensores.get(i).getZona() + " se ha activado.");
                timbre.hacerSonar();
            }
        }
    }
}
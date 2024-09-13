public class Conversor {
    
    public static double pulgadas_a_cm = 2.54;
    public static double cm_a_pulgadas = 1 / pulgadas_a_cm;
    public static double libras_a_kilos = 0.453592;
    public static double kilos_a_libras = 1 / libras_a_kilos;
    public static double galon_a_litro = 3.78541 ;
    public static double litro_a_galon = 1 / galon_a_litro;

    public static double cmApulgadas (double cm) {
        return cm * cm_a_pulgadas;
    }

    public static double pulgadasAcm (double pulgadas) {
        return pulgadas * pulgadas_a_cm;
    }

    public double librasAkilos (double libra) {
        return libra * libras_a_kilos;
    }

    public double kilosAlibras (double kilo) {
        return kilo * kilos_a_libras;
    }

    public double galonAlitro (double galon) {
        return galon * galon_a_litro;
    }

    public double litroAgalon (double litro) {
        return litro * litro_a_galon;
    }

    public static void main(String[] args) {
        double cm = 2;


        System.out.println(cm + " cm son " + cmApulgadas(cm) + " pulgadas.");
    }

}
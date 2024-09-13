import java.time.LocalDate;

public class Main {
     public static void main(String[] args) {
        Jardin jardinPrivado = new Jardin();
        Planta jazmin = new Planta("esquelectus", "jazmin", "japon", LocalDate.of (2024,5,6));
        Planta rosa = new Planta("mictus", "rosa", "mexico", LocalDate.of (2024,6,6));
        Planta alamo = new Planta("yuectus", "alamo", "italia", LocalDate.of (2024,7,6));
        Planta alerce = new Planta("poctus", "alerce", "argentina", LocalDate.of (2024,8,7));

        jardinPrivado.agregarPlanta(jazmin);
        jardinPrivado.agregarPlanta(rosa);
        jardinPrivado.agregarPlanta(alamo);
        jardinPrivado.agregarPlanta(alerce);
        System.out.println(jazmin);
        System.out.println(alerce);

     }
}

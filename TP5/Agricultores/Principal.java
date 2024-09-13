public class Principal {
     public static void main(String[] args) {
        Granja granja1 = new Granja();
        Cereales grueso = new Pastura("girasol", "pastura");
        Lote l1 = new Lote(50);

        l1.agregarMineral("Magnesio"); 
        l1.agregarMineral("Litio");

        grueso.agregarMineral("Magnesio");
        grueso.agregarMineral("Litio");

        
        System.out.println(granja1.puedeSembrar(grueso, l1));
     }
}

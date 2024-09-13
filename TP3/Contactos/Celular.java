public class Celular {
    Contactos [] contactos;

    public Celular () {
        contactos=new Contactos[0];
    }

    public void agregarNumero (Contactos contactoNuevo) {
        Contactos [] contactosAux = new Contactos[contactos.length+1];

        for ( int i = 0; i < contactos.length; i++){
            contactosAux[i]=contactos[i];
        }

        contactosAux[contactosAux.length-1]=contactoNuevo;
        contactos=contactosAux;
    }

    public void mostrarContactos () {
        for (int i = 0; i < contactos.length; i++){
            System.out.println("Contacto: " + contactos[i].getNombre() + " " + contactos[i].getApellido());
            System.out.println("Edad: " + contactos[i].getEdad());
            System.out.println("Número de teléfono: " + contactos[i].getNum());
            System.out.println("----------------");
            
        }System.out.println("El promedio de edad es: " + promedioEdad());
    }

    public void mostrarContactosRepetidos () {
        for (int i = 0; i < contactos.length; i++){
            int j = i+1;
            while ( j < contactos.length && contactos[i].getNum()!=contactos[j].getNum()){
                j++;
            }

            if (contactos[i].getNum()==contactos[j].getNum()){
            System.out.println("El contacto: " + contactos[i].getNombre() + " " + contactos[i].getApellido() + " y el contacto " + contactos[j].getNombre()+ " " + contactos[j].getApellido() + " comparten el mismo número: " + contactos[i].getNum());
            
        }
    }
    }

    private int promedioEdad() {
        int sumatoria = 0;
        for(int i = 0; i < contactos.length; i++){
            sumatoria += contactos[i].getEdad();
        }

        return sumatoria/contactos.length;
    }

    public static void main(String[] args) {
        Celular celuMio = new Celular();
        celuMio.agregarNumero(new Contactos("Pepito", "Rodriguez", "Alem 1233", "pepito@123", 26, 654654654));
        celuMio.agregarNumero(new Contactos("Pepito", "Rodriguez", "Alem 1233", "pepito@123", 20, 654654654));
        celuMio.mostrarContactos();
        celuMio.mostrarContactosRepetidos();
    }


}

public class Personajes {
    String nombreReal;
    String nombreHeroe;
    int visionNocturna;
    int velocidad;
    int fuerza;
    int peso;
    int altura;
    int edad;

   public Personajes(String nombreReal1, String nombreHeroe1,int visionNocturna1,int velocidad1,int fuerza1,int peso1,int altura1,int edad1){
    setnombreReal(nombreReal1);
    setnombreHeroe(nombreHeroe1);
    setVisionNocturna(visionNocturna1);
    setVelocidad(velocidad1);
    setFuerza(fuerza1);
    setPeso(peso1);
    setAltura(altura1);
    setEdad(edad1);
   }

private void setnombreReal(String nombreReal1) {
    this.nombreReal=nombreReal1;
}

private void setnombreHeroe(String nombreHeroe1) {
    this.nombreHeroe=nombreHeroe1;
}

private void setVisionNocturna(int visionNocturna1) {
    this.visionNocturna=visionNocturna1;
}

private void setVelocidad(int velocidad1) {
    this.velocidad=velocidad1;
}

private void setFuerza(int fuerza1) {
    this.fuerza=fuerza1;
}

private void setPeso(int peso1) {
    this.peso=peso1;
}

private void setAltura(int altura1) {
    this.altura=altura1;
}

private void setEdad(int edad1) {
    this.edad=edad1;
}
}

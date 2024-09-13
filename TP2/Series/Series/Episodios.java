
public class Episodios {
 String titulo, descripcion; 
 boolean seVio;
 int calificacion;

 public Episodios(String newTitulo, String newDescripcion, boolean newValor, int cal){
    titulo = newTitulo;
    descripcion = newDescripcion;
    seVio = newValor;
    calificacion = cal;

 }

 public String getTitulo(){
    return titulo;
 }

 public void setTitulo(String newTitulo){
    titulo = newTitulo;
 }

 public String getDescripcion(){
    return descripcion;
 }

 public void setDescripcion(String newDescripcion){
    descripcion = newDescripcion;
 }

 public boolean seVio(){
    return seVio;
 }

 public void setValor(boolean newValor){
    seVio = newValor;
 }

 public int getCalificacion(){
    if (seVio){
    return calificacion;
 } else {
    return 0;
 }
}


 public void ingresarCalificacion(boolean seVio, int valor){
    if (seVio && (valor>=0 || valor<=5)){
        calificacion = valor;
    }

    else if (seVio && valor<=0 && valor>=5){
        System.out.println("El valor ingresado es incorrecto");
        calificacion = valor;
    }

    else if (!seVio && valor<0){
        calificacion = valor;
    }

    else {
        System.out.println("No se puede calificar un episodio no visto");
    }
 }



}

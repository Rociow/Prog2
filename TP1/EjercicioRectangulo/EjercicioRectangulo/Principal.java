package EjercicioRectangulo;


public class Principal{
public static void main (String[] args){
    PuntoGeometrico punto1 = new PuntoGeometrico(1,1);
    PuntoGeometrico punto2 = new PuntoGeometrico(1,2);
    PuntoGeometrico punto3 = new PuntoGeometrico(2,1);
    PuntoGeometrico punto4 = new PuntoGeometrico(2,2);

    Rectangulo cuadrado = new Rectangulo(punto1,punto2,punto3,punto4);
    cuadrado.mostrarRectangulo();
    System.out.println("El largo del vertice superior es de: " + cuadrado.calcularLargo());
    System.out.println("Es un cuadrado? "+ cuadrado.esCuadrado());
    System.out.println("Esta acostado? "+ cuadrado.estaAcostado());
	System.out.println("El area de la figura es: " + cuadrado.calcularArea());
}

public int compararRectangulos (Rectangulo r1, Rectangulo r2){
    double area1 = r1.calcularArea();
    double area2 = r2.calcularArea();

    if (area1 > area2){
        return 1;
    } else if (area1 < area2){
        return 0;
    } else {
        return -1;
    }
}

}

public class Rectangulo {
    PuntoGeometrico v1;
    PuntoGeometrico v2;
    PuntoGeometrico v3;
    PuntoGeometrico v4;

    public void desplazarRectangulo (int x, int y){
        v1.desplazarPunto(x,y);
        v2.desplazarPunto(x, y);
        v3.desplazarPunto(x, y);
        v4.desplazarPunto(x, y);
    }

    public int calcularArea () {
        return (v1.getX()+v2.getX())*(v3.getX()+v4.getX());
    }

    public int comparar (Rectangulo rectangulo){
        
    }
}

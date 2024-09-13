public class PuntoGeometrico {
    private int x;
    private int y;

    public PuntoGeometrico () {
        this.x = 0;
        this.y = 0;
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public void desplazarPunto (int incrementaX, int incrementaY) {
        this.x += incrementaX;
        this.y += incrementaY;
    }

    public double distanciaEuclidea (int xCompara, int yCompara) {
        return Math.sqrt(Math.sqrt(this.x - xCompara)+Math.sqrt(this.x - yCompara));
    }
}

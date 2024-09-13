public class PuntoGeometrico {
    int x;
    int y;
    final static int DEF_X=10;
    final static int DEX_Y=10;
    
    public PuntoGeometrico(){
        setX(DEF_X);
        setY(DEX_Y);
    }

    public PuntoGeometrico(int x, int y) {
		this();
		setX(x);
		setY(y);
	}

    public int getX (){
        return x;
    }

    public void setX (int newX){
        this.x = newX;
    }

    public int getY (){
        return y;
    }

    public void setY (int newY){
        this.y = newY;
    }


    public void moverPunto (int des_x, int des_y){
        setX(this.x + des_x);
        setY(this.y + des_y);
    }

    public void printInfo() {
		System.out.println("Las coordenas son (x,y): (" + getX(this.x) + "," + getY(this.y) + ").");
	}

    public double distanciaEuclidea (double distancia, int x1, int x2, int y1, int y2) {

        distancia = (Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2));
        return distancia;

    }

    public static void main(String[] args) {
        PuntoGeometrico A = new PuntoGeometrico(10,5);
        a.printInfo();
    }
}


package EjercicioRectangulo;

public class PuntoGeometrico {
    int x;
    int y;
    double distancia;
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
		System.out.println("Las coordenas son (x,y): (" + this.x + "," + this.y + ").");
	}

    public double distanciaEuclidea (int distancia_x, int distancia_y) {
        double distancia = ( (this.x - distancia_x) * (this.x - distancia_x) ) + ( (this.y - distancia_y) *  (this.y - distancia_y) );
		distancia = Math.sqrt(distancia);
		return (distancia);

    }

}


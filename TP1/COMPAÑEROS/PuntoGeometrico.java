package EjercioPunto;


public class PuntoGeometrico {
	int x;
	int y;
	
	final static int DEF_X = 10;
	final static int DEF_Y = 10;
	
	public PuntoGeometrico() {
		setX(DEF_X);
		setY(DEF_Y);
	}
	
	public PuntoGeometrico(int x, int y) {
		this();
		setX(x);
		setY(y);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void printInfo() {
		System.out.println("Las coordenas son (x,y): (" + this.x + "," + this.y + ").");
	}
	
	public void desplazar(int des_x, int des_y) {
		setX(this.x + des_x);
		setY(this.y + des_y);
	}
	
	public double calcularDistancia(int distancia_x, int distancia_y) { // Distancia2  = ( X1 – X2 )2 + (Y1 – Y2)2 
		double distancia = ( (this.x - distancia_x) * (this.x - distancia_x) ) + ( (this.y - distancia_y) *  (this.y - distancia_y) );
		distancia = Math.sqrt(distancia);
		return (distancia);
	}
	
}

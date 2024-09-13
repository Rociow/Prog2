package EjercioPunto;

public class Rectangulo {
	PuntoGeometrico punto1;
	PuntoGeometrico punto2;
	PuntoGeometrico punto3;
	PuntoGeometrico punto4;
	
	final static PuntoGeometrico DEF_PUNTO1 = new PuntoGeometrico(1,3);
	final static PuntoGeometrico DEF_PUNTO2 = new PuntoGeometrico(4,3);
	final static PuntoGeometrico DEF_PUNTO3 = new PuntoGeometrico(1,1);
	final static PuntoGeometrico DEF_PUNTO4 = new PuntoGeometrico(4,1);
	
	public Rectangulo() {
		setPunto1(DEF_PUNTO1);
		setPunto2(DEF_PUNTO2);
		setPunto3(DEF_PUNTO3);
		setPunto4(DEF_PUNTO4);
	}
	
	
	public Rectangulo(PuntoGeometrico punto1, PuntoGeometrico punto2, PuntoGeometrico punto3, PuntoGeometrico punto4) {
		setPunto1(punto1);
		setPunto2(punto2);
		setPunto3(punto3);
		setPunto4(punto4);
	}
	
	public void setPunto1(PuntoGeometrico punto1) {
		this.punto1=punto1;
	}
	
	public void setPunto2(PuntoGeometrico punto2) {
		this.punto2=punto2;
	}
	
	public void setPunto3(PuntoGeometrico punto3) {
		this.punto3=punto3;
	}
	
	public void setPunto4(PuntoGeometrico punto4) {
		this.punto4=punto4;
	}
	
	
	public void mostrarRectangulo() {
		this.punto1.printInfo();
		this.punto2.printInfo();
		this.punto3.printInfo();
		this.punto4.printInfo();
	}
	
	public void desplazarRectangulo(int des_x, int des_y) {
		this.punto1.desplazar(des_x, des_y);
		this.punto2.desplazar(des_x, des_y);
		this.punto3.desplazar(des_x, des_y);
		this.punto4.desplazar(des_x, des_y);
	}
	
	public double calcularLargo() {
		return this.punto1.calcularDistancia(this.punto2.x, this.punto2.y);
	}
	
	public boolean esCuadrado() {
		double lado1 = this.punto1.calcularDistancia(this.punto2.x, this.punto2.y);
		double lado2 = this.punto1.calcularDistancia(this.punto3.x, this.punto3.y);
		
		return lado1==lado2;
	}
	
	public boolean estaAcostado() {
		double lado1 = this.punto1.calcularDistancia(this.punto2.x, this.punto2.y);
		double lado2 = this.punto1.calcularDistancia(this.punto3.x, this.punto3.y);
		
		return lado1>lado2;
	}
	
	public double calcularArea() {
		double lado1 = this.punto1.calcularDistancia(this.punto2.x, this.punto2.y);
		double lado2 = this.punto1.calcularDistancia(this.punto3.x, this.punto3.y);
		
		return lado1*lado2;
	}
}

package EjercioPunto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuntoGeometrico punto1 = new PuntoGeometrico(1,3);
		PuntoGeometrico punto2 = new PuntoGeometrico(4,3);;
		PuntoGeometrico punto3 = new PuntoGeometrico(1,1);;
		PuntoGeometrico punto4 = new PuntoGeometrico(4,1);;
		
		Rectangulo rectangulo1 = new Rectangulo(punto1, punto2, punto3, punto4);
		rectangulo1.mostrarRectangulo();
		//rectangulo1.desplazarRectangulo(3, 3);
		//rectangulo1.mostrarRectangulo();
		
		System.out.println("El largo del vertice superior es de: " + String.format("%.2f", rectangulo1.calcularLargo()));
		System.out.println("Es un cuadrado? "+rectangulo1.esCuadrado());
		System.out.println("Esta acostado? "+rectangulo1.estaAcostado());
		System.out.println("El area de la figura es: " + rectangulo1.calcularArea());
		System.out.println();
		punto1 = new PuntoGeometrico(6,8);
		punto2 = new PuntoGeometrico(9,8);
		punto3 = new PuntoGeometrico(6,6);
		punto4 = new PuntoGeometrico(9,6);
		Rectangulo rectangulo2 = new Rectangulo(punto1, punto2, punto3, punto4);
		rectangulo1.mostrarRectangulo();
		System.out.println();
		rectangulo2.mostrarRectangulo();
		System.out.println();
		System.out.println("Las areas son: " + compararAreas(rectangulo1, rectangulo2));
	}
	
	public static int compararAreas(Rectangulo rectangulo1, Rectangulo rectangulo2) {
		double area1 = rectangulo1.calcularArea();
		double area2 = rectangulo2.calcularArea();
		int comparacion;
		if(area1>area2) {
			comparacion = 1;
		}else if(area1<area2) {
			comparacion = -1;
		}else {
			comparacion = 0;
		}
		return comparacion;
	}
}

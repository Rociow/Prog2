package Clase1;

public class Avion {
	int capacidad;
	String matricula;
	int velocidad;
	Marca marca;
	
	/*public Avion() {
		capacidad = 10;
		matricula ="AR1";
		velocidad = 1000;
	}*/
	
	public Avion(int cap, String mat, int vel) {
		capacidad = cap;
		matricula = mat;
		velocidad = vel;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int nuevo) {
		capacidad = nuevo;
	}
	
	public void setMarca(Marca nueva) {
		marca = nueva;
	}
}

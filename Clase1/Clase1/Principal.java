package Clase1;

public class Principal {
	
	public static void main(String[] args) {
		
		Avion a1 = new Avion(50, "RR2", 2500);
		int cap = a1.getCapacidad();
		System.out.println("La capacidad del avion es " + cap);
		a1.setCapacidad(100);
		cap = a1.getCapacidad();
		System.out.println("La capacidad del avion es " + cap);
		Marca marca1 = new Marca("Boeing", "Cal", "NN");
		a1.setMarca(marca1);
		//Avion a2 = new Avion(); // Ya no existe el constructor por defecto
	}

}

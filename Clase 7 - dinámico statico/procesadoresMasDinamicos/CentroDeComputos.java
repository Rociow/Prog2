package procesadoresMasDinamicos;

import java.util.ArrayList;

public class CentroDeComputos {

	public static void main(String[] args) {
		Tarea t1 = new Tarea("t1", 10, 6, 1);
		Tarea t2 = new Tarea("t2", 5, 10, 3);
		Tarea t3 = new Tarea("t3", 8, 5, 2);
		
		// Creamos un procesador que ordena por CPU
		ProcesadorDinamico p1 = new ProcesadorDinamico(new ColaDeTareasOrdenada(new ComparadorPorCPU()));
		ProcesadorDinamico p2 = p1;
		p1.agregarTarea(t1);
		p1.agregarTarea(t2);
		p1.agregarTarea(t3);
		
		System.out.println(p1);
		
		p1.setColaDeTareas(new ColaDeTareasOrdenada(new ComparadorPorMemoria()));
		
		System.out.println(p1);
		
		p2.ejecutarTodas();
		
	}
}

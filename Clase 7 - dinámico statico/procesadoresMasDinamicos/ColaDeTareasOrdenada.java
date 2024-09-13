package procesadoresMasDinamicos;

public class ColaDeTareasOrdenada extends ColaDeTareas {

	private ComparadorDeTareas comparador;
	
	public ColaDeTareasOrdenada(ComparadorDeTareas comparador) {
		super();
		this.comparador = comparador;
	}
	
	@Override
	public void addTarea(Tarea tarea) {
		int i = 0;
		while (i < this.tareas.size() 
				//&& tarea.getPrioridad() >= this.tareas.get(i).getPrioridad())
				&& comparador.esMayor(tarea, this.tareas.get(i)))
			i++;
		
		if (i == this.tareas.size()) {
			this.tareas.add(tarea); // Inserta al final
		}
		else {
			this.tareas.add(i, tarea); // Inserta en posicion i
		}
	}

}

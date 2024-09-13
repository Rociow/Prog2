package procesadoresDinamicos;

import java.util.ArrayList;

public abstract class ColaDeTareas {
	
	protected ArrayList<Tarea> tareas;
	
	public ColaDeTareas() {
		this.tareas = new ArrayList<>();
	}
	
	public boolean tieneElementos() {
		return !this.tareas.isEmpty();
	}
	
	public Tarea sacarTarea() {
		if (this.tieneElementos())
			return tareas.remove(0);
		else
			return null;
	}
	
	public int getCantElementos() {
		return this.tareas.size();
	}
	
	public abstract void addTarea(Tarea tarea);
	
	public String toString() {
		return this.tareas.toString();
	}

}

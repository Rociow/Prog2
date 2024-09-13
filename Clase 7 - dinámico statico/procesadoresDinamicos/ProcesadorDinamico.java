package procesadoresDinamicos;

import java.util.ArrayList;

public class ProcesadorDinamico {
	protected ColaDeTareas tareas;
	
	public ProcesadorDinamico(ColaDeTareas tareas) {
		this.tareas = tareas;
	}
	
	public void setColaDeTareas(ColaDeTareas tareas) {
		if (!tareas.tieneElementos()) {
			// Acepto el cambio, sino la descarto
			// Recorrer las tareas cargadas y pasarlas a la nueva
			int n = this.tareas.getCantElementos();
			for (int i = 0; i < n; i++) {
				tareas.addTarea(this.tareas.sacarTarea());
			}
			// Realizo la asignación
			this.tareas = tareas;
		}
	}
	
	public void ejecutarTarea() {
		// Ejecuta la primera tarea de la lista de tareas
		if (tareas.tieneElementos()) {
			// No está vacio, puedo ejecutar la primera
			Tarea tareaAEjecutar = tareas.sacarTarea();
			if (tareaAEjecutar != null)
				// La ejecuto
				tareaAEjecutar.ejecutar();
		}
	}
	
	public void ejecutarTodas() {
		int n = this.tareas.getCantElementos();
		for(int i = 0; i < n; i++)
			this.ejecutarTarea();
	}
	
	public void agregarTarea(Tarea tarea) {
		this.tareas.addTarea(tarea);
	}
	
	public String toString() {
		return "Tareas: " + this.tareas;
	}
}

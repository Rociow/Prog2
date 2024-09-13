package procesadoresDinamicos;

public class ColaDeTareasFIFO extends ColaDeTareas {
	
	@Override
	public void addTarea(Tarea tarea) {
		this.tareas.add(tarea);
	}

}

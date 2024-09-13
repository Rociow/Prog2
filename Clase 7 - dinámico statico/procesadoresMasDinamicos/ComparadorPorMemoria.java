package procesadoresMasDinamicos;

public class ComparadorPorMemoria extends ComparadorDeTareas {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getUsoMem() > t2.getUsoMem();
	}

}

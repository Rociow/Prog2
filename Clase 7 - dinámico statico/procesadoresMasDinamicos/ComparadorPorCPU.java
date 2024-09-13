package procesadoresMasDinamicos;

public class ComparadorPorCPU extends ComparadorDeTareas {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getUsoCPU() > t2.getUsoCPU();
	}

}

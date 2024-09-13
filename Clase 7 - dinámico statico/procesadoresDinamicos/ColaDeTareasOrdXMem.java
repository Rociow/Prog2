package procesadoresDinamicos;

public class ColaDeTareasOrdXMem extends ColaDeTareasOrdenada {

	@Override
	protected boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getUsoMem() > t2.getUsoMem();
	}

}

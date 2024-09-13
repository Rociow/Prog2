package procesadoresDinamicos;

public class ColaDeTareasOrdXCPU extends ColaDeTareasOrdenada {

	@Override
	protected boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getUsoCPU() > t2.getUsoCPU();
	}

}

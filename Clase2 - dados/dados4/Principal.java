package dados4;

public class Principal {
	
	public static void main(String[] args) {
		Jugador pepe = new Jugador("Pepe");
		Jugador tito = new Jugador("Tito");
		
		Juego juego1 = new Juego(6, pepe, tito, 5);
		Jugador ganador = juego1.jugar();
		if (ganador != null)
			System.out.println("Ganó " + ganador.getNombre());
		else
			System.out.println("Empate");
		
		Juego juego2 = new Juego(200,3, 8, pepe, tito, 4);
		ganador = juego2.jugar();
		if (ganador != null)
			System.out.println("Ganó " + ganador.getNombre());
		else
			System.out.println("Empate");
		
		System.out.println(pepe.imprimirEstadistica());
		System.out.println(tito.imprimirEstadistica());
	}

}

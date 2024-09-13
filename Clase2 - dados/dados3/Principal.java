package dados3;

public class Principal {
	
	public static void main(String[] args) {
		Jugador pepe = new Jugador("Pepe");
		Jugador tito = new Jugador("Tito");
		
		Juego juego1 = new Juego(6, pepe, tito, 5);
		juego1.jugar();
		
		Juego juego2 = new Juego(200,3, 8, pepe, tito, 4);
		juego2.jugar();
		
		System.out.println(pepe.imprimirEstadistica());
		System.out.println(tito.imprimirEstadistica());
	}

}

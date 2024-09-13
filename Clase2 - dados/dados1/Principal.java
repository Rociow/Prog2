package dados1;

public class Principal {
	
	public static void main(String[] args) {
		Juego juego1 = new Juego();
		juego1.jugar();
		
		Juego juego2 = new Juego(200,3);
		juego2.jugar();
	}

}

package dados2;

public class Juego {
	
	// Cantidad de rondas por defecto
	final static int DEF_RONDAS = 10;
	// Puntaje maximo por defecto
	final static int DEF_PUNTAJE_MAX = 7;
	//int puntos1;
	//int puntos2;
	
	Jugador j1;
	Jugador j2;
	int cantRondas;
	int puntajeMax;
	Dado dado1;
	Dado dado2;
	
	public Juego(int cantCaras, Jugador j1, Jugador j2) {
		this(DEF_RONDAS, DEF_PUNTAJE_MAX, cantCaras, j1, j2);
		//puntos1 = 0;
		//puntos2 = 0;
		//cantRondas = DEF_RONDAS;
	}
	
	public Juego(int cantRondas, int puntajeMax, int cantCaras, Jugador j1, Jugador j2) {
		this.cantRondas = cantRondas;
		this.puntajeMax = puntajeMax;
		//puntos1 = 0;
		//puntos2 = 0;
		this.dado1 = new Dado(cantCaras);
		this.dado2 = new Dado(cantCaras);
		this.j1 = j1;
		this.j2 = j2;
	}
	
	public void jugar() {
		int ronda1, ronda2;
		j1.vaAJugar();
		j2.vaAJugar();
		// Desarrollamos 10 rondas
		for (int i = 0; i < cantRondas; i++) {
			// Tirar los dados
			ronda1 = j1.tirarDado(dado1, dado2);//dado1.tirar() + dado2.tirar();
			ronda2 = j2.tirarDado(dado1, dado2);//dado1.tirar() + dado2.tirar();
			
			// Determinar los puntos
			if (ronda1 >= this.puntajeMax && ronda1 > ronda2)
				j1.aumentarPuntaje();
			else
				if (ronda2 >= this.puntajeMax && ronda2 > ronda1)
					j2.aumentarPuntaje();
		}
		
		// Determinar el ganador
		if (j1.getPuntos() > j2.getPuntos()) {
			System.out.println("Gano " + j1.getNombre());
			j1.gano();
		}
		else
			if (j2.getPuntos() > j1.getPuntos()) { 
				System.out.println("Gano " + j2.getNombre());
				j2.gano();
			}
			else
				System.out.println("Empate");
	}
	


}

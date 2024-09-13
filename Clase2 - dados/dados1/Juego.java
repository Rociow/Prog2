package dados1;

public class Juego {
	
	final static int DEF_RONDAS = 10;
	final static int DEF_PUNTAJE_MAX = 7;
	int puntos1;
	int puntos2;
	int cantRondas;
	int puntajeMax;
	
	public Juego() {
		this(DEF_RONDAS, DEF_PUNTAJE_MAX);
		//puntos1 = 0;
		//puntos2 = 0;
		//cantRondas = DEF_RONDAS;
	}
	
	public Juego(int cantRondas, int puntajeMax) {
		this.cantRondas = cantRondas;
		this.puntajeMax = puntajeMax;
		puntos1 = 0;
		puntos2 = 0;
	}
	
	public void jugar() {
		int ronda1, ronda2;
		// Desarrollamos 10 rondas
		for (int i = 0; i < cantRondas; i++) {
			// Tirar los dados
			ronda1 = tirarDado() + tirarDado();
			ronda2 = tirarDado() + tirarDado();
			
			// Determinar los puntos
			if (ronda1 >= this.puntajeMax && ronda1 > ronda2)
				puntos1++;
			else
				if (ronda2 >= this.puntajeMax && ronda2 > ronda1)
					puntos2++;
		}
		
		// Determinar el ganador
		if (puntos1 > puntos2)
			System.out.println("Gano 1");
		else
			if (puntos2 > puntos1)
				System.out.println("Gano 2");
			else
				System.out.println("Empate");
	}
	
	private int tirarDado() {
		return (int)(Math.random() * 6) + 1;
	}

}

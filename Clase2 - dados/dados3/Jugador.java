package dados3;

public class Jugador {
	String nombre;
	int puntos;
	int cantPartidasGanadas;
	int cantPartidasJugadas;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntos = 0;
		this.cantPartidasGanadas = 0;
		this.cantPartidasJugadas = 0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int tirarDado(Cubilete cub) {
		return cub.tirar();
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public void aumentarPuntaje() {
		this.puntos++;
	}
	
	public void gano() {
		this.cantPartidasGanadas++;
	}
	
	public void vaAJugar() {
		this.puntos = 0;
		this.cantPartidasJugadas++;
	}
	
	public String imprimirEstadistica() {
		return this.nombre + " gano " + this.cantPartidasGanadas + " de " + this.cantPartidasJugadas;
	}
	
	
	
	

}
package dados3;

public class Dado {
	static final int DEF_CARAS = 6;
	int cantCaras;
	
	public Dado() {
		this(DEF_CARAS);
	}
	
	public Dado(int cantCaras) {
		this.cantCaras = cantCaras;
	}
	
	public int tirar() {
		return (int)(Math.random() * this.cantCaras) + 1;
	}
	
}

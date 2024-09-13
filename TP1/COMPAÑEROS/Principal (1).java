package EjercicioPersona;

import java.time.LocalDate;

public class Principal {
	final static LocalDate HOY = LocalDate.now();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Persona persona1 = new Persona(38961362);
		Persona persona1 = new Persona(38961362, "Matias", "Bava", LocalDate.of(1996, 8, 16), "Masculino", 175, 91, 28) ;
		persona1.printInfo();
		System.out.println("Su edad y fecha de nacimiento coinciden? " + persona1.esCoherente());
		System.out.println("Tiene edad para votar? " + persona1.puedeVotar());
		System.out.println("Es mayor de edad? " + persona1.esMayor());
		System.out.println("Es su cumple anios? " + persona1.cumpleAnios());
		System.out.println("Esta en forma? " + persona1.estaEnforma());
		System.out.println("Cual es su IMC? " + persona1.indiceDeMasaCoorporal());
		
	}

}

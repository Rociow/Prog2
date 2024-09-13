package EjercicioPersona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	int dni;
	int peso;
	int altura;
	int edad;
	String nombre;
	String apellido;
	String sexo;
	LocalDate fechaDeNacimiento;
	
	
	final static LocalDate DEF_FECHA_NAC = LocalDate.of(2000,01,01);
	final static String DEF_SEXO = "Femenino";
	final static String DEF_NOMBRE = "N";
	final static String DEF_APELLIDO = "N";
	final static int DEF_PESO = 1;
	final static int DEF_ALTURA = 1;
	final static int EDAD_PARA_VOTAR=16;
	final static int MAYOR_EDAD=18;
	final static LocalDate HOY = LocalDate.now();
	

	public Persona(int dni) {
		this.dni=dni;
		this.nombre=DEF_NOMBRE;
		this.apellido=DEF_APELLIDO;
		this.fechaDeNacimiento=DEF_FECHA_NAC;
		this.sexo=DEF_SEXO;
		this.altura=DEF_ALTURA;
		this.peso=DEF_PESO;
	}
	
	public Persona(int dni, String nombre, String apellido) {
		this(dni);
		setNombre(nombre);
		setApellido(apellido);
	}
	
	public Persona(int dni, String nombre, String apellido, LocalDate fechaDeNacimiento) {
		this(dni,nombre,apellido);
		this.fechaDeNacimiento=fechaDeNacimiento;
	}
	
	public Persona(int dni, String nombre, String apellido, LocalDate fechaDeNacimiento, String sexo) {
		this(dni,nombre,apellido,fechaDeNacimiento);
		setSexo(sexo);
	}
	
	public Persona(int dni, String nombre, String apellido, LocalDate fechaDeNacimiento, String sexo, int altura) {
		this(dni,nombre,apellido,fechaDeNacimiento,sexo);
		setAltura(altura);
	}
	
	public Persona(int dni, String nombre, String apellido, LocalDate fechaDeNacimiento, String sexo, int altura, int peso) {
		this(dni,nombre,apellido,fechaDeNacimiento,sexo, altura);
		setPeso(peso);
	}
	
	public Persona(int dni, String nombre, String apellido, LocalDate fechaDeNacimiento, String sexo, int altura, int peso, int edad) {
		this(dni,nombre,apellido,fechaDeNacimiento,sexo, altura, peso);
		setEdad(edad);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento=fechaDeNacimiento;
	}
	
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	public void setAltura(int altura) {
		this.altura=altura;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public boolean estaEnforma() {
		boolean enForma = false;
		double indice=indiceDeMasaCoorporal();
		if(indice>18.5&&indice<25) {
			enForma=true;
		}
		return enForma;
	}
	
	public double indiceDeMasaCoorporal() {
		double altura = this.altura/100.0;
		double indice = this.peso / (altura*altura);
		return indice;
	}

    public int calcularEdad() {
        return Period.between(fechaDeNacimiento, Principal.HOY).getYears();
    }
    
    public boolean esCoherente() {
        return this.edad == calcularEdad();
    }
    
    public boolean puedeVotar() {
    	return calcularEdad()>=EDAD_PARA_VOTAR;
    }
    
    public boolean esMayor() {
    	return calcularEdad()>=MAYOR_EDAD;
    }
    
    public boolean cumpleAnios() {
    	return fechaDeNacimiento.getMonth() == Principal.HOY.getMonth() && fechaDeNacimiento.getDayOfMonth() == Principal.HOY.getDayOfMonth();
    }
    
    public void printInfo() {
    	System.out.print("Estos son los datos de la Persona, nombre "+this.nombre+", apellido "+this.apellido);
    	System.out.print(", documento numero "+ this.dni + ", edad " + this.edad + ", fecha de nacimiento " + this.fechaDeNacimiento);
    	System.out.println(", sexo " + this.sexo + ", altura " + this.altura + ", peso " + this.peso);
    }
	
	
}

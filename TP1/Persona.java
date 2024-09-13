import java.time.LocalDate;

public class Persona {
    String nombre;
    String apellido;
    String sexo;
    int edad;
    int año;
    int mes; //string
    int dia;
    int dni;
    int peso;
    int altura;
    LocalDate date;
    LocalDate hoy = LocalDate.now();

    public Persona() {
        nombre = "N";
        apellido = "N";
        peso = 1;
        altura = 1; 
        date = LocalDate.of(2000, 1, 1);
    }

    public Persona(int dni1){ //esto ya hace que sea obligatorio ingresar el dni, ya que no le setie un valor por defecto
        dni = dni1;
        nombre = "N";
        apellido = "N";
        peso = 1;
        altura = 1; 
        date = LocalDate.of(2000, 1, 1);
    }

    public Persona(int dni1, String nombre1, String apellido1){
        dni = dni1;
        nombre = nombre1;
        apellido = apellido1;
        peso = 1;
        altura = 1; 
        date = LocalDate.of(2000, 1, 1);
    }

    public Persona(int dni1, String nombre1, String apellido1, int anio, int mes, int dia){
        dni = dni1;
        nombre = nombre1;
        apellido = apellido1;
        date = LocalDate.of(anio, mes, dia);
        peso = 1;
        altura = 1; 
    }

    public String getNombre (){
        return nombre;
    }

    public void setNombre (String newNombre){
        this.nombre = newNombre;
    }

    public String getApellido (){
        return apellido;
    }

    public void setApellido (String newApellido){
        this.apellido = newApellido;
    }

    public String getSexo (){
        return sexo;
    }

    public void setSexo (String newSexo){
        this.sexo = newSexo;
    }

    public int getEdad (){
        return edad;
    }

    public void setEdad (int newEdad){
        this.edad = newEdad;
    }

    public int getAnio (){
        return año;
    }

    public void setAnio (int newAnio){
        this.año = newAnio;
    }

    public int getMes (){
        return mes;
    }

    public void setMes (int newMes){
        this.mes = newMes;
    }

    public int getDia (){
        return dia;
    }

    public void setDia (int newDia){
        this.dia = newDia;
    }

    public int getPeso (){
        return peso;
    }

    public void setPeso (int newPeso){
        this.peso = newPeso;
    }

    public int getAltura (){
        return altura;
    }

    public void setAltura (int newAltura){
        this.altura = newAltura;
    }

    public LocalDate getFecha (){
        return date;
    }

    public void setFecha (LocalDate newFecha){
        this.date = newFecha;
    }

    public int getDNI (){
        return dni;
    }

    public void setDNI (int newDNI){
        this.dni = newDNI;
    }



    public float MasaCorporal(int peso, int altura){
        float IMC = peso / (altura*altura);
        return IMC;
    }

    public boolean EstaenForma (float IMC){
        if ( IMC >= 18.5 && IMC <= 25){ //no declarar constantes, despues hay que modificar los valores
            return true;
        } else {
            return false;
        }
    }

    public boolean cumpleAños (){

        if ((date.getMonthValue() == hoy.getMonthValue()) && (date.getDayOfMonth() == hoy.getDayOfMonth())) { //tengo que ver para que compare nomas el dia y el mes
            return true;

        } else {
            return false;
            
        }
    }

    public boolean esMayor (){
        if ((hoy.getYear() - date.getYear()) >= 18){
            return true;
        } else {
            return false;
        }

    }

    public boolean puedeVotar(){
        if ((hoy.getYear() - date.getYear()) >= 16){
            return true;
        } else {
            return false;
        }
    }

    public boolean esCoherente(){
        if ((hoy.getYear() - date.getYear()) == edad){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Persona n1 = new Persona(42028294, "Rocio", "Wesenack", 1999, 8, 12);
        n1.setDia(29);

        System.out.println("Nombre: " + n1.getNombre());
        System.out.println("Apellido: " + n1.getApellido());
        System.out.println("dni: " + n1.getDNI());
        System.out.println("Sexo: " + n1.getSexo());
        System.out.println("Edad: " + n1.getEdad());
        System.out.println("Peso: " + n1.getPeso());
        System.out.println("Altura: " + n1.getAltura());
        System.out.println("Fecha de nacimiento: " + n1.getFecha());
        
        if (n1.cumpleAños() == true) {
            System.out.println("Es su cumpleaños");
        } else {
            System.out.println("No es su cumpleaños");

        }

        Persona n2 = new Persona(5435435, "Rocio", "Wesenack", 1999, 8, 29);

        System.out.println("Nombre: " + n2.getNombre());
        System.out.println("Apellido: " + n2.getApellido());
        System.out.println("dni: " + n2.getDNI());
        System.out.println("Sexo: " + n2.getSexo());
        System.out.println("Edad: " + n2.getEdad());
        System.out.println("Peso: " + n2.getPeso());
        System.out.println("Altura: " + n2.getAltura());
        System.out.println("Fecha de nacimiento: " + n2.getFecha());
        
        if (n2.cumpleAños() == true) {
            System.out.println("Es su cumpleaños");
        } else {
            System.out.println("No es su cumpleaños");

        }
    
    }



}

//en el main declaro los constructores
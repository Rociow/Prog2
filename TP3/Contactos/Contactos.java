

public class Contactos {
    String nombre, apellido, direccion, mail;
    int edad, num;

    public Contactos (String nombre1,String apellido1,String direccion1,String mail1, int edad1, int num1) {
        setNombre(nombre1);
        setApellido(apellido1);
        setDireccion(direccion1);
        setEmail(mail1);
        setEdad(edad1);
        setNum(num1);
    }

    private void setNum(int num1) {
        this.num=num1;
    }

    private void setEdad(int edad1) {
        this.edad=edad1;
    }

    private void setEmail(String mail1) {
        this.mail=mail1;
    }

    private void setDireccion(String direccion1) {
        this.direccion=direccion1;
    }

    private void setApellido(String apellido1) {
        this.apellido=apellido1;
    }

    private void setNombre(String nombre1) {
        this.nombre=nombre1;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getEmail(){
        return mail;
    }

    public int getEdad(){
        return edad;
    }

    public int getNum(){
        return num;
    }

    /*public String getCiudad(){
        Pattern pattern = Pattern.compile("(+34|0034|34)?{9}");
        if(num.(+34|0034|34)?{9}){

        }
    }*/
}

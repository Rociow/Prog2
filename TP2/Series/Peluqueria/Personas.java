
public class Personas {
    String nombre;
    String rol;
    


public Personas (String nombre, String newrol){
    setNombre(nombre);
    this.rol = newrol;
}

public String getNombre(){
    return nombre;
}

public void setNombre (String newnombre){
    this.nombre = newnombre;
}

public String getRol(){
    return rol;
}

public void setRol(String newrol){
    this.rol = newrol;
}



}

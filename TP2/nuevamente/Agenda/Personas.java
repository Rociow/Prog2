
public class Personas {
    private String nombre;
    private String mail;
    private int telefono;
    
    public Personas (String nom, String mail, int num) {
        this.nombre = nom;
        this.mail = mail;
        this.telefono = num;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre () {
        return nombre;
    }

    public void setMail (String mail) {
        this.mail = mail;
    }

    public String getMail () {
        return mail;
    }

    public void setNumero (int tel) {
        this.telefono = tel;
    }

    public int getNumero () {
        return telefono;
    }



}

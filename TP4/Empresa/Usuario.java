public class Usuario extends Personas{
    String usuario, contraseña;

    public Usuario (String nombre, String apellido, int edad, String usuario2, String contraseña2){
        super(nombre,apellido,edad);
        setUsuario(usuario2);
        setContraseña(contraseña);
    }

    private void setUsuario(String usuario2) {
        this.usuario=usuario2;
    }

    private void setContraseña(String contraseña2) {
        this.contraseña = contraseña2;
    }

    public String obtenerDescripcion() {
        return "Usuario: " + nombre + " " + apellido + ", Edad: " + edad + ", Usuario: " + usuario + ", Contraseña: " + contraseña;
    }
}

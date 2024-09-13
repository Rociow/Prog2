/*1 - El Jardín privado
Se desea implementar un sistema de gestión de plantas para un Jardín privado, de cada planta
se guarda su nombre científico, su nombre común, país de origen, fecha de compra y un
identificador único. Cada vez que se crea una planta nueva para la colección, se debe asignar
un número nuevo de forma automática e incremental.  */

import java.time.LocalDate;

public class Planta {
    String nombreCientifico, nombreComun, paisOrigen;
    LocalDate fechaCompra;
    int id;
    public static int contador = 1;

    public Planta (String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra) {
        this.id = contador++;
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.paisOrigen = paisOrigen;
        this.fechaCompra = fechaCompra;
    }

    public int getId() {
        return id;
    }

    public String getNombreCientifico () {
        return nombreCientifico;
    }

    public void setNombreCientifico (String nombre) {
        this.nombreCientifico = nombre;
    }

    public String getNombreComun () {
        return nombreComun;
    }

    public void setNombreComun (String nombre) {
        this.nombreComun = nombre;
    }


    public String getPais () {
        return paisOrigen;
    }

    public void setPais (String pais) {
        this.paisOrigen = pais;
    }

    public String toString () {
        return "ID: " + id + ". La planta " + nombreCientifico + ", mejor conocida como: " + nombreComun + ", es originaria de " + paisOrigen + " y ha sido comprada el día: " + fechaCompra;
    }

}

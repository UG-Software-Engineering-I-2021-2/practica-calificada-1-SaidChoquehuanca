package main;

public class Autor {
    String nombre;
    String nacionalidad;
    String fecha;

    public Autor(String nombre, String nacionalidad, String fecha) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getnacionalidad() {
        return nacionalidad;
    }

    public String getFecha() {
        return fecha;
    }

}

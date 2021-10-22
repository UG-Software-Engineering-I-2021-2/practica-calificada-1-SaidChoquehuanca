package main;

public class Libro {
    Autor autor;
    String nombre;
    String anho;
    String Editorial;
    boolean viejo; //True significa que sí es antiguo, False significa es nuevo
    boolean adquirido = false;

    public Libro(Autor autor, String nombre, String anho, String editorial, boolean viejo) {
        this.autor = autor;
        this.nombre = nombre;
        this.anho = anho;
        Editorial = editorial;
        this.viejo = viejo;
        this.adquirido = false;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnho() {
        return anho;
    }

    public String getEditorial() {
        return Editorial;
    }

    public boolean isViejo() {
        return viejo;
    }

    public boolean isAdquirido() {
        return adquirido;
    }

    public void setAdquirido(boolean adquirido) {
        this.adquirido = adquirido;
    }
}

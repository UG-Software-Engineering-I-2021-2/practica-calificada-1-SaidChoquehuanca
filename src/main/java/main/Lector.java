package main;

public class Lector {
    String correo;
    Libro libros[] = new Libro[3];
    int cant_libros;
    int multa = 0;

    public Lector(String correo, Libro[] libros, int cant_libros) {
        this.correo = correo;
        this.libros = libros;
        this.cant_libros = cant_libros;
    }

    public String getCorreo() {
        return correo;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public int getMulta() {
        return multa;
    }

    public String prestarse(Libro libro_prestar){
        if(this.multa>=0){
            return "Tiene una multa, no puede prestarse";
        }
        else if(cant_libros==libros.length){
            return "Tiene el maximo el maximo de libros, no se puede prestar";
        }
        else{
            if(libro_prestar.isViejo()){
                libros[cant_libros]=libro_prestar;
                cant_libros+=1;
                return "Libro prestado";
            }
            else if(!libro_prestar.isViejo() && !libro_prestar.isAdquirido() ){
                libro_prestar.setAdquirido(true);
                return "Libro adquirido";
            }
            else {
                return "Este libro ya fue adquirido, te notificaremos cuando este dispobible a tu correo";
            }
        }
    }

}

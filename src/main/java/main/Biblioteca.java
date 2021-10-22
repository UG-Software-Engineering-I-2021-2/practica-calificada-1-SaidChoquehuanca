package main;

import main.Libro;
public class Biblioteca {
    Libro libros[];
    int cantidad_max_libros;
    int contador=0;

    public Biblioteca(int cantidad_max_libros) {
        libros = new Libro[cantidad_max_libros];
        this.cantidad_max_libros=cantidad_max_libros;
    }

    public Biblioteca(Libro[] libros,int cantidad_max_libros) {
        this.cantidad_max_libros = cantidad_max_libros;
        this.libros = libros;
        this.contador = libros.length-1;
    }

    public String Add_libro(Libro nuevo_libro){
        if(contador<cantidad_max_libros){
            libros[contador]=nuevo_libro;
            contador++;
            return "Libro agregado";
        }
        else {
            return "Ya no se puede agregar mas libros";
        }
    }



}

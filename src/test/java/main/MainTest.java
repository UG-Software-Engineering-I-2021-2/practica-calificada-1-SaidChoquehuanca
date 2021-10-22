package main;

import main.*;

import org.junit.Test;
import org.testng.Assert;

public class MainTest {

    Biblioteca biblio = new Biblioteca(5);
    Autor autor1 = new Autor("Juan","Peruano","12/06/1945");
    Autor autor2 = new Autor("Pedro","Argentino","15/09/1987");
    Autor autor3 = new Autor("Luis","Colombiano","01/12/1998");
    Libro libro1 = new Libro(autor1,"Estrellas Fugaces","1967","San Fernando",true);
    Libro libro2 = new Libro(autor2,"Caperucita Roja","2005","Tres Cruces",true);
    Libro libro3 = new Libro(autor3,"La Gran Nuez","2016","3 Barcos",false);
    Libro libro4 = new Libro(autor1,"El Monte Azul","1965","3 Barcos",true);
    Libro libro5 = new Libro(autor2,"El Caballero Dorado","2010","San Fernando",false);


    @Test()
    public void test01(){
        //String mensaje = biblio.Add_libro(libro1);
        Assert.assertEquals(biblio.Add_libro(libro1), "Libro agregado");
    }

    @Test()
    public void test02(){
        biblio.Add_libro(libro1);
        biblio.Add_libro(libro2);
        biblio.Add_libro(libro3);
        biblio.Add_libro(libro4);
        biblio.Add_libro(libro5);
        Assert.assertEquals(biblio.Add_libro(libro2), "Ya no se puede agregar mas libros");
    }

}

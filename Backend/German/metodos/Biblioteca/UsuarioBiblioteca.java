package metodos.Biblioteca;
import java.util.ArrayList;
import metodos.tienda.Usuario;


public class UsuarioBiblioteca {
    String nombre;
    ArrayList<Libro> prestados;

    public UsuarioBiblioteca(String nombre) {
        this.nombre = nombre;
        this.prestados = new ArrayList<Libro>();
    }

    public void prestarLibro (Libro libro){
        if (libro.disponible == true) {
            libro.disponible = false;
            this.prestados.add(libro);
            System.out.println(this.nombre + " tomo prestado " + libro);
        } else {
            System.out.println("Libro no disponible");
        }
    }
    


        


}
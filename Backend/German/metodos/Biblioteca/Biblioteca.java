package metodos.Biblioteca;

import metodos.Biblioteca.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner sc = new Scanner(System.in);
    ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();

        this.libros.add(new Libro("Muerte y Vida del Cartel de Medellin", "Carlos Lehder", 2024, true));
        this.libros.add(new Libro("Habitos Atomicos", "James Clear", 2018, true));
        this.libros.add(new Libro("Harry Potter", "J. K. Rowling", 2001, true));
    }

    public void MostrarLibros() {
        for (Libro libro : this.libros) {
            if (libro.disponible == true) {
                System.out.println(libro);
            }
        }
    }

    public Libro BuscarLibros(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

    System.out.println("---Libros disponibles en la biblioteca---");
    biblioteca.MostrarLibros();  // <-- Esto mostrará los libros disponibles primero

    UsuarioBiblioteca usuario = new UsuarioBiblioteca("Maicol");

    System.out.println(usuario.nombre + ", ¿qué libros desea prestar?");
    Scanner sc = new Scanner(System.in);
    String titulos = sc.nextLine();

    String[] listaTitulos = titulos.split(",");
    for (String titulo : listaTitulos) {
        titulo = titulo.trim(); // quitar espacios extra
        Libro libro = biblioteca.BuscarLibros(titulo);

        if (libro == null) {
            System.out.println("El libro \"" + titulo + "\" no existe.");
        } else if (libro.disponible) {
            usuario.prestarLibro(libro);
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está prestado.");
        }
    }

    System.out.println("Libros prestados a " + usuario.nombre + ":");
    for (Libro libro : usuario.prestados) {
        System.out.println(libro);
    }

    System.out.println("Libros que quedaron disponibles en la biblioteca:");
    biblioteca.MostrarLibros();
}


}

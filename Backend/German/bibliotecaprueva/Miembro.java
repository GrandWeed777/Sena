package bibliotecaprueva;

import java.util.ArrayList;

public class Miembro {

    private String nombre;
    private ArrayList<Publicacion> prestamos;

    public Miembro(String nombre) {
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public void tomarPrestado(Publicacion p) {
        prestamos.add(p);
        System.out.println(nombre + " tomó prestado: " + p.getTitulo());
    }

    public void mostrarPrestamos() {
        System.out.println("\nPublicaciones prestadas por " + nombre + ":");
        for (Publicacion p : prestamos) {
            System.out.println("- " + p.getTitulo() + " (" + p.getAutor() + ")");
        }
    }
}

package metodos.Biblioteca;

public class Libro {
    String titulo;
    String autor;
    int año;
    boolean disponible;

    public Libro (String titulo, String autor, int año, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.disponible = disponible;
    }

    public String toString(){
        return this.titulo + " - " + this.autor +  " (" + this.año + ")";
    } 

}

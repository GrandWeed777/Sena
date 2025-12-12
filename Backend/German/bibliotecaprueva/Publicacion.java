package bibliotecaprueva;

public class Publicacion {
    protected String titulo;
    protected String autor;

    public Publicacion(String autor, String titulo){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
}

 package bibliotecaprueva;

public class Libro  extends Publicacion{

    private int numeroPaginas;

    public Libro (String titulo, String autor, int numeroPaginas){
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeropaginas(){
        return numeroPaginas;
    }
}
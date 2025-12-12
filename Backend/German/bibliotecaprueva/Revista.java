package bibliotecaprueva;

public class Revista extends Publicacion{
    private int indicion;

    public Revista(String titulo, String autor, int indicion){
        super(titulo, autor);
        this.indicion = indicion;
    }

    public int getIndicion(){
        return indicion;
    }
}

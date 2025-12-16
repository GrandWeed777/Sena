public class Perro extends Mascotas {
    private int edad;

    public Perro(String nombre, String especie, int edad){
        super(nombre, especie);
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void traerPalo(String nombre){
        System.out.println(nombre + "Esta atrapando el palo!");
    }

    @Override
    public void hacerSonido(String sonido){
        System.out.println("soy un perro y hago " + sonido);
    }
}

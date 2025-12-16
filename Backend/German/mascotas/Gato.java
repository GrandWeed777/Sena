public class Gato extends Mascotas{
    public int edad;

    public Gato(String nombre, String especie, int edad){
        super(nombre, especie);
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void dormir(String especie){
        System.out.println("Soy " + especie + " y estoy durmiendo");
    }

    @Override
    public void hacerSonido( String sonido){
        System.out.println("el gato esta haciendo" + sonido);
    }
}

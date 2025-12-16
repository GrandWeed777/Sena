public class Mascotas {
    private String nombre;
    private String especie;

    public Mascotas(String nombre, String especie){
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCambiarNombre(String nuevoNombre){
        if (!nombre.isEmpty()) {
            this.nombre = nuevoNombre;
        }
    }

    public void hacerSonido(String sonido){
        System.out.println("soy un " + especie + " y hago " + sonido);
    }

}

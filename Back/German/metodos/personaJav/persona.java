package metodos.personaJav;

public class persona {
    boolean esMayor;
    int edad;
    String nombre;

    public void saludar() {
        System.out.println("Hola soy " + nombre);
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            esMayor = true;
        } else {
            esMayor = false;
        }
        return esMayor;
    }

    public int convertirAñosAMeses(){
        return edad * 12;
    }

    public void mostrarBienvenida(){
        System.out.println("Bienvenido");
    }
}

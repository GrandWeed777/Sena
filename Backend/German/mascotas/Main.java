public class Main {
    public static void main(String[] args) {
        Gato tom = new Gato("Tom", "Felino", 2);
        Perro Axel = new Perro("Axel", "Canino", 3);

        tom.hacerSonido(" Miau, Miau");
        tom.dormir("Felino");
        System.out.println("La edad de " + tom.getNombre() + " es de " + tom.getEdad()+ " años");
        

        Axel.hacerSonido("Guau, Guau");
        Axel.traerPalo(" Axel");
        System.out.println("La edad de" + Axel.getNombre() + " es de " + Axel.getEdad() + " años");


        
    }
}

package bibliotecaprueva;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Vida y muerte del cartel de Med.", "Carlos lehder", 355);
        Revista r1 = new Revista("Prueva..", "Maicol Vera", 134);

        Miembro m1 = new Miembro("Maicol");

        m1.tomarPrestado(l1);
        m1.tomarPrestado(r1);


        m1.mostrarPrestamos();
    }
}

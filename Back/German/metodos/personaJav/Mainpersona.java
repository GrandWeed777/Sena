package metodos.personaJav;

import java.util.Scanner;

public class Mainpersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        persona p1 = new persona();
        p1.mostrarBienvenida();
        System.out.print("Ingrese el nombre del personaje 1: ");
        p1.nombre = sc.nextLine();
        p1.edad = 17;

        persona p2 = new persona();
        System.out.print("Ingrese el nombre del personaje 2: ");
        p2.nombre = sc.nextLine();
        p2.edad = 19;

        p1.saludar();
        p2.saludar();

        System.out.println("P1 Mayor de Edad? " + p1.esMayorDeEdad());
        System.out.println("P2 Mayor de Edad? " + p2.esMayorDeEdad());

        int meses = p1.convertirAñosAMeses();
        System.out.println("Los meses de personaje 1: " + meses);
        int mesesp2 = p1.convertirAñosAMeses();
        System.out.println("Los meses de personaje 1: " + mesesp2);
        sc.close();
    }
}

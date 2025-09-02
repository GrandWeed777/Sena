package Taller4;

import java.util.Scanner;

public class ingresoapiscina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.print("Sabe nadar? ");
        boolean sabenadar = scanner.nextBoolean();
        scanner.close();

        if (edad >= 18) {
            if (sabenadar) {
                System.out.println("Puede ingresar a la piscina");
            } else {
                System.out.println("Debe usar flotador");
            }
        } else {
            System.out.println("Debe ir acompañado de adulto");
        }    
    }
}

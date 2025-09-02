package Taller4;

import java.util.Scanner;

public class aceesocine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tiene Dinero?");
        String tienedinero = scanner.next();
        scanner.close();
        
        if (edad >= 15) {
            if (tienedinero.equalsIgnoreCase("si")) {
                System.out.println("Puedes comprar tu entrada");
            } else {
                System.out.println("No puedes entrar, no tienes dinero");
            }
        } else {
            if (edad < 15 ) {
                System.out.println("Debe venir acompañado con audulto");
            }
        }
    }
}

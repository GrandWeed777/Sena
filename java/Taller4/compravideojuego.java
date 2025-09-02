package Taller4;

import java.util.Scanner;

public class compravideojuego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el genero");
        String genero = scanner.next(); 

        if (edad < 18 ){
            if (genero.equalsIgnoreCase("terror")) {
                System.out.println("No puedes comprar este juego");
            }
        } 
        if (edad >= 18) {
            System.out.println("Tiene Dinero? ");
                 String dinero = scanner.next();

            if (dinero.equalsIgnoreCase("si")) {
                System.out.println("Compra realizada");
            } else {
                System.out.println("No tiene saldo suficiente");
            }
            scanner.close();
        }
    }
}

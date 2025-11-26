package Taller5;

import java.util.Scanner;

public class clasificaciondeconductor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Años de experiencia?");
        int experiencia = scanner.nextInt();
        scanner.close(); 

        if (edad > 25 && experiencia >= 5 || edad > 30 ){
            System.out.println("Califica para la licencia especial");
        } else {
            System.out.println("No califica para la licencia especial");
        }
    }
}

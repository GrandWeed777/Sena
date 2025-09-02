package Taller2;

import java.util.Scanner;

public class rangodeedad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        scanner.close();

        if (edad >= 18) {
            System.out.println("Es adulto");
        } else {
            System.out.println("No es adulto");
        }
    }
}

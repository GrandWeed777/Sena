package Taller3;

import java.util.Scanner;

public class fueraderango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero < 0 || numero > 100) {
            System.out.println("Numero fuera de rango");
        } else {
            System.out.println("Numero esta en el rango");
        }
    }
}
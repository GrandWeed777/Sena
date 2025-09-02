package Taller2;

import java.util.Scanner;

public class numerodentrorango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1 && numero <= 100) {
            System.out.println("Esta en el rango");
        } else {
            System.out.println("No esta en el rango");
        }
    }
}

package Taller2;

import java.util.Scanner;

public class multipode5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero % 5 == 0) {
            System.out.println("Es multiplo de 5");
        } else {
            System.out.println("No es multiplo de 5");
        }
    }
}

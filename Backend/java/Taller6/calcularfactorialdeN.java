package Taller6;

import java.util.Scanner;

public class calcularfactorialdeN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para N");
        int numero = scanner.nextInt();

        double factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de: " + numero + " es " + factorial);
        
        scanner.close();
    }
}

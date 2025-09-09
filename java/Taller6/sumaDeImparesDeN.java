package Taller6;

import java.util.Scanner;

public class sumaDeImparesDeN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor para N: ");
        int n = scanner.nextInt();

        int suma = 0;

        System.out.print("Los " + n + " primeros números impares son: ");

        for (int i = 1; i <= n; i++) {
            int impar = 2 * i - 1;
            suma += impar;

            // Si no es el último número, imprime con "+"
            if (i < n) {
                System.out.print(impar + " + ");
            } else {
                System.out.print(impar + " = ");
            }
        }

        System.out.println(suma);

        scanner.close();
    }
}


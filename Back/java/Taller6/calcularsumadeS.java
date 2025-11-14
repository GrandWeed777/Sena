 package Taller6;

import java.util.Scanner;

public class calcularsumadeS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor para N");
        int n = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 1) {
                System.out.print("S = ");
            }
            System.out.print( i);

            if (i % 2 == 0) {
                suma -= i;
            } else {
                suma += i;
            }

            if (i < n) {
                if (i % 2 == 0) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" - ");
                }

            }

        }
        sc.close();
        System.out.println();
        System.out.println("La suma es: " + suma);
    }
}

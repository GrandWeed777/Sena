package tallergpt;

import java.util.Scanner;

public class sumadelosprimerosN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor para N");
        int n = sc.nextInt();

        int suma = 0;

        for ( int i = 1; i <= n; i++) {
            suma += i; 

            System.out.print(i);

            if ( i + 1 <= n) {
                System.out.print(" + ");
            }
        } 
        System.out.println();
        System.out.println("La suma de los primeros numeros de N es: " + suma);
        sc.close();
    }
}

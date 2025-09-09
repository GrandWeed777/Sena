package Taller6;

import java.util.Scanner;

public class sumadeparesedeN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para N");
        int n = scanner.nextInt();

        
        int suma = 0;

       for (int i = 1; i <= n; i++) {
            suma += 2 * i;
            System.out.print(2 * i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + suma);



        scanner.close();
    }
}

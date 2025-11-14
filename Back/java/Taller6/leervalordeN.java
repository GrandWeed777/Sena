package Taller6;

import java.util.Scanner;

public class leervalordeN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para N :");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++)

        System.out.println(i);
     
        scanner.close();
    }
}

package Guia2;

import java.util.Scanner;

public class ejercisio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }

        sc.close();
    }
}

package Guia2;

import java.util.Scanner;

public class ejercisio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean numeropositivo = false;

        do {
            System.out.print("Ingrese un numero: ");
            int numero = sc.nextInt();
            if (numero <= 0) {
                numeropositivo = false;
                System.out.println("Ingresa un numero incorrecto!");
            } else {
                numeropositivo = true;
                System.out.println("Numero correcto");
            }

        } while (!numeropositivo);
        sc.close();
    }
}

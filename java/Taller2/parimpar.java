package Taller2;

import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero % 2 ==0 ) {
            System.out.println("Es par");
        } else  {
            System.out.println("Es impar");
        }

    }
}

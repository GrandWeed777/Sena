package Taller2;

import java.util.Scanner;

public class positivonegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero > 0 ) {
            System.out.println("Es positivo");
        } else if (numero < 0 ) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es Cero");
            }
            }
}

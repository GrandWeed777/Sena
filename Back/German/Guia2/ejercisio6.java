package Guia2;

import java.util.Scanner;

public class ejercisio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoInicial = 1000000;
        boolean montoIncorrecto;

        do {
            System.out.print("Ingresa un monto a retirar: ");
            int monto = sc.nextInt();

            if (monto > saldoInicial) {
                System.out.println("ERROR!! Ingresa un monto valido");
                montoIncorrecto = true;
            } else {
                System.out.println("Monto retirador con exito!");
                montoIncorrecto = false;
            }

        } while (montoIncorrecto == true);
        sc.close();
    }
}

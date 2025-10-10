package German.Taller1;

import java.util.Scanner;

public class ejercisio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] saldo = {5000000};
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinero");
            System.out.println("3 - Retirar dinero");
            System.out.println("4 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Saldo actual: " + saldo[0]);

            } else if (opcion == 2) {
                System.out.print("Digite el monto a depositar: ");
                float deposito = sc.nextFloat();
                saldo[0] += deposito;
                System.out.println("Depósito exitoso ");
                System.out.println("Saldo actual: " + saldo[0]);

            } else if (opcion == 3) {
                System.out.print("Digite el monto a retirar: ");
                float retiro = sc.nextFloat();

                if (retiro <= saldo[0]) {
                    saldo[0] -= retiro;
                    System.out.println("Retiro exitoso ");
                } else {
                    System.out.println("Saldo insuficiente ");
                }
                System.out.println("Saldo actual: " + saldo[0]);

            } else if (opcion == 4) {
                System.out.println("Saliendo del sistema... ");

            } else {
                System.out.println("Opción inválida Intente nuevamente.");
            }
        }

        sc.close(); 
    }
}

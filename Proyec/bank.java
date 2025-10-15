

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] saldo = { 5000000 };
        int opcion = 0;
        int limiteDia = 9999999;
        int totalRetiros = 0;
        int totalDepositos = 0;
        int operaciones = 0;

        while (opcion != 5) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinero");
            System.out.println("3 - Retirar dinero");
            System.out.println("4 - Ver resumen del Dia");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Saldo actual: " + saldo[0]);
                operaciones++; 

            } else if (opcion == 2) {
                System.out.print("Digite el monto a depositar: ");
                float deposito = sc.nextFloat();
                saldo[0] += deposito;
                totalDepositos += deposito;
                operaciones ++;
                System.out.println("Depósito exitoso ");
                System.out.println("Saldo actual: " + saldo[0]);

            } else if (opcion == 3) {
                System.out.print("Digite el monto a retirar: ");
                float retiro = sc.nextFloat();

                if (totalRetiros + retiro < limiteDia && retiro <= saldo[0]) {
                    saldo[0] -= retiro;
                    totalRetiros += retiro;
                    operaciones ++;
                    System.out.println("Retiro Exitoso");
                } else {
                    System.out.println("Saldo insucifiente o limite de retiros alcanzado");
                }
                System.out.println("Saldo actual: " + saldo[0]);

            } else if (opcion == 4) {
                System.out.println("Total de depositos realizados: " + totalDepositos);
                System.out.println("Total retiros realizados: " + totalRetiros);
                System.out.println("Total operaciones realizadas: " + operaciones);
                System.out.println("Saldo final: " + saldo[0]);

            } else if (opcion == 5) {
                System.out.println("Saliendo del sistema... ");
            }

            else {
                System.out.println("Opción inválida Intente nuevamente.");
            }
        }

        sc.close();
    }
}

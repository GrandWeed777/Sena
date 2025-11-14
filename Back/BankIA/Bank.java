import java.util.Scanner;

public class Bank {
    private String usuario;
    private double saldo = 5000000;
    private Scanner sc = new Scanner(System.in);

    public Bank(String usuario) {
        this.usuario = usuario;
    }

    public void iniciar() {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n--- Menú de " + usuario + " ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar dinero");
            System.out.println("3 - Retirar dinero");
            System.out.println("4 - Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> System.out.println("Su saldo actual es: $" + saldo);
                case 2 -> depositar();
                case 3 -> retirar();
                case 4 -> System.out.println("Sesión cerrada correctamente.");
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private void depositar() {
        System.out.print("Ingrese el monto a depositar: ");
        double monto = sc.nextDouble();
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso . Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    private void retirar() {
        System.out.print("Ingrese el monto a retirar: ");
        double monto = sc.nextDouble();
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso . Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Monto inválido o insuficiente.");
        }
    }
}

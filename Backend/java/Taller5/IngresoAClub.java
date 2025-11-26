package Taller5;

import java.util.Scanner;

public class IngresoAClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Es socio activo? (si/no)");
        String socio = scanner.next();

        System.out.println("Ingrese el valor de su cuota anual:");
        int cuota = scanner.nextInt();
        scanner.nextLine(); // <-- limpiar el buffer

        System.out.println("¿Tiene invitación especial? (si/no)");
        String invitacionEspecial = scanner.nextLine().toLowerCase();

        if (socio.equalsIgnoreCase("si") && cuota >= 500) {
            System.out.println("Puede ingresar al club");
        } else if (invitacionEspecial.equalsIgnoreCase("si")) {
            System.out.println("Puede ingresar al club");
        } else {
            System.out.println("No puede ingresar al club");
        }

        scanner.close();
    }
}

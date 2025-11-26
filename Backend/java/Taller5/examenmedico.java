package Taller5;

import java.util.Scanner;

public class examenmedico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tiene certificado medico? (si/no)");
        String certificadoMedico = scanner.nextLine().toLowerCase();

        System.out.println("Es fumador? (si/no)");
        String fumador = scanner.nextLine().toLowerCase();

        System.out.println("tiene permiso especial (si/no)");
        String permisoEspecial = scanner.nextLine().toLowerCase();

        if (certificadoMedico.equals("si") && fumador.equals("no")) {
            System.out.println("Puede realizar el deporte");
        } else if (permisoEspecial.equals("si")) {
            System.out.println("Puede realizar el deporte");
        } else {
            System.out.println("No puede realizar el deporte");
        }
        scanner.close();    
    }
}

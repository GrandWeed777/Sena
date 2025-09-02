package Taller5;

import java.util.Scanner;

public class ofertadetelefonia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los meses en la compañia");
        int meses = scanner.nextInt();

        System.out.println("Ingrese su consumo de datos en GB");
        int datos = scanner.nextInt();

        if (meses >= 12 && datos >= 10) {
            System.out.println("Aplica para el plan");
        } else {
            if (meses >= 24) {
                System.out.println("Aplica para el plan");
            } else {
            System.out.println("No aplica para el plan");
        }
        } 
        scanner.close();
    }
}

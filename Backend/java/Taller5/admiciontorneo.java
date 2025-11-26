package Taller5;

import java.util.Scanner;

public class admiciontorneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su rating");
        int rating = scanner.nextInt();

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        if (rating >= 1800 && edad > 15) {
            System.out.println("Puede participar en el torneo");
        } else {
            if (rating > 2000 ) {
                System.out.println("Puede participar en el torneo");
            }  else {
                System.out.println("No puede participar en el torneo");
            }
        }     
        scanner.close();     
    }
}

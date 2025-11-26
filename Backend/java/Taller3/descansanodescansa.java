package Taller3;

import java.util.Scanner;

public class descansanodescansa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Es noche?");
        boolean esnoche = scanner.nextBoolean();

        System.out.println("Es fin de semana?");
        boolean fincho = scanner.nextBoolean();
        scanner.close();

        if (esnoche || fincho) {
            System.out.println("Puede Descansar");
        } else {
            System.out.println("No puede Descansar");
        }
    }
}

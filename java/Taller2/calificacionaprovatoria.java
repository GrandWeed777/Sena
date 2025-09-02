package Taller2;

import java.util.Scanner;

public class calificacionaprovatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la calificacion del 0 al 10");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("No aprobado");
        }
    }
    
}

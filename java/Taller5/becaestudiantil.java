package Taller5;

import java.util.Scanner;

public class becaestudiantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su promedio");
        int promedio = scanner.nextInt();

        System.out.println("Ingrese su nivel estrato");
       int estrato = scanner.nextInt();
        scanner.close(); 

        if (promedio >= 90 && estrato <= 2 || promedio >= 95) {
            System.out.println("El estuadiante obtiene la beca");
        } else {
            System.out.println("El estudiante no obtiene la beca");
        }
    }
}

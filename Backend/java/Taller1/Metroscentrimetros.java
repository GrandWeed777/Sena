package Taller1;

import java.util.Scanner;

public class Metroscentrimetros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los metros");
        int metros = scanner.nextInt();

        scanner.close();

        int conversion = metros * 100;
                                                                //System.out.println("La conversion es: " + conversion);
        System.out.println( conversion + "  centimetros");
    }
}

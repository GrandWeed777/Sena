package Taller1;

import java.util.Scanner;

public class Algoritmos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la edad");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el peso");
        int peso = scanner.nextInt();

        scanner.close();
        System.out.println("La edad es: " + edad );
        System.out.println("El peso es: " + peso);
    }
}
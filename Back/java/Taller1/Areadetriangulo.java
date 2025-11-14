package Taller1;

import java.util.Scanner;

public class Areadetriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base");
        int base = scanner.nextInt();

        System.out.println("Ingrse altura");
        int altura = scanner.nextInt();

        scanner.close();
        int resultado = base * altura /2;
        System.out.println("El area es: " + resultado);
    }
}

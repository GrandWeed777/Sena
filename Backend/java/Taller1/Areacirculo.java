package Taller1;

import java.util.Scanner;

public class Areacirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio");
        int radio = scanner.nextInt();

        double PI = Math.PI;

        scanner.close();

       double resultado = PI * radio * radio;
        System.out.println("El areas es: "+ resultado);
    }
}

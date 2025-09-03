package Taller6;

import java.util.Scanner;

public class paisygentilicio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] gentilicios = {
            "", 
            "Colombiano/a",
            "Chamo/a",
            "Brazileño/a",
            "Ecuatoriano/a",
            "Peruano/a",
            "Boliviano/a",
            "Chileno/a",
            "Argentino/a",
            "Uruguayo/a",
            "Paraguayo/a",
        };

        System.out.println("Ingrese el numero del pais (1-10): ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("El gentilicio es: " + gentilicios[numero]);
        } else {
            System.out.println("Ingrese un pais valido");
        }
        scanner.close();
    }
}

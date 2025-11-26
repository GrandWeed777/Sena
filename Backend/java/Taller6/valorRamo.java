package Taller6;

import java.util.Scanner;

public class valorRamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int precio = 0;

        System.out.println("Tipo de flor (rosa o clavel):");
        String tipo = scanner.next().toLowerCase();

       
        if (!tipo.equals("rosa") && !tipo.equals("clavel")) {
            System.out.println("Tipo de flor no válida.");
            scanner.close();
            return; 
        }

        System.out.println("Color de la flor: (roja/otro)");
        String color = scanner.next().toLowerCase();

        System.out.println("Cantidad de flores:");
        int cantidad = scanner.nextInt();

        switch (tipo) {
            case "rosa":
                if (color.equals("roja")) {
                    precio = (cantidad <= 12) ? 1250 : 1100;
                } else {
                    precio = 1205;
                }
                break;

            case "clavel":
                if (color.equals("blanco")) {
                    precio = (cantidad <= 12) ? 1050 : 1000;
                } else {
                    precio = 1200;
                }
                break;
        }
        int total = precio * cantidad;
        System.out.println("El precio del ramo es: $" + total);

        scanner.close();
    }
}

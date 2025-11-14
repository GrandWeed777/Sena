package Taller5;

import java.util.Scanner;

public class descuentodetienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la compra:");
        int valorCompra = scanner.nextInt();

        System.out.println("Cliente Frecuente? (true/false):");
        boolean clientefrecuente = scanner.nextBoolean();
        scanner.close();

        if (valorCompra > 100 &&  clientefrecuente || valorCompra > 200) {
            System.out.println("Tiene un descuento del 20%");
        } 
        else {
            System.out.println("No tiene descuento");
        }
}
}
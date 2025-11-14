package Taller3;

import java.util.Scanner;

public class numerorango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 50) {         
                if (numero <= 100) {
                    System.out.println("Numero esta en el rango");
                } else {
                    System.out.println("Esta fuera del rango");
                }
            } else {
                System.out.println("El numero esta fuera del rango");
            }
        }
    }


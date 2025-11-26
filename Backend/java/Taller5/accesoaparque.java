package Taller5;

import java.util.Scanner;

public class accesoaparque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrse su estatura en cm");
        int estatura = scanner.nextInt();
        System.out.println("Acompañado de adulto? (true/false)");
        boolean acompañado = scanner.nextBoolean();
        scanner.close();

        if (edad >= 12 && estatura >= 160 || acompañado)  { 
            System.out.println("Puede ingresar al parque");
    } else {
        System.out.println("No puede ingresar al parque");
    }
}
}

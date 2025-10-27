package Guia1.Taller1;


import java.util.Scanner;

public class ejercisio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.close();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
    }
}
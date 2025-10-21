package Guia2;

import java.util.Scanner;

public class ejercisio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        int contador = 1;

        while ( contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }
        sc.close();

    }
}

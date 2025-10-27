package Guia1.Taller1;


import java.util.Scanner;

public class ejercisio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un un numero para determinar si es par o impar: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero % 2 == 0) {
            System.out.println("El numero es par!");
        } else {
            System.out.println("El numero es impar");
        }

    }
}

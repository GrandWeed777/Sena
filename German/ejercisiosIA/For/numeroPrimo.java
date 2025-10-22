package ejercisiosIA.For;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }

        }
        if (contador == 2) {
            System.out.println(numero + " Es primo");
        } else {
            System.out.println(numero + " No es primo");
        }
        sc.close();
    }
}

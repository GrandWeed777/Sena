package ejercisiosIA.Do_while;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        int iterador = 1;
        int divisores = 0;

        do {
            if (numero % iterador == 0) {
                divisores++;

            }
            iterador++;

        } while (iterador <= 100);
        if (divisores == 2) {
            System.out.println(numero + " Es primo");
        } else {
            System.out.println(numero + "No es primo");
        }
        sc.close();
    }
}

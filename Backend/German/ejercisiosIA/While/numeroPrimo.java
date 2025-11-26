package ejercisiosIA.While;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int numero = sc.nextInt();
        int iterador = 1;
        int divisores = 0;

        while (iterador <= 100) {
            if (numero % iterador == 0) {
                divisores++;
            }
            iterador++;
        }
        if (divisores == 2) {
            System.out.println(numero + " Es primo!");
        } else {
            System.out.println(numero + " No es primo!!");
        }
        sc.close(); 
    }
}
/**Realiza un programa en Java que solicite al usuario ingresar un número entero positivo y determine si dicho número es primo o no.
Un número es primo cuando solo tiene dos divisores: 1 y él mismo.
El programa debe contar cuántos divisores tiene el número y mostrar un mensaje indicando si es primo o no. */